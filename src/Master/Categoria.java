/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
     
     public static boolean CadastrarCategoria(Categoria categ) throws IOException{
         FileWriter arq = new FileWriter("/home/thales/BancoForca/palavra.txt", true);
         PrintWriter gravarArq = new PrintWriter(arq);
         gravarArq.println(",,"+categ.getNome());
         arq.close();
        return true;
     }
     
     public void AtualizaCateg(ArrayList<Palavra> p){
         palavras.addAll(p);
     }
     
     public static void getPalavrasCateg(Categoria c) throws FileNotFoundException, IOException{
          FileReader arq2 = new FileReader("/home/thales/BancoForca/palavra.txt");
          BufferedReader lerArq = new BufferedReader(arq2);
          ArrayList<Palavra> palavrass = new ArrayList<>();
          String readLine = lerArq.readLine();
          String readLineVet[] = new String[5];
          
          while(readLine != null){
              readLineVet = readLine.split(",");
              if(readLineVet[2].equals(c.getNome())){
                  if(!readLineVet[0].isEmpty()){
                     palavrass.add(Palavra.getPalavraBD(readLineVet[0]));
                  }
              }
              c.setPalavras(palavrass);
              readLine = lerArq.readLine();
          }
     }
     
     
     
     
     
     
     
     public static ArrayList<String> getCategoriasBD() throws FileNotFoundException, IOException{
          FileReader arq2 = new FileReader("/home/thales/BancoForca/palavra.txt");
          BufferedReader lerArq = new BufferedReader(arq2);
          ArrayList<String> retorno = new ArrayList<>();
          String readLine = lerArq.readLine();
          String readLineVet[] = new String[5];
          while(readLine != null){
              readLineVet = readLine.split(",");
              if(!retorno.contains(readLineVet[2])){
              retorno.add(readLineVet[2]);
              }
              readLine = lerArq.readLine();
          }
         
         return retorno;
     }
     
     public static Categoria getCategoriasBD(String nome) throws FileNotFoundException, IOException{
          FileReader arq2 = new FileReader("/home/thales/BancoForca/palavra.txt");
          BufferedReader lerArq = new BufferedReader(arq2);
          Categoria c=null;
          String readLine = lerArq.readLine();
          String readLineVet[] = new String[5];
          while(readLine != null){
              readLineVet = readLine.split(",");
              if(nome.equals(readLineVet[2])){
               c = new Categoria(nome);
               getPalavrasCateg(c);
              }
              readLine = lerArq.readLine();
          }
         
         return c;
     }
     
    /* public static ArrayList<String> getCategoriasBD(Categoria c){
         
         
         
     }*/
         
     
  
    
}
