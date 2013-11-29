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
 * A value representing the type of hazard or threat associated with the
 * Entity.</p>
 * <i>Examples:</i> Petrochemical or organic chemicals are highly flammable
 * agents that pose an increased risk of fire under certain conditions. Entities
 * with either natural or introduced radioactive character pose a risk to those
 * handling them. Entities comprising specimens from diseased individuals pose
 * an increased risk of infection to those handling them. Persons or animals of
 * irascible temperament may prove to be a risk to healthcare personnel.
 *
 * <i>Rationale:</i> Some entities have characteristics that pose potential
 * increased risk of injury or damage to other Entities. This attribute
 * identifies the type of risk without specifying the level of risk.
 *
 * <p>
 * Documentation based on HL7 document centre </p> specifications
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "EntityRiskCode")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityRiskCode")
public class EntityRiskCode implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId")
    private long internalId;
    /**
     * see {@link healthy.rim.type.CD}
     */
    @XmlElement(name = "code")
    private CD code;

    /**
     *
     */
    public EntityRiskCode() {
    }

    /**
     *
     * @param internalId see {@link #internalId}
     * @param code see {@link #code}
     */
    public EntityRiskCode(long internalId, CD code) {
        this.internalId = internalId;
        this.code = code;
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
     * @return see {@link #code}
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
        hash = 19 * hash + (int) (this.internalId ^ (this.internalId >>> 32));
        hash = 19 * hash + Objects.hashCode(this.code);
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
        final EntityRiskCode other = (EntityRiskCode) obj;
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
        return "EntityRiskCode{internalId= " + Long.toString(getInternalId())
                + ", code=" + code + '}';
    }
}
