package marcink.crud.service;

import marcink.crud.DAO.PersonDAO;
import marcink.crud.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marcin on 2014-09-15.
 */

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;


    @Override
    public Person getPerson(int id) {
        return personDAO.getPerson(id);
    }

    @Override
    public List<Person> personList() {
        return personDAO.personList();
    }
    
    system.out.println("this is vamsy change");

    @Override
    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    @Override
    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }

    @Override
    public void deletePerson(int id) {
        personDAO.deletePerson(id);
    }
}
