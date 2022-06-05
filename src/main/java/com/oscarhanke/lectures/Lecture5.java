package com.oscarhanke.lectures;

import com.oscarhanke.beans.Person;
import com.oscarhanke.beans.PersonDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture5 {
    public static void main(String[] args) {
        List<Person> peoples = getPeoples();

        List<Person> peoplesOverSeven = getPeoplesOverSevenYearsOld(peoples);
        System.out.println("PeoplesOverSeven size: " + peoplesOverSeven.size());

        List<PersonDTO> dtos = personToPersonDTO(peoples);
        System.out.println("dtos size: " + dtos.size());

        Double averageAge = getAverageAge(peoples);
        System.out.println("Average age: " + averageAge);
    }

    public static Double getAverageAge(List<Person> peoples){
        return peoples.stream().
                mapToDouble(Person::getAge)
//                mapToDouble(person -> person.getAge())
                .average()
                .orElse(0);
    }

    public static List<PersonDTO> personToPersonDTO(List<Person> peoples){
        return peoples.stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))
//                .map(PersonDTO::map)
                    // or this
//                .map(person -> {
//                    PersonDTO dto = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
//                    return dto;
//                })
                .collect(Collectors.toList());

    }

    public static List<Person> getPeoplesOverSevenYearsOld(List<Person> peoples){
        return peoples.stream()
                .filter(person -> person.getAge() > 7)
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
