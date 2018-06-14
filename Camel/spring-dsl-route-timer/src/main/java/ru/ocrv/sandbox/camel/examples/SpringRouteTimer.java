package ru.ocrv.sandbox.camel.examples;

import org.apache.camel.spring.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringRouteTimer {

    private static final Logger log = LoggerFactory.getLogger(SpringRouteTimer.class);

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        main.enableHangupSupport();
        main.run();
    }

}