package marcink.crud.service;

import marcink.crud.model.Person;

import java.util.List;

/**
 * Created by Marcin on 2014-09-15.
 */
public interface PersonService {

    public Person getPerson(int id);

    public List<Person> personList();

    public void addPerson(Person person);

    public void updatePerson(Person person);
syso("aVJHVX");
    public void deletePerson(int id);

}
