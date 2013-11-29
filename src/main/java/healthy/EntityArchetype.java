/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * This is a "base" Archetype container, it contains a header or archetype
 * formal definition, a description document wish contains the translations of
 * the body part and the body itself who defines the data content.
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 */
@XmlRootElement(name = "Archetype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Archetype")
@XmlSeeAlso(PersonArchetype.class)
public class EntityArchetype implements Serializable {

    protected static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "id", required = true, nillable = false)
    protected final long id = 101L;
    @XmlElement(name = "header", type = EntityArchetypeHeader.class, required = true, nillable = false)
    protected EntityArchetypeHeader header; 

    /**
     * Constructor
     *
     *
     */
    public EntityArchetype() {
        header = new EntityArchetypeHeader();
    }

    /**
     * Do get this archetype type (OBSERVATION, INSTRUCTION, EVALUATION) if null
     * is returned then this instance do not have header definition and this
     * object is malformed (wont work like that)
     *
     * @return an ArchetypeType enumerator
     */
    public EntityArchetypeType getType() {
        if (header != null) {
            return header.getType();
        } else {
            return null;
        }
    }

    /**
     * This archetype unique identifier
     *
     * @return long value
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return an ArchetypeHeader
     */
    public EntityArchetypeHeader getHeader() {
        return header;
    }
 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + (this.header == null ? 0 : this.header.hashCode()); 
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
        final EntityArchetype other = (EntityArchetype) obj;
        if (this.id != other.id) {
            return false;
        }
         return Objects.equals(this.header, other.header);
    }

    @Override
    public String toString() {
        return "Archetype{" + "id=" + id + "-" + header.getType().toString() + '}';
    }
}
