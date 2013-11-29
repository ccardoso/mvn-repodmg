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
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 18-Jul-2013
 */
@XmlRootElement(name = "EntityArchetypeHeader")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityArchetypeHeader")
public class EntityArchetypeHeader implements Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "type", required = true, nillable = false)
    private EntityArchetypeType type;
    @XmlElement(name = "name")
    private static final String name = "Living Person Archetype";
    @XmlElement(name = "author")
    private static final String author = "TICE Helthy PPS2";

    /**
     * Typed Constructor
     *
     */
    public EntityArchetypeHeader() {
    }

    public EntityArchetypeHeader(EntityArchetypeType type) {
        this.type = type;
    }

    /**
     *
     * @return archetype type
     */
    public EntityArchetypeType getType() {
        return type;
    }

    public void setType(EntityArchetypeType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return Archetype author
     */
    public String getAuthor() {
        return author;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.author);
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
        final EntityArchetypeHeader other = (EntityArchetypeHeader) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.author, other.author);
    }

    @Override
    public String toString() {
        return "ArchetypeHeader{" + "name=" + name + ", author=" + author + '}';
    }
}
