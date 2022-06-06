package com.oscarhanke.lectures;

import java.util.Arrays;

public class Lecture6FindAnyOrFirst {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};
        Integer anyNumber = findAnyLowerThanTen(numbers);
        System.out.println("Find any: " + anyNumber);
        Integer firstNumber = findFirstLowerThanTen(numbers);
        System.out.println("Find first: " + firstNumber);
    }

    private static Integer findFirstLowerThanTen(Integer [] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number < 10)
                .findFirst()
                .orElse(0);
    }

    //find any may give different results but its faster than findFirst()
    public static Integer findAnyLowerThanTen(Integer [] numbers){
        return Arrays.stream(numbers)
                .filter(number -> number < 10)
                .findAny()
                .orElse(0);
    }
}
