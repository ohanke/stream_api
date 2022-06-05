package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1Functional {
    public static void main(String[] args) {
        List<Person> peoples = getPeoples();

        List<Person> peoplesWithAgeUpToFive = getPeoplesWithAgeUpToFive(peoples);
        peoplesWithAgeUpToFive.forEach(System.out::println);
    }

    public static List<Person> getPeoplesWithAgeUpToFive (List<Person> peoples) {
        int maxAge = 5;
        return peoples.stream()
                .filter(person -> person.getAge() <= maxAge)
                .limit(3)
                .collect(Collectors.toList());

    }

    public static List<Person> getPeoples(){
        String [] names = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",};
        int peoplesAmount = 10;
        List<Person> peoples = new ArrayList<>();
        for (int i = 0; i < peoplesAmount; i++){
            int id = i;
            int age = i + 1;
            peoples.add(new Person(id, names[i] ,age));
        }
        return peoples;
    }
}
