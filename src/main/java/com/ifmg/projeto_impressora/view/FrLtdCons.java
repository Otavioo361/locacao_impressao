/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ifmg.projeto_impressora.view;

import com.ifmg.projeto_impressora.model.auth.Autenticador;
import com.ifmg.projeto_impressora.controller.ImpressoraController;
import com.ifmg.projeto_impressora.controller.TMCadImpressora;
import com.ifmg.projeto_impressora.controller.LtdConsController;
import com.ifmg.projeto_impressora.view.veterinario.FrLtdEqFornecedor;
import com.ifmg.projeto_impressora.view.veterinario.FrLtdConsEqServico;
import javax.swing.JFrame;

/**
 *
 * @author gusta
 */
public class FrLtdCons extends javax.swing.JFrame {
    
    LtdConsController ltdConsController;
    private JFrame telaAnterior;
    /**
     * Creates new form FrVeterinario
     */
    public FrLtdCons(JFrame telaQueChamou) {
        this.telaAnterior = telaQueChamou;
        LtdConsController ltdConsController = new LtdConsController();
        initComponents();
        
        ltdConsController.atualizarTabelaImpressora(grdImpressoras, Autenticador.getIdLogado());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTelaRelAlimento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdImpressoras = new javax.swing.JTable();
        btnRelacionarServicos = new javax.swing.JButton();
        lblTitutoEquinos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTelaRelAlimento.setText("Relacionar");
        btnTelaRelAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaRelAlimentoActionPerformed(evt);
            }
        });

        grdImpressoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdImpressoras.setEnabled(false);
        jScrollPane1.setViewportView(grdImpressoras);

        btnRelacionarServicos.setText("Relacionar");
        btnRelacionarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionarServicosActionPerformed(evt);
            }
        });

        lblTitutoEquinos.setText("Impressoras responsáveis");

        jLabel1.setText("Relacionar impressora com Fornecedor:");

        jLabel2.setText("Relacionar equino com serviço adicional:");

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Fornecedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTelaRelAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(160, 160, 160)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelacionarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(lblTitutoEquinos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaRelAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelacionarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblTitutoEquinos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaRelAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaRelAlimentoActionPerformed
        FrLtdEqFornecedor frltdimpforn = new FrLtdEqFornecedor(this);
        frltdimpforn .setVisible(true);
    }//GEN-LAST:event_btnTelaRelAlimentoActionPerformed

    private void btnRelacionarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionarServicosActionPerformed
        FrLtdConsEqServico frltdEqServ = new FrLtdConsEqServico(this);
        frltdEqServ.setVisible(true);
    }//GEN-LAST:event_btnRelacionarServicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelacionarServicos;
    private javax.swing.JButton btnTelaRelAlimento;
    private javax.swing.JTable grdImpressoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitutoEquinos;
    // End of variables declaration//GEN-END:variables
}
