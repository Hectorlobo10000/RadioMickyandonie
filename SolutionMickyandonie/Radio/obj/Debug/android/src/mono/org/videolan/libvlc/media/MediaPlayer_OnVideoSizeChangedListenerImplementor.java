package mono.org.videolan.libvlc.media;


public class MediaPlayer_OnVideoSizeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.media.MediaPlayer.OnVideoSizeChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVideoSizeChanged:(Lorg/videolan/libvlc/media/MediaPlayer;II)V:GetOnVideoSizeChanged_Lorg_videolan_libvlc_media_MediaPlayer_IIHandler:Org.Videolan.Libvlc.Media.MediaPlayer/IOnVideoSizeChangedListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnVideoSizeChangedListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnVideoSizeChangedListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnVideoSizeChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnVideoSizeChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnVideoSizeChangedListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onVideoSizeChanged (org.videolan.libvlc.media.MediaPlayer p0, int p1, int p2)
	{
		n_onVideoSizeChanged (p0, p1, p2);
	}

	private native void n_onVideoSizeChanged (org.videolan.libvlc.media.MediaPlayer p0, int p1, int p2);

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
