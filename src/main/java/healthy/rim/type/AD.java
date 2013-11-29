package healthy.rim.type;import java.io.Serializable;import javax.xml.bind.annotation.XmlAccessType;import javax.xml.bind.annotation.XmlAccessorType;import javax.xml.bind.annotation.XmlElement;import javax.xml.bind.annotation.XmlRootElement;import javax.xml.bind.annotation.XmlType;/** * Mailing and home or office addresses. A sequence of address parts, such as * street or post office Box, city, postal code, country, etc. * * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com> * @since 21-Jan-2013 */@XmlRootElement(name = "AD")@XmlAccessorType(XmlAccessType.FIELD)@XmlType(name = "AD", propOrder = {    "address",    "country",    "jurisdiction",    "postalCode",    "purpose",    "type",    "validTime"})public class AD extends RimDataType implements Serializable {    private static final long serialVersionUID = 20130121009924L;    @XmlElement(required = true)    private String address = "";    @XmlElement(required = true)    private String jurisdiction = "";    @XmlElement(required = true)    private String postalCode = "";    @XmlElement(required = true)    private String country = "";    @XmlElement(type = AddressType.class, required = true)    private AddressType type;    @XmlElement(type = AddressPurpose.class, required = true)    private AddressPurpose purpose;    @XmlElement(type = IVL.class)    private IVL<TS> validTime = new IVL(new TS(), new TS());    public AD() {     }    public AD(String address, String jurisdiction, String postalCode,            String country, AddressType type, AddressPurpose purpose, IVL<TS> validTime) {        this.address = address;        this.jurisdiction = jurisdiction;        this.postalCode = postalCode;        this.country = country;        this.type = type;        this.purpose = purpose;        this.validTime = validTime;    }    public String getAddress() {        return address;    }    public void setAddress(String address) {        this.address = address;    }    public String getJurisdiction() {        return jurisdiction;    }    public void setJurisdiction(String jurisdiction) {        this.jurisdiction = jurisdiction;    }    public String getPostalCode() {        return postalCode;    }    public void setPostalCode(String postalCode) {        this.postalCode = postalCode;    }    public String getCountry() {        return country;    }    public void setCountry(String country) {        this.country = country;    }    public AddressType getType() {        return type;    }    public void setType(AddressType type) {        this.type = type;    }    public AddressPurpose getPurpose() {        return purpose;    }    public void setPurpose(AddressPurpose purpose) {        this.purpose = purpose;    }    public IVL<TS> getValidTime() {        return validTime;    }    public void setValidTime(IVL<TS> validTime) {        this.validTime = validTime;    }    @Override    public int hashCode() {        int hash = 5;        hash = 79 * hash + (this.address != null ? this.address.hashCode() : 0);        hash = 79 * hash + (this.jurisdiction != null ? this.jurisdiction.hashCode() : 0);        hash = 79 * hash + (this.postalCode != null ? this.postalCode.hashCode() : 0);        hash = 79 * hash + (this.country != null ? this.country.hashCode() : 0);        hash = 79 * hash + (this.type != null ? this.type.hashCode() : 0);        hash = 79 * hash + (this.purpose != null ? this.purpose.hashCode() : 0);        hash = 79 * hash + (this.validTime != null ? this.validTime.hashCode() : 0);        return hash;    }    @Override    public boolean equals(Object obj) {        if (obj == null) {            return false;        }        if (getClass() != obj.getClass()) {            return false;        }        final AD other = (AD) obj;        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {            return false;        }        if ((this.jurisdiction == null) ? (other.jurisdiction != null) : !this.jurisdiction.equals(other.jurisdiction)) {            return false;        }        if ((this.postalCode == null) ? (other.postalCode != null) : !this.postalCode.equals(other.postalCode)) {            return false;        }        if ((this.country == null) ? (other.country != null) : !this.country.equals(other.country)) {            return false;        }        if (this.type != other.type) {            return false;        }        if (this.purpose != other.purpose) {            return false;        }        if (this.validTime != other.validTime && (this.validTime == null || !this.validTime.equals(other.validTime))) {            return false;        }        return true;    }    @Override    public String toString() {        return "AD{" + "address=" + address + ", jurisdiction=" + jurisdiction + ", postalCode=" + postalCode + ", country=" + country + '}';    }}