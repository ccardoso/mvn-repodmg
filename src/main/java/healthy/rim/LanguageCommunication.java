package healthy.rim;

import healthy.rim.type.BooleanAdapter;
import healthy.rim.type.CD;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * LanguageCommunication The language communication capabilities for an
 * Entity.</p>
 *
 * <i>Examples:</i> A patient who originally came from Mexico may have fluent
 * language capabilities to speak, read and write in Spanish, but only
 * rudimentary capabilities in English. A person from Russia may have the
 * capability to communicate equally well in spoken language in Russian,
 * Armenian or Ukrainian, but prefers to speak in Armenian.
 *
 * <i>Discussion:</i> While it may seem on the surface that this class would be
 * restricted in usage to only the LivingSubject subtypes, Devices also have the
 * ability to communicate, such as automated telephony devices that transmit
 * patient information to live operators on a triage line or provide automated
 * laboratory results to clinicians.RootElement
 *
 * <i>Rationale:</i> Each Entity with the ability to communicate verbally has
 * differing language and proficiency level. This class specifies the languages
 * with which the entity can communicate, the mode of communication (speak,
 * read, write), the proficiency of that communication, and the Entity's
 * preference.
 * <p>
 * Documentation based on HL7 document centre </p> specifications
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "LanguageCommunication")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageCommunication")
public class LanguageCommunication implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "internalId")
    private long internalId;
    /**
     * <p>
     * A value representing a language for which the Entity has some level of
     * proficiency for written or spoken communication.</p>
     *
     * <i>Examples:</i> Spanish, Italian, German, English, American Sign, etc.
     *
     * <i>Discussion:</i> Communication via spoken or written language is not
     * solely restricted to LivingSubjects. Devices that communicate with
     * persons using human language also must specify in which languages they
     * are capable. Automated voice response systems respond to human language
     * and communicate with other devices or persons using human language.
     *
     * <i>Rationale:</i> Many individuals and devices have the capability to
     * communicate at varying levels in multiple languages. This code specifies
     * a language capability that the entity wishes to make known.
     */
    @XmlElement(name = "languageCode")
    private String languageCode;
    /**
     * <p>
     * A value representing the method of expression of the language.</p>
     *
     * <i>Examples:</i> expressed spoken, expressed written, expressed signed,
     * received spoken, received written, received signed
     */
    @XmlElement(name = "modeCode")
    private CD modeCode;
    /**
     * <p>
     * A value representing the level of proficiency in a language.</p>
     * <i>Examples:</i> excellent, good, fair, poor
     */
    @XmlElement(name = "proficiencyLevelCode")
    private CD proficiencyLevelCode;
    /**
     * <p>
     * An indicator specifying whether or not the language is preferred by the
     * entity for the associated mode.</p>
     */
    @XmlElement(name = "preferencedInd", defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean preferenceInd = false;

    /**
     *
     */
    public LanguageCommunication() {
    }

    /**
     *
     * @param languageCode see {@link #languageCode}
     * @param modeCode see {@link #modeCode}
     * @param proficiencyLevelCode see {@link #proficiencyLevelCode}
     * @param preferenceInd see {@link #preferenceInd}
     */
    public LanguageCommunication(String languageCode, CD modeCode,
            CD proficiencyLevelCode, boolean preferenceInd) {
        this.languageCode = languageCode;
        this.modeCode = modeCode;
        this.proficiencyLevelCode = proficiencyLevelCode;
        this.preferenceInd = preferenceInd;
    }

    /**
     *
     * @param internalId see {@link #internalId}
     * @param languageCode see {@link #languageCode}
     * @param modeCode see {@link #modeCode}
     * @param proficiencyLevelCode see {@link #proficiencyLevelCode}
     * @param preferenceInd see {@link #preferenceInd}
     */
    public LanguageCommunication(long internalId, String languageCode,
            CD modeCode, CD proficiencyLevelCode, boolean preferenceInd) {
        this.internalId = internalId;
        this.languageCode = languageCode;
        this.modeCode = modeCode;
        this.proficiencyLevelCode = proficiencyLevelCode;
        this.preferenceInd = preferenceInd;
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
     * @return see {@link #languageCode}
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     *
     * @param languageCode see {@link #languageCode}
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
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
     * @return see {@link #modeCode}
     */
    public CD getModeCode() {
        return this.modeCode;
    }

    /**
     *
     * @param modeCode see {@link #modeCode}
     */
    public void setModeCode(CD modeCode) {
        this.modeCode = modeCode;
    }

    /**
     *
     * @return see {@link #proficiencyLevelCode}
     */
    public CD getProficiencyLevelCode() {
        return this.proficiencyLevelCode;
    }

    /**
     *
     * @param proficiencyLevelCode see {@link #proficiencyLevelCode}
     */
    public void setProficiencyLevelCode(CD proficiencyLevelCode) {
        this.proficiencyLevelCode = proficiencyLevelCode;
    }

    /**
     *
     * @return see {@link #preferenceInd}
     */
    public boolean isPreferenceInd() {
        return this.preferenceInd;
    }

    /**
     *
     * @param preferenceInd see {@link #preferenceInd}
     */
    public void setPreferenceInd(boolean preferenceInd) {
        this.preferenceInd = preferenceInd;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.internalId ^ (this.internalId >>> 32));
        hash = 79 * hash + Objects.hashCode(this.languageCode);
        hash = 79 * hash + Objects.hashCode(this.modeCode);
        hash = 79 * hash + Objects.hashCode(this.proficiencyLevelCode);
        hash = 79 * hash + (this.preferenceInd ? 1 : 0);
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
        final LanguageCommunication other = (LanguageCommunication) obj;
        if (this.internalId != other.internalId) {
            return false;
        }
        if (!Objects.equals(this.languageCode, other.languageCode)) {
            return false;
        }
        if (!Objects.equals(this.modeCode, other.modeCode)) {
            return false;
        }
        if (!Objects.equals(this.proficiencyLevelCode,
                other.proficiencyLevelCode)) {
            return false;
        }
        if (this.preferenceInd != other.preferenceInd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LanguageCommunication{ internalId= " + Long.toString(
                getInternalId()) + ",  languageCode=" + languageCode
                + ", modeCode=" + modeCode + ", proficiencyLevelCode="
                + proficiencyLevelCode + ", preferenceInd=" + preferenceInd
                + '}';
    }
}
