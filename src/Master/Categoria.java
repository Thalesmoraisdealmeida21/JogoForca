/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.util.ArrayList;
import java.util.Random;

/*CadastrarCategoria()
    
/*CadastrarJogador()*/
/*CadastrarPalavra()*/


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
    
    public Palavra SorteiaPalavra(Integer dificulCodigo){
        Random r = new Random();
        Palavra p;
        int sort, i;
        sort = r.nextInt(palavras.size());
        p = palavras.get(sort);
        return p;
    }
    
     public Palavra SorteiaPalavra(String legenda){
        Random r = new Random();
        Palavra p;
        int sort, i;
        sort = r.nextInt(palavras.size());
        p = palavras.get(sort);
        
   
               return p;
    }
    
    
    
    
    public void addPalavra(Palavra p){
        palavras.add(p);
    }
    
     public void removePalavra(Palavra p){
        palavras.remove(p);
    }
     
  
    
}
