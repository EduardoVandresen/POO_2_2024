package atividadeArquivoRefeito;

public class Resposta {
	private Pergunta pergunta;
	private boolean respostaFeita;
	
	public String correcao() {
		if(pergunta.isResposta() == respostaFeita) {
			return "acerto";
		}
		return "erro";
	}

	
	public Resposta() {
		this(new Pergunta(),false);	
	}


	public Pergunta getPergunta() {
		return pergunta;
	}


	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}


	public boolean isRespostaFeita() {
		return respostaFeita;
	}


	public void setRespostaFeita(boolean respostaFeita) {
		this.respostaFeita = respostaFeita;
	}


	public Resposta(Pergunta pergunta, boolean respostaFeita) {
		super();
		this.pergunta = pergunta;
		this.respostaFeita = respostaFeita;
	}
	
}
