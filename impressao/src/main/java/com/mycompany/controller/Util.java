/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Otavio
 */
public class Util {
    public static void jTableShow(JTable grd, AbstractTableModel tableModel, TableCellRenderer render) {
        grd.setModel(tableModel);
        if (render != null) {
            grd.setDefaultRenderer(Object.class, render);
        }
    }   
}
