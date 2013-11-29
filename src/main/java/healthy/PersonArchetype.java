/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import healthy.rim.Person;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author llerena
 */
@XmlRootElement(name = "PersonArchetype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonArchetype")
public class PersonArchetype extends EntityArchetype {

    @XmlElement(name = "person", type = healthy.rim.Person.class, required = true)
    private Person person;

    private PersonArchetype() {
        person = new Person();
    }

    public PersonArchetype(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.person);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonArchetype other = (PersonArchetype) obj;
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonArchetype{" + "person=" + person.toString() + '}';
    }
}
