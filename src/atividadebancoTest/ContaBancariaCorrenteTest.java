package atividadebancoTest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividadebanco.ContaBancaria;
import atividadebanco.ContaBancariaCorrente;



class ContaBancariaCorrenteTest {
    ContaBancaria c1;
    ContaBancaria c2;
    

    @BeforeEach
    public void inicialização() {

         c1 = new ContaBancariaCorrente(01 , 900);
         c2 = new ContaBancariaCorrente(02 , 1000);

    }
    @Test
    void testToString() {
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]",c1.toString() );
    }
    @Test
    void testSaque() {
        c1.Saque(800);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$100.0]",c1.toString() );
    }
    @Test
    void testSaqueErrado() {
        c1.Saque(901);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]",c1.toString() );
    }
    @Test
    void testDeposito() {
        c1.Deposito(100);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$1000.0]",c1.toString() );
    }
    @Test
    void testTranferencia() {
        c1.Tranferencia(c2 , 100);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$800.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1100.0]",c2.toString() );
    }
    void testTranferenciaErrado() {
        c1.Tranferencia(c2 , 10000);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1000.0]",c2.toString() );
    }
}