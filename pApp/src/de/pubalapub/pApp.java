package de.pubalapub;


import com.codename1.ui.Display;
import com.codename1.ui.Form;
import userclasses.StateMachine;

public class pApp {
   
    private Form current;

    public void init(Object context) {
    }

    public void start() {
        if(current != null){
            current.show();
            System.out.println(current.getLayoutHeight());
            return;
        }
        StateMachine sm = new StateMachine("/theme");
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }
}
