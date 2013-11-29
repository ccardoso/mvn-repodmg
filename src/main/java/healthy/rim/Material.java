package healthy.rim;
 
import healthy.EntityArchetypeType;
import healthy.rim.type.CD;
import healthy.rim.type.IVL;
import healthy.rim.type.PQ;
import healthy.rim.type.TS;
import java.util.Objects;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Material is a subtype of Entity that is inanimate and locationally
 * independent.</p>
 *
 * <i>Examples:</i> Pharmaceutical substances (including active vaccines
 * containing retarded virus), disposable supplies, durable equipment,
 * implantable devices, food items (including meat or plant products), waste,
 * traded goods, etc.
 *
 * <i>Discussion:</i> Manufactured or processed products are considered
 * material, even if they originate as living matter. Materials come in a wide
 * variety of physical forms and can pass through different states (ie. Gas,
 * liquid, solid) while still retaining their physical composition and material
 * characteristics.
 *
 * <i>Rationale:</i> There are entities that have attributes in addition to the
 * Entity class, yet cannot be classified as either LivingSubject or Place.
 * <p>
 * Documentation based on HL7 document centre </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Material")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Material")
public class Material extends Entity implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    /**
     * <p>
     * A value representing the state (solid, liquid, gas) and nature of the
     * material.</p>
     *
     * <i>Examples:</i> For therapeutic substances, the dose form, such as
     * tablet, ointment, gel, etc.
     *
     *
     */
    @XmlElement(name = "formCode")
    private CD formCode;
    /**
     * A LOT number or LOT identifier of this material as Text or Coded Tex
     */
    @XmlElement(name = "lotNumberText", required = true)
    private String lotNumberText;
    /**
     * The expiration Date for this material (if available)
     */
    @XmlElement(name = "expirationTime", required = true)
    private IVL<TS> expirationTime = new IVL<>(new TS(), new TS());
    /**
     * Stability time means the time in between this material can be used with
     * no loosing the activity ingredients or components, etc.
     */
    @XmlElement(name = "stabilityTime", required = true)
    private IVL<TS> stabilityTime= new IVL<>(new TS(), new TS());

    /**
     *
     */
    public Material() {
    }

    public Material(EntityArchetypeType classCode) {
        super(classCode);
        if (!(classCode.equals(EntityArchetypeType.DEVICE) || classCode.equals(EntityArchetypeType.CONTAINER))) {
            throw new IllegalArgumentException("A material can't be a:" + classCode.name());
        }
    }

    public Material(EntityArchetypeType classCode, CD formCode, String lotNumberText, IVL<TS> expirationTime, IVL<TS> stabilityTime) {
        super(classCode);
        if (!(classCode.equals(EntityArchetypeType.DEVICE) || classCode.equals(EntityArchetypeType.CONTAINER))) {
            throw new IllegalArgumentException("A material can't be a:" + classCode.name());
        }
        this.formCode = formCode;
        this.lotNumberText = lotNumberText;
        this.expirationTime = expirationTime;
        this.stabilityTime = stabilityTime;
    }

    /**
     *
     * @param formCode see {@link #formCode}
     * @param lotNumberText see {@link #lotNumberText}
     * @param expirationTime see {@link #expirationTime}
     * @param classCode see {@link #classCode}
     * @param stabilityTime
     * @param determinerCode see {@link #determinerCode}
     * @param code see {@link #code}
     * @param quantity see {@link #quantity}
     * @param description see {@link #description}
     * @param statusCode see {@link #statusCode}
     * @param existenceTime see {@link #existenceTime}
     * @param entityNames see {@link #entityNames}
     * @param entityHandlingCodes see {@link #entityHandlingCodes}
     * @param roles see {@link #roles}
     * @param entityTelecoms see {@link #entityTelecoms}
     * @param entityAddresses see {@link #entityAddresses}
     * @param entityRiskCodes see {@link #entityRiskCodes}
     * @param entityIds see {@link #entityIds}
     * @param languageCommunications see {@link #languageCommunications}
     */
    public Material(CD formCode, String lotNumberText, IVL<TS> expirationTime, IVL<TS> stabilityTime, EntityArchetypeType classCode, String determinerCode, CD code, PQ quantity, String description, String statusCode, IVL<TS> existenceTime, Set entityNames, Set entityHandlingCodes, Set roles, Set entityTelecoms, Set entityAddresses, Set entityRiskCodes, Set entityIds, Set languageCommunications) {
        super(classCode, determinerCode, code, quantity, description, statusCode, existenceTime, entityNames, entityHandlingCodes, roles, entityTelecoms, entityAddresses, entityRiskCodes, entityIds, languageCommunications);
        if (!(classCode.equals(EntityArchetypeType.DEVICE) || classCode.equals(EntityArchetypeType.CONTAINER))) {
            throw new IllegalArgumentException("A material can't be a:" + classCode.name());
        }
        this.formCode = formCode;
        this.lotNumberText = lotNumberText;
        this.expirationTime = expirationTime;
        this.stabilityTime = stabilityTime;
    }

    /**
     *
     * @return see {@link #formCode}
     */
    public CD getFormCode() {
        return this.formCode;
    }

    /**
     *
     * @param formCode see {@link #formCode}
     */
    public void setFormCode(CD formCode) {
        this.formCode = formCode;
    }

    /**
     *
     * @return see {@link #lotNumberText}
     */
    public String getLotNumberText() {
        return this.lotNumberText;
    }

    /**
     *
     * @param lotNumberText see {@link #lotNumberText}
     */
    public void setLotNumberText(String lotNumberText) {
        this.lotNumberText = lotNumberText;
    }

    /**
     *
     * @return see {@link #expirationTime}
     */
    public IVL<TS> getExpirationTime() {
        return this.expirationTime;
    }

    /**
     *
     * @param expirationTime see {@link #expirationTime}
     */
    public void setExpirationTime(IVL<TS> expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     *
     * @return see {@link #stabilityTime}
     */
    public IVL<TS> getStabilityTime() {
        return this.stabilityTime;
    }

    /**
     *
     * @param stabilityTime see {@link #stabilityTime}
     */
    public void setStabilityTime(IVL<TS> stabilityTime) {
        this.stabilityTime = stabilityTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
        hash = 71 * hash + Objects.hashCode(this.formCode);
        hash = 71 * hash + Objects.hashCode(this.lotNumberText);
        hash = 71 * hash + Objects.hashCode(this.expirationTime);
        hash = 71 * hash + Objects.hashCode(this.stabilityTime);
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
        final Material other = (Material) obj;
        if (!Objects.equals(super.getInternalId(), other.getInternalId())) {
            return false;
        }
        if (!Objects.equals(this.formCode, other.formCode)) {
            return false;
        }
        if (!Objects.equals(this.lotNumberText, other.lotNumberText)) {
            return false;
        }
        if (!Objects.equals(this.expirationTime, other.expirationTime)) {
            return false;
        }
        if (!Objects.equals(this.stabilityTime, other.stabilityTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Material{internalId=" + Long.toString(getInternalId()) + ", "
                + "formCode=" + formCode + ", lotNumberText=" + lotNumberText
                + ", expirationTime=" + expirationTime + ", stabilityTime="
                + stabilityTime + '}';
    }
}
