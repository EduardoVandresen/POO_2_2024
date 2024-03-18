package atividadebancoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividadebanco.ContaBancaria;
import atividadebanco.ContaBancariaCorrente;
import atividadebanco.ContaBancariaEspecial;
import atividadebanco.ContaBancariaPoupanca;
import atividadebanco.Banco;
public class BancoTest {

    private Banco banco = new Banco();
    	
    @BeforeEach
    public void criarContas(){
        banco.adicionarConta(new ContaBancariaCorrente(10, 100));
        banco.adicionarConta(new ContaBancariaPoupanca(20, 100));
        banco.adicionarConta(new ContaBancariaEspecial(30, 100, 500));
    }

    @Test
    public void depositoTest(){
        List<ContaBancaria> contas =  banco.getContas();

        contas.get(0).Deposito(200);
        contas.get(1).Deposito(200);
        contas.get(2).Deposito(200);
        assertEquals("ContaBancaria: numero Conta=10, saldo=R$300.0]", contas.get(0).toString());
        assertEquals("ContaBancaria: numero Conta=20, saldo=R$300.0]", contas.get(1).toString());
        assertEquals("ContaBancaria: numero Conta=30, saldo=R$300.0]", contas.get(2).toString());     
    }

    @Test
    public void saqueContaCorrenteOk(){
        List<ContaBancaria> contas = banco.getContas();

        assertTrue(contas.get(0).Saque(50));
        assertEquals("ContaBancaria: numero Conta=10, saldo=R$50.0]", contas.get(0).toString());
    }

    @Test
    public void saquecContaCorrenteFail(){
        List<ContaBancaria> contas = banco.getContas();

        assertFalse(contas.get(0).Saque(150));
        assertEquals("ContaBancaria: numero Conta=10, saldo=R$100.0]", contas.get(0).toString());
    }

    @Test
    public void saqueContaPoupancaOkTest(){
    List<ContaBancaria> contas = banco.getContas();

    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertEquals("ContaBancaria: numero Conta=20, saldo=R$75.0]", contas.get(1).toString());
    }

    @Test
    public void saqueContaPoupancaFailTest(){
    List<ContaBancaria> contas = banco.getContas();

    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertTrue(contas.get(1).Saque(5));
    assertFalse(contas.get(1).Saque(5));
    assertEquals("ContaBancaria: numero Conta=20, saldo=R$75.0]", contas.get(1).toString());
    }

    @Test
    public void saqueContaPoupancaFail2Test(){
    List<ContaBancaria> contas = banco.getContas();

    assertFalse(contas.get(1).Saque(500));
    assertEquals("ContaBancaria: numero Conta=20, saldo=R$100.0]", contas.get(1).toString());
    }

    @Test
    public void saqueContaEspecialOk(){
        List<ContaBancaria> contas =  banco.getContas();

        assertTrue(contas.get(2).Saque(600));
        assertEquals("ContaBancaria: numero Conta=30, saldo=R$-500.0]", contas.get(2).toString());
    }

    @Test
    public void saqueContaEspecialFail(){
        List<ContaBancaria> contas=  banco.getContas();

        assertFalse(contas.get(2).Saque(700));
        assertEquals("ContaBancaria: numero Conta=30, saldo=R$100.0]", contas.get(2).toString());
    }

    @Test
    public void transferenciaTestOk(){
        List <ContaBancaria> contas = banco.getContas();

        assertTrue(contas.get(0).Tranferencia(contas.get(1), 50));
        assertEquals("ContaBancaria: numero Conta=10, saldo=R$50.0]", contas.get(0).toString());
        assertEquals("ContaBancaria: numero Conta=20, saldo=R$150.0]", contas.get(1).toString());
    }

    @Test
    public void transferenciaTestFail(){
        List <ContaBancaria> contas = banco.getContas();

        assertFalse(contas.get(0).Tranferencia(contas.get(1), 150));
        assertEquals("ContaBancaria: numero Conta=10, saldo=R$100.0]", contas.get(0).toString());
        assertEquals("ContaBancaria: numero Conta=20, saldo=R$100.0]", contas.get(1).toString());
    }

    @Test
    public void transferenciaDestinoTestFail(){
        List <ContaBancaria> contas = banco.getContas();

        assertFalse(contas.get(0).Tranferencia(null, 150));
        assertEquals("ContaBancaria: numero Conta=10, saldo=R$100.0]", contas.get(0).toString());
    }

}