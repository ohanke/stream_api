package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture13IntermediateAndTerminalOperations {
    public static void main(String[] args) {
        List<Person> people = getPeoples();

        System.out.println(
                people.stream()
                        .filter(person -> {
                            System.out.println("Filtering people: " + person);
                            return person.getAge() > 5;
                        })
                        .map(person -> {
                            System.out.println("Mapping person: " + person);
                            return person.getAge();
                        })
                        .map(age -> {
                            System.out.println("Mapping age: " + age);
                            return age + (age * 2);
                        })
                        .collect(Collectors.toList())
        );
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
