package Master;

import java.util.ArrayList;
import java.util.Iterator;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thales
 */
public class JogoEasy extends Jogo {
    final private Integer numMaxErrors = 20;
    private Palavra p;
    private ArrayList<Character> jaChutadas;
   
    
    /**
     * Dificuldade Niveis
     * ---Legenda----
     * 1 - Easy
     * 2 - Medium
     * 3 - Hard
     * @param j
     * @param c 
     */
    public JogoEasy(Jogador j, Categoria c) {
        super(j, c);
        p = c.SorteiaPalavra(1); //sorteia palavra easy
        jaChutadas = new ArrayList<>();
              
    }


    public Palavra getP() {
        return p;
    }

    public void setP(Palavra p) {
        this.p = p;
    }

   public boolean testaFimJogo(){
      if(tentativas == numMaxErrors ){
          finalizaJogo();
          return true;
      }else{
          if(verificaVitoria()){
              return true;
          }
      }
      return false;
    }
    
   public boolean verificaVitoria(){
       if(printaChute().contains("_")){
            return false;
       }else{
           return true;
       }
   }
    
    /** 
        Adiciona chute as letras ja chutadas 
     * testa o chute para ver se o chute tem na palavra
     * soma o numero de tentatias
     * 
     */
    public void chutar(Character chute){
       jaChutadas.add(chute);
       tentativas++;
       chutes.addAll(p.ContemCharacter(chute));
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

 }
    
    
    
    
    
