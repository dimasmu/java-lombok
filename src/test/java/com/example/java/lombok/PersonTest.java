package com.example.java.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void createViaConstructor() {

        var hobbies = new ArrayList<String>();
        hobbies.add("game");
        hobbies.add("traveling");
        hobbies.add("Read");
        Person person = new Person("id", "name", 30, hobbies);
    }

    @Test
    void createViaSetter() {

        var hobbies = new ArrayList<String>();
        hobbies.add("game");
        hobbies.add("traveling");
        hobbies.add("Read");
        Person person = new Person();
        person.setId("id");
        person.setName("name");
        person.setHobbies(hobbies);
        person.setAge(30);
    }

    @Test
    void createViaBuilder() {
        var hobbies = new ArrayList<String>();
        hobbies.add("game");
        hobbies.add("traveling");
        hobbies.add("Read");
        Person person1 = Person.builder().id("id").name("name").hobbies(hobbies).build();

        Person.PersonBuilder personBuilder = Person.builder()
                .id("id")
                .name("name")
                .hobby("game")
                .hobby("traveling")
                .hobby("Read");
        Person person2 = personBuilder.build();

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }

}
