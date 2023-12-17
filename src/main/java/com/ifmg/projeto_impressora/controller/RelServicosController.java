/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.ImpressoraServico;
import com.ifmg.projeto_impressora.model.Proprietario;
import com.ifmg.projeto_impressora.model.dao.ProprietarioDAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Otavio
 */
public class RelServicosController {
    private ProprietarioDAO repositorio;
    
    public RelServicosController(){
        this.repositorio = new ProprietarioDAO();
    }
    
    public boolean gerarRelatorio(Integer id){
        Document document = new Document();
        String arquivoPdf = "relatorioServicos.pdf";
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream(arquivoPdf));
            document.open();
            
            Proprietario prop = (Proprietario) repositorio.find(id);
            List<Impressora> impressora = prop.getImpressora();
            
            String servicos = "";
            PdfPTable table = new PdfPTable(2);
            for (Impressora equino : prop.getImpressora()) {
                table.addCell(String.valueOf(equino.getId())+" - "+equino.getNome());
                
                servicos = "";
                for (ImpressoraServico equinoServico : equino.getImpressoraServico()) {
                    servicos += "\nServiço: " + equinoServico.getServicoAdicional().getServico() + "\n" +
                            "Quantidade: " + equinoServico.getQtd() + "\n" +
                            "Preço: " + equinoServico.getServicoAdicional().getPreco() + "\n\n";
                   
                }
                table.addCell(servicos);
            }
            
            document.add(table);
            document.close();
            
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RelServicosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(RelServicosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
