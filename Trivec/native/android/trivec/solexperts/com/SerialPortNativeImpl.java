package trivec.solexperts.com;
import serial.solexperts.com.serialport;

public class SerialPortNativeImpl {
    public String getString(int param, String param1) {
    	if(param == null){
    		param1 = "Hallo from native IMPL";
    	}
        return null;
    }
    
    public String testHelloJNI(){
    	SerialPort sp = new SerialPort();
    	return sp.HelloJNI();
    }

    public boolean isSupported() {
        return true;
    }

}
