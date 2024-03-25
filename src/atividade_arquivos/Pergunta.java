package atividade_arquivos;

public class Pergunta {
	private String resposta;
	private String pergunta;
	
	
	
	
	
	
	
	public Pergunta(String resposta, String pergunta) {
		super();
		this.resposta = resposta;
		this.pergunta = pergunta;
	}







	@Override
	public String toString() {
		return "Pergunta " + " - " +pergunta;
	}







	public String getNr() {
		return resposta;
	}







	public void setNr(String resposta) {
		this.resposta = resposta;
	}







	public String getPergunta() {
		return pergunta;
	}







	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	
}
