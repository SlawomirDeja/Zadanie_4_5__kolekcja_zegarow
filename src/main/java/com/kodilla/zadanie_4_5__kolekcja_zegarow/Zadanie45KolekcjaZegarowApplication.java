package com.kodilla.zadanie_4_5__kolekcja_zegarow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Zadanie45KolekcjaZegarowApplication {

    public static void main(String[] args) {
        SpringApplication.run(Zadanie45KolekcjaZegarowApplication.class, args);

        List<Clock> clocks = new LinkedList<>();

        clocks.add(new Clock());
        clocks.add(new Clock());
        clocks.add(new Clock());
        clocks.add(new Clock());
        clocks.add(new Clock());

        for (Clock clock: clocks) clock.addMinute();
    }

}
