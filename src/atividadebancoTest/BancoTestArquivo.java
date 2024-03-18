package atividadebancoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividadebanco.Banco;
import atividadebanco.ContaBancaria;
import atividadebanco.ContaBancariaCorrente;
import atividadebanco.ContaBancariaEspecial;
import atividadebanco.ContaBancariaPoupanca;


class BancoTestArquivo {
	 private Banco banco = new Banco();
	 @BeforeEach
	    public void criarContas(){

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
	 @Test
	    public void depositoTest(){
	        List<ContaBancaria> contas =  banco.getContas();

	        contas.get(0).Deposito(200);
	        contas.get(1).Deposito(200);
	        contas.get(2).Deposito(200);
	        assertEquals("ContaBancaria: numero Conta=10, saldo=R$300.0]", contas.get(0).toString());
	        assertEquals("ContaBancaria: numero Conta=20, saldo=R$300.0]", contas.get(1).toString());
	        assertEquals("ContaBancaria: numero Conta=30, saldo=R$300.0]", contas.get(2).toString());     
	    
	 }
}


