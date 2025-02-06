package com.example.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testConstructorNull() {

//      untuk melakukan check apakah return member adalah null pointer exception
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member(null, null);
        });

    }

    @Test
    void testSetterNull() {

//      untuk melakukan check apakah return member adalah null pointer exception
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("muehehe", "awkawkawk");
            member.setId(null);
            member.setName(null);
        });

    }

    @Test
    void testMethodNull() {

//      untuk melakukan check apakah return member adalah null pointer exception
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("muehehe", "awkawkawk");
            member.sayHello(null);
        });

    }

}
