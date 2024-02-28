package com.gurudev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Personal Data")
class EntityTest {

    private Entity entity;

    @BeforeEach
    void setUp() {

        entity = new Entity();

    }

    @DisplayName("Testing data for Person 1")
    @Test
    void entityTestPerson1() {
        
        entity.setFirstName("John");
        entity.setLastName("Doe");
        entity.setEmail("john.doe@example.com");
        entity.setDateOfBirth("1980-01-01");
        entity.setContactNumber(123 - 456 - 7890);

        assertEquals("John", entity.getFirstName());
        assertEquals("Doe", entity.getLastName());
        assertEquals("john.doe@example.com", entity.getEmail());
        assertEquals("1980-01-01", entity.getDateOfBirth());
        assertEquals(123 - 456 - 7890, entity.getContactNumber());

    }

    @DisplayName("Testing data for Person 2")
    @Test
    void entityTestPerson2() {

        entity.setFirstName("Jane");
        entity.setLastName("Smith");
        entity.setEmail("jane.smith@example.com");
        entity.setDateOfBirth("1985-02-02");
        entity.setContactNumber(234 - 567 - 8901);

        assertEquals("Jane", entity.getFirstName());
        assertEquals("Smith", entity.getLastName());
        assertEquals("jane.smith@example.com", entity.getEmail());
        assertEquals("1985-02-02", entity.getDateOfBirth());
        assertEquals(234 - 567 - 8901, entity.getContactNumber());
    }

    @DisplayName("Testing data for Person 3")
    @Test
    void entityTestPerson3() {

        entity.setFirstName("Bob");
        entity.setLastName("Johnson");
        entity.setEmail("bob.johnson@example.com");
        entity.setDateOfBirth("1990-03-03");
        entity.setContactNumber(345 - 678 - 9012);

        assertEquals("Bob", entity.getFirstName());
        assertEquals("Johnson", entity.getLastName());
        assertEquals("bob.johnson@example.com", entity.getEmail());
        assertEquals("1990-03-03", entity.getDateOfBirth());
        assertEquals(345 - 678 - 9012, entity.getContactNumber());
    }

    @DisplayName("Testing data for Person 3")
    @Test
    void entityTestPerson4() {

        entity.setFirstName("Alice");
        entity.setLastName("Williams");
        entity.setEmail("alice.williams@example.com");
        entity.setDateOfBirth("1995-04-04");
        entity.setContactNumber(456 - 789 - 0123);

        assertEquals("Alice", entity.getFirstName());
        assertEquals("Williams", entity.getLastName());
        assertEquals("alice.williams@example.com", entity.getEmail());
        assertEquals("1995-04-04", entity.getDateOfBirth());
        assertEquals(456 - 789 - 0123, entity.getContactNumber());


    }

    @DisplayName("Testing Data for Person 3")
    @Test
    void entityTestPerson5() {

        entity.setFirstName("Charlie");
        entity.setLastName("Brown");
        entity.setEmail("charlie.brown@example.com");
        entity.setDateOfBirth("2000-05-05");
        entity.setContactNumber(567 - 890 - 1234);

        assertEquals("Charlie", entity.getFirstName());
        assertEquals("Brown", entity.getLastName());
        assertEquals("charlie.brown@example.com", entity.getEmail());
        assertEquals("2000-05-05", entity.getDateOfBirth());
        assertEquals(567 - 890 - 1234, entity.getContactNumber());
    }


}
