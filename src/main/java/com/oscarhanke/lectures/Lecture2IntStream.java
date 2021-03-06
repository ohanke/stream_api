package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lecture2IntStream {
    public static void main(String[] args) {
        System.out.println("For loop: ");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("IntStream exclusive: ");
        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println("");
        System.out.println("IntStream inclusive: ");
        IntStream.rangeClosed(0, 10).forEach(System.out::println);

        List<Person> peoples = getPeoples();
        intStreamThroughPeopleList(peoples);

        System.out.println("");
        System.out.println("IntStream.iterate: ");
        intStreamIterate(15);
    }

    public static void intStreamIterate(int limit){
        IntStream.iterate(0, operand -> operand + 1)
                .filter(number -> number % 2 == 0)
                .limit(limit)
                .forEach(System.out::println);
    }

    public static void intStreamThroughPeopleList(List<Person> peoples){
        IntStream.range(0, peoples.size()).forEach(index -> {
            Person person = peoples.get(index);
            System.out.println(person);
        });
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
