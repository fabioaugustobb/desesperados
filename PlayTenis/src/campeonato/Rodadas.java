/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import java.util.ArrayList;

/**
 *
 * @author a1420267
 */
public class Rodadas {

    public void Rodadas(ArrayList<Jogador> listaJogadores) {
        Jogo jogo1 = new Jogo(listaJogadores.get(0), listaJogadores.get(1));
        Jogo jogo2 = new Jogo(listaJogadores.get(2), listaJogadores.get(3));
        Jogo jogo3 = new Jogo(listaJogadores.get(4), listaJogadores.get(5));
        Jogo jogo4 = new Jogo(listaJogadores.get(6), listaJogadores.get(7));
        Jogo jogo5 = new Jogo(listaJogadores.get(8), listaJogadores.get(9));
        Jogo jogo6 = new Jogo(listaJogadores.get(10), listaJogadores.get(11));
        Jogo jogo7 = new Jogo(listaJogadores.get(12), listaJogadores.get(13));
        Jogo jogo8 = new Jogo(listaJogadores.get(14), listaJogadores.get(15));
        jogo1.decidirPartida();
        jogo2.decidirPartida();
        jogo3.decidirPartida();
        jogo4.decidirPartida();
        jogo5.decidirPartida();
        jogo6.decidirPartida();
        jogo7.decidirPartida();
        jogo8.decidirPartida();


        Jogo quartas1 = new Jogo(jogo1.obterVencedor(), jogo2.obterVencedor());
        Jogo quartas2 = new Jogo(jogo3.obterVencedor(), jogo4.obterVencedor());
        Jogo quartas3 = new Jogo(jogo5.obterVencedor(), jogo6.obterVencedor());
        Jogo quartas4 = new Jogo(jogo7.obterVencedor(), jogo8.obterVencedor());

        quartas1.decidirPartida();
        quartas2.decidirPartida();
        quartas3.decidirPartida();
        quartas4.decidirPartida();



        Jogo semi1 = new Jogo(quartas1.obterVencedor(), quartas2.obterVencedor());
        Jogo semi2 = new Jogo(quartas3.obterVencedor(), quartas4.obterVencedor());

        semi1.decidirPartida();
        semi2.decidirPartida();
    

        Jogo final1 = new Jogo(semi1.obterVencedor(), semi2.obterVencedor());

        final1.decidirPartida();
    }

}
