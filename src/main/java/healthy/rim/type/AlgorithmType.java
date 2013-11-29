/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy.rim.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author llerena
 */
@XmlRootElement(name = "AlgorithmType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmType")
@XmlEnum(String.class)
public enum AlgorithmType {

    SHA1,
    SHA256,
    SHA384,
    SHA512,
    MD5;
}
