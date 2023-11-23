/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.controller.tableModel.TMCadLocal;
import com.mycompany.model.Local;
import com.mycompany.model.dao.LocalDAO;
import com.mycompany.model.exceptions.LocalException;
import com.mycompany.model.valid.ValidateLocal;
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

    public String buscarBaiasString() {
        List<Local> locais = repositorio.findAll();

        String baiaString = "";
        for (Local local : locais) {
            baiaString += local.getId() + "\n";
        }

        return baiaString;
    }

    public Local buscarLocalPorId(Integer id) {
        if (id == null) {
            return null;
        }
        Local local = (Local) repositorio.find(id);
        return local;
    }

    public void cadastrarBaia(Double tamanho, String tipo) {
        ValidateLocal valid = new ValidateLocal();
        Local novoLocal = valid.validaCamposEntrada(tamanho, tipo);

        repositorio.save(novoLocal);
    }

    public void atualizarBaia(int idBaia, Double tamanho, String tipo) {
        ValidateLocal valid = new ValidateLocal();
        Local novoLocal = valid.validaCamposEntrada(tamanho, tipo);

        novoLocal.setId(idBaia);
        repositorio.save(novoLocal);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadLocal(repositorio.findAll()), null);
    }

    public void excluirBaia(Local local) {
        if (local != null) {
            repositorio.delete(local);
        } else {
            throw new LocalException("Error: Baia inexistente.");
        }
    }
}
