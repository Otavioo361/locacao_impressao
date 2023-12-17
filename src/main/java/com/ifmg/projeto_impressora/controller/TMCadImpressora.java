/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Impressora;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio
 */
public class TMCadImpressora extends AbstractTableModel {
    private List<Impressora> lista;

    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_MARCA = 2;
    private final int COL_PROP = 3;
    private final int COL_LTDCONS = 4;
    private final int COL_LOCAL = 5;
   

    public TMCadImpressora(List<Impressora> lstLocatario) {
        lista = lstLocatario;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Impressora aux = new Impressora();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = lista.get(rowIndex);

            // verifica qual valor deve ser retornado
            switch (columnIndex) {
                case -1:
                    return aux;
                case COL_ID:
                    return aux.getId();
                case COL_NOME:
                    return aux.getNome();
                case COL_MARCA:
                    return aux.getMarca();
                case COL_PROP:
                    if (aux.getProprietario() == null) {
                        return "";
                    }
                    return aux.getProprietario().getId() + " - " + aux.getProprietario().getNome();
                
                case COL_LTDCONS:
                    if (aux.getLtdCons()== null) {
                        return "";
                    }
                    return aux.getLtdCons().getId() + " - " + aux.getLtdCons().getNome();
                case COL_LOCAL:
                    if (aux.getLocal() == null) {
                        return "";
                    }
                    return aux.getLocal().getId();

                default:
                    break;
            }
        }
        return aux;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case COL_ID:
                return "Id";
            case COL_NOME:
                return "Nome";
            case COL_MARCA:
                return "Marca";
            case COL_LTDCONS:
                return "empresaConcerta";
            case COL_PROP:
                return "Proprietário";            
            case COL_LOCAL:
                return "Local";

            default:
                break;
        }

        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }
}
