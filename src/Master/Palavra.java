
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
    private String dica;

    public Palavra(String nome) {
        this.nome = nome;
    }
    
    public Palavra(String nome, String dica) {
        this.nome = nome;
        this.dica = dica;
    }
    
    public void setDica(String dica) {
        this.dica = dica;
    }

    public String getDica() {
        return dica;
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
    
    /**
     * Retorna um arrayList com as posições que contem determinado caracter c verificando se contem entre as jaChutadas
     * @param c
     * @param jaChutadas
     * @return 
     */
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
 /**
  * Retorna um arrayList com as posições que contem determinado caracter c
  * @param c
  * @return 
  */
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
    
 
    
 
        
    
    

