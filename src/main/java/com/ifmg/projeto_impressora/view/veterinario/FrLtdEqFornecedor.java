/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ifmg.projeto_impressora.view.veterinario;

import com.ifmg.projeto_impressora.model.auth.Autenticador;
import com.ifmg.projeto_impressora.controller.FornecedorController;
import com.ifmg.projeto_impressora.controller.ImpressoraController;
import com.ifmg.projeto_impressora.controller.LtdConsController;
import com.ifmg.projeto_impressora.model.exceptions.ImpressoraException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class FrLtdEqFornecedor extends javax.swing.JFrame {

    private JFrame telaAnterior;
    
    ImpressoraController impressoraController;
    FornecedorController fornecedorController;
    LtdConsController ltdConsController;
    /**
     * Creates new form FrVeterinario
     */
    public FrLtdEqFornecedor(JFrame telaQueChamou) {
        impressoraController = new ImpressoraController();
        fornecedorController = new FornecedorController();
        ltdConsController = new LtdConsController();
        this.telaAnterior = telaQueChamou;
        initComponents();
        
        impressoraCombobox();
        fornecedorCombobox();
        
        impressoraController.atualizarTabelaRelacionamentos(grdImpressoraFornecedor);
    }
    
    public void impressoraCombobox() {
        String[] impressoraString = ltdConsController.buscarImpressoraString(Autenticador.getIdLogado()).split("\n");

        for (String impresssoraIdNome : impressoraString) {
            cbxImpressora.addItem(impresssoraIdNome);
        }
    }
    
    public void fornecedorCombobox() {
        String[] impressoraString = fornecedorController.buscarFornecedorString().split("\n");

        for (String impressoraIdNome : impressoraString) {
            cbxFornecedor.addItem(impressoraIdNome);
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

        cbxImpressora = new javax.swing.JComboBox<>();
        cbxFornecedor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdImpressoraFornecedor = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblEquinoCbx = new javax.swing.JLabel();
        lblAlimentoCbx = new javax.swing.JLabel();
        btnRelacionar = new javax.swing.JButton();
        btnDeletarRelacionamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grdImpressoraFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdImpressoraFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdImpressoraFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdImpressoraFornecedor);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Relacionar Fornecedores");

        lblEquinoCbx.setText("Equino:");

        lblAlimentoCbx.setText("Alimento:");

        btnRelacionar.setText("Relacionar");
        btnRelacionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionarActionPerformed(evt);
            }
        });

        btnDeletarRelacionamento.setText("Deletar");
        btnDeletarRelacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarRelacionamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquinoCbx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlimentoCbx)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnRelacionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnDeletarRelacionamento)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquinoCbx)
                    .addComponent(lblAlimentoCbx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRelacionar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletarRelacionamento)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelacionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionarActionPerformed
        String fornecedor = String.valueOf(cbxFornecedor.getSelectedItem());
        String impressora = String.valueOf(cbxImpressora.getSelectedItem());
        
        if(!fornecedor.equals("") && !impressora.equals("")){
            impressoraController.relacionarImpressoraFornecedor(impressora, fornecedor);
        }
        
        impressoraController.atualizarTabelaRelacionamentos(grdImpressoraFornecedor);
    }//GEN-LAST:event_btnRelacionarActionPerformed

    private void grdImpressoraFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdImpressoraFornecedorMouseClicked

    }//GEN-LAST:event_grdImpressoraFornecedorMouseClicked

    private void btnDeletarRelacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarRelacionamentoActionPerformed
        deletarlinhaGrdSelecionada();
    }//GEN-LAST:event_btnDeletarRelacionamentoActionPerformed

    private void deletarlinhaGrdSelecionada(){
        Object[] relSelecionado = (Object[]) this.getObjectSelectOnGrid();
        
        System.out.println("AAAAAAAAAA: "+ relSelecionado[0].toString());

        if (relSelecionado == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {
                impressoraController.excluirRelacionamentoAlimentos(
                        Integer.parseInt(relSelecionado[0].toString()), Integer.parseInt(relSelecionado[2].toString())
                );

                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (ImpressoraException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        
        impressoraController.atualizarTabelaRelacionamentos(grdImpressoraFornecedor);
    }
    
    private Object getObjectSelectOnGrid() {
        int rowCliked = grdImpressoraFornecedor.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdImpressoraFornecedor.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarRelacionamento;
    private javax.swing.JButton btnRelacionar;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JComboBox<String> cbxImpressora;
    private javax.swing.JTable grdImpressoraFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlimentoCbx;
    private javax.swing.JLabel lblEquinoCbx;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}