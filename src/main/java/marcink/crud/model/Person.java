package marcink.crud.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Marcin on 2014-09-15.
 */

@Entity
@Table(name = "person")
@NamedQueries({
        @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")})
public class Person {
	
	syso("gsvCKJV");

    @Id
    @Entity
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "name cannot be null")
    @Size(min = 1, max = 30, message = "The name length must be between {min} and {max}")
    @Column
    private String name;

    @NotEmpty(message = "surname cannot be null")
    @Size(min = 1, max = 30, message = "The surname length must be between {min} and {max}")
    @Column(name = "surname")
    private String surname;

    @NotEmpty(message = "address cannot be null")
    @Size(min = 1, max = 50, message = "The address length must be between {min} and {max}")
    @Column
    private String address;

    @Size(min = 9, max = 9, message = "The phone number length must have 9 numbers")
    @Column
    private String phone;


    public Person() {

    }

    public Person(Integer id, String name, String surname, String address, String phone) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public String getage(){
    	
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
