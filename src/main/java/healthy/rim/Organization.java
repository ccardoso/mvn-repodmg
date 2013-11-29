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
 * Organisation is an Entity representing a formalised group of entities with a
 * common purpose (e.g. administrative, legal, political) and the infrastructure
 * to carry out that purpose.</p>
 *
 * <i>Examples:</i> Companies and institutions, a government department, an
 * incorporated body that is responsible for administering a facility, an
 * insurance company.
 * <p>
 * Documentation based on HL7 document centre </p> specifications
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Organisation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation")
public class Organization extends Entity implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    /**
     * <p>
     * A value representing the industrial category of an organisation
     * entity.</p>
     *
     * <i>Examples:</i> 11231-Chicken Egg Production, 6211- Offices of
     * Physicians, 621511-Medical Laboratories, 524114-Direct Health and Medical
     * Insurance Carriers.
     */
    @XmlElement(name = "standardIndustryClassCode")
    private CD standardIndustryClassCode;

    /**
     *
     */
    public Organization() {
        super(EntityArchetypeType.ORGANIZATION);
    }

    /**
     *
     * @param classCode see {@link #classCode}
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
    public Organization(EntityArchetypeType classCode, String determinerCode, CD code,
            PQ quantity, String description, String statusCode,
            IVL<TS> existenceTime, Set entityNames, Set entityHandlingCodes,
            Set roles, Set entityTelecoms, Set entityAddresses,
            Set entityRiskCodes, Set entityIds, Set languageCommunications) {
        super(EntityArchetypeType.ORGANIZATION, determinerCode, code, quantity, description, statusCode,
                existenceTime, entityNames, entityHandlingCodes, roles,
                entityTelecoms, entityAddresses, entityRiskCodes, entityIds,
                languageCommunications);
    }

    /**
     *
     * @param standardIndustryClassCode see {@link #standardIndustryClassCode} 
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
    public Organization(CD standardIndustryClassCode,
            String determinerCode, CD code, PQ quantity, String description,
            String statusCode, IVL<TS> existenceTime, Set entityNames,
            Set entityHandlingCodes, Set roles, Set entityTelecoms,
            Set entityAddresses, Set entityRiskCodes, Set entityIds,
            Set languageCommunications) {
        super(EntityArchetypeType.ORGANIZATION, determinerCode, code, quantity, description, statusCode,
                existenceTime, entityNames, entityHandlingCodes, roles,
                entityTelecoms, entityAddresses, entityRiskCodes, entityIds,
                languageCommunications);
        this.standardIndustryClassCode = standardIndustryClassCode;
    }

    /**
     * see {@link #standardIndustryClassCode}
     *
     * @return CD
     */
    public CD getStandardIndustryClassCode() {
        return this.standardIndustryClassCode;
    }

    /**
     *
     * @param standardIndustryClassCode see {@link #standardIndustryClassCode}
     */
    public void setStandardIndustryClassCode(CD standardIndustryClassCode) {
        this.standardIndustryClassCode = standardIndustryClassCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
        hash = 29 * hash + Objects.hashCode(this.standardIndustryClassCode);
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
        final Organization other = (Organization) obj;
        if (!Objects.equals(super.getInternalId(), other.getInternalId())) {
            return false;
        }
        if (!Objects.equals(this.standardIndustryClassCode,
                other.standardIndustryClassCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Organisation{internalId= " + Long.toString(getInternalId())
                + ", standardIndustryClassCode =" + standardIndustryClassCode
                + '}';
    }
}
