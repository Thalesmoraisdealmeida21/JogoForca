
package Master;

import java.util.ArrayList;

/**
 *
 * @author thales
 */
public class Palavra 
{
    
     private String nome;
     private int acertos;
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
    
    public int chutar(Character c){
        int i = acertos + 1;
        while(i < nome.length()){
            if(nome.charAt(i) == c){
                acertos = i;
                return i;
            }
            i++;
        }
        return -1;
    }
       
   
     }
    
 
    
 
        
    
    

