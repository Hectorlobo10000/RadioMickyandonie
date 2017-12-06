package mono.org.videolan.libvlc.media;


public class MediaPlayer_OnErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.media.MediaPlayer.OnErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Lorg/videolan/libvlc/media/MediaPlayer;II)Z:GetOnError_Lorg_videolan_libvlc_media_MediaPlayer_IIHandler:Org.Videolan.Libvlc.Media.MediaPlayer/IOnErrorListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnErrorListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnErrorListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnErrorListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnErrorListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onError (org.videolan.libvlc.media.MediaPlayer p0, int p1, int p2)
	{
		return n_onError (p0, p1, p2);
	}

	private native boolean n_onError (org.videolan.libvlc.media.MediaPlayer p0, int p1, int p2);

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
