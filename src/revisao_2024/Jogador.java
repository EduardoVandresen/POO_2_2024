package revisao_2024;


public class Jogador {
    private String nome;
    private int camisa;
    private int gols;


    public Jogador(String nome, int camisa, int gols) {
        this.nome = nome;
        this.camisa = camisa;
        this.gols = gols;
    }

    public Jogador(){
        setNome("");
        setCamisa(999);
        setGols(-1);      
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCamisa() {
        return this.camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getGols() {
        return this.gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", camisa=" + camisa + ", gols=" + gols + "]";
    }
    
}
