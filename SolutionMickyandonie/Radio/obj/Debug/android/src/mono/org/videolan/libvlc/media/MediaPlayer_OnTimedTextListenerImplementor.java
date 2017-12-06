package mono.org.videolan.libvlc.media;


public class MediaPlayer_OnTimedTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.media.MediaPlayer.OnTimedTextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimedText:(Lorg/videolan/libvlc/media/MediaPlayer;Landroid/media/TimedText;)V:GetOnTimedText_Lorg_videolan_libvlc_media_MediaPlayer_Landroid_media_TimedText_Handler:Org.Videolan.Libvlc.Media.MediaPlayer/IOnTimedTextListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnTimedTextListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayer_OnTimedTextListenerImplementor.class, __md_methods);
	}


	public MediaPlayer_OnTimedTextListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayer_OnTimedTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Media.MediaPlayer+IOnTimedTextListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onTimedText (org.videolan.libvlc.media.MediaPlayer p0, android.media.TimedText p1)
	{
		n_onTimedText (p0, p1);
	}

	private native void n_onTimedText (org.videolan.libvlc.media.MediaPlayer p0, android.media.TimedText p1);

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
