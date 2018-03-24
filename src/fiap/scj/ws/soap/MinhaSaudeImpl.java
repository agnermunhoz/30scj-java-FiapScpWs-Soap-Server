package fiap.scj.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import fiap.scj.model.Diagnostico;
import fiap.scj.model.Paciente;

@WebService
public class MinhaSaudeImpl {

	@WebMethod
	public float calcularImc(
			@XmlElement(name = "altura") float altura, 
			@XmlElement(name = "peso") float peso) {
		return peso / (altura * altura);
	}
	
	@WebMethod
	public String imcStatus(@XmlElement(name = "icm") float icm) {
		if (icm < 17) 
			return "Muito abaixo do peso";
		if (icm < 18.49) 
			return "Abaixo do peso";
		if (icm < 24.99) 
			return "Peso normal";
		if (icm < 29.99) 
			return "Acima do peso";
		if (icm < 34.99) 
			return "Obesidade I";
		if (icm < 39.99) 
			return "Obesidade II";	
		return "Obesidade III";
	}
	
	@WebMethod
	public Diagnostico avaliar(Paciente paciente) {
		
		float imc = calcularImc(paciente.getAltura(), paciente.getPeso());
		
		String status = imcStatus(imc);
	
		Diagnostico diagnostico = new Diagnostico();
		
		diagnostico.setSituacao(status);
		diagnostico.setCuidados("Emagrecer");
		diagnostico.setRecomendacao("Pare de comer");
		diagnostico.setPesoIdeal(21.75f * paciente.getAltura() * paciente.getAltura());
		
		return  diagnostico;
	}
	
}
