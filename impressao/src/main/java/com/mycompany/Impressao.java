/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import com.mycompany.model.view.FrAtendente;
import com.mycompany.model.view.FrCadImpressora;
import com.mycompany.model.view.FrCliente;
import com.mycompany.model.view.FrLogin;
import com.mycompany.model.view.FrMenuPrincipal;

/**
 *
 * @author JonathasOliveira
 */
public class Impressao {
    public static void main(String[] args) {
        FrLogin telaLogin = new FrLogin();
        telaLogin.setLocationRelativeTo(null);
        telaLogin.setVisible(false);
        
        FrCliente telaCliente = new FrCliente();
        telaCliente.setLocationRelativeTo(null);
        telaCliente.setVisible(false);
        
        FrCadImpressora telaImpressora = new FrCadImpressora();
        telaImpressora.setLocationRelativeTo(null);
        telaImpressora.setVisible(false);
        
        FrAtendente telaAtendente = new FrAtendente();
        telaAtendente.setLocationRelativeTo(null);
        telaAtendente.setVisible(false);
        
        FrMenuPrincipal telaMenu = new FrMenuPrincipal();
        telaMenu.setLocationRelativeTo(null);
        telaMenu.setVisible(true);
    }
}
