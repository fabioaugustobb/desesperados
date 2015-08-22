/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

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


    public static void main(String[] args) {
        // TODO code application logic here
        
        Jogador jogador = new Jogador ();
		Jogo rodada = new Jogo ();
		jogador.criaListaJogadores(); 
		Campeonato PlayTenis = new Campeonato ("PlayTenis");
		PlayTenis.rodadas(jogador.obterListaJogadores());

    }

      	public Campeonato (String nomeTorneio) {
		this.nomeTorneio = nomeTorneio;
	}
}
