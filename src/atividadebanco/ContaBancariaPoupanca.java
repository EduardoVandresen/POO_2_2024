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

        if(dia <= 0) {
            return false;
        }else {
            if(saldo >= valor) {
            this.saldo -=  valor;
            dia --;
            return true;
        }return false;
    }
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





    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }




}