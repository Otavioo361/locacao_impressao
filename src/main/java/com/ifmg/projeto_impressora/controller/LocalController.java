/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Local;
import com.ifmg.projeto_impressora.model.dao.LocalDAO;
import com.ifmg.projeto_impressora.model.exceptions.LocalException;
import com.ifmg.projeto_impressora.model.valid.ValidateLocal;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class LocalController {

    private LocalDAO repositorio;

    public LocalController() {
        this.repositorio = new LocalDAO();
    }

    public String buscarLocalString() {
        List<Local> locais = repositorio.findAll();

        String localtring = "";
        for (Local local : locais) {
            localtring += local.getId() + "\n";
        }

        return localtring;
    }

    public Local buscarLocalPorId(Integer id) {
        if (id == null) {
            return null;
        }
        Local local = (Local) repositorio.find(id);
        return local;
    }

    public void cadastrarLocal(Double tamanho, String tipo) {
        ValidateLocal valid = new ValidateLocal();
        Local novaLocal = valid.validaCamposEntrada(tamanho, tipo);

        repositorio.save(novaLocal);
    }

    public void atualizarLocal(int idLocal, Double tamanho, String tipo) {
        ValidateLocal valid = new ValidateLocal();
        Local novaLocal = valid.validaCamposEntrada(tamanho, tipo);

        novaLocal.setId(idLocal);
        repositorio.save(novaLocal);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadLocal(repositorio.findAll()), null);
    }

    public void excluirLocal(Local local) {
        if (local != null) {
            repositorio.delete(local);
        } else {
            throw new LocalException("Error: Local inexistente.");
        }
    }
}
