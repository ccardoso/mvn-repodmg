/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import healthy.rim.Container;
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
@XmlRootElement(name = "ContainerArchetype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerArchetype")
public class ContainerArchetype extends EntityArchetype {

    @XmlElement(name = "container", type = healthy.rim.Container.class, required = true)
    private Container container;

    public ContainerArchetype() {
    }

    public ContainerArchetype(Container container) {
        this.container = container;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.container);
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
        final ContainerArchetype other = (ContainerArchetype) obj;
        if (!Objects.equals(this.container, other.container)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonArchetype{" + "container=" + container.toString() + '}';
    }
}
