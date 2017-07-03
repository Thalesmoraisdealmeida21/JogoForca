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
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author thales
 */
public class Jogador {
    private String nome;
    private int pontos;
    
    public Jogador(String nome) {
        this.nome = nome;
        pontos = 0;
    }
    
      public Jogador(String nome, Integer pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public static boolean CadastraJogador(Jogador j) throws IOException{
        int i;
        FileWriter arq = new FileWriter("/home/thales/BancoForca/jogador.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println(j.getNome()+",0");
        arq.close();
        return true;
    }
    
    public static ArrayList<String> getJogadores() throws FileNotFoundException, IOException{
        FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        String linha = lerArq.readLine(); 
        ArrayList<String> retorno = new ArrayList<>();
        
        while (linha != null)
        {
            retorno.add(linha.substring(0, linha.indexOf(",")));
            linha = lerArq.readLine();
   
        }
        return retorno;
    }
    
  public static void gravaPontosBD(Jogador j) throws IOException{
 
        FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        ArrayList<String> leitura = new ArrayList<>(); 
        String linha = lerArq.readLine();
        
        while(linha != null)
        {
            leitura.add(linha);
            System.out.println(linha);
            linha = lerArq.readLine();
        }
        arq2.close();
          
        FileWriter arq = new FileWriter("/home/thales/BancoForca/jogador.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        int i=0;
        while(i < leitura.size())
        {
            System.out.println(leitura.get(i).substring(0, leitura.get(i).indexOf(",")));
            if((leitura.get(i).substring(0, leitura.get(i).indexOf(","))).equals(j.getNome())){
                gravarArq.write(leitura.get(i).substring(0, leitura.get(i).indexOf(",") +1) + j.getPontos() + "\n");
            }
            else
            {
            gravarArq.write(leitura.get(i)+"\n");
            }
            i++;
        }
       arq.close();
    }
  
    public static int retornaPontosBD(Jogador j) throws IOException{
        FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        Integer retornoPontos;
        int i=0;
        ArrayList<String> leitura = new ArrayList<>(); 
        
        String linha = lerArq.readLine();
        
        while(linha != null)
        {
            leitura.add(linha);
            linha = lerArq.readLine();
        }
        String arrayLeitura[] = new String[2];
        i=0;
        while(i<leitura.size()){
            if(leitura.get(i).contains(j.getNome())){
                arrayLeitura = leitura.get(i).split(",");
                System.out.println("Entrou no if");
            }
            i++;
        }
        
        return Integer.parseInt(arrayLeitura[1]);
        
        
        
      
    }
    

    
}
