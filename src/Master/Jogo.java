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
public abstract class Jogo {
    private Jogador j;
    private Categoria c;
    protected Integer tentativas = 0;
    protected Integer pontosJogo;
    protected ArrayList<Integer> chutes;
    protected Integer acertos;

    public void setC(Categoria c) {
        this.c = c;
    }

    public void setPontosJogo(Integer pontosJogo) {
        this.pontosJogo = pontosJogo;
    }

    public void setAcertos(Integer acertos) {
        this.acertos = acertos;
    }
    
    

    public Categoria getC() {
        return c;
    }

    public Integer getPontosJogo() {
        return pontosJogo;
    }

    public Integer getAcertos() {
        return acertos;
    }
    
    

    public void setChutes(ArrayList<Integer> chutes) {
        this.chutes = chutes;
    }

    public ArrayList<Integer> getChutes() {
        return chutes;
    }

    public Integer getTentativas() {
        return tentativas;
    }

    public void setTentativas(Integer tentativas) {
        this.tentativas = tentativas;
    }

    public Jogo(Jogador j, Categoria c) {
        this.j = j;
        this.c = c;
        chutes = new ArrayList<>();
    }

    public Jogador getJ() {
        return j;
    }
    
    public void setJ(Jogador j) {
        this.j = j;
    }
    
    public void finalizaJogo(){
        j.setPontos(pontosJogo);
    }
    
    /**
     
     * retorna uma string apenas mostrando as letras ja chutadas
     */
    public String printaChute(String palavra)
    {
        int i, i2=0;
        String retorno =  "";
        Character aux;
        for(i=0;i<palavra.length();i++)
        {
            if(chutes.contains(i))
            {
                 aux = palavra.charAt(i);
                 retorno = retorno + " " + aux.toString();
            }
            else
            {
                retorno = retorno + " _";
            }
        }
        return retorno;
    } 
    
    
    public abstract boolean testaFimJogo();
    public abstract void chutar(Character chute);
    public abstract boolean verificaVitoria();
    
    


   
    
    
    
    
    
}
