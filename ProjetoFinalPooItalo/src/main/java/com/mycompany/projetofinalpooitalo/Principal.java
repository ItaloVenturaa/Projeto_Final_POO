/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpooitalo;

import javax.swing.JOptionPane;

/**
 *
 * @author ipvve
 */
//Nome: Italo Pereira Ventura -  RA: 2467259

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barMnPrincipal = new javax.swing.JMenuBar();
        mnPrincipal = new javax.swing.JMenu();
        ItMnCadAtle = new javax.swing.JMenu();
        irMnCadCor = new javax.swing.JMenuItem();
        itMnCadSal = new javax.swing.JMenuItem();
        itMnCadNad = new javax.swing.JMenuItem();
        ItSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretaria do Esporte");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Bem-Vindo");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setText("Secretaria do Esporte do Municipio de Assis-Sp");

        mnPrincipal.setText("Menu Principal");

        ItMnCadAtle.setText("Cadastrar Atleta");

        irMnCadCor.setText("Corredor");
        irMnCadCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irMnCadCorActionPerformed(evt);
            }
        });
        ItMnCadAtle.add(irMnCadCor);

        itMnCadSal.setText("Saltador");
        itMnCadSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadSalActionPerformed(evt);
            }
        });
        ItMnCadAtle.add(itMnCadSal);

        itMnCadNad.setText("Nadador");
        itMnCadNad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadNadActionPerformed(evt);
            }
        });
        ItMnCadAtle.add(itMnCadNad);

        mnPrincipal.add(ItMnCadAtle);

        ItSair.setText("Sair");
        ItSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItSairActionPerformed(evt);
            }
        });
        mnPrincipal.add(ItSair);

        barMnPrincipal.add(mnPrincipal);

        setJMenuBar(barMnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMnCadSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadSalActionPerformed
       abreCadSal();
    }//GEN-LAST:event_itMnCadSalActionPerformed

    private void irMnCadCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irMnCadCorActionPerformed
       abreCadCor();
    }//GEN-LAST:event_irMnCadCorActionPerformed

    private void ItSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItSairActionPerformed
        sai();
    }//GEN-LAST:event_ItSairActionPerformed

    private void itMnCadNadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadNadActionPerformed
       abreCadNad();
    }//GEN-LAST:event_itMnCadNadActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated
    
    public void sai() {
        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == 0) {
            //System.exit(0);
            dispose();
        }
    }
    public void abreCadNad(){
        CadNad.getCadNad().setVisible(true);
    }
    public void abreCadSal(){
       CadSal.getCadSal().setVisible(true);
    }
    
    public void abreCadCor(){
        CadCor.getCadCor().setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ItMnCadAtle;
    private javax.swing.JMenuItem ItSair;
    private javax.swing.JMenuBar barMnPrincipal;
    private javax.swing.JMenuItem irMnCadCor;
    private javax.swing.JMenuItem itMnCadNad;
    private javax.swing.JMenuItem itMnCadSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu mnPrincipal;
    // End of variables declaration//GEN-END:variables
}