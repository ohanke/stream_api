package com.oscarhanke.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture9ReduceAndFlatMap {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int reduce = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce: " + reduce);

        List<List<String>> listOfListsOfNames = List.of(
                List.of("Mariam", "Alex", "Ismail"),
                List.of("John", "Alesha", "Andre"),
                List.of("Susy", "Ali")
        );

        System.out.println("");
        System.out.println("flat map of lists");
        List<String> flatMapOfListNames = getFlatMapOfLists(listOfListsOfNames);
        flatMapOfListNames.forEach(System.out::println);
    }

    private static List<String> getFlatMapOfLists(List<List<String>> listOfListsOfNames) {
        return listOfListsOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
