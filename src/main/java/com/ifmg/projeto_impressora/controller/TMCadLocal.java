/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Local;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Otavio
 */
public class TMCadLocal extends AbstractTableModel {
    private List<Local> lista;
    
    private final int COL_ID = 0; 
    private final int COL_TAMANHO = 1;   
    private final int COL_TIPO = 2;    

    public TMCadLocal(List<Local> lstBaia) {        
        lista = lstBaia;        
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
        Local aux = new Local();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = lista.get(rowIndex);

            //verifica qual valor deve ser retornado
            switch (columnIndex) {
                case -1:
                    return aux;
                case COL_ID:
                    return aux.getId();
                case COL_TAMANHO:
                    return aux.getTamanho();
                case COL_TIPO:
                    return aux.getTipo();
                 
               
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
            case COL_TAMANHO:
                return "Tamanho";
            case COL_TIPO:
                return "Tipo";
                        
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
