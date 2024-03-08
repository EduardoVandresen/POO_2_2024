package revisao_2024.testes;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import revisao_2024.Jogador;


public class JogadorTeste {
    
    Jogador j1;
    Jogador j2;

    @Before
    public void inicializaJogadores(){
        j1 = new Jogador();
        j2 = new Jogador("A",5,3);
    }

    @Test
    public void construtorVazioTest(){
        assertEquals(999,j1.getCamisa());
        assertEquals(-1,j1.getGols());
        assertEquals("",j1.getNome());
        assertEquals("Jogador [nome=, camisa=999, gols=-1]", j1.toString());
        }

        @Test
        public void construtorParametros(){
            assertEquals(5,j2.getCamisa());
            assertEquals(3,j2.getGols());
            assertEquals("A",j2.getNome());
            assertEquals("Jogador [nome=A, camisa=5, gols=3]", j2.toString());
            }


    @Test
    public void testGetCamisa() {

    }

    @Test
    public void testGetGols() {

    }

    @Test
    public void testGetNome() {

    }

    @Test
    public void testSetCamisa() {

    }

    @Test
    public void testSetGols() {

    }

    @Test
    public void testSetNome() {

    }

    @Test
    public void testToString() {

    }
}
