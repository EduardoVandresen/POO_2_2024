package atividadebanco;

public class ContaBancariaCorrente extends ContaBancaria {

	public ContaBancariaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaBancariaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	 public boolean Saque(double valor) {
        if(saldo >= valor) {
            this.saldo -=  valor;
            return true;
        }return false;
    }
	@Override
	 public boolean Deposito(double valor) {
        this.saldo +=valor;
        return true;
    }
	@Override
	 public boolean Tranferencia(ContaBancaria destino, double valor ) {
	        if(Saque(valor)) {
	            if(destino.Deposito(valor)) {
	                return true;
	            }else {
	                Deposito(valor);
	                return false;
	            }
	        }return false;
	    }
	
}
