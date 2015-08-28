/*
 Classe jogador recebe os parÃ¢metros da tela de seleção.
 */
package campeonato;
import java.util.ArrayList;

/*
 * Mariana Matias 
 */
public class Jogador {

    // Declaração das variáveis
    private String nome;
    private int rg;
    private String endereco;
    private int telefone;
    
    private ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

    public Jogador(String nome, int rg, String endereco, int telefone) {
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
    }

    public Jogador() {

    }

    public void criaListaJogadores(Jogador novoJogador) {

       listaJogadores.add(novoJogador);
       
    }

    public ArrayList<Jogador> obterListaJogadores() {
        return listaJogadores;
    }

    public String obterNome() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
