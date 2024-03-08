package atividadebanco;

public class ContaBancariaEspecial extends ContaBancaria {
	
	private double limite;
	

	
	public ContaBancariaEspecial(int numeroConta, double saldo, double limite) {
		super(numeroConta, saldo);
		this.limite = limite;
	}

	@Override
	public boolean Saque(double valor) {
		
		if(saldo>= valor) {
			super.Saque(valor);
			return true;
		} limite = limite + saldo;
		if(limite >= valor) {
			super.Saque(valor);
			limite = limite - valor;
			return true;
		}return false;
	}

	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	

}
