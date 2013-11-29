package healthy.rim;

import healthy.rim.type.CD;
import healthy.rim.type.PQ;
import healthy.rim.type.QSET;
import healthy.rim.type.TS;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Patient is a Role of a Living Subject (player) as a recipient of health care
 * services from a healthcare provider (scoper).
 * <p>
 * Documentation based on HL7 document centre </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Patient")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient")
public class Patient extends Role implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name = "veryImportantPersonCode")
    private CD veryImportantPersonCode;

    /**
     *
     */
    public Patient() {
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
    public Patient(long internalId, String classCode, CD code,
            Boolean negationInd, String statusCode, QSET<TS> effectiveTime,
            String certificateText, CD confidentialityCode, PQ quantity,
            Integer priorityNumber, Integer positionNumber) {
        super(internalId, classCode, code, negationInd, statusCode,
                effectiveTime, certificateText, confidentialityCode, quantity,
                priorityNumber, positionNumber);
    }

    /**
     *
     * @param veryImportantPersonCode see {@link #veryImportantPersonCode}
     */
    public Patient(CD veryImportantPersonCode) {
        this.veryImportantPersonCode = veryImportantPersonCode;
    }

    /**
     *
     * @param veryImportantPersonCode see {@link #veryImportantPersonCode}
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
    public Patient(CD veryImportantPersonCode, long internalId, String classCode,
            CD code, Boolean negationInd, String statusCode,
            QSET<TS> effectiveTime, String certificateText,
            CD confidentialityCode, PQ quantity, Integer priorityNumber,
            Integer positionNumber) {
        super(internalId, classCode, code, negationInd, statusCode,
                effectiveTime, certificateText, confidentialityCode, quantity,
                priorityNumber, positionNumber);
        this.veryImportantPersonCode = veryImportantPersonCode;
    }

    /**
     * see {@link #veryImportantPersonCode}
     *
     * @return CD
     */
    public CD getVeryImportantPersonCode() {
        return this.veryImportantPersonCode;
    }

    /**
     *
     * @param veryImportantPersonCode see {@link #veryImportantPersonCode}
     */
    public void setVeryImportantPersonCode(CD veryImportantPersonCode) {
        this.veryImportantPersonCode = veryImportantPersonCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
        hash = 67 * hash + Objects.hashCode(this.veryImportantPersonCode);
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
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.veryImportantPersonCode,
                other.veryImportantPersonCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{internalId= " + Long.toString(getInternalId())
                + ", veryImportantPersonCode=" + veryImportantPersonCode + '}';
    }
}
