/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import healthy.rim.type.AD;
import healthy.rim.type.BasicEN;
import healthy.rim.type.CD;
import healthy.rim.type.II;
import healthy.rim.type.TEL;
import java.util.Set;
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
@XmlRootElement(name = "PersonDemographicArchetype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDemographicArchetype")
public class PersonDemographicArchetype extends PersonBasicArchetype {

    // Education Level code
    @XmlElement(name = "educationLevel")
    private CD educationLevel;
    // address
    @XmlElement(name = "address")
    private AD address;
    //
    @XmlElement(name = "telecom")
    private Set<TEL> telecom;
    // 
    @XmlElement(name = "careGiver")
    private Set<TEL> careGiver;

    public PersonDemographicArchetype() {
        super.header.setType(EntityArchetypeType.PERSON);
    }

    public PersonDemographicArchetype(CD educationLevel, AD address, Set<TEL> telecom, Set<TEL> careGiver, Set<II> personId, BasicEN personName, Set<BasicEN> filiation, String administrativeGenderCode) {
        super(personId, personName, filiation, administrativeGenderCode);
        this.educationLevel = educationLevel;
        this.address = address;
        this.telecom = telecom;
        this.careGiver = careGiver;
        super.header.setType(EntityArchetypeType.PERSON);
    }

    public CD getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(CD educationLevel) {
        this.educationLevel = educationLevel;
    }

    public AD getAddress() {
        return address;
    }

    public void setAddress(AD address) {
        this.address = address;
    }

    public Set<TEL> getTelecom() {
        return telecom;
    }

    public void setTelecom(Set<TEL> telecom) {
        this.telecom = telecom;
    }

    public Set<TEL> getCareGiver() {
        return careGiver;
    }

    public void setCareGiver(Set<TEL> careGiver) {
        this.careGiver = careGiver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.educationLevel);
        hash = 17 * hash + Objects.hashCode(this.address);
        hash = 17 * hash + Objects.hashCode(this.telecom);
        hash = 17 * hash + Objects.hashCode(this.careGiver);
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
        final PersonDemographicArchetype other = (PersonDemographicArchetype) obj;
        if (!Objects.equals(this.educationLevel, other.educationLevel)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.telecom, other.telecom)) {
            return false;
        }
        if (!Objects.equals(this.careGiver, other.careGiver)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonDemographicArchetype{" + "educationLevel=" + educationLevel + ", address=" + address + ", telecom=" + telecom + ", careGiver=" + careGiver + '}';
    }
}
