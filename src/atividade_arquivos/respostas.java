package atividade_arquivos;

public class respostas {
	private  String resposta;

	public respostas(String resposta) {
		super();
		this.resposta = resposta;
	}
	public boolean acertou() {
		if(resposta.equalsIgnoreCase("Acertou\n")) {
			return false;
		}return false;
	}

	public respostas() {
		
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	
}
