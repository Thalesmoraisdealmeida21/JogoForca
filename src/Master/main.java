/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import Master.InterfaceGrafica.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thales
 */
public class main {
    public static void main(String args[]) throws IOException{
        
        Configurações frame = new Configurações();
        frame.setVisible(true);
        
        //Jogador j = new Jogador("Miriam");
       // j.setPontos(Jogador.retornaPontosBD(j));
        
           // System.out.println(Jogador.retornaPontosBD(j));
            
           // int teste = Integer.parseInt(Jogador.retornaPontosBD(j));
            
           // System.out.println(teste);
        
        /*FileReader arq2 = new FileReader("/home/thales/BancoForca/jogador.txt");
        BufferedReader lerArq = new BufferedReader(arq2);

        
        ArrayList<String> leitura = new ArrayList<>();
        
        String linha = lerArq.readLine();
        
          while(linha != null){
             leitura.add(linha);
             System.out.println(linha);
             linha = lerArq.readLine();
          }
          arq2.close();
          
           FileWriter arq = new FileWriter("/home/thales/BancoForca/jogador.txt");
           PrintWriter gravarArq = new PrintWriter(arq);

         int i=0;
         while(i < leitura.size()){
             System.out.println(leitura.get(i).substring(0, leitura.get(i).indexOf(",")));
             if((leitura.get(i).substring(0, leitura.get(i).indexOf(","))).equals("Thales")){
               gravarArq.write(leitura.get(i).substring(0, leitura.get(i).indexOf(",") +1) + "40\n");
               System.out.println("entrou if");
             }else{
            gravarArq.write(leitura.get(i)+"\n");
             }
            i++;
        }
       arq.close();*/
            

       

        
        
            
       
        
        
        /* FileWriter arq = new FileWriter("/home/thales/thalex.txt");
         PrintWriter gravarArq = new PrintWriter(arq);
         
         for(int i=0; i<10; i++){
         gravarArq.println("Thales|20");
         gravarArq.println("Thiago|30");
         }
         
         arq.close();
         
          FileReader arq2 = new FileReader("/home/thales/thalex.txt");
          BufferedReader lerArq = new BufferedReader(arq2);
      ArrayList<String> linhas = new ArrayList<>();
      String linha = lerArq.readLine(); 
      while (linha != null) {
        System.out.printf("%s\n", linha);
 
        linha = lerArq.readLine();
        linhas.add(linha);// lê da segunda até a última linha
      }
     
      if(linhas.get(0).equals(_))
      System.out.print("");*/
       
        
      /*Categoria c = new Categoria("Informatica");
        Palavra p = new Palavra("Computador");
        //Palavra p2 = new Palavra("Mouseo"); 
       // Palavra p3 = new Palavra("vvo");
        
        p.setDificulty("easy");
        //p2.setDificulty("easy");
       // p3.setDificulty("easy");
        
       c.addPalavra(p);
       //c.addPalavra(p2);
       //c.addPalavra(p3);
       
       
        
        Jogador j = new Jogador("Thales");
        
        JogoEasy jogo = new JogoEasy(j, c);
        
        /*ArrayList<Integer> teste = new ArrayList<>();
        
        teste.add(1);
        teste.add(8);
        teste.add(0);
        teste.add(2);*/
        

       /* ArrayList<Integer> teste1 = new ArrayList<>();
        ArrayList<Integer> teste2 = new ArrayList<>();
        ArrayList<Integer> teste3 = new ArrayList<>();
        
        teste1.add(1);
        teste1.add(2);
     
        
        teste2.add(4);
        teste2.add(5);
        teste2.add(6);
        
        
        teste1.addAll(teste2);
        System.out.println(teste1);
        
        
        
        
        
        
     Scanner ler;
    ler = new Scanner(System.in);
       System.out.println(jogo.getP().getNome());
        int i = 0;
        while(i < 30){
            System.out.println("Informe seu chute");
            String x = ler.next();
            jogo.chutar(x.charAt(0));
            System.out.println(jogo.printaChute());
            i++;
        }*/
    
        
        
      
        
       
        
        




      
    }
}
