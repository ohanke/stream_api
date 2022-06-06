package com.oscarhanke.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture9Reduce {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int reduce = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce: " + reduce);


    }
}
