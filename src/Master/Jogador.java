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
public class Jogador implements Comparable<Jogador> {
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
    
    /**
     * Grava o nome de um jogador no txt
     * @param j
     * @return
     * @throws IOException 
     */
    public static boolean CadastraJogador(Jogador j) throws IOException{
        int i;
        FileWriter arq = new FileWriter("/home/thales/BancoForca/jogador.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println(j.getNome()+",0");
        arq.close();
        return true;
    }
    /**
     * Grava o jogador no txt
     * @return
     * @throws IOException 
     */
    public boolean CadastraJogador() throws IOException{
        try{
        int i;
        FileWriter arq = new FileWriter("/home/thales/BancoForca/jogador.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println(getNome()+",0");
        arq.close();
        return true;
        }catch(Exception e){
            return false;
        }
    }
    
    /**
     * Retorna um ArrayList de String com o nome dos jogadores cdastrados n txt
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
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
    
    /**
     * Retorna um arrayList do tipo Jogador com todos os jogadores gravados no txt
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static ArrayList<Jogador> getJogadores2() throws FileNotFoundException, IOException{
        FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        String linha = lerArq.readLine(); 
        ArrayList<Jogador> retorno = new ArrayList<>();
        int i=0, pontos;
        while (linha != null)
        {
            retorno.add(new Jogador(linha.substring(0, linha.indexOf(","))));
            pontos = Jogador.retornaPontosBD(retorno.get(i));
            retorno.get(i).setPontos(pontos);
            linha = lerArq.readLine();
            i++;
   
        }
        return retorno;
    }
    
    
    public static Jogador getJogadorBD(String nome) throws IOException{
        FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        String linha = lerArq.readLine(); 
        String linha2[] = new String[2];
        Jogador j = null;
         while (linha != null)
        {
            linha2 = linha.split(",");
            if(linha2[0].equals(nome)){
                j = new Jogador(linha2[0], Integer.parseInt(linha2[1]));
            }
            linha = lerArq.readLine();
        }
         return j;
    }
    
    /**
     * grava os pontos do jogaor em um txt passando por parametro o jogador do qual deseja gravar
     * @param j
     * @throws IOException 
     */
  public static void gravaPontosBD(Jogador j) throws IOException{
 
        FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);
        ArrayList<String> leitura = new ArrayList<>(); 
        String linha = lerArq.readLine();
        
        while(linha != null)
        {
            leitura.add(linha);
    
            linha = lerArq.readLine();
        }
        arq2.close();
          
        FileWriter arq = new FileWriter("/home/thales/BancoForca/jogador.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        int i=0;
        while(i < leitura.size())
        {
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
  
    /**
     * Consulta os dados de um determinao jogador no banco de dados em txt passando como passando como parametro o propio jogador
     * 
     * @param j
     * @return
     * @throws IOException 
     */
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
            }
            i++;
        } 
        return Integer.parseInt(arrayLeitura[1]);
    }
    

    /**
     * Compara o jogador com um outro jogador
     * @param j2
     * @return 
     */
    @Override
    public int compareTo(Jogador j2) {
         if (this.pontos > j2.getPontos()) {
          return -1;
     }
     if (this.pontos < j2.getPontos()) {
          return 1;
     }
     return 0;
    }
}
