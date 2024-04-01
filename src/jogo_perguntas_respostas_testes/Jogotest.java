package jogo_perguntas_respostas_testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import jogo_perguntas_respostas.Arquivo;
import jogo_perguntas_respostas.Pergunta;
import jogo_perguntas_respostas.Resposta;

class Jogotest {

	private Arquivo jogo = new Arquivo();
	private Arquivo jogo2 =new Arquivo();
	@Test
	void carregaArquivoTest() {
		jogo.lerArquivo();
		assertEquals(50, jogo.getPerguntas().size());
		Pergunta quarta = jogo.getPerguntas().get(3);
		assertEquals("A água ferve a 100 graus Celsius.", quarta.getTitulo());
		assertEquals(true, quarta.isRespostaCorreta());
	}
	
	@Test
	void fazCorrecaoTest() {
		Pergunta pergunta = new Pergunta("ABCD é EFGH,Falso");
		Resposta r = new Resposta(pergunta, true);
		assertEquals("erro", r.correcao());
	}
	@Test
	void fazCorrecaoFalseTest() {
		Pergunta pergunta = new Pergunta("ABCD é EFGH,Falso");
		Resposta r = new Resposta(pergunta, false);
		assertEquals("acerto", r.correcao());
	}
	@Test
	void calculaPontuacaoTest() {
		assertEquals(2, jogo.calculaPontuacao(respostasControladas()));
		}
	@Test
	void gravaResultadoTest() {
		jogo.gravaResultado(respostasControladas());
		assertEquals(jogo.lerRespostas(),"1,A,acerto\n"
				+ "2,b,acerto\n"
				+ "3,c,erro\n"
				+ "4,d,erro\n"
				+ "");
	}
	@Test
	void sorteiaRodadaTest() {
		jogo.lerArquivo();
		jogo2.lerArquivo();
		jogo2.sorteiaRodada(50);
		for(int i =1; i<50;i++) {
			assertNotEquals(jogo2.getPerguntas().get(i).getTitulo(),jogo.getPerguntas().get(i).getTitulo());
		}
		//assertNotEquals(jogo.getPerguntas().get(1).getTitulo(),jogo2.getPerguntas().get(1).getTitulo());
	}
	
	private ArrayList<Resposta> respostasControladas(){
		ArrayList<Resposta> respostas = new ArrayList<Resposta>();
		Pergunta pa = new Pergunta("A", false);
		Pergunta pb = new Pergunta("b", false);
		Pergunta pc = new Pergunta("c", true);
		Pergunta pd = new Pergunta("d", true);
		respostas.add(new Resposta(pa, false));
		respostas.add(new Resposta(pb, false));
		respostas.add(new Resposta(pc, false));
		respostas.add(new Resposta(pd, false));
		return respostas;
		
	}
	private ArrayList<Pergunta> perguntasControladas(){
		ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
		perguntas.add(new Pergunta("a", false));
		perguntas.add(new Pergunta("b", false));
		perguntas.add(new Pergunta("c", false));
		perguntas.add(new Pergunta("d", true));
		return perguntas;
	}
}
