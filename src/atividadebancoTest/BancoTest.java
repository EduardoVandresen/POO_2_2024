package atividadebancoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividadebanco.ContaBancaria;
import atividadebanco.ContaBancariaCorrente;
import atividadebanco.ContaBancariaEspecial;
import atividadebanco.ContaBancariaPoupanca;
import atividadebanco.Banco;
class BancoTest {

	Banco b1;
	Banco b2;
	ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	ArrayList<ContaBancariaCorrente> contasCorrentes = new ArrayList<ContaBancariaCorrente>();
    ArrayList<ContaBancariaEspecial> contasEspeciais = new ArrayList<ContaBancariaEspecial>();
    ArrayList<ContaBancariaPoupanca> contasPoupanca = new ArrayList<ContaBancariaPoupanca>();
    
	@BeforeEach
    public void inicialização() {

        contas.add(new ContaBancaria (01 , 900));
        contas.add(new ContaBancaria (02 , 900));
        contasCorrentes.add(new ContaBancariaCorrente(01 , 1000));
        contasCorrentes.add(new ContaBancariaCorrente(02 , 1000));
        contasEspeciais.add(new ContaBancariaEspecial(01 , 1000 , 50));
        contasEspeciais.add(new ContaBancariaEspecial(02 , 1000 , 50));
        contasPoupanca.add(new ContaBancariaPoupanca(01 , 800));
        contasPoupanca.add(new ContaBancariaPoupanca(02 , 900));
        b1 = new Banco(contas, contasCorrentes,contasEspeciais,contasPoupanca);
       
	}
        @Test
        void testListaContabancaria() {
            assertEquals( "ContaBancaria: numero Conta=1, saldo=R$900.0]\n" + "ContaBancaria: numero Conta=2, saldo=R$900.0]\n",b1.listaContasBancaria());
        }
        @Test
        void testListaContabancariaCorrente() {
            assertEquals( "ContaBancaria: numero Conta=1, saldo=R$1000.0]\n" + "ContaBancaria: numero Conta=2, saldo=R$1000.0]\n",b1.listaContasCorrentes());
        }
        @Test
        void testListaContabancariaEspeciais() {
            assertEquals( "ContaBancaria: numero Conta=1, saldo=R$1000.0]\n" + "ContaBancaria: numero Conta=2, saldo=R$1000.0]\n",b1.listaContasEspeciais());
        }
        @Test
        void testListaContabancariaPoupanca() {
            assertEquals( "ContaBancaria: numero Conta=1, saldo=R$800.0]\n" + "ContaBancaria: numero Conta=2, saldo=R$900.0]\n",b1.listaContasPoupanca());
        }
}
