/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.model.view;

/**
 *
 * @author JonathasOliveira
 */
public class FrManutenção extends javax.swing.JFrame {

    /**
     * Creates new form FrManutenção
     */
    public FrManutenção() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        grdManutencao = new javax.swing.JPanel();
        lblManutencao = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        edtCliente = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        edtModelo = new javax.swing.JTextField();
        lblDataInicial = new javax.swing.JLabel();
        edtDataInicial = new javax.swing.JTextField();
        lblDataFinal = new javax.swing.JLabel();
        edtDataFinal = new javax.swing.JTextField();
        lblDefeito = new javax.swing.JLabel();
        edtDefeito = new javax.swing.JTextField();
        lblReparo = new javax.swing.JLabel();
        edtReparo = new javax.swing.JTextField();
        lblAvaliacao = new javax.swing.JLabel();
        edtAvaliacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TMManutencao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblManutencao.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblManutencao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManutencao.setText("Informações de Manutenção");

        lblCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblCliente.setText("Nome do Cliente:");

        lblModelo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblModelo.setText("Modelo da Impressora: ");

        lblDataInicial.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDataInicial.setText("Iniciado em:");

        lblDataFinal.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDataFinal.setText("Concluído: ");

        lblDefeito.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblDefeito.setText("Defeito: ");

        lblReparo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblReparo.setText("Reparo realizado: ");

        lblAvaliacao.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblAvaliacao.setText("Avaliação: ");

        TMManutencao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TMManutencao);

        javax.swing.GroupLayout grdManutencaoLayout = new javax.swing.GroupLayout(grdManutencao);
        grdManutencao.setLayout(grdManutencaoLayout);
        grdManutencaoLayout.setHorizontalGroup(
            grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grdManutencaoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grdManutencaoLayout.createSequentialGroup()
                        .addComponent(lblDataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lblDataFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(grdManutencaoLayout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(grdManutencaoLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(grdManutencaoLayout.createSequentialGroup()
                        .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(grdManutencaoLayout.createSequentialGroup()
                                .addComponent(lblReparo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtReparo))
                            .addGroup(grdManutencaoLayout.createSequentialGroup()
                                .addComponent(lblDefeito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblAvaliacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(grdManutencaoLayout.createSequentialGroup()
                .addComponent(lblManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        grdManutencaoLayout.setVerticalGroup(
            grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grdManutencaoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataInicial)
                    .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDataFinal)
                        .addComponent(edtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDefeito)
                    .addComponent(edtDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(grdManutencaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReparo)
                    .addComponent(edtReparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvaliacao)
                    .addComponent(edtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(grdManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(grdManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrManutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrManutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrManutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrManutenção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrManutenção().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TMManutencao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edtAvaliacao;
    private javax.swing.JTextField edtCliente;
    private javax.swing.JTextField edtDataFinal;
    private javax.swing.JTextField edtDataInicial;
    private javax.swing.JTextField edtDefeito;
    private javax.swing.JTextField edtModelo;
    private javax.swing.JTextField edtReparo;
    private javax.swing.JPanel grdManutencao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblDefeito;
    private javax.swing.JLabel lblManutencao;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblReparo;
    // End of variables declaration//GEN-END:variables
}
