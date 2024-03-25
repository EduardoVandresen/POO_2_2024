package atividade_arquivos;

import java.util.ArrayList;
import java.util.List;


public class arquivo {
	private List<Pergunta> perguntas;

	public void adicionarPergunta(Pergunta pergunta) {
		perguntas.add(pergunta);
	}
	
	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	
}
