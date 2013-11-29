package healthy.rim;

import healthy.EntityArchetypeType;
import healthy.rim.type.BooleanAdapter;
import healthy.rim.type.CD;
import healthy.rim.type.PQ;
import healthy.rim.type.TS;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Person is a subtype of LivingSubject representing a human being.</p>
 *
 * <i>Constraints:</i> This class can be used to represent either a single
 * individual or a group of individuals based on the value of
 * Entity.determinerCode and Entity.quantity.
 * <p>
 * Documentation based on HL7 document centre </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Person")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person")
public class Person extends Entity implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    /**
     * <p>
     * A value representing the gender (sex) of a Living subject.</p>
     *
     * <i>Examples:</i> female, male
     *
     * <i>Discussion:</i> This attribute does not include terms related to
     * clinical gender. Gender is a complex physiological, genetic and
     * sociological concept that requires multiple observations in order to be
     * comprehensively described. The purpose of this attribute is to provide a
     * high level classification that can additionally be used for the
     * appropriate allocation of inpatient bed assignment.
     *
     * <i>Constraints:</i> This code is used for administrative purposes.
     */
    @XmlElement(name = "administrativeGenderCode")
    private String administrativeGenderCode = "";
    /**
     * The date and time of a living subject's birth or hatching.
     */
    @XmlElement(name = "birthTime")
    private TS birthTime = new TS();
    /**
     * An indication that the subject is dead.
     */
    @XmlElement(name = "deceasedInd", defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean deceasedInd = false;
    /**
     * The date and time that a living subject's death occurred.
     */
    @XmlElement(name = "deceasedTime")
    private TS deceasedTime = new TS();
    /**
     * An indication as to whether the living subject is part of a multiple
     * birth.
     */
    @XmlElement(name = "multipleBirthInd", defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean multipleBirthInd = false;
    /**
     * The order in which this living subject was born if part of a multiple
     * birth.
     */
    @XmlElement(name = "multipleBirthOrderNumber")
    private int multipleBirthOrderNumber = -1;
    /**
     * <p>
     * An indication that the living subject is a candidate to serve as an organ
     * donor.</p>
     *
     * <i>Discussion:</i> This attribute specifies whether an individual living
     * subject has donated or is willing to donate an organ.
     */
    @XmlElement(name = "organDonnorInd", defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean organDonnorInd = false;
    @XmlElement(name = "birthmarks")
    private String birthmarks = "";
    @XmlElement(name = "hairColor")
    private String hairColor = "";
    @XmlElement(name = "eyeColor")
    private String eyeColor = "";
    @XmlElement(name = "weightQuantity")
    private PQ weightQuantity = new PQ();
    @XmlElement(name = "heightQuantity")
    private PQ heightQuantity = new PQ();
    //==============================================================
    /**
     * <p>
     * A value representing the domestic partnership status of a person.</p>
     *
     * <i>Examples:</i> Married, separated, divorced, widowed, common-law
     * marriage.
     *
     * <i>Rationale:</i> This information is reported on UB FL 16
     */
    @XmlElement(name = "maritalStatusCode")
    private CD maritalStatusCode = new CD();
    /**
     * The highest level of education a person achieved (e.g. elementary school,
     * high school or secondary school degree complete, college or baccalaureate
     * degree complete).
     */
    @XmlElement(name = "educationLevelCode")
    private CD educationLevelCode = new CD();
    /**
     * <p>
     * A value specifying the housing situation of a person.</p>
     *
     * <i>Examples:</i> Independent household, institution, nursing home,
     * extended care facility, retirement community, etc.).
     *
     * <I>Discussion:</i> Used for discharge planning, social service
     * assessment, psychosocial evaluation.
     *
     *
     */
    @XmlElement(name = "livingArrangementCode")
    private CD livingArrangementCode = new CD();
    /**
     * The primary religious preference of a person (e.g. Hinduism, Islam, Roman
     * Catholic Church).
     */
    @XmlElement(name = "religiousAffiliationCode")
    private CD religiousAffiliationCode = new CD();
    /**
     * A value representing the race of a person.
     */
    @XmlElement(name = "raceCode")
    private CD raceCode = new CD();
    /**
     * see {@link PersonDisabilityCode}
     */
    @XmlElement(name = "personDisabilityCodes")
    private Set<PersonDisabilityCode> personDisabilityCodes = new HashSet(0);
    /**
     * see {@link PersonEthnicGroupCode}
     */
    @XmlElement(name = "personEthnicGroupCodes")
    private Set<PersonEthnicGroupCode> personEthnicGroupCodes = new HashSet(0);
    /**
     *
     */
    @XmlElement(name = "personFiliationCode")
    private Set<PersonFiliationCode> personFiliationCodes = new HashSet(0);

    /**
     * Default constructor
     */
    public Person() {
        super(EntityArchetypeType.PERSON);
    }

    /**
     * Constructor
     *
     * @param administrativeGenderCode see {@link #administrativeGenderCode}
     * @param birthTime see {@link #birthTime}
     * @param deceasedInd see {@link #deceasedInd}
     * @param deceasedTime see {@link #deceasedTime}
     * @param multipleBirthInd see {@link #multipleBirthInd}
     * @param multipleBirthOrderNumber see {@link #multipleBirthOrderNumber}
     * @param organDonnorInd see {@link #organDonnorInd}
     * @param birthmarks see {@link #birthmarks}
     * @param hairColor see {@link #hairColor}
     * @param eyeColor see {@link #eyeColor}
     * @param weightQuantity see {@link #weightQuantity }
     * @param heightQuantity see {@link #heightQuantity }
     * @param maritalStatusCode see {@link #maritalStatusCode }
     * @param educationLevelCode see {@link #educationLevelCode }
     * @param livingArrangementCode see {@link #livingArrangementCode }
     * @param religiousAffiliationCode see {@link #religiousAffiliationCode }
     * @param raceCode see {@link #raceCode }
     */
    public Person(String administrativeGenderCode, TS birthTime, Boolean deceasedInd, TS deceasedTime, Boolean multipleBirthInd, int multipleBirthOrderNumber, Boolean organDonnorInd, String birthmarks, String hairColor, String eyeColor, PQ weightQuantity, PQ heightQuantity, CD maritalStatusCode, CD educationLevelCode, CD livingArrangementCode, CD religiousAffiliationCode, CD raceCode) {
        super(EntityArchetypeType.PERSON);
        this.administrativeGenderCode = administrativeGenderCode;
        this.birthTime = birthTime;
        this.deceasedInd = deceasedInd;
        this.deceasedTime = deceasedTime;
        this.multipleBirthInd = multipleBirthInd;
        this.multipleBirthOrderNumber = multipleBirthOrderNumber;
        this.organDonnorInd = organDonnorInd;
        this.birthmarks = birthmarks;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.weightQuantity = weightQuantity;
        this.heightQuantity = heightQuantity;
        this.maritalStatusCode = maritalStatusCode;
        this.educationLevelCode = educationLevelCode;
        this.livingArrangementCode = livingArrangementCode;
        this.religiousAffiliationCode = religiousAffiliationCode;
        this.raceCode = raceCode;
    }

    /**
     *
     * @return see {@link #administrativeGenderCode}
     */
    public String getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }

    /**
     *
     * @param administrativeGenderCode see {@link #administrativeGenderCode}
     */
    public void setAdministrativeGenderCode(String administrativeGenderCode) {
        this.administrativeGenderCode = administrativeGenderCode;
    }

    /**
     *
     * @return see {@link #birthTime}
     */
    public TS getBirthTime() {
        return birthTime;
    }

    /**
     *
     * @param birthTime see {@link #birthTime}
     */
    public void setBirthTime(TS birthTime) {
        this.birthTime = birthTime;
    }

    /**
     *
     * @return see {@link #deceasedInd}
     */
    public Boolean getDeceasedInd() {
        return deceasedInd;
    }

    /**
     *
     * @param deceasedInd see {@link #deceasedInd}
     */
    public void setDeceasedInd(Boolean deceasedInd) {
        this.deceasedInd = deceasedInd;
    }

    /**
     *
     * @return see {@link #deceasedTime}
     */
    public TS getDeceasedTime() {
        return deceasedTime;
    }

    /**
     *
     * @param deceasedTime see {@link #deceasedTime}
     */
    public void setDeceasedTime(TS deceasedTime) {
        this.deceasedTime = deceasedTime;
    }

    /**
     *
     * @return see {@link #multipleBirthInd}
     */
    public Boolean getMultipleBirthInd() {
        return multipleBirthInd;
    }

    /**
     *
     * @param multipleBirthInd see {@link #multipleBirthInd}
     */
    public void setMultipleBirthInd(Boolean multipleBirthInd) {
        this.multipleBirthInd = multipleBirthInd;
    }

    /**
     *
     * @return see {@link #multipleBirthOrderNumber}
     */
    public int getMultipleBirthOrderNumber() {
        return multipleBirthOrderNumber;
    }

    /**
     *
     * @param multipleBirthOrderNumber see {@link #multipleBirthOrderNumber}
     */
    public void setMultipleBirthOrderNumber(int multipleBirthOrderNumber) {
        this.multipleBirthOrderNumber = multipleBirthOrderNumber;
    }

    /**
     *
     * @return see {@link #organDonnorInd}
     */
    public Boolean getOrganDonnorInd() {
        return organDonnorInd;
    }

    /**
     *
     * @param organDonnorInd see {@link #organDonnorInd}
     */
    public void setOrganDonnorInd(Boolean organDonnorInd) {
        this.organDonnorInd = organDonnorInd;
    }

    /**
     *
     * @return see {@link #birthmarks}
     */
    public String getBirthmarks() {
        return birthmarks;
    }

    /**
     *
     * @param birthmarks see {@link #birthmarks}
     */
    public void setBirthmarks(String birthmarks) {
        this.birthmarks = birthmarks;
    }

    /**
     *
     * @return see {@link #hairColor}
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     *
     * @param hairColor see {@link #hairColor}
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     *
     * @return see {@link #eyeColor}
     */
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     *
     * @param eyeColor see {@link #eyeColor}
     */
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     *
     * @return see {@link #weightQuantity}
     */
    public PQ getWeightQuantity() {
        return weightQuantity;
    }

    /**
     *
     * @param weightQuantity see {@link #weightQuantity}
     */
    public void setWeightQuantity(PQ weightQuantity) {
        this.weightQuantity = weightQuantity;
    }

    /**
     *
     * @return see {@link #heightQuantity}
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
     * see {@link #maritalStatusCode}
     *
     * @return CD
     */
    public CD getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     *
     * @param maritalStatusCode see {@link #maritalStatusCode}
     */
    public void setMaritalStatusCode(CD maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    /**
     * see {@link #educationLevelCode}
     *
     * @return CD
     */
    public CD getEducationLevelCode() {
        return educationLevelCode;
    }

    /**
     *
     * @param educationLevelCode see {@link #educationLevelCode}
     */
    public void setEducationLevelCode(CD educationLevelCode) {
        this.educationLevelCode = educationLevelCode;
    }

    /**
     * see {@link #livingArrangementCode}
     *
     * @return CD
     */
    public CD getLivingArrangementCode() {
        return livingArrangementCode;
    }

    /**
     *
     * @param livingArrangementCode see {@link #livingArrangementCode}
     */
    public void setLivingArrangementCode(CD livingArrangementCode) {
        this.livingArrangementCode = livingArrangementCode;
    }

    /**
     *
     *
     * @return see {@link #religiousAffiliationCode}
     */
    public CD getReligiousAffiliationCode() {
        return religiousAffiliationCode;
    }

    /**
     *
     * @param religiousAffiliationCode see {@link #religiousAffiliationCode}
     */
    public void setReligiousAffiliationCode(CD religiousAffiliationCode) {
        this.religiousAffiliationCode = religiousAffiliationCode;
    }

    /**
     * see {@link #raceCode}
     *
     * @return CD
     */
    public CD getRaceCode() {
        return raceCode;
    }

    /**
     *
     * @param raceCode see {@link #raceCode}
     */
    public void setRaceCode(CD raceCode) {
        this.raceCode = raceCode;
    }

    /**
     * see {@link #personDisabilityCodes}
     *
     * @return Set
     */
    public Set<PersonDisabilityCode> getPersonDisabilityCodes() {
        return personDisabilityCodes;
    }

    /**
     *
     * @param personDisabilityCodes see {@link #personDisabilityCodes}
     */
    public void setPersonDisabilityCodes(
            Set<PersonDisabilityCode> personDisabilityCodes) {
        this.personDisabilityCodes = personDisabilityCodes;
    }

    /**
     * see {@link #personEthnicGroupCodes}
     *
     * @return Set
     */
    public Set<PersonEthnicGroupCode> getPersonEthnicGroupCodes() {
        return personEthnicGroupCodes;
    }

    /**
     *
     * @param personEthnicGroupCodes see {@link #personEthnicGroupCodes}
     */
    public void setPersonEthnicGroupCodes(Set<PersonEthnicGroupCode> personEthnicGroupCodes) {
        this.personEthnicGroupCodes = personEthnicGroupCodes;
    }

    public Set<PersonFiliationCode> getPersonFiliationCodes() {
        return personFiliationCodes;
    }

    public void setPersonFiliationCodes(Set<PersonFiliationCode> personFiliationCode) {
        this.personFiliationCodes = personFiliationCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.administrativeGenderCode);
        hash = 13 * hash + Objects.hashCode(this.birthTime);
        hash = 13 * hash + Objects.hashCode(this.deceasedInd);
        hash = 13 * hash + Objects.hashCode(this.deceasedTime);
        hash = 13 * hash + Objects.hashCode(this.multipleBirthInd);
        hash = 13 * hash + this.multipleBirthOrderNumber;
        hash = 13 * hash + Objects.hashCode(this.organDonnorInd);
        hash = 13 * hash + Objects.hashCode(this.birthmarks);
        hash = 13 * hash + Objects.hashCode(this.hairColor);
        hash = 13 * hash + Objects.hashCode(this.eyeColor);
        hash = 13 * hash + Objects.hashCode(this.weightQuantity);
        hash = 13 * hash + Objects.hashCode(this.heightQuantity);
        hash = 13 * hash + Objects.hashCode(this.maritalStatusCode);
        hash = 13 * hash + Objects.hashCode(this.educationLevelCode);
        hash = 13 * hash + Objects.hashCode(this.livingArrangementCode);
        hash = 13 * hash + Objects.hashCode(this.religiousAffiliationCode);
        hash = 13 * hash + Objects.hashCode(this.raceCode);
        hash = 13 * hash + Objects.hashCode(this.personDisabilityCodes);
        hash = 13 * hash + Objects.hashCode(this.personEthnicGroupCodes);
        hash = 13 * hash + Objects.hashCode(this.personFiliationCodes);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.administrativeGenderCode, other.administrativeGenderCode)) {
            return false;
        }
        if (!Objects.equals(this.birthTime, other.birthTime)) {
            return false;
        }
        if (!Objects.equals(this.deceasedInd, other.deceasedInd)) {
            return false;
        }
        if (!Objects.equals(this.deceasedTime, other.deceasedTime)) {
            return false;
        }
        if (!Objects.equals(this.multipleBirthInd, other.multipleBirthInd)) {
            return false;
        }
        if (this.multipleBirthOrderNumber != other.multipleBirthOrderNumber) {
            return false;
        }
        if (!Objects.equals(this.organDonnorInd, other.organDonnorInd)) {
            return false;
        }
        if (!Objects.equals(this.birthmarks, other.birthmarks)) {
            return false;
        }
        if (!Objects.equals(this.hairColor, other.hairColor)) {
            return false;
        }
        if (!Objects.equals(this.eyeColor, other.eyeColor)) {
            return false;
        }
        if (!Objects.equals(this.weightQuantity, other.weightQuantity)) {
            return false;
        }
        if (!Objects.equals(this.heightQuantity, other.heightQuantity)) {
            return false;
        }
        if (!Objects.equals(this.maritalStatusCode, other.maritalStatusCode)) {
            return false;
        }
        if (!Objects.equals(this.educationLevelCode, other.educationLevelCode)) {
            return false;
        }
        if (!Objects.equals(this.livingArrangementCode, other.livingArrangementCode)) {
            return false;
        }
        if (!Objects.equals(this.religiousAffiliationCode, other.religiousAffiliationCode)) {
            return false;
        }
        if (!Objects.equals(this.raceCode, other.raceCode)) {
            return false;
        }
        if (!Objects.equals(this.personDisabilityCodes, other.personDisabilityCodes)) {
            return false;
        }
        if (!Objects.equals(this.personEthnicGroupCodes, other.personEthnicGroupCodes)) {
            return false;
        }
        if (!Objects.equals(this.personFiliationCodes, other.personFiliationCodes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "administrativeGenderCode=" + administrativeGenderCode + ", birthTime=" + birthTime + ", deceasedInd=" + deceasedInd + ", deceasedTime=" + deceasedTime + ", multipleBirthInd=" + multipleBirthInd + ", multipleBirthOrderNumber=" + multipleBirthOrderNumber + ", organDonnorInd=" + organDonnorInd + ", birthmarks=" + birthmarks + ", hairColor=" + hairColor + ", eyeColor=" + eyeColor + ", weightQuantity=" + weightQuantity + ", heightQuantity=" + heightQuantity + ", maritalStatusCode=" + maritalStatusCode + ", educationLevelCode=" + educationLevelCode + ", livingArrangementCode=" + livingArrangementCode + ", religiousAffiliationCode=" + religiousAffiliationCode + ", raceCode=" + raceCode + ", personDisabilityCodes=" + personDisabilityCodes + ", personEthnicGroupCodes=" + personEthnicGroupCodes + ", personFiliationCodes=" + personFiliationCodes + '}';
    }
}
