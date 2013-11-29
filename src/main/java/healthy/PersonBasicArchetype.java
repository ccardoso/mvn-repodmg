/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import healthy.rim.type.BasicEN;
import healthy.rim.type.II;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author llerena
 */
@XmlRootElement(name = "PersonBasicArchetype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBasicArchetype")
public class PersonBasicArchetype extends EntityArchetype {

    // Id
    @XmlElementWrapper(name = "personIds", required = true)
    @XmlElement(name = "personId", required = true)
    private Set<II> personId = new HashSet<>();
    // Name 
    @XmlElement(name = "personName", type = healthy.rim.type.BasicEN.class, required = true)
    private BasicEN personName = new BasicEN();
    // Filiation
    @XmlElementWrapper(name = "filiations", required = true)
    @XmlElement(name = "filiation", required = true)
    private Set<BasicEN> filiation = new HashSet<>();
    //
    @XmlElement(name = "administrativeGenderCode", required = true)
    private String administrativeGenderCode = "";

    public PersonBasicArchetype() {
        super();
        super.header.setType(EntityArchetypeType.PERSON);
        personId.add(new II());
        filiation.add(new BasicEN());
    }

    public PersonBasicArchetype(Set<II> personId, BasicEN personName, Set<BasicEN> filiation, String administrativeGenderCode) {
        this.personId = personId;
        this.personName = personName;
        this.filiation = filiation;
        this.administrativeGenderCode = administrativeGenderCode;
        super.header.setType(EntityArchetypeType.PERSON);
    }

    public Set<II> getPersonId() {
        return personId;
    }

    public void setPersonId(Set<II> personId) {
        this.personId = personId;
    }

    public BasicEN getPersonName() {
        return personName;
    }

    public void setPersonName(BasicEN personName) {
        this.personName = personName;
    }

    public Set<BasicEN> getFiliation() {
        return filiation;
    }

    public void setFiliation(Set<BasicEN> filiation) {
        this.filiation = filiation;
    }

    public String getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }

    public void setAdministrativeGenderCode(String administrativeGenderCode) {
        this.administrativeGenderCode = administrativeGenderCode;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.personId);
        hash = 79 * hash + Objects.hashCode(this.personName);
        hash = 79 * hash + Objects.hashCode(this.filiation);
        hash = 79 * hash + Objects.hashCode(this.administrativeGenderCode);
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
        final PersonBasicArchetype other = (PersonBasicArchetype) obj;
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        if (!Objects.equals(this.personName, other.personName)) {
            return false;
        }
        if (!Objects.equals(this.filiation, other.filiation)) {
            return false;
        }
        if (!Objects.equals(this.administrativeGenderCode, other.administrativeGenderCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonBasicArchetype{" + "personId=" + personId + ", personName=" + personName + ", filiation=" + filiation + ", administrativeGenderCode=" + administrativeGenderCode + '}';
    }
}
