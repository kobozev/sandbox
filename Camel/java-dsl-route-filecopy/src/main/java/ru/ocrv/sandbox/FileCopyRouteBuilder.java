package ru.ocrv.sandbox;

import org.apache.camel.builder.RouteBuilder;

public class FileCopyRouteBuilder extends RouteBuilder {

    public void configure() {

        from("file:src/data?noop=true").
                to("file:target/messages");

    }

}
