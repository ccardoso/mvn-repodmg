package healthy.rim;

import healthy.rim.type.CD;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * A value representing special handling requirements for the Entity.</p>
 *
 * <i>Examples:</i> Keep at room temperature; Keep frozen below 0 C; Keep in a
 * dry environment; Keep upright, do not turn upside down.
 *
 * Rationale: This attribute is used to describe special handling required by
 * the Entity to avoid damage to it or other entities.
 * <p>
 * Documentation based on HL7 document centre </p> F
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "EntityHandlingCode")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityHandlingCode")
public class EntityHandlingCode implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId")
    private long internalId;
    /**
     * see {@link healthy.rim.type.CD}
     */
    @XmlElement(name = "code")
    private CD code = new CD();

    /**
     *
     * @param internalId see {@link #internalId}
     * @param code see {@link #code}
     */
    public EntityHandlingCode(long internalId, CD code) {
        this.internalId = internalId;
        this.code = code;
    }

    /**
     *
     */
    public EntityHandlingCode() {
    }

    /**
     *
     * @return see {@link #internalId}
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
     *
     * @return see {@link healthy.rim.type.CD}
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
        int hash = 7;
        hash = 37 * hash + (int) (this.internalId ^ (this.internalId >>> 32));
        hash = 37 * hash + Objects.hashCode(this.code);
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
        final EntityHandlingCode other = (EntityHandlingCode) obj;
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
        return "EntityHandlingCode{internalId= " + Long.toString(getInternalId()) + ", code=" + code + '}';
    }
}
