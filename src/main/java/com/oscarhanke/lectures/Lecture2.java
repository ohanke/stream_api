package com.oscarhanke.lectures;

import java.util.stream.IntStream;

public class Lecture2 {
    public static void main(String[] args) {
        System.out.println("For loop: ");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("IntStream exclusive: ");
        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println("");
        System.out.println("IntStream inclusive: ");
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }
}
