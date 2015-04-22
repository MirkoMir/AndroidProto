package trivec.solexperts.com;

import com.codename1.system.NativeInterface;

public interface SerialPortNative extends NativeInterface{
	public String getString(int Val, String otherVal);
	public String HelloJNI();

}
