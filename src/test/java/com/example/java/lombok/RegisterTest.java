package com.example.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {
    // with berfungsi untuk membuat objek yg hampir mirip agar lebih cepat
    @Test
    void testWith() {

        var registry1 = new Register("moko", "rahasia");
        var registry2 = registry1.withUsername("moko2");

        Assertions.assertEquals(registry1.getPassword(), registry2.getPassword());
        Assertions.assertNotEquals(registry1.getUsername(), registry2.getUsername());

        System.out.println(registry1);
        System.out.println(registry2);

    }

}
