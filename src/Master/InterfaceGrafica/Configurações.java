/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master.InterfaceGrafica;
import Master.*;
import static Master.Jogador.retornaPontosBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thales
 */
public class Configurações extends javax.swing.JFrame {
 
    
    
    
    public Configurações() throws IOException { 
        initComponents();
        combodificuldade.removeAllItems();
        combodificuldade.addItem("FACIL");
        combodificuldade.addItem("MEDIO");
        combodificuldade.addItem("DIFICIL");
        addComboBoxJogadores();
    }
    
   private void addComboBoxJogadores() throws IOException{
       try{
        int i=0;
        jog.removeAllItems();
        ArrayList<String> jogadores = Jogador.getJogadores();
        while(i < jogadores.size()){
                jog.addItem(jogadores.get(i));
                i++;
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInicia = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtCactegoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jgrNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btncadjog = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jogador1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCadCategoria = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jog = new javax.swing.JComboBox<>();
        combodificuldade = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jogador2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        verpontos = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel11.setText("Nome");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Preferencias do Jogo");

        btnInicia.setText("Iniciar Jogo");
        btnInicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciaMouseClicked(evt);
            }
        });
        btnInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel5.setText("Cadastrar Categoria");

        jgrNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgrNomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel6.setText("Cadastrar Jogador");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setText("Cadastros");

        jLabel4.setText("Nome");

        btncadjog.setText("Cadastrar");
        btncadjog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadjogActionPerformed(evt);
            }
        });

        jButton3.setText("Cadastrar");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel9.setText("Cadastrar Palavra");

        jLabel10.setText("Nome");

        jLabel12.setText("Nome");

        jLabel13.setText("Categoria");

        btnCadCategoria.setText("Cadastrar");
        btnCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCategoriaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel14.setText("Jogo");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Categoria");

        jLabel16.setText("Jogador");

        jLabel17.setText("Dificuldade");

        jog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogActionPerformed(evt);
            }
        });

        combodificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combodificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodificuldadeActionPerformed(evt);
            }
        });

        jLabel18.setText("Dica");

        jButton1.setText("Exibir Ranking");

        verpontos.setText("Ver Pontos");
        verpontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpontosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btncadjog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtCactegoria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadCategoria)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jog, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(verpontos)))))
                        .addContainerGap(322, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jgrNome, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnInicia)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel12)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combodificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCactegoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncadjog)
                    .addComponent(jLabel10)
                    .addComponent(btnCadCategoria)
                    .addComponent(jgrNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verpontos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(combodificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicia)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciaActionPerformed
        

    }//GEN-LAST:event_btnIniciaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnIniciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciaMouseClicked
        Categoria c = new Categoria("Informatica");
        Palavra p = new Palavra("Computador");
        Palavra p2 = new Palavra("Mouseo"); 
        Palavra p3 = new Palavra("vvo");
        c.addPalavra(p);
        c.addPalavra(p2);
        c.addPalavra(p3);
        JogoEasy je = null;
        JogoMedium jm;
        JogoHard jh;
        JogoRunning frame = null;
        Jogador thales = new Jogador(jog.getSelectedItem().toString());
        try {
            thales.setPontos(retornaPontosBD(thales));
        } catch (IOException ex) {
            Logger.getLogger(Configurações.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(combodificuldade.getSelectedItem().toString() == "FACIL"){
         je = new JogoEasy(thales, c);
         frame = new JogoRunning(je);
        }
         else
        {
            if(combodificuldade.getSelectedItem().toString() == "MEDIO")
            {
                jm = new JogoMedium(thales, c);
                frame = new JogoRunning(jm);
            }
            else
            {
                if(combodificuldade.getSelectedItem().toString() == "DIFICIL")
                {
                    jh = new JogoHard(thales, c);
                    frame = new JogoRunning(jh); 
                }
            }
        }
        frame.setVisible(true);
    }//GEN-LAST:event_btnIniciaMouseClicked

    private void jgrNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgrNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgrNomeActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogActionPerformed

    private void combodificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodificuldadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodificuldadeActionPerformed

    private void btncadjogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadjogActionPerformed
                if(evt.getSource() == btncadjog){
                    Jogador jogador = new Jogador(jgrNome.getText());
                    try {
                        Jogador.CadastraJogador(jogador);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!");
                }
        try {
            addComboBoxJogadores();
        } catch (IOException ex) {
            Logger.getLogger(Configurações.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
       
       
            
           
    }//GEN-LAST:event_btncadjogActionPerformed

    private void btnCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCategoriaActionPerformed
           if(evt.getSource() == btnCadCategoria){
             Categoria c = new Categoria(txtCactegoria.getText());
               try {
                   Categoria.CadastrarCategoria(c);
               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, ex.getMessage());
               }
               JOptionPane.showMessageDialog(null, "Categoria Cadastrada com sucesso");
         }
    }//GEN-LAST:event_btnCadCategoriaActionPerformed

    private void verpontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpontosActionPerformed
        if(evt.getSource() == verpontos){
            Jogador j = new Jogador(jog.getSelectedItem().toString());
            try {
                j.setPontos(Jogador.retornaPontosBD(j));
            } catch (IOException ex) {
                Logger.getLogger(Configurações.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, j.getPontos());
        }
    }//GEN-LAST:event_verpontosActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCategoria;
    private javax.swing.JButton btnInicia;
    private javax.swing.JButton btncadjog;
    private javax.swing.JComboBox<String> combodificuldade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jgrNome;
    private javax.swing.JComboBox<String> jog;
    private javax.swing.JTextField jogador1;
    private javax.swing.JTextField jogador2;
    private javax.swing.JTextField txtCactegoria;
    private javax.swing.JButton verpontos;
    // End of variables declaration//GEN-END:variables
}
