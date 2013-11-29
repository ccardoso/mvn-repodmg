package healthy.rim;

import healthy.EntityArchetypeType;
import healthy.rim.type.CD;
import healthy.rim.type.IVL;
import healthy.rim.type.TS;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * A subtype of ManufacturedMaterial used in an activity, without being
 * substantially changed through that activity.
 * </p>
 *
 * The kind of device is identified by the code attribute inherited from Entity.
 *
 * <i>Usage:</i> This includes durable (reusable) medical equipment as well as
 * disposable equipment.
 * <p>
 * Documentation based on HL7 document centre </p>
 *
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Device")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device")
public class Device extends Material implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    /**
     * The human designated moniker for a device assigned by the manufacturer.
     *
     * <i>Examples:</i> Perkin Elmer 400 Inductively Coupled Plasma Unit
     */
    @XmlElement(name = "manufacturerModelName")
    private String manufacturerModelName;
    /**
     * The moniker, version and release of the software that operates the device
     * as assigned by the software manufacturer or developer.
     *
     * <i>Examples:</i> Agilent Technologies Chemstation A.08.xx
     */
    @XmlElement(name = "softwareName")
    private String softwareName;
    /**
     * <p>
     * A value representing the current state of control associated with the
     * device.</p>
     *
     * <i>Examples:</i> A device can either work autonomously
     * (localRemoteControlStateCode="Local") or it can be controlled by another
     * system (localRemoteControlStateCode="Remote").
     *
     * <i>Rationale:</i> The control status of a device must be communicated
     * between devices prior to remote commands being transmitted. If the device
     * is not in "Remote" status then external commands will be ignored.
     */
    @XmlElement(name = "localRemoteStateCode")
    private CD localRemoteStateCode;
    /**
     * <p>
     * A value representing the current functional activity of an automated
     * device.</p>
     *
     * <i>Examples:</i> Normal, Warning, Critical
     *
     * <i>Constraints:</i> The value of the attribute is determined by the
     * device.
     *
     *
     */
    @XmlElement(name = "alertLevelCode")
    private CD alertLevelCode;
    /**
     * <p>
     * The date/time of the last calibration of the device.</p>
     *
     * <i>Rationale:</i> Devices are required to be re-calibrated at specific
     * intervals to ensure they are performing within specifications. The
     * accepted interval between calibrations varies with protocols. Thus for
     * results to be valid, the precise time/date of last calibration is a
     * critical component.
     */
    @XmlElement(name = "lastClaibrationTime")
    private TS lastClaibrationTime;

    /**
     * Default constructor
     */
    public Device() {
        super(EntityArchetypeType.DEVICE);
    }

    /**
     * Constructor
     *
     * @param manufacturerModelName see {@link #manufacturerModelName}
     * @param softwareName see {@link #softwareName}
     * @param localRemoteStateCode see {@link #localRemoteStateCode}
     * @param alertLevelCode see {@link #alertLevelCode}
     * @param lastClaibrationTime see {@link #lastClaibrationTime}
     */
    public Device(String manufacturerModelName, String softwareName, CD localRemoteStateCode, CD alertLevelCode, TS lastClaibrationTime) {
        super(EntityArchetypeType.DEVICE);
        this.manufacturerModelName = manufacturerModelName;
        this.softwareName = softwareName;
        this.localRemoteStateCode = localRemoteStateCode;
        this.alertLevelCode = alertLevelCode;
        this.lastClaibrationTime = lastClaibrationTime;
    }

    /**
     * Constructor
     *
     * @param manufacturerModelName see {@link #manufacturerModelName}
     * @param softwareName see {@link #softwareName}
     * @param localRemoteStateCode see {@link #localRemoteStateCode}
     * @param alertLevelCode see {@link #alertLevelCode}
     * @param lastClaibrationTime see {@link #lastClaibrationTime}
     * @param formCode see {@link #formCode}
     * @param lotNumberText see {@link #lotNumberText}
     * @param expirationTime see {@link #expirationTime}
     * @param stabilityTime see {@link #stabilityTime}
     */
    public Device(String manufacturerModelName, String softwareName, CD localRemoteStateCode, CD alertLevelCode, TS lastClaibrationTime, CD formCode, String lotNumberText, IVL<TS> expirationTime, IVL<TS> stabilityTime) {
        super(EntityArchetypeType.DEVICE, formCode, lotNumberText, expirationTime, stabilityTime);
        this.manufacturerModelName = manufacturerModelName;
        this.softwareName = softwareName;
        this.localRemoteStateCode = localRemoteStateCode;
        this.alertLevelCode = alertLevelCode;
        this.lastClaibrationTime = lastClaibrationTime;
    }

    /**
     *
     * @return see {@link #manufacturerModelName}
     */
    public String getManufacturerModelName() {
        return this.manufacturerModelName;
    }

    /**
     *
     * @param manufacturerModelName see {@link #manufacturerModelName}
     */
    public void setManufacturerModelName(String manufacturerModelName) {
        this.manufacturerModelName = manufacturerModelName;
    }

    /**
     *
     * @return see {@link #softwareName}
     */
    public String getSoftwareName() {
        return this.softwareName;
    }

    /**
     *
     * @param softwareName see {@link #softwareName}
     */
    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    /**
     *
     * @return see {@link #localRemoteStateCode}
     */
    public CD getLocalRemoteStateCode() {
        return this.localRemoteStateCode;
    }

    /**
     *
     * @param localRemoteStateCode see {@link #localRemoteStateCode}
     */
    public void setLocalRemoteStateCode(CD localRemoteStateCode) {
        this.localRemoteStateCode = localRemoteStateCode;
    }

    /**
     *
     * @return see {@link #alertLevelCode}
     */
    public CD getAlertLevelCode() {
        return this.alertLevelCode;
    }

    /**
     *
     * @param alertLevelCode see {@link #alertLevelCode}
     */
    public void setAlertLevelCode(CD alertLevelCode) {
        this.alertLevelCode = alertLevelCode;
    }

    /**
     *
     * @return see {@link #lastClaibrationTime}
     */
    public TS getLastClaibrationTime() {
        return this.lastClaibrationTime;
    }

    /**
     *
     * @param lastClaibrationTime see {@link #lastClaibrationTime}
     */
    public void setLastClaibrationTime(TS lastClaibrationTime) {
        this.lastClaibrationTime = lastClaibrationTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
        hash = 59 * hash + Objects.hashCode(this.manufacturerModelName);
        hash = 59 * hash + Objects.hashCode(this.softwareName);
        hash = 59 * hash + Objects.hashCode(this.localRemoteStateCode);
        hash = 59 * hash + Objects.hashCode(this.alertLevelCode);
        hash = 59 * hash + Objects.hashCode(this.lastClaibrationTime);
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
        final Device other = (Device) obj;
        if (!Objects.equals(this.getInternalId(), other.getInternalId())) {
            return false;
        }
        if (!Objects.equals(this.manufacturerModelName,
                other.manufacturerModelName)) {
            return false;
        }
        if (!Objects.equals(this.softwareName, other.softwareName)) {
            return false;
        }
        if (!Objects.equals(this.localRemoteStateCode,
                other.localRemoteStateCode)) {
            return false;
        }
        if (!Objects.equals(this.alertLevelCode, other.alertLevelCode)) {
            return false;
        }
        if (!Objects.equals(this.lastClaibrationTime, other.lastClaibrationTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Device{internalId= " + Long.toString(getInternalId())
                + ", manufacturerModelName=" + manufacturerModelName
                + ", softwareName=" + softwareName + ", localRemoteStateCode="
                + localRemoteStateCode + ", alertLevelCode=" + alertLevelCode
                + ", lastClaibrationTime=" + lastClaibrationTime + '}';
    }
}
