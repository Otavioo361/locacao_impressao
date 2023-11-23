/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.model.view;

/**
 *
 * @author JonathasOliveira
 */
public class FrCadImpressora extends javax.swing.JFrame {

    /**
     * Creates new form FrCadImpressora
     */
    public FrCadImpressora() {
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

        lblCadImpressora = new javax.swing.JLabel();
        btnNovaImpressora = new javax.swing.JButton();
        btnEditarImpressora = new javax.swing.JButton();
        btnExcluirImpressora = new javax.swing.JButton();
        btnSalvarImpressora = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        edtMarca = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        edtTipo = new javax.swing.JTextField();
        edtColorida = new javax.swing.JCheckBox();
        lblModelo = new javax.swing.JLabel();
        edtModelo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadImpressora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadImpressora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadImpressora.setText("Cadastro de Impressora");

        btnNovaImpressora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovaImpressora.setText("Novo");
        btnNovaImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaImpressoraActionPerformed(evt);
            }
        });

        btnEditarImpressora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarImpressora.setText("Editar");
        btnEditarImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarImpressoraActionPerformed(evt);
            }
        });

        btnExcluirImpressora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluirImpressora.setText("Excluir");
        btnExcluirImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirImpressoraActionPerformed(evt);
            }
        });

        btnSalvarImpressora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvarImpressora.setText("Salvar");
        btnSalvarImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarImpressoraActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblId.setText("ID:");

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblMarca.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblMarca.setText("Marca:");

        edtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMarcaActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        edtColorida.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        edtColorida.setText("Colorida");

        lblModelo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblModelo.setText("Modelo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblCadImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovaImpressora)
                                .addGap(59, 59, 59)
                                .addComponent(btnEditarImpressora)
                                .addGap(43, 43, 43)
                                .addComponent(btnExcluirImpressora))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalvarImpressora)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(edtColorida)
                        .addGap(54, 54, 54)
                        .addComponent(lblModelo)
                        .addGap(18, 18, 18)
                        .addComponent(edtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCadImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaImpressora)
                    .addComponent(btnEditarImpressora)
                    .addComponent(btnExcluirImpressora)
                    .addComponent(btnSalvarImpressora))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtColorida)
                    .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaImpressoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovaImpressoraActionPerformed

    private void btnEditarImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarImpressoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarImpressoraActionPerformed

    private void btnExcluirImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirImpressoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirImpressoraActionPerformed

    private void btnSalvarImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarImpressoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarImpressoraActionPerformed

    private void edtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMarcaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarImpressora;
    private javax.swing.JButton btnExcluirImpressora;
    private javax.swing.JButton btnNovaImpressora;
    private javax.swing.JButton btnSalvarImpressora;
    private javax.swing.JCheckBox edtColorida;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtMarca;
    private javax.swing.JTextField edtModelo;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtTipo;
    private javax.swing.JLabel lblCadImpressora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}
