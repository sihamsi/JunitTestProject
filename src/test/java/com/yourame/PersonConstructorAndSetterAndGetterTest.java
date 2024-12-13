package com.yourame;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sao.Person;

public class PersonConstructorAndSetterAndGetterTest {

    @Test
    public void testPersonConstructor() {
       
        Person jamalPerson = new Person();

        jamalPerson.setFirstName("Jamal");
        jamalPerson.setLastName("Jamali");

        assertNotNull(jamalPerson);
        assertEquals("Jamal", jamalPerson.getFirstName());
        assertEquals("Jamali", jamalPerson.getLastName());
    }
     }
