package atividadebancoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividadebanco.ContaBancariaPoupanca;

class ContaBancariaPoupancaTest {

    ContaBancariaPoupanca c1;
    ContaBancariaPoupanca c2;
    ContaBancariaPoupanca c3;

    @BeforeEach
    public void inicialização() {

         c1 = new ContaBancariaPoupanca(01 , 900);
         c2 = new ContaBancariaPoupanca(02 , 1000);

    }

    @Test
    void testToString() {
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]",c1.toString() );
    }
    @Test
    void testSaque() {
        c1.Saque(900);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$0.0]",c1.toString() );
    }
    @Test
    void testTranferencia() {
        c1.Tranferencia(c2 , 100);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$800.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1100.0]",c2.toString() );
    }
    @Test
    void testTranferenciaErrado() {
        c1.Tranferencia(c2 , 10000);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1000.0]",c2.toString() );
    }
    @Test
    void testSaqueDias() {
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$899.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$898.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$897.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$896.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$895.0]",c1.toString() );

    }
    @Test
    void testSaqueDiasErrado() {
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$899.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$898.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$897.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$896.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$895.0]",c1.toString() );
        c1.Saque(1);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$895.0]",c1.toString() );

    }
}