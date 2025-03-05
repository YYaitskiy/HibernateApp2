package org.example.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Passport")
public class Passport implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    @Column(name = "passport_number")
    private int passwordNumber;

    public Passport() {
    }

    public Passport(int passwordNumber) {
        this.passwordNumber = passwordNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPasswordNumber() {
        return passwordNumber;
    }

    public void setPasswordNumber(int passwordNumber) {
        this.passwordNumber = passwordNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "person=" + person +
                ", passwordNumber=" + passwordNumber +
                '}';
    }
}
