package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture12UnderstandingCollect {
    public static void main(String[] args) {
        List<Person> people = getPeoples();

        List<String> names = people.stream()
                .map(Person::getFirstName)
                .collect(                                    //2
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );
//                .collect(                                  //1
//                        () -> new ArrayList<String>(),
//                        (List, element) -> List.add(element),
//                        (List1, List2) -> List1.addAll(List2)
//                );
//                .collect(Collectors.toList());             //3

        names.forEach(System.out::println);
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
