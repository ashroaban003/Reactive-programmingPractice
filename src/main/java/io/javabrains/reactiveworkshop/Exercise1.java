package io.javabrains.reactiveworkshop;

import java.nio.file.OpenOption;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(x->x<5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(x->x>5).sorted().limit(3).skip(1).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Optional<Integer> ds = StreamSources.intNumbersStream().filter(x->x>5).findFirst();
        System.out.println(ds.isPresent()?ds.get():-1);

        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().map(x->x.getFirstName()).forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        Set<Integer> intstream = StreamSources.intNumbersStream().collect(Collectors.toSet());
        StreamSources.userStream()
        .filter(x->intstream.contains(x.getId()))
        .forEach(System.out::println);
        

    } 

}
