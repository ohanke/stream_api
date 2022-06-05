package com.oscarhanke.lectures;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture4 {
    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1,1,1,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,8,9);

        List<Integer> distincNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List size: " + distincNumbers.size());
    }
}
