package atividadebanco;

public class ContaBancariaEspecial extends ContaBancaria {

    private double limite;



    public ContaBancariaEspecial(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public boolean Saque(double valor) {
        limite = limite + saldo;
        if(saldo>= valor) {
            this.saldo -=  valor;

            return true;
        } 
        if(limite >= valor) {
            this.saldo -=  valor;

            limite = limite - valor;
            return true;
        }return false;
    }
    @Override
    public boolean Tranferencia(ContaBancaria destino, double valor ) {
        if(Saque(valor)) {
        	if(destino.equals(null) ) {
        		return false;
        	}
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
        return super.toString();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}