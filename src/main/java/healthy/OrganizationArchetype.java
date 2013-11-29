/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import healthy.rim.Organization;
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
@XmlRootElement(name = "OrganizationArchetype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationArchetype")
public class OrganizationArchetype extends EntityArchetype {

    @XmlElement(name = "organization", type = healthy.rim.Organization.class, required = true)
    private Organization organization;

    public OrganizationArchetype() {
        super.header.setType(EntityArchetypeType.ORGANIZATION);
    }

    public OrganizationArchetype(Organization organization) {
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.organization);
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
        final OrganizationArchetype other = (OrganizationArchetype) obj;
        if (!Objects.equals(this.organization, other.organization)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonArchetype{" + "organization=" + organization.toString() + '}';
    }
}
