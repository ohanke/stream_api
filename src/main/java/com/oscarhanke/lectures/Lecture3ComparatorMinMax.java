package com.oscarhanke.lectures;

import java.util.Comparator;
import java.util.List;

public class Lecture3ComparatorMinMax {
    public static void main(String[] args) {
        final List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        System.out.println(getMinValue(numbers));
        System.out.println(getMaxValue(numbers));
    }

    public static int getMinValue(List<Integer> numbers){
        return numbers.stream()
                .min(Comparator.naturalOrder())
                //.min((x, y) -> x > y ? 1 : 0)
                .get();
    }

    public static int getMaxValue(List<Integer> numbers){
        return numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
    }
}


