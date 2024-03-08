package atividadebanco;

public class ContaBancariaPoupanca extends ContaBancaria {

	private int dia = 5;
	
	public ContaBancariaPoupanca() {
		super();
	}

	public ContaBancariaPoupanca(int numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	
	@Override
	public boolean Saque(double valor) {
		int zero = 0;
		if(dia <= zero) {
			return false;
		}else {
			super.Saque(valor);
			dia--;
			return true;
		}
	}
	
	
	
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	

}
