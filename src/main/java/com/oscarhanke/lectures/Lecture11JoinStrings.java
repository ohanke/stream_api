package com.oscarhanke.lectures;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture11JoinStrings {
    public static void main(String[] args) {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");

        joiningStrings(names);
        String joinedStrings = joiningStringWithStreams(names);
        System.out.println(joinedStrings);
    }

    private static String joiningStringWithStreams(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("|"));
    }

    private static void joiningStrings(List<String> names) {
        String join = "";

        for (String name : names) {
            join += name + ", ";
        }

        System.out.println(join.substring(0, join.length()-2));
    }
}
