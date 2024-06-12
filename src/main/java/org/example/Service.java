package org.example;

public class Service {

    public String getName(int number) {
        if (number <= 0) {
            return "a";
        } else {
            return "b";
        }
    }

    public void walk(int steps) {
        System.out.println("You take: " + steps + " steps.");
        if (steps <= 1) return;
        walk(steps - 1);
    }
}
