package healthy.rim;

import healthy.EntityArchetypeType;
import healthy.rim.type.AD;
import healthy.rim.type.CD;
import healthy.rim.type.EN;
import healthy.rim.type.II;
import healthy.rim.type.IVL;
import healthy.rim.type.PQ;
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

/**
 * <p>
 * An Entity it's a physical thing, group of physical things or an organisation
 * capable of participating in Acts, while in a role. </p>
 * <p>
 * <i>Discussion:</i> An entity is a physical object that has, had or will have
 * existence. The only exception to this is Organisation, which while not having
 * a physical presence, full-fills the other characteristics of an Entity. The
 * Entity hierarchy encompasses living subjects (including human beings),
 * organisations, material, and places and their specialisations. It does not
 * indicate the roles played, or acts that these entities participate in.
 * </p>
 * <p>
 * <i>Constraints:</i> It does not include events/acts/actions, or the roles
 * that things can play (e.g. patient, provider).
 * </p>
 * <p>
 * Documentation based on HL7 document centre.
 * </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Entity")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity")
public class Entity implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId")
    private long internalId;
    /**
     * <p>
     * An HL7 defined value representing the class or category that the Entity
     * instance represents.</p>
     *
     * <i>Examples:</i> Person, Animal, Chemical Substance, Group, Organisation,
     * etc
     *
     * <i>Rationale:</i> Due to the extremely large number of potential values
     * for a code set representing all physical things in the universe, the
     * class code indicators was restricted to an EntityArchetypeType enumerator
     * see {@link healthy.dmg.EntityArchetypeType}. This can be used to
     * constrain the eligible value domains for the Entity.code attribute.
     */
    @XmlElement(name = "classCode", required = true, nillable = false, type = healthy.EntityArchetypeType.class)
    private EntityArchetypeType classCode = EntityArchetypeType.PERSON;
    /**
     * <p>
     * An HL7 defined value representing whether the Entity represents a kind-of
     * or a specific instance.</p>
     *
     * <i>Examples:</i> 1 human being (an instance), 3 syringes (quantified
     * kind) or the population of Indianapolis (kind of group)
     *
     * <i>Rationale:</i> An Entity may at times represent information concerning
     * a specific instance (the most common), a quantifiable group with common
     * characteristics or a general type of Entity. This code distinguishes
     * these different representations.
     */
    @XmlElement(name = "determinerCode", required = true)
    private String determinerCode = "";
    /**
     * <p>
     * A value representing the specific kind of Entity the instance
     * represents.</p>
     * <p>
     * <i>Examples:</i> A medical building, a Doberman Pinscher, a blood
     * collection tube, a tissue biopsy.
     * </p>
     * <p>
     * <i>Rationale:</i> For each Entity, the value for this attribute is drawn
     * from one of several coding systems depending on the Entity.classCode,
     * such as living subjects (animal and plant taxonomies), chemical substance
     * (e.g., IUPAC code), organisations, insurance company, government agency,
     * hospital, park, lake, syringe, etc. It is possible that Entity.code may
     * be so fine grained that it represents a single instance. An example is
     * the CDC vaccine manufacturer code, modeled as a concept vocabulary, when
     * in fact each concept refers to a single instance.
     * </p>
     */
    @XmlElement(name = "code", required = true)
    private CD code = new CD();
    /**
     * <p>
     * The number or quantity of the Entity, with appropriate units, congruent
     * with the value of Entity.determinerCode. </p>
     * <p>
     * <i>Examples:</i> With undetermined kinds, the quantity is but a reference
     * quantity for the specification of the proportion of ingredients or
     * components (e.g. through a has-part, has-ingredient, or has-content
     * Role). For example, a kind of group with 60% females is Person(quantity =
     * 100) has-part Person(quantity = 60; sex = female). Amoxicillin 500 mg per
     * tablet is Material(Tablet, quantity = 1) has-ingredient
     * Material(Amoxicillin, quantity = 500 mg). Glucose 5% (D5W) is
     * Material(D5W, quantity = 1 kg) has-ingredient Material(Glucose, quantity
     * = 50 g).
     * </p>
     * <p>
     * Material-specific quantity relations are expressed using the fact that
     * the data type of this attribute is a set of physical quantity
     * (SET&lt;PQ&gt;). If more than one quantity value are specified in this
     * set, each element in this set is considered to specify the same amount of
     * the material. For example, for one liter of water one could use the set 1
     * L, 1 kg, 55.56 mol to specify the volume, mass, and amount of substance
     * for the same amount of water, this is equivalent with specifying the mass
     * density (volumic mass 1 kg/L) and the molar mass (18 g/mol). For Glucose
     * one could specify 180 g, 1 mol according to the molar mass (180 g/mol).
     * </p>
     * <p>
     * <i>Discussion:</i> When the Entity instance is a portion of a substance,
     * the quantity specifies the amount of that substance comprised by that
     * portion. For an undetermined substance (kind) the quantity serves two
     * purposes at the same time: (a) it provides a means of relations between
     * quantities specific for that substance, and (b) it is a reference
     * quantity for the specification of ingredients or components. In all
     * cases, the quantity is an extensive "amount" kind of quantity (e.g.,
     * number, length, volume, mass, surface area, energy, etc.). Note that most
     * relative or fractional quantities are not amounts, in particular, mass
     * fraction, substance concentration, mass ratios, percentages, etc. are not
     * extensive quantities and are prohibited values for this attribute.
     * </p>
     * <p>
     * <i>Constraints:</i> For Entities with determinerCode = INSTANCE, the
     * quantity is 1. For an Entity with determinerCode = QUANTIFIED_KIND, the
     * quantity is the number of individual members in the group; for an Entity
     * with a determinerCode = KIND, the value is undetermined.
     * </p>
     */
    @XmlElement(name = "quantity", required = true)
    private PQ quantity = new PQ();
    /**
     * <p>
     * A textual or multimedia depiction of the Entity.</p>
     * <p>
     * <i>Discussion:</i> The content of the description is not considered part
     * of the functional information communicated between systems. Descriptions
     * are meant to be shown to interested human individuals. All information
     * relevant for automated functions must be communicated using the proper
     * attributes and associated objects.
     * </p>
     * <p>
     * <i>Rationale:</i> Names and descriptions of entities are typically more
     * meaningful to human viewers than numeric, mnemonic or abbreviated code
     * values. The description allows for additional context about the entity to
     * be conveyed to human viewers without impacting the functional components
     * of the message.
     * </p>
     */
    @XmlElement(name = "description", required = true)
    private String description = "";
    /**
     * <p>
     * A value representing whether the information associated with the Entity
     * is currently active or inactive for the purpose of participation in acts.
     * </p>
     * <p>
     * <b>Design Advisory: </b>This attribute was defined in the original RIM as
     * repeating, owing to the presence of nested states in the state machines.
     * In actual practice, however, there is never a need to communicate more
     * than a single status value. therefore, committees are advised to
     * <b>constrain this attribute to a maximum cardinality of 1</b> in all
     * message designs.
     * </p>
     */
    @XmlElement(name = "statusCode", required = true)
    private String statusCode = "";
    /**
     * <p>
     * An interval of time specifying the period in which the Entity physically
     * existed. </p>
     * <p>
     * <i>Examples:</i> ManufactureDate/DisposalDate
     * </p>
     * <p>
     * <i>Constraints:</i> This period may represent past, present or future
     * time periods.
     * </p>
     * <p>
     * <i>Rationale:</i> Physical entities have specified periods in which they
     * exist. Equipment is manufactured, placed in service, retired and
     * salvaged. The relevance of this attribute is in planning, availability
     * and retrospective analysis.
     * </p>
     */
    @XmlElement(name = "existenceTime", required = true)
    private IVL<TS> existenceTime = new IVL<>(new TS(), new TS());
    /**
     * <p>
     * A non-unique textual identifier or moniker for the Entity.</p>
     * <p>
     * <i>Examples:</i> Proper names, nicknames, legal names of persons, places
     * or things.
     * </p>
     * <p>
     * <i>Rationale:</i> Most entities have a commonly used name that can be
     * used to differentiate them from other Entities, but does not provide a
     * unique identifier.
     * </p>
     */
    @XmlElementWrapper(name = "entityNames", required = true, nillable = false)
    @XmlElement(name = "entityName", required = true, nillable = false)
    private Set<EN> entityNames = new HashSet(0);
    /**
     * <p>
     * A set of Entity Handling Codes see {@link EntityHandlingCode}
     * </p>
     */
    @XmlElementWrapper(name = "entityHandlingCodes", required = true)
    @XmlElement(name = "entityHandlingCode", required = true)
    private Set<EntityHandlingCode> entityHandlingCodes = new HashSet(0);
    /**
     * <p>
     * A set of telecommunication addresses for the Entity see {@link TEL}.
     * </p>
     */
    @XmlElementWrapper(name = "entityTelecoms", required = true)
    @XmlElement(name = "entityTelecom", required = true, nillable = false)
    private Set<TEL> entityTelecoms = new HashSet(0);
    /**
     * <p>
     * A addresses for the Entity see {@link AD}.
     * </p>
     */
    @XmlElementWrapper(name = "entityAddresses", required = true, nillable = false)
    @XmlElement(name = "entityAddress", required = true, nillable = false)
    private Set<AD> entityAddresses = new HashSet(0);
    /**
     * <p>
     * A set of Entity Risk Codes see {@link EntityRiskCode}</p>
     */
    @XmlElementWrapper(name = "entityRiskCodes", required = true, nillable = false)
    @XmlElement(name = "entityRiskCode", required = true)
    private Set<EntityRiskCode> entityRiskCodes = new HashSet(0);
    /**
     * <p>
     * A set of unique identifier for the Entity. see {@link II}</p>
     * <p>
     *
     */
    @XmlElementWrapper(name = "entityIds", required = true, nillable = false)
    @XmlElement(name = "entityId", required = true, nillable = false)
    private Set<II> entityIds = new HashSet(0);
    /**
     * <p>
     * A set of ROles for the Entity. see {@link Role}</p>
     * <p>
     *
     */
    @XmlElementWrapper(name = "roles", required = true, nillable = false)
    @XmlElement(name = "role", required = true, nillable = false)
    private Set<Role> roles = new HashSet(0);
    /**
     * see {@link LanguageCommunication}
     */
    @XmlElementWrapper(name = "languageCommunications", required = true)
    @XmlElement(name = "language", required = true, nillable = false)
    private Set<LanguageCommunication> languageCommunications = new HashSet(0);

    public Entity() { 
    }

    /**
     * Default constructor
     *
     * @param classCode see {@link #classCode}
     */
    public Entity(EntityArchetypeType classCode) {
        this.classCode = classCode; 
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
    public Entity(EntityArchetypeType classCode, String determinerCode, CD code, PQ quantity,
            String description, String statusCode, IVL<TS> existenceTime,
            Set<EN> entityNames, Set<EntityHandlingCode> entityHandlingCodes, Set<Role> roles,
            Set<TEL> entityTelecoms, Set<AD> entityAddresses, Set<EntityRiskCode> entityRiskCodes,
            Set<II> entityIds, Set<LanguageCommunication> languageCommunications) {
        this.classCode = classCode;
        this.determinerCode = determinerCode;
        this.code = code;
        this.quantity = quantity;
        this.description = description;
        this.statusCode = statusCode;
        this.existenceTime = existenceTime;
        this.entityNames = entityNames;
        this.entityHandlingCodes = entityHandlingCodes;
        this.roles = roles;
        this.entityTelecoms = entityTelecoms;
        this.entityAddresses = entityAddresses;
        this.entityRiskCodes = entityRiskCodes;
        this.entityIds = entityIds;
        this.languageCommunications = languageCommunications;
    }

    /**
     *
     * @return see {@link #internalId}
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
     *
     * @return see {@link #classCode}
     */
    public EntityArchetypeType getClassCode() {
        return this.classCode;
    }

    /**
     *
     * @param classCode see {@link #classCode}
     */
    public void setClassCode(EntityArchetypeType classCode) {
        this.classCode = classCode;
    }

    /**
     *
     * @return see {@link #determinerCode}
     */
    public String getDeterminerCode() {
        return this.determinerCode;
    }

    /**
     *
     * @param determinerCode see {@link #determinerCode}
     */
    public void setDeterminerCode(String determinerCode) {
        this.determinerCode = determinerCode;
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

    /**
     *
     * @return see {@link #quantity}
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
     *
     * @return see {@link #description}
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @param description see {@link #description}
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return see {@link #statusCode}
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
     *
     * @return see {@link #existenceTime}
     */
    public IVL<TS> getExistenceTime() {
        return this.existenceTime;
    }

    /**
     *
     * @param existenceTime see {@link #existenceTime}
     */
    public void setExistenceTime(IVL<TS> existenceTime) {
        this.existenceTime = existenceTime;
    }

    /**
     *
     * @return see {@link #entityNames}
     */
    public Set<EN> getEntityNames() {
        return this.entityNames;
    }

    /**
     *
     * @param entityNames see {@link #entityNames}
     */
    public void setEntityNames(Set<EN> entityNames) {
        this.entityNames = entityNames;
    }

    /**
     *
     * @return see {@link #entityHandlingCodes}
     */
    public Set<EntityHandlingCode> getEntityHandlingCodes() {
        return this.entityHandlingCodes;
    }

    /**
     *
     * @param entityHandlingCodes see {@link #entityHandlingCodes}
     */
    public void setEntityHandlingCodes(Set<EntityHandlingCode> entityHandlingCodes) {
        this.entityHandlingCodes = entityHandlingCodes;
    }

    /**
     *
     * @return see {@link #roles}
     */
    public Set<Role> getRoles() {
        return this.roles;
    }

    /**
     *
     * @param roles see {@link #roles}
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     *
     * @return see {@link #entityTelecoms}
     */
    public Set<TEL> getEntityTelecoms() {
        return this.entityTelecoms;
    }

    /**
     *
     * @param entityTelecoms see {@link #entityTelecoms}
     */
    public void setEntityTelecoms(Set<TEL> entityTelecoms) {
        this.entityTelecoms = entityTelecoms;
    }

    /**
     *
     * @return see {@link #entityAddresses}
     */
    public Set<AD> getEntityAddresses() {
        return this.entityAddresses;
    }

    /**
     *
     * @param entityAddresses see {@link #entityAddresses}
     */
    public void setEntityAddresses(Set<AD> entityAddresses) {
        this.entityAddresses = entityAddresses;
    }

    /**
     *
     * @return see {@link #entityRiskCodes}
     */
    public Set<EntityRiskCode> getEntityRiskCodes() {
        return this.entityRiskCodes;
    }

    /**
     *
     * @param entityRiskCodes see {@link #entityRiskCodes}
     */
    public void setEntityRiskCodes(Set<EntityRiskCode> entityRiskCodes) {
        this.entityRiskCodes = entityRiskCodes;
    }

    /**
     *
     * @return see {@link #entityIds}
     */
    public Set<II> getEntityIds() {
        return this.entityIds;
    }

    /**
     *
     * @param entityIds see {@link #entityIds}
     */
    public void setEntityIds(Set<II> entityIds) {
        this.entityIds = entityIds;
    }

    /**
     *
     * @return see {@link #languageCommunications}
     */
    public Set<LanguageCommunication> getLanguageCommunications() {
        return this.languageCommunications;
    }

    /**
     *
     * @param languageCommunications see {@link #languageCommunications}
     */
    public void setLanguageCommunications(Set<LanguageCommunication> languageCommunications) {
        this.languageCommunications = languageCommunications;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
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
        final Entity other = (Entity) obj;
        if (!Objects.equals(this.internalId, other.internalId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityinternalId= " + Long.toString(getInternalId())
                + ", classCode=" + classCode + ", determinerCode="
                + determinerCode + ", code=" + code + ", quantity=" + quantity
                + ", description=" + description + ", statusCode=" + statusCode
                + '}';
    }
}
