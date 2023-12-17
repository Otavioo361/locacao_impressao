/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.auth.Autenticador;
import com.ifmg.projeto_impressora.model.dao.LocatarioDAO;
import com.ifmg.projeto_impressora.model.dao.ProprietarioDAO;
import com.ifmg.projeto_impressora.model.dao.LtdConsDAO;

/**
 *
 * @author Otavio
 */
public class AutenticadorController {

    private LocatarioDAO repTecnico;
    private LtdConsDAO repVeterinario;
    private ProprietarioDAO repProprietario;

    public AutenticadorController() {
        repTecnico = new LocatarioDAO();
        repVeterinario = new LtdConsDAO();
        repProprietario = new ProprietarioDAO();
    }

    public char autenticarPorEmailSenha(String email, String senha) {
        Integer idTecnico = repTecnico.getTecnicoByEmailAndSenha(email, senha);
        if (!(idTecnico == 0)) {
            Autenticador.setIdLogado(idTecnico);
            return 'c';
        }

        Integer idLtdCons = repVeterinario.getLtdConsByEmailAndSenha(email, senha);
        if (!(idLtdCons == 0)) {
            Autenticador.setIdLogado(idLtdCons);
            return 'v';
        }

        Integer idProprietario = repProprietario.getProprietarioByEmailAndSenha(email, senha);
        if (!(idProprietario == 0)) {
            Autenticador.setIdLogado(idProprietario);
            return 'p';
        }
        return 'n';
    }

}
