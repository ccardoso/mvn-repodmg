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
 * A subtype of ManufacturedMaterial used to hold other Entities for purposes
 * such as transportation or protection of contents from loss or damage.</p>
 *
 * <i>Rationale:</i> The specifications for this class arose from the
 * collaboration between HL7 and the NCCLS. Many of the attribute definitions
 * are drawn from or reference the NCCLS standard. With amorphous substances
 * (liquids, gases) a container is required. However, the content of a container
 * is always distinguishable and relatively easily separable from the container,
 * unlike the content (ingredient) of a mixture.
 *
 * <i>Usage:</i> A container is related to a content material through
 * <p>
 * Documentation based on HL7 document centre.
 * </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Container")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Container")
public class Container extends Material implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    /**
     * The functional capacity of the container.
     */
    @XmlElement(name = "capacityQuantity")
    private PQ capacityQuantity;
    /**
     * The height of the container.
     */
    @XmlElement(name = "heightQuantity")
    private PQ heightQuantity;
    /**
     * The outside diameter of the container.
     */
    @XmlElement(name = "diameterQuantity")
    private PQ diameterQuantity;
    /**
     * <p>
     * The distance from the Point of Reference to the separator material
     * (barrier) within a container.</p>
     *
     * <i>Rationale:</i> This distance may be provided by a laboratory
     * automation system to an instrument and/or specimen processing/handling
     * device to facilitate the insertion of a sampling probe into the specimen
     * without touching the separator. See the Point of Reference definition or
     * in NCCLS standard AUTO5 Laboratory Automation: Electromechanical
     * Interfaces.
     */
    @XmlElement(name = "barrierDeltaQuantity")
    private PQ barrierDeltaQuantity;
    /**
     * <p>
     * The distance from the Point of Reference to the outside bottom of the
     * container.</p>
     *
     * <i>Rationale:</i> Refer to Point of Reference in NCCLS standard AUTO5
     * Laboratory Automation: Electromechanical Interfaces.
     */
    @XmlElement(name = "bottomDeltaQuantity")
    private PQ bottomDeltaQuantity;
    /**
     * The type of container cap consistent with decapping, piercing or other
     * automated manipulation.
     */
    @XmlElement(name = "capTypeCode")
    private CD capTypeCode;
    /**
     * <p>
     * A material added to a container to facilitate and create a physical
     * separation of specimen components of differing density.</p>
     *
     * <i>Examples:</i> A gel material added to blood collection tubes that
     * following centrifugation creates a physical barrier between the blood
     * cells and the serum or plasma.
     *
     * Rationale: The composition or nature of the separator material may have
     * an effect on the analysis. Knowledge of the material aids interpretation
     * of results.
     */
    @XmlElement(name = "separatorTypeCode")
    private CD separatorTypeCode;

    /**
     *
     */
    public Container() {
        super(EntityArchetypeType.CONTAINER);
    }

    /**
     * @param capacityQuantity see {@link #capacityQuantity}
     * @param heightQuantity see {@link #heightQuantity}
     * @param diameterQuantity see {@link #diameterQuantity}
     * @param barrierDeltaQuantity see {@link #barrierDeltaQuantity}
     * @param bottomDeltaQuantity see {@link #bottomDeltaQuantity}
     * @param capTypeCode see {@link #capTypeCode}
     * @param separatorTypeCode see {@link #separatorTypeCode} 
     */
    public Container(PQ capacityQuantity, PQ heightQuantity, PQ diameterQuantity, PQ barrierDeltaQuantity, PQ bottomDeltaQuantity, CD capTypeCode, CD separatorTypeCode) {
        super(EntityArchetypeType.CONTAINER);
        this.capacityQuantity = capacityQuantity;
        this.heightQuantity = heightQuantity;
        this.diameterQuantity = diameterQuantity;
        this.barrierDeltaQuantity = barrierDeltaQuantity;
        this.bottomDeltaQuantity = bottomDeltaQuantity;
        this.capTypeCode = capTypeCode;
        this.separatorTypeCode = separatorTypeCode;
    }

    /**
     *
     * @param capacityQuantity see {@link #capacityQuantity}
     * @param heightQuantity see {@link #heightQuantity}
     * @param determinerCode see {@link Entity#determinerCode}
     * @param bottomDeltaQuantity see {@link #bottomDeltaQuantity}
     * @param capTypeCode see {@link #capTypeCode}
     * @param separatorTypeCode see {@link #separatorTypeCode}
     * @param diameterQuantity see {@link #diameterQuantity}
     * @param barrierDeltaQuantity see {@link #barrierDeltaQuantity}
     * @param formCode see {@link Material#formCode}
     * @param expirationTime see {@link Material#expirationTime}
     * @param stabilityTime see {@link Material#expirationTime}
     * @param lotNumberText see {@link Material#lotNumberText}
     * @param code see {@link Entity#code}
     * @param quantity see {@link Entity#quantity}
     * @param description see {@link Entity#description}
     * @param statusCode see {@link Entity#statusCode}
     * @param existenceTime see {@link Entity#existenceTime}
     * @param entityNames see {@link Entity#entityNames}
     * @param entityHandlingCodes see {@link Entity#entityHandlingCodes}
     * @param roles see {@link Entity#roles}
     * @param entityTelecoms see {@link Entity#entityTelecoms}
     * @param entityAddresses see {@link Entity#entityAddresses}
     * @param entityRiskCodes see {@link Entity#entityRiskCodes}
     * @param entityIds see {@link Entity#entityIds}
     * @param languageCommunications see {@link Entity#languageCommunications}
     */
    public Container(PQ capacityQuantity, PQ heightQuantity, PQ diameterQuantity, PQ barrierDeltaQuantity, PQ bottomDeltaQuantity, CD capTypeCode, CD separatorTypeCode, CD formCode, String lotNumberText, IVL<TS> expirationTime, IVL<TS> stabilityTime, String determinerCode, CD code, PQ quantity, String description, String statusCode, IVL<TS> existenceTime, Set entityNames, Set entityHandlingCodes, Set roles, Set entityTelecoms, Set entityAddresses, Set entityRiskCodes, Set entityIds, Set languageCommunications) {
        super(formCode, lotNumberText, expirationTime, stabilityTime, EntityArchetypeType.CONTAINER, determinerCode, code, quantity, description, statusCode, existenceTime, entityNames, entityHandlingCodes, roles, entityTelecoms, entityAddresses, entityRiskCodes, entityIds, languageCommunications);
        this.capacityQuantity = capacityQuantity;
        this.heightQuantity = heightQuantity;
        this.diameterQuantity = diameterQuantity;
        this.barrierDeltaQuantity = barrierDeltaQuantity;
        this.bottomDeltaQuantity = bottomDeltaQuantity;
        this.capTypeCode = capTypeCode;
        this.separatorTypeCode = separatorTypeCode;
    }

    /**
     * see {@link Container#capacityQuantity}
     *
     * @return PQ
     */
    public PQ getCapacityQuantity() {
        return capacityQuantity;
    }

    /**
     *
     * @param capacityQuantity see {@link #capacityQuantity}
     */
    public void setCapacityQuantity(PQ capacityQuantity) {
        this.capacityQuantity = capacityQuantity;
    }

    /**
     * see {@link #heightQuantity}
     *
     * @return PQ
     */
    public PQ getHeightQuantity() {
        return heightQuantity;
    }

    /**
     *
     * @param heightQuantity see {@link #heightQuantity}
     */
    public void setHeightQuantity(PQ heightQuantity) {
        this.heightQuantity = heightQuantity;
    }

    /**
     * see {@link #diameterQuantity}
     *
     * @return PQ
     */
    public PQ getDiameterQuantity() {
        return diameterQuantity;
    }

    /**
     *
     * @param diameterQuantity see {@link #diameterQuantity}
     */
    public void setDiameterQuantity(PQ diameterQuantity) {
        this.diameterQuantity = diameterQuantity;
    }

    /**
     * see {@link #barrierDeltaQuantity}
     *
     * @return PQ
     */
    public PQ getBarrierDeltaQuantity() {
        return barrierDeltaQuantity;
    }

    /**
     *
     * @param barrierDeltaQuantity see {@link #barrierDeltaQuantity}
     */
    public void setBarrierDeltaQuantity(PQ barrierDeltaQuantity) {
        this.barrierDeltaQuantity = barrierDeltaQuantity;
    }

    /**
     * see {@link #bottomDeltaQuantity}
     *
     * @return PQ
     */
    public PQ getBottomDeltaQuantity() {
        return bottomDeltaQuantity;
    }

    /**
     *
     * @param bottomDeltaQuantity see {@link #bottomDeltaQuantity}
     */
    public void setBottomDeltaQuantity(PQ bottomDeltaQuantity) {
        this.bottomDeltaQuantity = bottomDeltaQuantity;
    }

    /**
     * see {@link #capTypeCode}
     *
     * @return CD
     */
    public CD getCapTypeCode() {
        return capTypeCode;
    }

    /**
     *
     * @param capTypeCode see {@link #capTypeCode}
     */
    public void setCapTypeCode(CD capTypeCode) {
        this.capTypeCode = capTypeCode;
    }

    /**
     * see {@link #separatorTypeCode}
     *
     * @return CD
     */
    public CD getSeparatorTypeCode() {
        return separatorTypeCode;
    }

    /**
     *
     * @param separatorTypeCode see {@link #separatorTypeCode}
     */
    public void setSeparatorTypeCode(CD separatorTypeCode) {
        this.separatorTypeCode = separatorTypeCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
        hash = 47 * hash + Objects.hashCode(this.capacityQuantity);
        hash = 47 * hash + Objects.hashCode(this.heightQuantity);
        hash = 47 * hash + Objects.hashCode(this.diameterQuantity);
        hash = 47 * hash + Objects.hashCode(this.barrierDeltaQuantity);
        hash = 47 * hash + Objects.hashCode(this.bottomDeltaQuantity);
        hash = 47 * hash + Objects.hashCode(this.capTypeCode);
        hash = 47 * hash + Objects.hashCode(this.separatorTypeCode);
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
        final Container other = (Container) obj;
        if (!Objects.equals(this.getInternalId(), other.getInternalId())) {
            return false;
        }
        if (!Objects.equals(this.capacityQuantity, other.capacityQuantity)) {
            return false;
        }
        if (!Objects.equals(this.heightQuantity, other.heightQuantity)) {
            return false;
        }
        if (!Objects.equals(this.diameterQuantity, other.diameterQuantity)) {
            return false;
        }
        if (!Objects.equals(this.barrierDeltaQuantity,
                other.barrierDeltaQuantity)) {
            return false;
        }
        if (!Objects.equals(this.bottomDeltaQuantity, other.bottomDeltaQuantity)) {
            return false;
        }
        if (!Objects.equals(this.capTypeCode, other.capTypeCode)) {
            return false;
        }
        return Objects.equals(this.separatorTypeCode, other.separatorTypeCode);
    }
}
