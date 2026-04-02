package com.kodilla.zadanie_4_5__kolekcja_zegarow;

public class Clock {
    private int minutes = 0;

    public void addMinute() {
        if (minutes >= 59) minutes = 0;
            else minutes++;
    }

    @Override
    public String toString() {
        return Integer.toString(minutes);
    }
}
