package ru.ocrv.sandbox.camel.examples;

import org.apache.camel.builder.RouteBuilder;

public class FileCopyRouteBuilder extends RouteBuilder {

    public void configure() {

        from("file:src/data?noop=true").
                to("file:target/messages");

    }

}
