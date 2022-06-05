package com.oscarhanke.lectures;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lecture4 {
    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1,1,1,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,8,9);

        List<Integer> distincNumbersList = getDistincValuesList(numbers);
        System.out.println("");
        System.out.println("distincNumbersList :");
        distincNumbersList.forEach(System.out::println);

        Set<Integer> numberSet = getNumberSet(numbers);
        System.out.println("");
        System.out.println("NumberSet: ");
        numberSet.forEach(System.out::println);

    }

    public static List<Integer> getDistincValuesList(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Set<Integer> getNumberSet(List<Integer> numbers){
        return numbers.stream()
                .collect(Collectors.toSet());
    }
}
