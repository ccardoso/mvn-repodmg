package healthy.rim.type;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * * Mailing and home or office addresses. A sequence of address parts, such as
 * * street or post office Box, city, postal code, country.
 *
 * * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 31-Oct-2013
 */
@XmlRootElement(name = "BasicAD")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicAD", propOrder = {"address", "jurisdiction", "postalCode", "country"})
public class BasicAD extends RimDataType implements Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(required = true)
    private String address;
    @XmlElement(required = true)
    private String jurisdiction;
    @XmlElement(required = true)
    private String postalCode;
    @XmlElement(required = true)
    private String country;

    public BasicAD() {
    }

    public BasicAD(String address, String jurisdiction, String postalCode, String country) {
        this.address = address;
        this.jurisdiction = jurisdiction;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAddress() {
        return address;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.jurisdiction);
        hash = 41 * hash + Objects.hashCode(this.postalCode);
        hash = 41 * hash + Objects.hashCode(this.country);
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
        final BasicAD other = (BasicAD) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.jurisdiction, other.jurisdiction)) {
            return false;
        }
        if (!Objects.equals(this.postalCode, other.postalCode)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BasicAD{" + "address=" + address + ", jurisdiction=" + jurisdiction + ", postalCode=" + postalCode + ", country=" + country + '}';
    }
}