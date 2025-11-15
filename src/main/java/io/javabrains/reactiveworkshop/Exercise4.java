package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.stream.Collector;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(System.out::println);

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        ReactiveSources.intNumberMono().flux().toStream().findAny().get();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
