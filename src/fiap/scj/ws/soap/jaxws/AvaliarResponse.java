
package fiap.scj.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "avaliarResponse", namespace = "http://soap.ws.scj.fiap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avaliarResponse", namespace = "http://soap.ws.scj.fiap/")
public class AvaliarResponse {

    @XmlElement(name = "return", namespace = "")
    private fiap.scj.model.Diagnostico _return;

    /**
     * 
     * @return
     *     returns Diagnostico
     */
    public fiap.scj.model.Diagnostico getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(fiap.scj.model.Diagnostico _return) {
        this._return = _return;
    }

}
