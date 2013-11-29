package healthy.rim;

import healthy.rim.type.CD;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Person Disability Code is a value identifying a person's disability.
 *
 * <p>
 * Documentation based on HL7 document centre </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "PersonDisabilityCode")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDisabilityCode")
public class PersonDisabilityCode implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId")
    private long internalId;
    /**
     * see {@link healthy.rim.type.CD}
     */
    @XmlElement(name = "code", type = healthy.rim.type.CD.class)
    private CD code;

    /**
     *
     */
    public PersonDisabilityCode() {
    }

    /**
     *
     * @param internalId see {@link #internalId}
     * @param code see {@link #code}
     */
    public PersonDisabilityCode(long internalId, CD code) {
        this.internalId = internalId;
        this.code = code;
    }

    /**
     *
     * @return long
     */
    public long getInternalId() {
        return internalId;
    }

    /**
     *
     * @param internalId see {@link #internalId}
     */
    public void setInternalId(long internalId) {
        this.internalId = internalId;
    }

    /**
     * see {@link #code}
     *
     * @return CD
     */
    public CD getCode() {
        return this.code;
    }

    /**
     *
     * @param code see {@link #code}
     */
    public void setCode(CD code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (this.internalId ^ (this.internalId >>> 32));
        hash = 17 * hash + Objects.hashCode(this.code);
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
        final PersonDisabilityCode other = (PersonDisabilityCode) obj;
        if (this.internalId != other.internalId) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonDisabilityCode{" + "internalId=" + internalId + ", code="
                + code.toString() + '}';
    }
}
