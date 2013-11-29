package healthy.rim.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * * A name for a person, organisation, place or thing. A sequence of name
 * parts, * such as given name or family name. Examples for
 * entity * name values are &quot;Ant&oacute;nio de Sousa Campos.&quot;,
 * &quot;Centro de * Saude de Aveiro.&quot;, &quot;Microsoft Corporation&quot;,
 * etc. An entity * name may be as simple as a character string or may consist
 * of several entity * name parts, such as, &quot;Ant&oacute;nio&quot;, &quot;de
 * Sousa&quot;, * &quot;Campos&quot;
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 30-Oct-2013
 */
@XmlRootElement(name = "BasicEN")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicEN", propOrder = {"given", "middle", "family", "fullName"})
public class BasicEN extends RimDataType {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(required = true)
    private String given = "";
    @XmlElement
    private String middle = "";
    @XmlElement
    private String family = "";
    @XmlElement
    private String fullName = "";

    public BasicEN() {
    }

    public BasicEN(String given, String middle, String family) {
        this.given = given;
        this.middle = middle;
        this.family = family;
        this.fullName = given + " " + middle + " " + family;
    }

    public String getGiven() {
        return given;
    }

    public void setGiven(String given) {
        this.fullName = given + " " + middle + " " + family;
        this.given = given;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.fullName = given + " " + middle + " " + family;
        this.middle = middle;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.fullName = given + " " + middle + " " + family;
        this.family = family;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.given != null ? this.given.hashCode() : 0);
        hash = 59 * hash + (this.middle != null ? this.middle.hashCode() : 0);
        hash = 59 * hash + (this.family != null ? this.family.hashCode() : 0);
        hash = 59 * hash + (this.fullName != null ? this.fullName.hashCode() : 0);
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
        final BasicEN other = (BasicEN) obj;
        if ((this.given == null) ? (other.given != null) : !this.given.equals(other.given)) {
            return false;
        }
        if ((this.middle == null) ? (other.middle != null) : !this.middle.equals(other.middle)) {
            return false;
        }
        if ((this.family == null) ? (other.family != null) : !this.family.equals(other.family)) {
            return false;
        }
        if ((this.fullName == null) ? (other.fullName != null) : !this.fullName.equals(other.fullName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BasicEN{" + "fullName=" + fullName + '}';
    }
}