package com.picnic;

import com.picnic.foo.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Picnic extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launchApp(Picnic.class, MainView.class, args);
    }


}