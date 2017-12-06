using System;
using Android.App;
using Android.Content;
using Android.Net;
using Android.OS;
using Android.Views;
using AlertDialog = Android.Support.V7.App.AlertDialog;

namespace Radio
{
    public class Net
    {
        private readonly MainActivity _activity;
        private readonly Dialog _alert;

        public Net(MainActivity activity)
        {
            _activity = activity;
            AlertDialog.Builder alert = new AlertDialog.Builder(_activity);
            alert.SetTitle("Radio Mickyandonie");
            alert.SetMessage("Error en la Red.");
            alert.SetNeutralButton("Cerrar", (sender, args) =>
            {
                _activity.FinishAffinity();
            });
            _alert = alert.Create();
        }

        public void CheckingNetwork()
        {
            ConnectivityManager connectivityManager =
                (ConnectivityManager) _activity.GetSystemService(Context.ConnectivityService);
            bool status;
            try
            {
                var networkInfo = connectivityManager.ActiveNetworkInfo;
                status = networkInfo.IsConnected;
            }
            catch (Exception)
            {

                status = false;
            }

            if (status == false)
            {
                _alert.Show();
            }
        }
    }
}