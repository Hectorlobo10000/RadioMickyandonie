package mono.org.videolan.libvlc.media;


public class MediaPlayer_OnPreparedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.media.MediaPlayer.OnPreparedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepared:(Lorg/videolan/libvlc/media/MediaPlayer;)V:GetOnPrepared_Lorg_videolan_libvlc_media_MediaPlayer_Handler:Org.Videolan.Libvlc.Media.MediaPlayer/IOnPreparedListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnPreparedListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnPreparedListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnPreparedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnPreparedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnPreparedListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPrepared (org.videolan.libvlc.media.MediaPlayer p0)
	{
		n_onPrepared (p0);
	}

	private native void n_onPrepared (org.videolan.libvlc.media.MediaPlayer p0);

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
