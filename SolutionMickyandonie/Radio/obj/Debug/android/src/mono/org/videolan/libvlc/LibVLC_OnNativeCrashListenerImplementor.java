package mono.org.videolan.libvlc;


public class LibVLC_OnNativeCrashListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.LibVLC.OnNativeCrashListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNativeCrash:()V:GetOnNativeCrashHandler:Org.Videolan.Libvlc.LibVLCLibVLC/IOnNativeCrashListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.LibVLCLibVLC+IOnNativeCrashListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", LibVLC_OnNativeCrashListenerImplementor.class, __md_methods);
	}


	public LibVLC_OnNativeCrashListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == LibVLC_OnNativeCrashListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.LibVLCLibVLC+IOnNativeCrashListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onNativeCrash ()
	{
		n_onNativeCrash ();
	}

	private native void n_onNativeCrash ();

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
