package mono.org.videolan.libvlc.media;


public class MediaPlayer_OnBufferingUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.media.MediaPlayer.OnBufferingUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBufferingUpdate:(Lorg/videolan/libvlc/media/MediaPlayer;I)V:GetOnBufferingUpdate_Lorg_videolan_libvlc_media_MediaPlayer_IHandler:Org.Videolan.Libvlc.Media.MediaPlayer/IOnBufferingUpdateListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnBufferingUpdateListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnBufferingUpdateListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnBufferingUpdateListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnBufferingUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnBufferingUpdateListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onBufferingUpdate (org.videolan.libvlc.media.MediaPlayer p0, int p1)
	{
		n_onBufferingUpdate (p0, p1);
	}

	private native void n_onBufferingUpdate (org.videolan.libvlc.media.MediaPlayer p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
