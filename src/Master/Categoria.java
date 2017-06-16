/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author thales
 */
public class Categoria {
    private String nome;
    private ArrayList<Palavra> palavras;

    
     public Categoria(String nome) {
        this.nome = nome;
        palavras = new ArrayList<Palavra>();
    }

    public Categoria(String nome, ArrayList<Palavra> palavras) {
        this.nome = nome;
        this.palavras = palavras;
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPalavras(ArrayList<Palavra> palavras) {
        this.palavras = palavras;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }
    
    public Palavra SorteiaPalavra(){
        Random r = new Random();
        int sort = r.nextInt(palavras.size());
        return (palavras.get(sort)); 
    }
    
    public void addPalavra(Palavra p){
        palavras.add(p);
    }
    
     public void removePalavra(Palavra p){
        palavras.remove(p);
    }
  
    
}
