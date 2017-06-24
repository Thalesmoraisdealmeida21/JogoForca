
package Master;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author thales
 */
public class Palavra 
{
    
     private String nome;
     private int acertos =0;
     private String dificulty; 

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }
     
     

    public Palavra(String nome) {
    
        this.nome = nome;
  
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public int getTamanho(){
        return nome.length();
    }
    
    public ArrayList<Integer> ContemCharacter(Character c, ArrayList<Character> jaChutadas){
        ArrayList<Integer> retorno = new ArrayList<>();
        int i;
        for(i=0; i < nome.length(); i++){  
            if(nome.charAt(i) == c){
                if(!jaChutadas.contains(c)){
                    retorno.add(i);
                }  
            }
        }
        return retorno;
    }
    
     /* public boolean ContemCharacter(Character c){
        return nome.contains(c.toString());
    }*/
      
    public ArrayList<Integer> ContemCharacter(Character c){
        ArrayList<Integer> retorno = new ArrayList<>();
        int i;
        for(i=0; i < nome.length(); i++){  
            if(nome.charAt(i) == c){
                    retorno.add(i);
                  
            }
        }
        return retorno;
    }
}
    
 
    
 
        
    
    

