/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonado_desesperados_poo;

import java.awt.List;
import java.util.ArrayList;

/**
 * Mariana Matias
 */
public class SalvarJogador {

    // Atributo de classe
    ArrayList jogadores;

    public SalvarJogador() {
        jogadores = new ArrayList();
    }

    public void setSalvarJogador(ArrayList jogador) {
        this.jogadores = jogadores;
    }

    public ArrayList getSalvarJogador() {
        return jogadores;
    }

    /*  DELEGAR OS QUE O JOGADOR PODERÁ FAZER    
     */
    
    // Adicionar o jogador na partida
    public void add(Jogador j) {
        jogadores.add(j);
    }

    // Remover o jogador da partida
    public void remove(Jogador j) {
        jogadores.add(j);
    }

}
