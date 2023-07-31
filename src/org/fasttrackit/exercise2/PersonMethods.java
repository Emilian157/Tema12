package org.fasttrackit.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMethods {
    public static List<String> getAllPersonsNames(List<Person> personList) {
        List<String> personsNames = new ArrayList<>();

        for (Person name : personList) {
            personsNames.add(name.getName());
        }

        return personsNames;
    }

    public static Map<String, List<String>> getAgeFromName(List<Person> personList) {
        Map<String, List<String>> ageFromName = new HashMap<>();

        for(Person person : personList) {
            String personName = person.getName();
            Integer personAge = person.getAge();

            if(!ageFromName.containsKey(personName)) {
                List<String> listOfAge = new ArrayList<>();
                listOfAge.add(String.valueOf(personAge));
                ageFromName.put(personName, listOfAge);
            } else {
                List<String> existingPersons = ageFromName.get(personName);
                existingPersons.add(String.valueOf(personAge));
                ageFromName.put(personName, existingPersons);
            }
        }
        return ageFromName;
    }
    public static List<Person> olderThanGivenAge(List<Person> personList, int age){
        List<Person> olderThanGivenAge = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                olderThanGivenAge.add(person);
            }
        }
        return olderThanGivenAge;
    }

    public static Map<String, List<String>> getNameFromHair(List<Person> personList) {
        Map<String, List<String>> nameFromHair = new HashMap<>();

        for(Person person : personList) {
            String personHair = person.getHairColor();
            String personName = person.getName();

            if(!nameFromHair.containsKey(personHair)) {
                List<String> listOfName = new ArrayList<>();
                listOfName.add(personName);
                nameFromHair.put(personHair, listOfName);
            } else {
                List<String> existingPersons = nameFromHair.get(personHair);
                existingPersons.add(personName);
                nameFromHair.put(personHair, existingPersons);
            }
        }
        return nameFromHair;
    }
    public static Map<Integer, List<String>> getPersonFromAge(List<Person> personList) {
        Map<Integer, List<String>> personFromAge = new HashMap<>();

        for(Person person : personList) {
            Integer personAge = person.getAge();
            String getPerson = person.toString();


            if(!personFromAge.containsKey(personAge)) {
                List<String> listOfPersons = new ArrayList<>();
                listOfPersons.add(getPerson);
                personFromAge.put(personAge, listOfPersons);
            } else {
                List<String> existingPersons = personFromAge.get(personAge);
                existingPersons.add(getPerson);
                personFromAge.put(personAge, existingPersons);
            }
        }
        return personFromAge;
    }

}
