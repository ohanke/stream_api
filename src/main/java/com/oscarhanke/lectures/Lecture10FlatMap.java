package com.oscarhanke.lectures;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture10FlatMap {
    public static void main(String[] args) {
        List<List<String>> listOfListsOfNames = List.of(
                List.of("Mariam", "Alex", "Ismail"),
                List.of("John", "Alesha", "Andre"),
                List.of("Susy", "Ali")
        );

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
