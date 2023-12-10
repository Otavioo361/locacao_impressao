/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.model.view;

/**
 *
 * @author JonathasOliveira
 */
public class FrLocacao extends javax.swing.JFrame {

    /**
     * Creates new form FrLocacao
     */
    public FrLocacao() {
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

        lblTituloLocacao = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblTamanho = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        edtTamanho = new javax.swing.JTextField();
        lblTipoMaquina = new javax.swing.JLabel();
        edtTipoMaquina = new javax.swing.JTextField();
        lblFinalidade = new javax.swing.JLabel();
        lblTempoLocacao = new javax.swing.JLabel();
        edtFinalidade = new javax.swing.JTextField();
        edtTempoLocacao = new javax.swing.JTextField();
        lblQtdeImpressora = new javax.swing.JLabel();
        edtQtdeImpressora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdLocacao = new javax.swing.JTable();
        btnConsultarLocaçao = new javax.swing.JButton();
        edtConsultarImpressora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloLocacao.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTituloLocacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloLocacao.setText("Locação");

        btnAdicionar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");

        lblId.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblId.setText("ID:");

        lblTamanho.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTamanho.setText("Tamanho:");

        lblTipoMaquina.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTipoMaquina.setText("Tipo de Máquina:");

        lblFinalidade.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblFinalidade.setText("Finalidade:");

        lblTempoLocacao.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTempoLocacao.setText("Tempo de Locação:");

        lblQtdeImpressora.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblQtdeImpressora.setText("Quantidade de Impressoras:");

        grdLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(grdLocacao);

        btnConsultarLocaçao.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnConsultarLocaçao.setText("Consultar");
        btnConsultarLocaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLocaçaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloLocacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultarLocaçao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtConsultarImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQtdeImpressora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtQtdeImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblTempoLocacao)
                                .addGap(18, 18, 18)
                                .addComponent(edtTempoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addGap(353, 353, 353)
                                .addComponent(btnSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTamanho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(45, 45, 45)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTipoMaquina)
                                .addGap(18, 18, 18)
                                .addComponent(edtTipoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btnExcluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFinalidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edtFinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoMaquina)
                    .addComponent(edtTipoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinalidade)
                    .addComponent(edtFinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeImpressora)
                    .addComponent(edtQtdeImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempoLocacao)
                    .addComponent(edtTempoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarLocaçao)
                    .addComponent(edtConsultarImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarLocaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLocaçaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarLocaçaoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnConsultarLocaçao;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtConsultarImpressora;
    private javax.swing.JTextField edtFinalidade;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtQtdeImpressora;
    private javax.swing.JTextField edtTamanho;
    private javax.swing.JTextField edtTempoLocacao;
    private javax.swing.JTextField edtTipoMaquina;
    private javax.swing.JTable grdLocacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFinalidade;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblQtdeImpressora;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JLabel lblTempoLocacao;
    private javax.swing.JLabel lblTipoMaquina;
    private javax.swing.JLabel lblTituloLocacao;
    // End of variables declaration//GEN-END:variables
}
