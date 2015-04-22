package trivec.solexperts.com;


import com.codename1.io.Log;
import com.codename1.system.NativeLookup;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Label;

import userclasses.StateMachine;

public class Trivec {
   
    private Form current;
    private String stringTest;

    public void init(Object context) {
        // Pro users - uncomment this code to get crash reports sent to you automatically
        /*Display.getInstance().addEdtErrorHandler(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                evt.consume();
                Log.p("Exception in AppName version " + Display.getInstance().getProperty("AppVersion", "Unknown"));
                Log.p("OS " + Display.getInstance().getPlatformName());
                Log.p("Error " + evt.getSource());
                Log.p("Current Form " + Display.getInstance().getCurrent().getName());
                Log.e((Throwable)evt.getSource());
                Log.sendLog();
            }
        });*/
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        
        SerialPortNative spn = (SerialPortNative)NativeLookup.create(SerialPortNative.class);
    	if(spn != null && spn.isSupported()){
    		stringTest = spn.HelloJNI();
    	}
    	Form hi = new Form("Hello");
    	hi.addComponent(new Label(stringTest));
    	hi.show();
        new StateMachine("/theme");        
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }
}
