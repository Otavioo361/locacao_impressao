
package view;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Impressora;



public class DlgCadImpressora extends javax.swing.JDialog {
    Impressora impressora;
    

    public DlgCadImpressora(java.awt.Frame parent, boolean modal, Impressora impressora) {

        super(parent, modal);                
        initComponents();    
        
        this.impressora = impressora;
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnFecharPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtImpressora = new javax.swing.JTextArea();
        btnAddImpressora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Impressora");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnFecharPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save_32x32.png"))); // NOI18N
        btnFecharPedido.setText("Fechar Pedido");
        btnFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPedidoActionPerformed(evt);
            }
        });

        edtImpressora.setColumns(20);
        edtImpressora.setRows(5);
        jScrollPane1.setViewportView(edtImpressora);

        btnAddImpressora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCliente.png"))); // NOI18N
        btnAddImpressora.setText("Add impressora");
        btnAddImpressora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImpressoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnAddImpressora)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 198, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFecharPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnFecharPedido))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPedidoActionPerformed
        if(this.impressora == null){
            //não tem nada para fazer
        
        }else if(this.impressora.getNumeroDeSerie() == null){
            JOptionPane.showConfirmDialog(this, "Você não selecionou oa impressora");
                 

        }else
            JOptionPane.showMessageDialog(this, "Pedido realizado com sucesso!");
            dispose();
    }//GEN-LAST:event_btnFecharPedidoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int response = JOptionPane.showConfirmDialog(null,
                    "Deseja realmente cancelar essa impressora?",
                    "Confirm",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                dispose();
            }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddImpressoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImpressoraActionPerformed
        DlgEscolhaImpressora TelaAddAluno = new DlgEscolhaImpressora(new JFrame(), true, impressora);
        TelaAddAluno.setVisible(true);
        
        atualizaInterfacePedido();
        
    }//GEN-LAST:event_btnAddImpressoraActionPerformed
    
    public void atualizaInterfacePedido(){
        String texto = this.impressora.toString();    
        edtImpressora.setText(texto);
    }
    
    public Impressora pesquisaImpressora(String numeroDeSerie) {


            if (impressora.getNumeroDeSerie().equals(numeroDeSerie)) {
                return impressora;
            }
        
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImpressora;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFecharPedido;
    private javax.swing.JTextArea edtImpressora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
