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
   
    

    public JogoEasy(Jogador j, Categoria c) {
        super(j, c);
        p = c.SorteiaPalavra();
        jaChutadas = new ArrayList<>();
        while(!p.getDificulty().equals("easy")){
             p = c.SorteiaPalavra();
        }
     
    }

    public Palavra getP() {
        return p;
    }

    public void setP(Palavra p) {
        this.p = p;
    }
    
    /*public boolean testaFimJogo(){
      if(this.tentativas >= numMaxErrors ){
          finalizaJogo();
          return true;
      }
      if(p.getAcertos() == p.getTamanho()){
          finalizaJogo();
          return true;
      }else{
          return false;
      }
    }*/
    
    /** 
        Adiciona chute as letras ja chutadas 
     * testa o chute para ver se o chute tem na palavra
     * soma o numero de tentatias
     * 
     */
    public void chutar(Character chute){
    
       jaChutadas.add(chute);
       tentativas++;
       //chutes.sort(p.ContemCharacter(chute));
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
    
    
    
    
    
