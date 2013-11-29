/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy.rim;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 18-Jul-2013
 */
@XmlRootElement(name = "RoleClassCode")
@XmlType(name = "RoleClassCode")
@XmlEnum(String.class)
public enum RoleClassCode {

    /**
     * see {@link healthy.dmg.rim.Container}
     */
    CONTAINER,
    /**
     * see {@link healthy.dmg.rim.Device}
     */
    DEVICE,
    /**
     * see {@link healthy.dmg.rim.Organization}
     */
    ORGANIZATION,
    /**
     * Extends from PERSON this role imply actions as medical Patient
     */
    PATIENT,
    /**
     * Extends from PERSON this role imply actions as Health Care Professional
     */
    PROFESSIONAL,
    /**
     * see {@link healthy.dmg.rim.Place}
     */
    PLACE,
    /**
     * Unknown or Unlisted Role
     */
    OTHER;
}
