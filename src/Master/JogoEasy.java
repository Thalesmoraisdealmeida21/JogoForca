package Master;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thales
 */
public class JogoEasy extends Jogo {
    private Integer numMaxErrors;
    private Palavra p;

    public JogoEasy(Palavra p) {
        if(p.getDificulty().equals("easy")){
             this.p = p;
        }else{
            System.out.println("eRROR");
        }
   
       
    }
    
    
    
}
