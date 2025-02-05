package com.example.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {

        Customer customer = new Customer();
        customer.setId("100");
        customer.setName("John");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructor() {

        var customer = new Customer("100", "John");
        Assertions.assertEquals("100", customer.getId());
        Assertions.assertEquals("John", customer.getName());

    }

    @Test
    void testEquals() {

        var customer = new Customer("100", "John");
        var customer2 = new Customer("100", "John");

        Assertions.assertEquals(customer, customer2);
        Assertions.assertEquals(customer.hashCode(), customer2.hashCode());

    }
}
