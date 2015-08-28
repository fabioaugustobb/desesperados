/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import campeonato.Jogo;
import campeonato.Jogador;
import java.util.ArrayList;

/**
 *
 * @author a1420127
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    private String nomeTorneio;
    private TelaInicial ti;

    public static void main(String[] args) {
        // TODO code application logic here

        Jogador jogador = new Jogador();
        Jogo rodada = new Jogo();
        jogador.criaListaJogadores(jogador);
        Campeonato playTenis = new Campeonato("PlayTenis");
        Rodadas inicial = new Rodadas();
        inicial.Rodadas(jogador.obterListaJogadores());

    }

    public Campeonato() {
        ti = new TelaInicial(this);
        ti.setLocationRelativeTo(null);
        ti.setVisible(true);
    }

    public Campeonato(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
    }

}
