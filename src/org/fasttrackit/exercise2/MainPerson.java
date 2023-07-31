package org.fasttrackit.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Melisa", 18, "Rosu");
        Person person2 = new Person("Alex", 21, "Blond");
        Person person3 = new Person("Mihaela", 36, "Negru");
        Person person4 = new Person("Luca", 53, "Negru");
        Person person5 = new Person("Mihnea", 25, "Blond");


        List<Person> personList =  new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);


        System.out.println(PersonMethods.getAllPersonsNames(personList));

        System.out.println("---------");
        Map<String, List<String>> personAgeFromName = PersonMethods.getAgeFromName(personList);
        System.out.println(personAgeFromName.get("Luca"));
        System.out.println(personAgeFromName.get("Mihaela"));

        System.out.println("---------");
        int givenAge = 28;
        List<Person> olderPersons = PersonMethods.olderThanGivenAge(personList, givenAge);
        for (Person person : olderPersons) {
            System.out.println(person.getName() + ", " + person.getAge());
        }

        System.out.println("---------");
        Map<String, List<String>> personNameFromHair = PersonMethods.getNameFromHair(personList);
        System.out.println(personNameFromHair.get("Negru"));
        System.out.println(personNameFromHair.get("Blond"));

        System.out.println("---------");
        Map<Integer, List<String>> personFromAge = PersonMethods.getPersonFromAge(personList);
        System.out.println(personFromAge.get(21));
        System.out.println(personFromAge.get(25));
    }
}
