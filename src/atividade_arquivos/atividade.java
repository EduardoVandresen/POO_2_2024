package atividade_arquivos;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import java.util.Random;
public class atividade {
	int contagem=0;
	
	public static void main(String[] args) {
		String menu = "1 - Rodada de pergunta\n"
				+ "2 - Score Total \n\n"
				+ "3 - Sair";
		
		
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) pergurtas();
				if(op == 2) score();
			
		}while(op!=3);
	}
	public static void pergurtas() {
		ArrayList<Pergunta> perguntas  = new ArrayList<Pergunta>();
		try {
			FileReader fr = new FileReader("perguntas.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while((linha = br.readLine())!= null) {
				String v[] = linha.split(",");
				String resposta = (v[0]);
				String pergunta = (v[1]);
				
					perguntas.add(new Pergunta(pergunta , resposta));
			
			}
			br.close();
			fr.close(); 
			Random r = new Random();
			int n = 1;
			
			for (int i = 0; i<10 ;i++) {
				int z = contaLinha() ;
				int x =r.nextInt(50);
				 String resposta = JOptionPane.showInputDialog(n +"º "+ perguntas.get(x).toString());
				
				try {
					FileWriter fw = new FileWriter("respostas.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					if(perguntas.get(x).getNr().equalsIgnoreCase(resposta)) {
							
						bw.append("Acerto\n");
						
					}else if(perguntas.get(x).getNr()!=resposta){
						bw.append("Erro\n");
						
					}n++;
					bw.close();
					fw.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
}
	public static void score() {
		ArrayList<respostas> resposta  = new ArrayList<respostas>();
		int o=0;
		try {
			FileReader fl = new FileReader("respostas.txt");
			BufferedReader bl = new BufferedReader(fl);
			String linha = "";
			
			String mostra;
			
			while((linha = bl.readLine())!= null) {
					resposta.add(new respostas(linha));
				}
				for(respostas respostas: resposta) {
				
					if(respostas.acertou()) {
						o++;
					}
		}
			mostra = "Score: " + o +"\n";
			JOptionPane.showMessageDialog(null, mostra);
			
			bl.close();
			fl.close(); 
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int contaLinha(){
		int linhas = 0;
		try {
			FileReader fr = new FileReader("respostas.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String linha = "";
		
		while((linha = br.readLine())!= null) {
			
			linhas++;
			
		}

		br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		
	}
		return linhas;
}
	public static int cont(){
		 int contagem =1;
		return contagem*5;
	}
}


