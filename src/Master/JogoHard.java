package Master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thales
 */
public class JogoHard extends Jogo {
    final private Integer numMaxErrors = 5;
    private Palavra p;
    private ArrayList<Character> jaChutadas;
   
    

    public JogoHard(Jogador j, Categoria c) {
        super(j, c);
        p = c.SorteiaPalavra(3);
        jaChutadas = new ArrayList<>();
    }

    public Palavra getP() {
        return p;
    }

    public void setP(Palavra p) {
        this.p = p;
    }
    
   
    
    /** 
        Adiciona chute as letras ja chutadas 
     * testa o chute para ver se o chute tem na palavra
     * soma o numero de tentatias
     * 
     */
     public boolean chutar(Character chute){
       if(!jaChutadas.contains(chute))
       {      
            jaChutadas.add(chute);
            tentativas++;
            chutes.addAll(p.ContemCharacter(chute));
            if(!p.ContemCharacter(chute).isEmpty())
            {
                setAcertos(getAcertos() + 1);
                setPontosJogo(getAcertos() * 3);
            }
            return true;
       }else{
           return false;
       }
    }
    
    public String printaChute()
    {
        int i, i2=0;
        String retorno =  "";
        Character aux;
        for(i=0;i<p.getNome().length();i++)
        {
            if(chutes.contains(i))
            {
                 aux = p.getNome().charAt(i);
                 retorno = retorno + " " + aux.toString();
            }
            else
            {
                retorno = retorno + " _";
            }
        }
        return retorno;
    } 
    
    
       public String printaChute(ArrayList<Integer> chutes)
    {
        int i, i2=0;
        String retorno =  "";
        Character aux;
        for(i=0;i<p.getNome().length();i++)
        {
            if(chutes.contains(i))
            {
                 aux = p.getNome().charAt(i);
                 retorno = retorno + " " + aux.toString();
            }
            else
            {
                retorno = retorno + " _";
            }
        }
        return retorno;
    } 

     public boolean testaFimJogo(){
      if(tentativas == numMaxErrors ){
          try {
              finalizaJogo();
          } catch (IOException ex) {
              Logger.getLogger(JogoHard.class.getName()).log(Level.SEVERE, null, ex);
          }
          return true;
      }else{
          if(verificaVitoria()){
              return true;
          }
      }
      return false;
    }

     public boolean verificaVitoria(){
       if(p.getTamanho() == getAcertos()){
           setPontosJogo(getPontosJogo() + 30);
       return true;
       }else{
           return false;
       }
   }
    
      public Integer retornaErrosRestantes(){
        return numMaxErrors - tentativas;
    }

 }
    
    
    
    
    
