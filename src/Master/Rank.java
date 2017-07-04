/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thales
 */
public class Rank {
    private ArrayList<Jogador> jogadores;

    public Rank(ArrayList<Jogador> j) throws IOException {
        jogadores = new ArrayList<>();
        this.jogadores = j;
        atualizaRank();
        getRank();
        
    }
     public Rank() throws IOException {
        jogadores = (Jogador.getJogadores2());
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
    
    public void atualizaRank() throws IOException{
        jogadores = (Jogador.getJogadores2());
    }
    

    public ArrayList<Jogador> getRank() throws IOException{
        atualizaRank();
        Collections.sort(jogadores);
        return jogadores;
        
    }    
}
