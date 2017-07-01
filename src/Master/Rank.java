/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.util.ArrayList;

/**
 *
 * @author thales
 */
public class Rank {
    private ArrayList<Jogador> jogadores;

    public Rank(ArrayList<Jogador> jogadores) {
        jogadores = new ArrayList<Jogador>();
        this.jogadores = jogadores;
    }
    
    public Rank() {
        jogadores = new ArrayList<Jogador>();
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    
    public Integer getPosicao(Jogador j)
    {
        int i, aux;
       return 1;
     
    }
    
    /* Metodos a construir*/
    //public ArrayList<Jogador> getRank();
    public Integer getPontuacao(Integer posicao){return 0;}
    public Integer getJogador(Integer posicao){return 0;}
    
    
      
    
    
    
    
    
}
