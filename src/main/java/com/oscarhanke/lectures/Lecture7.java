package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;

public class Lecture7 {
    public static void main(String[] args) {
        List<Person> people = getPeoples();

        Long numberOfPeoplesWithNameOne = getNumberOfPeoplesWithNameOne(people);
        System.out.println("numberOfPeoplesWithNameOne: " + numberOfPeoplesWithNameOne);

        Long numberOfPeoplesWithNameOneAndAgeTwo = getPeoplesWithNameOneAndAgeTwo(people);
        System.out.println("numberOfPeoplesWithNameOneAndAgeTwo: " + numberOfPeoplesWithNameOneAndAgeTwo);


        Integer minAgeForPersonWithNameOneWithoutComarator = getMinAgeForPersonWithNameOneWithoutComarator(people);
        System.out.println("minAgeForPersonWithNameOneWithoutComarator: " + minAgeForPersonWithNameOneWithoutComarator);

        Integer maxAgeForPersonWithNameOneWithoutComarator = getMaxAgeForPersonWithNameOneWithoutComarator(people);
        System.out.println("maxAgeForPersonWithNameOneWithoutComarator: " + maxAgeForPersonWithNameOneWithoutComarator);
    }

    private static Integer getMaxAgeForPersonWithNameOneWithoutComarator(List<Person> people) {
        return people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase("one"))
                .mapToInt(Person::getAge)
//                .mapToInt(person -> person.getAge())
                .max()
                .orElse(0);
    }

    private static Integer getMinAgeForPersonWithNameOneWithoutComarator(List<Person> people) {
        return people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase("one"))
                .mapToInt(Person::getAge)
//                .mapToInt(person -> person.getAge())
                .min()
                .orElse(0);
    }

    private static Long getPeoplesWithNameOneAndAgeTwo(List<Person> people) {
        return people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase("one") && person.getAge().equals(2))
                .count();
    }

    private static Long getNumberOfPeoplesWithNameOne(List<Person> people) {
        return people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase("one"))
                .count();
    }

    public static List<Person> getPeoples(){
        String [] names = {"One","One","One","One","Five","Six","Seven","Eight","Nine","Ten"};
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
