package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;

// find peoples with age <= 5
// then change impl to find first 3 peoples

public class Lecture1Imperative {
    public static void main(String[] args) {
        List<Person> peoples = getPeoples();

        System.out.println("Peoples with age up to five: ");
        List<Person> peopleWithAgeUpToFive = getPeoplesWithAgeUpToFive(peoples);
        peopleWithAgeUpToFive.forEach(System.out::println);
    }

    public static List<Person> getPeoplesWithAgeUpToFive (List<Person> peoples){
        int counter = 0; //
        final int limit = 3; //
        List<Person> peoplesWithAgeUpToFive = new ArrayList<>();
        for (Person person : peoples) {
            if (person.getAge() <= 5){
                peoplesWithAgeUpToFive.add(person);
                counter++;
                if (counter == limit){
                    break;
                }
            }
        }
        return peoplesWithAgeUpToFive;
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
