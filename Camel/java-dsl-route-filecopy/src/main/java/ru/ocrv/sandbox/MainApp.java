package ru.ocrv.sandbox;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

    public static void main(String... args) throws Exception {

        // create CamelContext
        CamelContext context = new DefaultCamelContext();

        context.addRoutes(new FileCopyRouteBuilder());

        // start the route and let it do its work
        context.start();
        Thread.sleep(10000);

        // stop the CamelContext
        context.stop();

    }
}
