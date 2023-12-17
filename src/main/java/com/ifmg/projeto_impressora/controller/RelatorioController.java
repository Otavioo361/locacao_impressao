/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Tecnico;
import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.dao.LocatarioDAO;
import com.ifmg.projeto_impressora.model.exceptions.LocatarioException;
import com.ifmg.projeto_impressora.model.valid.ValidateLocatario;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class RelatorioController {

    private LocatarioDAO repositorio;

    public RelatorioController() {
        this.repositorio = new LocatarioDAO();
    }

    public String buscarTecnicosString() {
        List<Tecnico> tecnicos = repositorio.findAll();

        String tecnicoIdNomeString = "";
        for (Tecnico tecnico : tecnicos) {
            tecnicoIdNomeString += tecnico.getId() + " - " + tecnico.getNome() + "\n";
        }

        return tecnicoIdNomeString;
    }

    public Tecnico buscarTecnicoPorId(Integer id) {
        if (id == null) {
            return null;
        }
        Tecnico tecnico = (Tecnico) repositorio.find(id);
        return tecnico;
    }

    public void cadastrarTecnico(String nome, String senha, String email, String data) {
        ValidateLocatario valid = new ValidateLocatario();
        Tecnico novoTecnico = valid.validaCamposEntrada(nome, senha, email, data);

        repositorio.save(novoTecnico);
    }

    public void atualizarTecnico(int idTecnico, String nome, String senha, String email, String data) {
        ValidateLocatario valid = new ValidateLocatario();
        Tecnico novoTecnico = valid.validaCamposEntrada(nome, senha, email, data);

        novoTecnico.setId(idTecnico);
        repositorio.save(novoTecnico);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadRelatorio(repositorio.findAll()), null);
    }

    public void excluirTecnico(Tecnico tecnico) {
        System.out.println(tecnico.getId());
        if (tecnico != null) {
            repositorio.delete(tecnico);
        } else {
            throw new LocatarioException("Error: Tecnico inexistente.");
        }
    }

    public void atualizarTabelaImpressora(JTable grdEquino, Integer id) {
        Tecnico cui= (Tecnico)repositorio.find(id);
        List<Impressora> impressora = cui.getImpressora();
        Util.jTableShow(grdEquino, new TMCadImpressora(impressora),null);
    }

}
