using Android.Support.Design.Widget;
using Android.Views;
using Android.Widget;
using Org.Videolan.Libvlc;
using MediaPlayer = Org.Videolan.Libvlc.MediaPlayer;
using Uri = Android.Net.Uri;

namespace Radio
{
    public class MainEventHandler
    {
        private readonly MainActivity _activity;
        private readonly MediaPlayer _mediaPlayer;
        private readonly MediaLibVLC _mediaEnglish;
        private readonly MediaLibVLC _mediaSpanish;


        public MainEventHandler(MainActivity activity)
        {
            _activity = activity;
            var mLibVlc = new LibVLCLibVLC(activity);
            _mediaPlayer = new MediaPlayer(mLibVlc);
            _mediaEnglish = new MediaLibVLC(mLibVlc, Uri.Parse("http://167.114.13.24:9990/"));
            _mediaSpanish = new MediaLibVLC(mLibVlc, Uri.Parse("http://167.114.13.24:9968/"));
        }

        public void OnClickBottomNavigation(BottomNavigationView bottomNavigationView)
        {
            bottomNavigationView.NavigationItemSelected += (sender, args) =>
            {
                SetStreaming(args.Item.ItemId);
            };
        }

        private  void SetStreaming(int itemId)
        {
            var message = "";
            switch (itemId)
            {
                case Resource.Id.action_home:
                    _activity.ActionPlayOrPause.Visibility = ViewStates.Invisible;
                    _activity.VisiblePlay.Clickable = false;
                    message = "Home";
                    break;
                case Resource.Id.action_english:
                    _activity.ActionPlayOrPause.Visibility = ViewStates.Visible;
                    _activity.VisiblePlay.Clickable = true;
                    CheckIsPlayingOnChangeStreaming(_mediaEnglish);
                    message = "Éxitos en Ingles";
                    break;
                case Resource.Id.action_spanish:
                    _activity.ActionPlayOrPause.Visibility = ViewStates.Visible;
                    _activity.VisiblePlay.Clickable = true;
                    CheckIsPlayingOnChangeStreaming(_mediaSpanish);
                    message = "Éxitos en Español";
                    break;
            }
            Toast.MakeText(_activity, message, ToastLength.Short).Show();
        }

        private void CheckIsPlayingOnChangeStreaming(MediaLibVLC media)
        {
            if (_mediaPlayer.Media != media)
            {
                _mediaPlayer.Stop();
                _mediaPlayer.Media = media;
                _activity.ActionPlayOrPause.SetImageResource(Resource.Drawable.ic_circle_play);
            }
        }

        public void OnClickActionPlayOrPause(ImageView actionPlayOrPause)
        {
            actionPlayOrPause.Click += (sender, args) =>
            {
                if (_mediaPlayer.IsPlaying)
                {
                    _mediaPlayer.Pause();
                    _activity.ActionPlayOrPause.SetImageResource(Resource.Drawable.ic_circle_play);
                    CheckingVisibility(_activity.ActionPlayOrPause);
                }
                else
                {
                    _mediaPlayer.Play();
                    _activity.ActionPlayOrPause.SetImageResource(Resource.Drawable.ic_circle_pause);
                    CheckingVisibility(_activity.ActionPlayOrPause);
                }
            };
        }

        public void OnclickActionVisiblePlay(ImageView visiblePlay, ImageView playOrPause)
        {
            visiblePlay.Click += (sender, args) =>
            {
                CheckingVisibility(playOrPause);
            };
            
        }

        private static void CheckingVisibility(ImageView playOrPause)
        {
            ViewStates newState = ViewStates.Visible;
            switch (playOrPause.Visibility)
            {
                case ViewStates.Visible:
                    newState = ViewStates.Invisible;
                    break;
                case ViewStates.Invisible:
                    newState = ViewStates.Visible;
                    break;
            }
            playOrPause.Visibility = newState;
        }
    }
}