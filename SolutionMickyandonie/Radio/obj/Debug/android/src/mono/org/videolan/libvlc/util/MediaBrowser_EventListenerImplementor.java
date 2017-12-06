package mono.org.videolan.libvlc.util;


public class MediaBrowser_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.util.MediaBrowser.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBrowseEnd:()V:GetOnBrowseEndHandler:Org.Videolan.Libvlc.Util.MediaBrowser/IEventListenerInvoker, VlcXamarin\n" +
			"n_onMediaAdded:(ILorg/videolan/libvlc/Media;)V:GetOnMediaAdded_ILorg_videolan_libvlc_Media_Handler:Org.Videolan.Libvlc.Util.MediaBrowser/IEventListenerInvoker, VlcXamarin\n" +
			"n_onMediaRemoved:(ILorg/videolan/libvlc/Media;)V:GetOnMediaRemoved_ILorg_videolan_libvlc_Media_Handler:Org.Videolan.Libvlc.Util.MediaBrowser/IEventListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Util.MediaBrowser+IEventListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaBrowser_EventListenerImplementor.class, __md_methods);
	}


	public MediaBrowser_EventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaBrowser_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Util.MediaBrowser+IEventListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onBrowseEnd ()
	{
		n_onBrowseEnd ();
	}

	private native void n_onBrowseEnd ();


	public void onMediaAdded (int p0, org.videolan.libvlc.Media p1)
	{
		n_onMediaAdded (p0, p1);
	}

	private native void n_onMediaAdded (int p0, org.videolan.libvlc.Media p1);


	public void onMediaRemoved (int p0, org.videolan.libvlc.Media p1)
	{
		n_onMediaRemoved (p0, p1);
	}

	private native void n_onMediaRemoved (int p0, org.videolan.libvlc.Media p1);

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
