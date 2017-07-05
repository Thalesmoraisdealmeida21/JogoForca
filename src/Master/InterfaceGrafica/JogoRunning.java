/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master.InterfaceGrafica;
import Master.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author thales
 */
public class JogoRunning extends javax.swing.JFrame {

    Jogo j;
    
    /**
     * Creates new form JogoRunning
     */
    public JogoRunning(JogoEasy j) {
        initComponents();
        this.j = j;
        NomeJogdor.setText(j.getJ().getNome());
        palavra.setText(j.printaChute());
    }

    JogoRunning(JogoMedium j) {
       initComponents();
       this.j = j;
       NomeJogdor.setText(j.getJ().getNome());
       palavra.setText(j.printaChute());
       
    }

    JogoRunning(JogoHard j) {
       initComponents();
       this.j = j;
       NomeJogdor.setText(j.getJ().getNome());
       palavra.setText(j.printaChute());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palavra = new javax.swing.JLabel();
        CHUTAR = new javax.swing.JButton();
        CHUTE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TENT = new javax.swing.JLabel();
        acert = new javax.swing.JLabel();
        errorRest = new javax.swing.JLabel();
        pontos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomeJogdor = new javax.swing.JLabel();
        dica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        palavra.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N

        CHUTAR.setText("Chutar");
        CHUTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHUTARActionPerformed(evt);
            }
        });

        CHUTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHUTEActionPerformed(evt);
            }
        });

        jLabel1.setText("Tentativas:");

        jLabel2.setText("Acertos:");

        jLabel3.setText("Erros restantes:");

        jLabel4.setText("Pontos do Jogo:");

        TENT.setText("0");

        acert.setText("0");

        errorRest.setText("0");

        pontos.setText("0");

        jLabel9.setFont(new java.awt.Font("Impact", 2, 14)); // NOI18N
        jLabel9.setText("Jogo da Forca");

        NomeJogdor.setText("Jogador");

        dica.setText("Dica");
        dica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TENT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(acert, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CHUTE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CHUTAR)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dica))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pontos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorRest, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(NomeJogdor)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeJogdor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CHUTAR)
                            .addComponent(CHUTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dica)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TENT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(acert))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(errorRest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pontos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHUTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHUTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHUTEActionPerformed

    private void CHUTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHUTARActionPerformed
        boolean chutarq;
        try{  
            chutarq = j.chutar(CHUTE.getText().charAt(0));
        }catch(StringIndexOutOfBoundsException e){
           JOptionPane.showMessageDialog(null, "Informe o seu chute");
        }
       if(j.chutar(CHUTE.getText().charAt(0)))
       {
            try{
                boolean chutar = j.chutar(CHUTE.getText().charAt(0));
            palavra.setText(j.printaChute());
      
                if(j.verificaVitoria()){
                    j.finalizaJogo();
                    JOptionPane.showMessageDialog(null, "Parabéns você venceu");
                    setVisible(false);
               }
               else
               {
                    if(j.testaFimJogo())
                    {
                        JOptionPane.showMessageDialog(null, "Fim do jogo você perdeu");
                        j.finalizaJogo();
                        setVisible(false);
                    }
                }
                
                TENT.setText(j.getTentativas().toString());
                acert.setText(j.getAcertos().toString());
                errorRest.setText(j.retornaErrosRestantes().toString());
        
               
                if(j.getPontosJogo() != null){
                  pontos.setText(j.getPontosJogo().toString());
                }
               
               
           }catch(StringIndexOutOfBoundsException e){
               JOptionPane.showMessageDialog(null, "Informe o seu chute");
           }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao finalizar jogo"+ e.getMessage());
                }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você ja chutou esta letra informe outra");
        }
    }//GEN-LAST:event_CHUTARActionPerformed

    private void dicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dicaActionPerformed
        if(evt.getSource()== dica)
        {
             if(j instanceof JogoEasy){
                    JogoEasy j2 = (JogoEasy) j;
                    JOptionPane.showMessageDialog(null, j2.getP().getDica());
                }
                else
                {
                    if(j instanceof JogoMedium)
                    {
                        JogoMedium j2 = (JogoMedium) j;
                        JOptionPane.showMessageDialog(null, j2.getP().getDica());
                    }
                    else
                    {
                        if(j instanceof JogoHard)
                        {
                            JogoHard j2 = (JogoHard) j;
                             JOptionPane.showMessageDialog(null, j2.getP().getDica());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Dificuldade invalida");
                        }
                        
                    }
                }
        }
    }//GEN-LAST:event_dicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHUTAR;
    private javax.swing.JTextField CHUTE;
    private javax.swing.JLabel NomeJogdor;
    private javax.swing.JLabel TENT;
    private javax.swing.JLabel acert;
    private javax.swing.JButton dica;
    private javax.swing.JLabel errorRest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel palavra;
    private javax.swing.JLabel pontos;
    // End of variables declaration//GEN-END:variables
}
