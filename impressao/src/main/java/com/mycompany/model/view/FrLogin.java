/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.model.view;

import com.mycompany.controller.AutenticadorLoginController;
import com.mycompany.model.auth.Autenticador;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JonathasOliveira
 */
public class FrLogin extends javax.swing.JFrame {

    AutenticadorLoginController autenticadorLoginController;
    
    public FrLogin() {
        initComponents();
    }

    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        edtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        edtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloLogin.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        lblTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloLogin.setText("Sistema de Locação de Impressora");

        lblUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário:");

        lblSenha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");

        edtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       if(edtUsuario.getText().equals("admin") && edtSenha.getText().equals("12345")){
            FrAdministrador telaAdministrador = new FrAdministrador();
            telaAdministrador.setVisible(true);
            dispose();
        }
        if(edtUsuario.getText().equals("cliente") && edtSenha.getText().equals("1234")){
            FrCliente telaCliente = new FrCliente();
            telaCliente.setVisible(true);
            dispose();
        }
       if(edtUsuario.getText().equals("atendente") && edtSenha.getText().equals("1234")){
            FrAtendente telaAtendente = new FrAtendente();
            telaAtendente.setVisible(true);
            dispose();
        }
       else{
            JOptionPane.showMessageDialog(rootPane, "Usuario ou Senha Invalidos!");
        }
       
       //if para acessar o banco de dados e redirecionar a tela administrador
       //outro if para acessar o banco de dados e redirecionar a tela atendente/funcionario
    }//GEN-LAST:event_btnEntrarActionPerformed

    private boolean autenticadorLoginController(String usuario, String senha) {
    // Implemente a lógica de autenticação adequada aqui
    // Exemplo básico: (NÃO use isso em produção)
        return usuario.equals("admin") && senha.equals("12345");
    }
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void edtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSenhaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JTextField edtUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloLogin;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
