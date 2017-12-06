package mono.org.videolan.libvlc.media;


public class MediaPlayer_OnSeekCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.media.MediaPlayer.OnSeekCompleteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSeekComplete:(Lorg/videolan/libvlc/media/MediaPlayer;)V:GetOnSeekComplete_Lorg_videolan_libvlc_media_MediaPlayer_Handler:Org.Videolan.Libvlc.Media.MediaPlayer/IOnSeekCompleteListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnSeekCompleteListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnSeekCompleteListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnSeekCompleteListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnSeekCompleteListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnSeekCompleteListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onSeekComplete (org.videolan.libvlc.media.MediaPlayer p0)
	{
		n_onSeekComplete (p0);
	}

	private native void n_onSeekComplete (org.videolan.libvlc.media.MediaPlayer p0);

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
