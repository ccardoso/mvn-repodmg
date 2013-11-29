/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package healthy.rim.type;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author llerena
 */
@XmlRootElement(name = "RimDataType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RimDataType")
@XmlSeeAlso({AD.class, CD.class, EN.class, II.class, IVL.class, PQ.class, TEL.class, QSET.class, TS.class})
public class RimDataType implements Serializable {

    private static final long serialVersionUID = 20130121009924L;
    @XmlElement(name ="encoded" , defaultValue = "false")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    private Boolean encoded;

    public RimDataType() {
    }

    public Boolean isEncoded() {
        return encoded;
    }

    public void setEncoded(Boolean encoded) {
        this.encoded = encoded;
    }
}
