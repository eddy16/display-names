package org.ecg.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonDAO personDAO;

    private PersonService personService;

    @BeforeEach
    void setup() {
        personService = new PersonService(personDAO);
    }

    @Test
    void createPerson() {
        Mockito.doNothing().when(personDAO).savePerson(ArgumentMatchers.any(Person.class));
        personService.createPerson("Edgar", "Cirilo");
    }
}
