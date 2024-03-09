package atividadebancoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividadebanco.ContaBancariaEspecial;

class ContaBancariaEspecialTest {
    ContaBancariaEspecial c1;
    ContaBancariaEspecial c2;
    @BeforeEach
    public void inicialização() {

         c1 = new ContaBancariaEspecial(01 , 900 , 100);
         c2 = new ContaBancariaEspecial(02 , 1000 , 100);
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
    void testSaqueLimite() {
        c1.Saque(950);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$-50.0]",c1.toString() );
    }
    @Test
    void testTranferencia() {
        c1.Tranferencia(c2 , 100);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$800.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1100.0]",c2.toString() );
    }
    @Test
    void testTranferenciaLimite() {
        c1.Tranferencia(c2 , 950);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$-50.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1950.0]",c2.toString() );
    }
    @Test
    void testTranferenciaErrado() {
        c1.Tranferencia(c2 , 10000);
        assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]",c1.toString() );
        assertEquals( "ContaBancaria: numero Conta=2, saldo=R$1000.0]",c2.toString() );
    }
}