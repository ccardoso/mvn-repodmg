package healthy.rim;

import healthy.rim.type.AD;
import healthy.rim.type.BooleanAdapter;
import healthy.rim.type.CD;
import healthy.rim.type.EN;
import healthy.rim.type.II;
import healthy.rim.type.PQ;
import healthy.rim.type.QSET;
import healthy.rim.type.TEL;
import healthy.rim.type.TS;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * A competency of the Entity playing the Role as identified, defined,
 * guaranteed, or acknowledged by the Entity that scopes the Role.</p>
 *
 * <i>Discussion:</i> An Entity participates in an Act as in a particular Role.
 * Note that a particular entity in a particular role can participate in an act
 * in many ways. Thus, a Person in the role of a practitioner can participate in
 * a patient encounter as a rounding physician or as an attending physician. The
 * Role defines the competency of the Entity irrespective of any Act, as opposed
 * to Participation, which are limited to the scope of an Act.
 *
 * Each role is "played" by one Entity, called the "player" and is "scoped" by
 * another Entity, called the "scoper". Thus the Role of "patient" may be played
 * by a person and scoped by the provider organisation from which the patient
 * will receive services. Similarly, the employer scopes an "employee" role.
 *
 * The identifier of the Role identifies the Entity playing the role in that
 * role. This identifier is assigned by the scoping Entity to the player. The
 * scoping Entity need not have issued the identifier, but it may have re-used
 * an existing identifier for the Entity to also identify the Entity in the Role
 * with the scoper.
 *
 * Most attributes of Role are attributes of the playing entity while in the
 * particular role.
 * <p>
 * Documentation based on HL7 document centre </p> specifications
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Role")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role")
public class Role implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId", required = true)
    private long internalId;
    /**
     * A code specifying the major category of a Role as defined by HL7
     * vocabulary.
     */
    @XmlElement(name = "classCode", required = true)
    private String classCode = "";
    /**
     * <p>
     * A code further specifying the kind of Role.</p>
     *
     * <i>Discussion:</i> The Role.code must conceptually be a proper
     * specialisation of Role.classCode. Role.code does not modify
     * Role.classCode. Rather, each is a complete concept or a Role-like
     * relationship between two Entities, but Role.code may be more specific
     * than Role.classCode.
     *
     * The Role.getCode() may not be coded if only an un-coded name for the type
     * of role is commonly used.
     */
    @XmlElement(name = "code")
    private CD code = new CD();
    /**
     * <p>
     * An indicator specifying that the Role is a competency that is
     * specifically not attributed to the Entity playing the Role.</p>
     *
     * <i>Examples:</i>
     * <li>1.) This Person is not our Employee</li>
     *
     * <li>2.) This Mouthwash does not have Alcohol as an ingredient.</li>
     *
     * <i>Constraint:</i> Normally all Roles are considered to be affirmative.
     * (This attribute defaults is FALSE).
     */
    @XmlElement(name = "negationInd", defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean negationInd = false;
    /**
     * A code specifying the state of this Role as defined in the
     * state-transition model.
     */
    @XmlElement(name = "statusCode")
    private String statusCode = "";
    /**
     * An interval of time specifying the period during which the Role is in
     * effect, if such time limit is applicable and known.
     */
    @XmlElement(name = "effectiveTime", type = QSET.class)
    private QSET<TS> effectiveTime = new QSET<>(new TS(), new TS(), 0, "");
    /**
     * <p>
     * A textual or multimedia depiction of a certificate issued by the scoping
     * Entity of a Role certifying that this Role is indeed played by the player
     * Entity.</p>
     *
     * <i>Examples:</i> The certificate can be represented in many different
     * ways, either inline or by reference, according to the ED data type.
     * Typical cases are:
     *
     * <li>1.) Paper-based certificate: the ED data type may refer to some
     * document or file that can be retrieved through an electronic interface to
     * a hardcopy archive.</li>
     *
     * <li>2.) Electronic certificate: this attribute can represent virtually
     * any electronic certification scheme, such as, an electronically
     * (including digitally) signed electronic text document.</li>
     *
     * <li>3.) Digital certificate (public key certificate): in particular, this
     * attribute can represent digital certificates, as an inline data block or
     * by reference to such data. The certificate data block would be
     * constructed in accordance to a digital certificate standard, such as
     * X509, SPKI, PGP, etc.</li>
     *
     * The certificate subject is the Entity that plays the Role. The
     * certificate issuer is the Entity that scopes the Role.
     */
    @XmlElement(name = "certificateText")
    private String certificateText = "";
    /**
     * A code indicating the data confidentiality and how should be treated.
     */
    @XmlElement(name = "confidentialityCode", type = CD.class)
    private CD confidentialityCode = new CD();
    /**
     * <p>
     * A ratio (numerator : denominator) specifying the relative quantities of
     * the Entity playing the Role in the Entity scoping the Role, used for
     * Roles that represent composition relationships between the scoping and
     * playing Entities.</p>
     *
     * <i>Examples:</i>
     * <li>1.) This syrup's (scoper) ingredients include 160 mg (numerator)
     * Acetaminophen (player) per tablespoon (denominator).</li>
     *
     * <li>2.) This herd (scoper) consists of 500 (numerator) cattle
     * (player).</li>
     *
     * <li>3.) A VAX 6630 computer (scoper) has 3 (numerator) CPUs (player) as
     * parts.</li>
     *
     * <li>4.) This package (scoper) contains 100 (numerator) pills
     * (player).</li>
     *
     * <i>Discussion:</i> In composition-relationships (e.g., has-parts,
     * has-ingredient, has-content) the Role.quantity attribute specifies that a
     * numerator amount of the target entity is comprised by a denominator
     * amount of the source entity of such composition-relationship. For
     * example, if a box (source) has-content 10 eggs (target), the relationship
     * quantity is 10:1; if 0.6 mL contain 75 mg of FeSO4 the ingredient
     * relationship quantity is 75 mg : 0.6 mL. Both numerator and denominator
     * must be amount quantities (extensive quantities, i.e., a count number,
     * mass, volume, amount of substance, amount of energy, etc.).
     */
    @XmlElement(name = "quantity", type = PQ.class)
    private PQ quantity = new PQ();
    /**
     * <p>
     * An integer specifying the priority of the Entity playing the Role with
     * respect to the Entity that scopes the Role.</p>
     *
     */
    @XmlElement(name = "priorityNumber")
    private Integer priorityNumber = -1;
    /**
     * <p>
     * An integer specifying the position of the Entity playing the Role with
     * respect to the Entity that scopes the Role.</p>
     *
     * <i>Discussion:</i> This attribute is primarily used with respect to
     * containment roles. For example, some containers have discrete positions
     * in which content may be located. Depending on the geometry of the
     * container, the position may be referenced as a scalar ordinal number, or
     * as a vector of ordinal numbers (coordinates). Coordinates always begin
     * counting at 1.
     *
     * Some containers may have customary ways of referring to the positions or
     * no way at all. In the absence of any specific regulation for a specific
     * container type, the rule of thumb is that the coordinate that is changed
     * earlier is positioned first. For an automated blood chemistry analyser
     * with a square shaped tray, this means that the first coordinate is the
     * one in which direction the tray moves at each step and the second
     * coordinate is the one in which the tray moves only every 10 (or so)
     * steps.
     */
    @XmlElement(name = "positionNumber")
    private Integer positionNumber = -1;
    /**
     * see {@link II}
     */
    @XmlElementWrapper(name = "roleId", required = true, nillable = false)
    @XmlElement(name = "roleId")
    private Set<II> roleIds = new HashSet(0);
    /**
     * see {@link EN}
     */
    @XmlElementWrapper(name = "roleNames", required = true, nillable = false)
    @XmlElement(name = "roleName")
    private Set<EN> roleNames = new HashSet(0);
    /**
     * see {@link AD}
     */
    @XmlElementWrapper(name = "roleAddresses", required = true, nillable = false)
    @XmlElement(name = "roleAddress")
    private Set<AD> roleAddresses = new HashSet(0);
    /**
     * see {@link TEL}
     */
    @XmlElementWrapper(name = "roleTelecoms", required = true, nillable = false)
    @XmlElement(name = "roleTelecom")
    private Set<TEL> roleTelecoms = new HashSet(0);
    /**
     * An individual, such as a physician, nurse, or social worker, who assists
     * in the identification, prevention, or treatment of an illness or
     * disability.
     */
    @XmlElementWrapper(name = "careGivers", required = true)
    @XmlElement(name = "careGiver")
    private Set<TEL> careGivers = new HashSet(0);
    /**
     * see {@link LicensedEntity}
     */
    @XmlElementWrapper(name = "licensedEntities", required = true, nillable = false)
    @XmlElement(name = "licensedEntity")
    private Set<LicensedEntity> licensedEntities = new HashSet(0);

    /**
     * Default constructor
     */
    public Role() {
    }

    /**
     *
     * @param internalId see {@link #internalId}
     * @param classCode see {@link #classCode}
     * @param code see {@link #code}
     * @param negationInd see {@link #negationInd}
     * @param statusCode see {@link #statusCode}
     * @param effectiveTime see {@link #effectiveTime}
     * @param certificateText see {@link #certificateText}
     * @param confidentialityCode see {@link #confidentialityCode}
     * @param quantity see {@link #quantity}
     * @param priorityNumber see {@link #priorityNumber}
     * @param positionNumber see {@link #positionNumber}
     */
    public Role(long internalId, String classCode, CD code, Boolean negationInd,
            String statusCode, QSET<TS> effectiveTime, String certificateText,
            CD confidentialityCode, PQ quantity, Integer priorityNumber,
            Integer positionNumber) {
        this.internalId = internalId;
        this.classCode = classCode;
        this.code = code;
        this.negationInd = negationInd;
        this.statusCode = statusCode;
        this.effectiveTime = effectiveTime;
        this.certificateText = certificateText;
        this.confidentialityCode = confidentialityCode;
        this.quantity = quantity;
        this.priorityNumber = priorityNumber;
        this.positionNumber = positionNumber;
    }

    /**
     * Internal Id
     *
     * @return long
     */
    public long getInternalId() {
        return this.internalId;
    }

    /**
     *
     * @param internalId see {@link #internalId}
     */
    public void setInternalId(long internalId) {
        this.internalId = internalId;
    }

    /**
     * see {@link #classCode}
     *
     * @return String
     */
    public String getClassCode() {
        return this.classCode;
    }

    /**
     *
     * @param classCode see {@link #classCode}
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode;
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

    /**
     * see {@link #negationInd}
     *
     * @return Boolean
     */
    public Boolean getNegationInd() {
        return this.negationInd;
    }

    /**
     *
     * @param negationInd see {@link #negationInd}
     */
    public void setNegationInd(Boolean negationInd) {
        this.negationInd = negationInd;
    }

    /**
     * see {@link #statusCode}
     *
     * @return String
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     *
     * @param statusCode see {@link #statusCode}
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * see {@link #effectiveTime}
     *
     * @return QSET<TS>
     */
    public QSET<TS> getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     *
     * @param effectiveTime see {@link #effectiveTime}
     */
    public void setEffectiveTime(QSET<TS> effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * see {@link #certificateText}
     *
     * @return String
     */
    public String getCertificateText() {
        return this.certificateText;
    }

    /**
     *
     * @param certificateText see {@link #certificateText}
     */
    public void setCertificateText(String certificateText) {
        this.certificateText = certificateText;
    }

    /**
     * see {@link #confidentialityCode}
     *
     * @return CD
     */
    public CD getConfidentialityCode() {
        return this.confidentialityCode;
    }

    /**
     *
     * @param confidentialityCode see {@link #confidentialityCode}
     */
    public void setConfidentialityCode(CD confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

    /**
     * see {@link #quantity}
     *
     * @return PQ
     */
    public PQ getQuantity() {
        return this.quantity;
    }

    /**
     *
     * @param quantity see {@link #quantity}
     */
    public void setQuantity(PQ quantity) {
        this.quantity = quantity;
    }

    /**
     * see {@link #priorityNumber}
     *
     * @return Integer
     */
    public Integer getPriorityNumber() {
        return this.priorityNumber;
    }

    /**
     *
     * @param priorityNumber see {@link #priorityNumber}
     */
    public void setPriorityNumber(Integer priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    /**
     * see {@link #positionNumber}
     *
     * @return Integer
     */
    public Integer getPositionNumber() {
        return this.positionNumber;
    }

    /**
     *
     * @param positionNumber see {@link #positionNumber}
     */
    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    /**
     * see {@link #licensedEntities}
     *
     * @return Set
     */
    public Set<LicensedEntity> getLicensedEntities() {
        return this.licensedEntities;
    }

    /**
     *
     * @param licensedEntities see {@link #licensedEntities}
     */
    public void setLicensedEntities(Set<LicensedEntity> licensedEntities) {
        this.licensedEntities = licensedEntities;
    }

    /**
     * see {@link #roleIds}
     *
     * @return Set
     */
    public Set<II> getRoleIds() {
        return this.roleIds;
    }

    /**
     *
     * @param roleIds see {@link #roleIds}
     */
    public void setRoleIds(Set<II> roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * see {@link #roleNames}
     *
     * @return Set
     */
    public Set<EN> getRoleNames() {
        return this.roleNames;
    }

    /**
     *
     * @param roleNames see {@link #roleNames}
     */
    public void setRoleNames(Set<EN> roleNames) {
        this.roleNames = roleNames;
    }

    /**
     * see {@link #roleAddresses}
     *
     * @return Set
     */
    public Set<AD> getRoleAddresses() {
        return this.roleAddresses;
    }

    /**
     *
     * @param roleAddresses see {@link #roleAddresses}
     */
    public void setRoleAddresses(Set<AD> roleAddresses) {
        this.roleAddresses = roleAddresses;
    }

    /**
     * see {@link #roleTelecoms}
     *
     * @return Set
     */
    public Set<TEL> getRoleTelecoms() {
        return this.roleTelecoms;
    }

    /**
     *
     * @param roleTelecoms see {@link #roleTelecoms}
     */
    public void setRoleTelecoms(Set<TEL> roleTelecoms) {
        this.roleTelecoms = roleTelecoms;
    }

    /**
     * see {@link #careGiver}
     *
     * @return
     */
    public Set<TEL> getCareGivers() {
        return careGivers;
    }

    /**
     * see {@link #careGiver}
     *
     * @return
     */
    public void setCareGiver(Set<TEL> careGivers) {
        this.careGivers = careGivers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.internalId ^ (this.internalId >>> 32));
        hash = 83 * hash + Objects.hashCode(this.classCode);
        hash = 83 * hash + Objects.hashCode(this.code);
        hash = 83 * hash + Objects.hashCode(this.negationInd);
        hash = 83 * hash + Objects.hashCode(this.statusCode);
        hash = 83 * hash + Objects.hashCode(this.effectiveTime);
        hash = 83 * hash + Objects.hashCode(this.certificateText);
        hash = 83 * hash + Objects.hashCode(this.confidentialityCode);
        hash = 83 * hash + Objects.hashCode(this.quantity);
        hash = 83 * hash + Objects.hashCode(this.priorityNumber);
        hash = 83 * hash + Objects.hashCode(this.positionNumber);
        hash = 83 * hash + Objects.hashCode(this.roleIds);
        hash = 83 * hash + Objects.hashCode(this.roleNames);
        hash = 83 * hash + Objects.hashCode(this.roleAddresses);
        hash = 83 * hash + Objects.hashCode(this.roleTelecoms);
        hash = 83 * hash + Objects.hashCode(this.careGivers);
        hash = 83 * hash + Objects.hashCode(this.licensedEntities);
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
        final Role other = (Role) obj;
        if (this.internalId != other.internalId) {
            return false;
        }
        if (!Objects.equals(this.classCode, other.classCode)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.negationInd, other.negationInd)) {
            return false;
        }
        if (!Objects.equals(this.statusCode, other.statusCode)) {
            return false;
        }
        if (!Objects.equals(this.effectiveTime, other.effectiveTime)) {
            return false;
        }
        if (!Objects.equals(this.certificateText, other.certificateText)) {
            return false;
        }
        if (!Objects.equals(this.confidentialityCode, other.confidentialityCode)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.priorityNumber, other.priorityNumber)) {
            return false;
        }
        if (!Objects.equals(this.positionNumber, other.positionNumber)) {
            return false;
        }
        if (!Objects.equals(this.roleIds, other.roleIds)) {
            return false;
        }
        if (!Objects.equals(this.roleNames, other.roleNames)) {
            return false;
        }
        if (!Objects.equals(this.roleAddresses, other.roleAddresses)) {
            return false;
        }
        if (!Objects.equals(this.roleTelecoms, other.roleTelecoms)) {
            return false;
        }
        if (!Objects.equals(this.careGivers, other.careGivers)) {
            return false;
        }
        if (!Objects.equals(this.licensedEntities, other.licensedEntities)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Role{" + "internalId=" + internalId + ", classCode=" + classCode + ", code=" + code + ", negationInd=" + negationInd + ", statusCode=" + statusCode + ", effectiveTime=" + effectiveTime + ", certificateText=" + certificateText + ", confidentialityCode=" + confidentialityCode + ", quantity=" + quantity + ", priorityNumber=" + priorityNumber + ", positionNumber=" + positionNumber + ", roleIds=" + roleIds + ", roleNames=" + roleNames + ", roleAddresses=" + roleAddresses + ", roleTelecoms=" + roleTelecoms + ", careGivers=" + careGivers + ", licensedEntities=" + licensedEntities + '}';
    }
}
