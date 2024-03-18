package atividadebanco;

public class ContaBancaria {
    protected int numeroConta;
    protected double saldo;





    public ContaBancaria(int numeroConta, double saldo) {

        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public ContaBancaria() {
    	this.numeroConta = 0;
        this.saldo= 0.0;
    }
    public boolean Saque(double valor) {
        if(saldo >= valor) {
            this.saldo -=  valor;
            return true;
        }return false;
    }
    public boolean Deposito(double valor) {
        this.saldo +=valor;
        return true;
    }
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

   

    @Override
    public String toString() {
        return "ContaBancaria: numero Conta=" + numeroConta + ", saldo=R$" + saldo + "]";
    }


    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}