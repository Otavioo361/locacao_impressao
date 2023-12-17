/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio
 */
public class TMShowRelacaoimpServico extends AbstractTableModel {
    private List<Object[]> lista;

    private final int COL_IMPRESSORA = 0;
    private final int COL_SERVICO = 1;
    private final int COL_SERVICO_QTD = 2;

    public TMShowRelacaoimpServico(List<Object[]> lstImpressora) {
        lista = lstImpressora;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] aux = new Object[4];
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = lista.get(rowIndex);

            // verifica qual valor deve ser retornado
            switch (columnIndex) {
                case -1:
                    return aux;
                case COL_IMPRESSORA:
                    return aux[0] + " - " + aux[1];
                case COL_SERVICO:
                    return aux[2] + " - " + aux[3];
                case COL_SERVICO_QTD:
                    return aux[4];

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
            case COL_IMPRESSORA:
                return "Impressora";
            case COL_SERVICO:
                return "Serviço Adicional";
            case COL_SERVICO_QTD:
                return "Quantidade";
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
