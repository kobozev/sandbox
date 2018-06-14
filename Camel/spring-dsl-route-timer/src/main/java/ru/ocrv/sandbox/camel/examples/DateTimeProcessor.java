package ru.ocrv.sandbox.camel.examples;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultMessage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeProcessor implements  Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        DefaultMessage message = new DefaultMessage();

        message.setBody(now.format(formatter));

        exchange.setOut(message);

    }

}