package marcink.crud.DAO;

import marcink.crud.model.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marcin on 2014-09-15.
 */

@Repository
public class PersonDAOimpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Person getPerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person person = (Person) session.get(Person.class, id);
        return person;
    }

    @Override
    public List<Person> personList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("SELECT p FROM Person p");
        return query.list();
    }

    @Override
    public void addPerson(Person person) {
        sessionFactory.getCurrentSession().save(person);
    }

    @Override
    public void updatePerson(Person person) {
        sessionFactory.getCurrentSession().update(person);
    }

    @Override
    public void deletePerson(int id) {
        Person person = getPerson(id);
        sessionFactory.getCurrentSession().delete(person);
    }
}
