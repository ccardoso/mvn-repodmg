package healthy.rim;

import healthy.rim.type.QSET;
import healthy.rim.type.TS;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * A Role of an Entity (player) that is accredited with licenses or
 * qualifications (diplomas) certifying that this Entity may properly perform
 * specific functions.</p>
 *
 * <i>Examples:</i>
 * <li>1.) A paramedical training diploma.</li>
 * <li>2.) The certification of equipment.</li>
 * <li>3.) A license to a Person or Organisation to provide health
 * services.</li>
 * <i>Constraints:</i>
 * The scoper is the Organisation that issues the credential.
 * <p>
 * Documentation based on HL7 document centre </p> specifications
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "LicensedEntity")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensedEntity")
public class LicensedEntity implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId")
    private long internalId;
    /**
     * The date recertification is required.
     */
    @XmlElement(name = "recertificationTime", required = true)
    private QSET<TS> recertificationTime = new QSET<>(new TS(), new TS());

    /**
     *
     */
    public LicensedEntity() {
    }

    public LicensedEntity(long internalId, QSET<TS> recertificationTime) {
        this.internalId = internalId;
        this.recertificationTime = recertificationTime;
    }

    /**
     *
     * @param internalId see {@link #internalId}
     */
    public LicensedEntity(long internalId) {
        this.internalId = internalId;
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
     * see {@link #recertificationTime}
     *
     * @return QSET\<TS\>
     */
    public QSET<TS> getRecertificationTime() {
        return this.recertificationTime;
    }

    /**
     *
     * @param recertificationTime see {@link #recertificationTime} see
     * {@link #recertificationTime see {@link #recertificationTime}}
     */
    public void setRecertificationTime(QSET<TS> recertificationTime) {
        this.recertificationTime = recertificationTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.internalId ^ (this.internalId >>> 32));

        hash = 89 * hash + Objects.hashCode(this.recertificationTime);
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
        final LicensedEntity other = (LicensedEntity) obj;
        if (this.internalId != other.internalId) {
            return false;
        }
        return Objects.equals(this.recertificationTime,
                other.recertificationTime);
    }

    @Override
    public String toString() {
        return "LicensedEntity{internalId= " + Long.toString(getInternalId())
                + ", recertificationTime=" + recertificationTime + '}';
    }
}
