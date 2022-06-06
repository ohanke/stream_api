package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lecture8GroupBy {
    public static void main(String[] args) {
        List<Person> people = getPeoples();

        Map<Integer, List<Person>> simpleGrouping = getSimpleGrouping(people);
        simpleGrouping.forEach((age, peoples) -> {
            System.out.println(age);
            peoples.forEach(System.out::println);
        });

        System.out.println("");
        System.out.println("GroupingAndCounting: ");
        Map<String, Long> groupingAndCounting = getGroupingAndCounting(people);
        groupingAndCounting.forEach((name, count) -> System.out.println(name + " > " + count));

    }

    private static Map<String, Long> getGroupingAndCounting(List<Person> people){
        return people.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                .collect(Collectors.groupingBy(Person::getFirstName, Collectors.counting()));
    }

    private static Map<Integer, List<Person>> getSimpleGrouping(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    public static List<Person> getPeoples(){
        String [] names = {"One","One","One","One","Five","Six","Seven","Seven","Nine","Ten"};
        Integer [] age = {3, 2, 5, 2, 2, 6, 7, 8, 9, 10};
        int peoplesAmount = 10;
        List<Person> peoples = new ArrayList<>();
        for (int i = 0; i < peoplesAmount; i++){
            int id = i;
            peoples.add(new Person(id, names[i] ,age[i]));
        }
        return peoples;
    }
}
