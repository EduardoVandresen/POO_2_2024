package leitura_escrita;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument.BranchElement;

public class LeituraEscrita {
	public static void main(String[] args) {
		String menu = "1 - escrever \n"
				+ "2 - Ler \n\n"
				+ "3 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) escreve();
				if(op == 2) leitura();
			
		}while(op!=3);
		}
	
	private static void escreve() {
		try {
			FileWriter fw = new FileWriter("solteio.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i<10; i++) {
				Random r = new Random();
				bw.append(r.nextInt(1000) + "\n");
			}
			bw.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
			}
	private static void leitura() {
		try {
			FileReader fr = new FileReader("solteio.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while((linha = br.readLine()) != null){
				System.out.print(linha + ",\n");
			}
			br.close();
			
		}catch (Exception e) {
			e.printStackTrace();
	}
}
}
