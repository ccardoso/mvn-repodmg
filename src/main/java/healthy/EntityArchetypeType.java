/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yosvany Llerena Rodríguez <yosvanyllr@gmail.com>
 * @since 18-Jul-2013
 */
@XmlRootElement(name = "ArchetypeType")
@XmlType(name = "ArchetypeType")
@XmlEnum(String.class)
public enum EntityArchetypeType {

    /**
     *
     */
    DEVICE, CONTAINER, PERSON, ORGANIZATION, PLACE;
}
