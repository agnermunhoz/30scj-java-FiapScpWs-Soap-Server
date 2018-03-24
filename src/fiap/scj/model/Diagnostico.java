package fiap.scj.model;


public class Diagnostico {

	private String situacao;
	private String cuidados;
	private String recomendacao;
	private float pesoIdeal;
	
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}
	public String getRecomendacao() {
		return recomendacao;
	}
	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}
	public float getPesoIdeal() {
		return pesoIdeal;
	}
	public void setPesoIdeal(float pesoIdeal) {
		this.pesoIdeal = pesoIdeal;
	}
	@Override
	public String toString() {
		return "Diagnostico [situacao=" + situacao + ", cuidados=" + cuidados + ", recomendacao=" + recomendacao
				+ ", pesoIdeal=" + pesoIdeal + "]";
	}
	
}
