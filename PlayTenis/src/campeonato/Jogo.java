package campeonato;


public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador vencedor;
    private Jogador perdedor;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public Jogo() {

    }

    public void decidirPartida() {
        int escolheVencedorDaPartida = 1 + (int) (Math.random() * 2);
        if (escolheVencedorDaPartida == 1) {
            this.vencedor = this.jogador1;
            this.perdedor = this.jogador2;

        } else {
            this.vencedor = this.jogador2;
            this.perdedor = this.jogador1;
        }
    }

    public Jogador obterVencedor() {
        return this.vencedor;
    }

}
