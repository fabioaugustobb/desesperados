/*
 Classe jogador recebe os parÃ¢metros da tela de seleção.
 */
package campeonado_desesperados_poo;

/*
 * Mariana Matias 
 */
public class Jogador {

    // Declaração das variáveis
    //    private int    Idjogador;
    private String Nome;
    private int Rg;
    private String Endereco;
    private int Telefone;

    public Jogador() {
        // Inicializar as variáveis
        //        Idjogador = 0;
        Nome = "";
        Rg = 0;
        Endereco = "";
        Telefone = 0;

    }

    // Pegar os dados da tela e realizar a leitura do Nome do Jogador
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    // Pegar os dados da tela e realizar a leitura do Rg do Jogador
    public int getRg() {
        return Rg;
    }
    public void setRg(int Rg) {
        this.Rg = Rg;
    }

        // Pegar os dados da tela e realizar a leitura do Endereço do Jogador
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    // Pegar os dados da tela e realizar a leitura do Telefone do Jogador
    public int getTelefone() {
        return Telefone;
    }
    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }
}
