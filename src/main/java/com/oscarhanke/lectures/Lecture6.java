package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6 {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};
        Integer number = findAnyLowerThanTen(numbers);
        System.out.println(number);
    }

    public static Integer findAnyLowerThanTen(Integer [] numbers){
        return Arrays.stream(numbers)
                .filter(number -> number < 10)
                .findAny().orElse(0);
    }
}
