/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller.tableModel;

import com.mycompany.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JonathasOliveira
 */
public class TMCadCliente extends AbstractTableModel {
        private List<Cliente> lista;
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;   
    private final int COL_EMAIL = 2;
    private final int COL_CPF = 3;
     private final int COL_LIMFATURA = 4;  

    public TMCadCliente(List<Cliente> lstCliente) {        
        lista = lstCliente;        
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {               
        Cliente aux = new Cliente();
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
                case COL_NOME:
                    return aux.getNome();
                case COL_EMAIL:
                    return aux.getEmail();
                case COL_CPF:
                    return aux.getCpf();
                case COL_LIMFATURA:
                    return aux.getLimiteFatura();
                 
               
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
            case COL_EMAIL:
                return "E-Mail";
            case COL_CPF:
                return "CPF";
            case COL_LIMFATURA:
                return "Limite Fatura";
                        
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
