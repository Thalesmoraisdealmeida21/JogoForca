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

    @Override
    public boolean testaFimJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaVitoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }
    
    
    
    
    
