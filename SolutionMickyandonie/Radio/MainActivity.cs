using Android.App;
using Android.OS;
using Android.Support.Design.Widget;
using Android.Support.V7.App;
using Android.Text;
using Android.Views;
using Android.Widget;
using Dyanamitechetan.Vusikview;


namespace Radio
{
    [Activity(Label = "Radio Mickyandonie", MainLauncher = true, Icon = "@drawable/ic_logo_long_extend", Theme = "@style/Theme.AppCompat.Light.NoActionBar")]
    public class MainActivity : AppCompatActivity
    {
        public VusikView MusicView { get; set; }
        public ImageView ActionPlayOrPause { get; set; }
        public ImageView VisiblePlay;
        private BottomNavigationView _bottomNavigation;
        private Net _network;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.Main);

            _network = new Net(this);
            var eventHandler = new MainEventHandler(this);

            VisiblePlay = FindViewById<ImageView>(Resource.Id.action_visible);
            MusicView = FindViewById<VusikView>(Resource.Id.music_view);
            _bottomNavigation = FindViewById<BottomNavigationView>(Resource.Id.bottom_navigation);
            ActionPlayOrPause = FindViewById<ImageView>(Resource.Id.action_play_or_pause);

            eventHandler.OnClickBottomNavigation(_bottomNavigation);
            eventHandler.OnClickActionPlayOrPause(ActionPlayOrPause);
            eventHandler.OnclickActionVisiblePlay(VisiblePlay, ActionPlayOrPause);

            ActionPlayOrPause.Visibility =  ViewStates.Invisible;
            VisiblePlay.Clickable = false;
        }

        protected override void OnResume()
        {
            base.OnResume();
            _network.CheckingNetwork();
            MusicView.Start();
                
        }
    }
}