
package Master;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    
    public static boolean cadastraPalavra(Palavra p, Categoria c) throws IOException
    {
        try{
        FileWriter arq = new FileWriter("/home/thales/BancoForca/palavra.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
        c.addPalavra(p);
        gravarArq.println(p.getNome()+","+p.getDica()+","+c.getNome());
        arq.close();
        return true;
        }catch(Exception e){
            return false;
        }   
    }
    
    public static Palavra getPalavraBD(String nome) throws FileNotFoundException, IOException{
        FileReader arq = new FileReader("/home/thales/BancoForca/palavra.txt");
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine();
        String readLineVet[] = new String[5];
        Palavra retorno = null;
        
        while(linha != null){
            readLineVet = linha.split(",");
            if(readLineVet[0].equals(nome)){
                retorno = new Palavra(readLineVet[0], readLineVet[1]);
            }
            linha = lerArq.readLine();
        }
        return retorno;
    }
  
}
    
 
    
 
        
    
    

