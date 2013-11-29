package healthy.rim;

import healthy.EntityArchetypeType;
import healthy.rim.type.BooleanAdapter;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import healthy.rim.type.AD;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * A subtype of Entity representing a bounded physical place or site with its
 * contained structures, if any.</p>
 *
 * <i>Examples:</i> A field, lake, city, county, state, country, lot (land),
 * building, pipeline, power line, playground, ship, truck.
 *
 * <i>Constraints:</i> Place may be natural or man-made. The geographic position
 * of a place may or may not be constant.
 *
 * <i>Discussion:</i> Places may be work facilities (where relevant acts occur),
 * homes (where people live) or offices (where people work). Places may contain
 * sub-places (floor, room, booth, bed). Places may also be sites that are
 * investigated in the context of health care, social work, public health
 * administration (e.g., buildings, picnic grounds, day care centres, prisons,
 * counties, states, and other focuses of epidemiological events).
 * <p>
 * Documentation based on HL7 document centre </p>
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 29-May-2013
 */
@XmlRootElement(name = "Place")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Place")
public class Place extends Entity implements java.io.Serializable {

    private static final long serialVersionUID = 20130121009924L;
    /**
     * <p>
     * An Indication of whether the facility has the capability to move freely
     * from one location to another.</p>
     *
     * <i>Examples:</i> Ships, aircraft and ambulances all have the capability
     * to participate in healthcare acts.
     */
    @XmlElement(name = "mobileInd",defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean mobileInd;
    /**
     * <p>
     * A free text note that carries information related to a site that is
     * useful for entities accessing that site.</p>
     *
     * <I>Discussion:</i> The attribute could include directions for finding the
     * site when address information is inadequate, GPS information is not
     * available, and/or the entity accessing the site cannot make direct use of
     * the GPS information. It could also include information useful to people
     * visiting the location. E.g., "Last house on the right", "If owner not
     * present, check whereabouts with neighbor down the road".
     */
    @XmlElement(name = "directionsText")
    private String directionsText;
    /**
     * <p>
     * A set of codes that locates the site within a mapping scheme.</p>
     *
     * <i>Examples:</i> map coordinates for US Geological Survey maps.
     */
    @XmlElement(name = "positionText")
    private String positionText;
    /**
     * <p>
     * The global positioning system coordinates of a place.</p>
     *
     * <i>Discussion:</i> The global positioning system values for this
     * attribute should conform with the USGS Spatial Data Transmission
     * Standards. Among other things this includes the nature of the latitude
     * and longitude readings, the offset error, the projection.
     *
     * <i>Rationale:</i> In some field conditions, there will be no physical
     * address to identify a place of interest. As all locations on the surface
     * of the earth have unique geographic coordinates, the GPS values allow for
     * precise location information to be captured and transmitted.
     */
    @XmlElement(name = "gpsText")
    private String gpsText;
    /**
     * see{@link healthy.rim.type.AD}
     */
    @XmlElement(name = "Address")
    private AD address;

    /**
     *
     */
    public Place() {
        super(EntityArchetypeType.PLACE);
    }

    /**
     *
     * @param mobileInd see {@link #mobileInd}
     * @param directionsText see {@link #directionsText}
     * @param positionText see {@link #positionText}
     * @param gpsText see {@link #gpsText}
     */
    public Place(Boolean mobileInd, String directionsText, String positionText, String gpsText) {
        super(EntityArchetypeType.PLACE);
        this.mobileInd = mobileInd;
        this.directionsText = directionsText;
        this.positionText = positionText;
        this.gpsText = gpsText;
    }

    /**
     *
     * @return see{@link #address}
     */
    public AD getAddress() {
        return address;
    }

    /**
     *
     * @param address see{@link #address}
     */
    public void setAddress(AD address) {
        this.address = address;
    }

    /**
     *
     * @return see{@link #mobileInd}
     */
    public Boolean getMobileInd() {
        return this.mobileInd;
    }

    /**
     *
     * @param mobileInd see {@link #mobileInd}
     */
    public void setMobileInd(Boolean mobileInd) {
        this.mobileInd = mobileInd;
    }

    /** 
     *
     * @return see {@link #directionsText}
     */
    public String getDirectionsText() {
        return this.directionsText;
    }

    /**
     *
     * @param directionsText see {@link #directionsText}
     */
    public void setDirectionsText(String directionsText) {
        this.directionsText = directionsText;
    }

    /**
     * see {@link #directionsText}
     *
     * @return String
     */
    public String getPositionText() {
        return this.positionText;
    }

    /**
     *
     * @param positionText see {@link #positionText}
     */
    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    /**
     * see {@link #positionText}
     *
     * @return String
     */
    public String getGpsText() {
        return this.gpsText;
    }

    /**
     *
     * @param gpsText see {@link #gpsText}
     */
    public void setGpsText(String gpsText) {
        this.gpsText = gpsText;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.getInternalId() ^ (this.getInternalId()
                >>> 32));
        hash = 97 * hash + Objects.hashCode(this.mobileInd);
        hash = 97 * hash + Objects.hashCode(this.directionsText);
        hash = 97 * hash + Objects.hashCode(this.gpsText);
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
        final Place other = (Place) obj;
        if (!Objects.equals(this.getInternalId(), other.getInternalId())) {
            return false;
        }
        if (!Objects.equals(this.mobileInd, other.mobileInd)) {
            return false;
        }
        if (!Objects.equals(this.directionsText, other.directionsText)) {
            return false;
        }
        if (!Objects.equals(this.positionText, other.positionText)) {
            return false;
        }
        if (!Objects.equals(this.gpsText, other.gpsText)) {
            return false;
        }
        return true;
    }
}
