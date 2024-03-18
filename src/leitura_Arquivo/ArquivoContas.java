package leitura_Arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import atividadebanco.ContaBancaria;
import atividadebanco.ContaBancariaCorrente;
import atividadebanco.ContaBancariaEspecial;
import atividadebanco.ContaBancariaPoupanca;

public class ArquivoContas {
	
	public static void main(String[] args) {
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
			try {
				FileReader fr = new FileReader("Contas.txt");
				BufferedReader br = new BufferedReader(fr);
				String linha = "";
				while((linha = br.readLine())!= null) {
					String v[] = linha.split(",");
					int nr = Integer.parseInt(v[1]);
					double saldo = Double.parseDouble(v[2]);
					if(v[0].equals("0")) {
						contas.add(new ContaBancariaCorrente(nr , saldo));
					}
					if(v[0].equals("1")) {
						contas.add(new ContaBancariaPoupanca(nr , saldo));
					}
					if(v[0].equals("2")) {
						Double limite = Double.parseDouble(v[3]);
						contas.add(new ContaBancariaEspecial(nr , saldo , limite));
					}
				}
				
				br.close();
				fr.close();
				for (ContaBancaria c : contas) {
					System.out.println(c);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
