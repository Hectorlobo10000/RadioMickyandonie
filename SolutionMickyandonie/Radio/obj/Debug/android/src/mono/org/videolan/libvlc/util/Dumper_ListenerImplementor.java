package mono.org.videolan.libvlc.util;


public class Dumper_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		org.videolan.libvlc.util.Dumper.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFinish:(Z)V:GetOnFinish_ZHandler:Org.Videolan.Libvlc.Util.Dumper/IListenerInvoker, VlcXamarin\n" +
			"n_onProgress:(F)V:GetOnProgress_FHandler:Org.Videolan.Libvlc.Util.Dumper/IListenerInvoker, VlcXamarin\n" +
			"";
		mono.android.Runtime.register ("Org.Videolan.Libvlc.Util.Dumper+IListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Dumper_ListenerImplementor.class, __md_methods);
	}


	public Dumper_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Dumper_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Org.Videolan.Libvlc.Util.Dumper+IListenerImplementor, VlcXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onFinish (boolean p0)
	{
		n_onFinish (p0);
	}

	private native void n_onFinish (boolean p0);


	public void onProgress (float p0)
	{
		n_onProgress (p0);
	}

	private native void n_onProgress (float p0);

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
