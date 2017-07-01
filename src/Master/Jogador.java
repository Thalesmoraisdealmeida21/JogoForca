/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author thales
 */
public class Jogador {
    private String nome;
    private int pontos;
    
    public Jogador(String nome) {
        this.nome = nome;
        pontos = 0;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public static boolean CadastraJogador(Jogador j) throws IOException{
        
        FileReader arq2 = new FileReader("/home/thales/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        
        FileWriter arq = new FileWriter("/home/thales/jogador.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
         gravarArq.println(j.getNome());
    
         
         arq.close();
          
        
        
        return true;
    }

    
}
