package atividadebanco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<ContaBancaria> contas ;
	private ArrayList<ContaBancariaCorrente> contasCorrentes ;
	private ArrayList<ContaBancariaEspecial> contasEspeciais ;
	private ArrayList<ContaBancariaPoupanca> contasPoupanca;
	
	
	
	
	public String listaContas() {
		String retorno= "";
		for(ContaBancaria contas: contas) {
			retorno += contas +"\n";
		}
		return retorno;
		
		
		
	}
	public String listaContasCorrentes() {
		String retorno= "";
		for(ContaBancariaCorrente contas: contasCorrentes) {
			retorno += contas +"\n";
		}
		return retorno;
		
		
		
	}
	public String listaContasEspeciais() {
		String retorno= "";
		for(ContaBancariaEspecial contas: contasEspeciais) {
			retorno += contas +"\n";
		}
		return retorno;
		
		
		
	}
	public String listaContasPoupanca() {
		String retorno= "";
		for(ContaBancariaPoupanca contas: contasPoupanca) {
			retorno += contas +"\n";
		}
		return retorno;
		
		
		
	}
	
	
	
	
	
	public Banco(ArrayList<ContaBancaria> contas, ArrayList<ContaBancariaCorrente> contasCorrentes,
			ArrayList<ContaBancariaEspecial> contasEspeciais, ArrayList<ContaBancariaPoupanca> contasPoupanca) {
		super();
		this.contas = contas;
		this.contasCorrentes = contasCorrentes;
		this.contasEspeciais = contasEspeciais;
		this.contasPoupanca = contasPoupanca;
	}
	
	
	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}
	public void setContas(ArrayList<ContaBancaria> contas) {
		this.contas = contas;
	}
	public ArrayList<ContaBancariaCorrente> getContasCorrentes() {
		return contasCorrentes;
	}
	public void setContasCorrentes(ArrayList<ContaBancariaCorrente> contasCorrentes) {
		this.contasCorrentes = contasCorrentes;
	}
	public ArrayList<ContaBancariaEspecial> getContasEspeciais() {
		return contasEspeciais;
	}
	public void setContasEspeciais(ArrayList<ContaBancariaEspecial> contasEspeciais) {
		this.contasEspeciais = contasEspeciais;
	}
	public ArrayList<ContaBancariaPoupanca> getContasPoupanca() {
		return contasPoupanca;
	}
	public void setContasPoupanca(ArrayList<ContaBancariaPoupanca> contasPoupanca) {
		this.contasPoupanca = contasPoupanca;
	}
}
