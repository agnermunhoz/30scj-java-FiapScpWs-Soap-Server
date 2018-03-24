
package fiap.scj.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "avaliar", namespace = "http://soap.ws.scj.fiap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avaliar", namespace = "http://soap.ws.scj.fiap/")
public class Avaliar {

    @XmlElement(name = "arg0", namespace = "")
    private fiap.scj.model.Paciente arg0;

    /**
     * 
     * @return
     *     returns Paciente
     */
    public fiap.scj.model.Paciente getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(fiap.scj.model.Paciente arg0) {
        this.arg0 = arg0;
    }

}
