
package view;

import controller.ImpressoraController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Impressora;
import model.exceptions.ImpressoraException;


public class FrImpressora extends javax.swing.JFrame {
    ImpressoraController impressoraController;
    String numeroDeSerieImpressoraEditando;

    public FrImpressora(FrHome aThis, boolean par) {
     
        
        impressoraController = new ImpressoraController();
        numeroDeSerieImpressoraEditando = "-";

        initComponents();
        this.addMaskOnFields();
        
        this.habilitarCampos(false);
        this.limparCampos();

       
        impressoraController.atualizarTabela(grdImpressoras);
    }
public void habilitarCampos(boolean flag) {
        for (int i = 0; i < panFormulario.getComponents().length; i++) {
            panFormulario.getComponent(i).setEnabled(flag);
        }
    }

    public void limparCampos() {
        edtNomeImpressora.setText("");
        edtNumeroDeSerie.setText("");
    }
    
    public void addMaskOnFields(){
        try {
            MaskFormatter maskNumeroDeSerie = new MaskFormatter("###########");
            maskNumeroDeSerie.install(edtNumeroDeSerie);
        } catch (ParseException ex) {
            Logger.getLogger(FrImpressora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void objetoParaCampos(Impressora imp) {
        edtNomeImpressora.setText(imp.getNomeImpressora());
        edtNumeroDeSerie.setText(imp.getNumeroDeSerie());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panFormulario = new javax.swing.JPanel();
        lblNomeImpressora = new javax.swing.JLabel();
        edtNomeImpressora = new javax.swing.JTextField();
        lblNumeroDeSerie = new javax.swing.JLabel();
        edtNumeroDeSerie = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdImpressoras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Fira Sans", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Impressora");

        btnNovo.setForeground(new java.awt.Color(0, 25, 255));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemadelocacaodeimpressoras/imagens/novo.jpg"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemadelocacaodeimpressoras/imagens/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemadelocacaodeimpressoras/imagens/cancelar.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemadelocacaodeimpressoras/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosistemadelocacaodeimpressoras/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblNomeImpressora.setText("Nome:");

        lblNumeroDeSerie.setText("Numero de Serie:");

        javax.swing.GroupLayout panFormularioLayout = new javax.swing.GroupLayout(panFormulario);
        panFormulario.setLayout(panFormularioLayout);
        panFormularioLayout.setHorizontalGroup(
            panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormularioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addComponent(lblNomeImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtNomeImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addComponent(lblNumeroDeSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNumeroDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panFormularioLayout.setVerticalGroup(
            panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormularioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeImpressora)
                    .addComponent(edtNomeImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDeSerie)
                    .addComponent(edtNumeroDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
        grdImpressoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdImpressorasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdImpressoras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addGap(30, 30, 30)
                .addComponent(panFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       Impressora impressoraEditando = (Impressora) this.getObjectSelectOnGrid();

        if (impressoraEditando == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(impressoraEditando);
            this.numeroDeSerieImpressoraEditando = impressoraEditando.getNumeroDeSerie();
        }                                 
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
          Impressora impressoraEditando = (Impressora) this.getObjectSelectOnGrid();

        if (impressoraEditando == null)
            JOptionPane.showMessageDialog(this, "Primeiro selecione um registro na tabela.");
        else {
            try {
                impressoraController.excluirImpressora(impressoraEditando.getNumeroDeSerie());

                impressoraController.atualizarTabela(grdImpressoras);
                JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
            } catch (ImpressoraException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
 try {
            if (!numeroDeSerieImpressoraEditando.equals("-")) {
                impressoraController.atualizarImpressora(edtNomeImpressora.getText(), edtNumeroDeSerie.getText());
            } else {
               impressoraController.cadastrarImpressora(edtNomeImpressora.getText(),edtNumeroDeSerie.getText());
            }

            impressoraController.atualizarTabela(grdImpressoras);
            this.habilitarCampos(false);
            this.limparCampos();
        } catch (ImpressoraException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
                
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void grdImpressorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdImpressorasMouseClicked
        if (evt.getClickCount() == 2) {
            btnEditarActionPerformed(null);
        }
    }//GEN-LAST:event_grdImpressorasMouseClicked

    private Object getObjectSelectOnGrid() {
        int rowCliked = grdImpressoras.getSelectedRow();
        Object obj = null;
        if (rowCliked >= 0) {
            obj = grdImpressoras.getModel().getValueAt(rowCliked, -1);
        }
        return obj;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtNomeImpressora;
    private javax.swing.JFormattedTextField edtNumeroDeSerie;
    private javax.swing.JTable grdImpressoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeImpressora;
    private javax.swing.JLabel lblNumeroDeSerie;
    private javax.swing.JPanel panFormulario;
    // End of variables declaration//GEN-END:variables
}
