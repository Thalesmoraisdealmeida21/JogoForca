/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import Master.InterfaceGrafica.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thales
 */
public class main {
    public static void main(String args[]){
        
        /*JogoRunning frame = new JogoRunning();
        frame.setVisible(true);*/
        
       Categoria c = new Categoria("Informatica");
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
        

        ArrayList<Integer> teste1 = new ArrayList<>();
        ArrayList<Integer> teste2 = new ArrayList<>();
        ArrayList<Integer> teste3 = new ArrayList<>();
        
        teste1.add(1);
        teste1.add(2);
        teste1.add(3);
        
        teste2.add(4);
        teste2.add(5);
        teste2.add(6);
        
        teste1.addAll(teste2);
        System.out.println(teste1);
        
        
        
        
        
        
     Scanner ler;
    ler = new Scanner(System.in);
   
        
        System.out.println(jogo.getP().getNome());
        System.out.println("Informe seu chute");
        String x = ler.next();
        jogo.chutar(x.charAt(0));
        
       
        
        /*jogo.chutar(x.charAt(0));
        System.out.println(jogo.printaChute(teste));
        System.out.println(jogo.getChutes());*/
                
   /* int retorno = jogo.getP().chutar(chute);
    if(retorno == -1){
        System.out.println("Você errou tente novamente");
    }else{
        System.out.print("Voce acertou  " + jogo.getP().getNome().charAt(retorno) + "   " + retorno);
    }
    
    System.out.println(retorno);*/


      
    }
}
