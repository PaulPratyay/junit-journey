package com.gurudev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test for Login Credentials")
class ServiceTest {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @DisplayName("Testing Login Credentials for Person 1")
    @Test
    void serviceTestPerson1() {

        service.setUserName("John_Doe");
        service.setPassword("john12@doe");

        assertEquals("John_Doe", service.getUserName());
        assertEquals("john12@doe", service.getPassword());
    }

    @DisplayName("Testing Login Credentials for Person 2")
    @Test
    void serviceTestPerson2() {

        service.setUserName("Jane_Smith");
        service.setPassword("Jane34#smith");

        assertEquals("Jane_Smith", service.getUserName());
        assertEquals("Jane34#smith", service.getPassword());
    }

    @DisplayName("Testing Login Credentials for Person 3")
    @Test
    void serviceTestPerson3() {

        service.setUserName("Bob_Johnson");
        service.setPassword("bob56$johnson");

        assertEquals("Bob_Johnson", service.getUserName());
        assertEquals("bob56$johnson", service.getPassword());
    }

    @DisplayName("Testing Login Credentials for Person 4")
    @Test
    void serviceTestPerson4() {

        service.setUserName("Alice_Williams");
        service.setPassword("Alice78&williams");

        assertEquals("Alice_Williams", service.getUserName());
        assertEquals("Alice78&williams", service.getPassword());
    }

    @DisplayName("Testing Login Credentials for Person 5")
    @Test
    void serviceTestPerson5() {

        service.setUserName("Charlie_Brown");
        service.setPassword("Charlie90*brown");

        assertEquals("Charlie_Brown", service.getUserName());
        assertEquals("Charlie90*brown", service.getPassword());
    }


}
