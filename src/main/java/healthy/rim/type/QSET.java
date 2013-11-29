package healthy.rim.type;import java.util.Objects;import javax.xml.bind.annotation.XmlAccessType;import javax.xml.bind.annotation.XmlAccessorType;import javax.xml.bind.annotation.XmlElement;import javax.xml.bind.annotation.XmlRootElement;import javax.xml.bind.annotation.XmlSeeAlso;import javax.xml.bind.annotation.XmlType;/** * A quantity value set that containing values like (lowerest and upperest value, a * nominal value and his measure unit). * * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com> * @since 30-Jan-2013 */@XmlRootElement(name = "QSET")@XmlAccessorType(XmlAccessType.FIELD)@XmlType(name = "QSET", propOrder = {    "lower",    "upper",    "value",    "unit"})@XmlSeeAlso(healthy.rim.type.RimDataType.class)public class QSET<RimDataType> {    @XmlElement(required = true)    private RimDataType lower;    @XmlElement    private RimDataType upper;    @XmlElement(required = true)    private double value;    @XmlElement(required = true)    private String unit = "";    public QSET() {    }    public QSET(RimDataType lower, RimDataType upper) {        this.lower = lower;        this.upper = upper;    }    public QSET(double value, String unit) {        this.value = value;        this.unit = unit;    }    public QSET(RimDataType lower, RimDataType upper, double value, String unit) {        this.lower = lower;        this.upper = upper;        this.value = value;        this.unit = unit;    }    public RimDataType getLow() {        return lower;    }    public void setLow(RimDataType lower) {        this.lower = lower;    }    public RimDataType getHigh() {        return upper;    }    public void setHigh(RimDataType upper) {        this.upper = upper;    }    public double getValue() {        return value;    }    public void setValue(double value) {        this.value = value;    }    public String getUnit() {        return unit;    }    public void setUnit(String unit) {        this.unit = unit;    }    @Override    public String toString() {        return (lower.toString() + "-" + upper.toString() + ", " + Double.toString(value) + " " + unit);    }    @Override    public int hashCode() {        int hash = 7;        hash = 67 * hash + Objects.hashCode(this.lower);        hash = 67 * hash + Objects.hashCode(this.upper);        hash = 67 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));        hash = 67 * hash + Objects.hashCode(this.unit);        return hash;    }    @Override    public boolean equals(Object obj) {        if (obj == null) {            return false;        }        if (getClass() != obj.getClass()) {            return false;        }        final QSET<RimDataType> other = (QSET<RimDataType>) obj;        if (!Objects.equals(this.lower, other.lower)) {            return false;        }        if (!Objects.equals(this.upper, other.upper)) {            return false;        }        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {            return false;        }        if (!Objects.equals(this.unit, other.unit)) {            return false;        }        return true;    }}