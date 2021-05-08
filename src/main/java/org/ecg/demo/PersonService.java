package org.ecg.demo;

public class PersonService {

    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public void createPerson(String name, String lastname) {
        Person personA = new Person(name, lastname);
        personDAO.savePerson(personA);
    }
}
