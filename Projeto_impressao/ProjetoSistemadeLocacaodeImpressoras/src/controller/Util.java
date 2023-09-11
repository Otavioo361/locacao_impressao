
package controller;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;


public class Util {

    private static Object render;
        public static void jTableShow(JTable grd, TMCadImpressora tmCadImpressora, AbstractTableModel tableModel) {
        grd.setModel(tableModel);
        if (render != null) {
            grd.setDefaultRenderer(Object.class, (TableCellRenderer) render);
        }
        
    }
    
   
    public static boolean validCPF(String cpf){        
              
        if(cpf.length() != 11  && cpf.length() != 14){
            throw new RuntimeException("CPF inválido -  Tamanho inválido.");
        }
        
        
        if(cpf.length() == 14){
            cpf = cpf.replaceAll("\\.", "");
            cpf = cpf.replaceAll("-", "");
        }
        
        
        if(cpf.length() == 11 && cpf.matches("[0-9]*")){
            String []vet = cpf.split("");                        
            
            int digito1 = Integer.parseInt(vet[9]);
            int digito2 = Integer.parseInt(vet[10]);
            
            
            int soma1 = 0;
            int fator1 = 10;
            for(int i=0; i <=8; i++){
                int val = Integer.parseInt(vet[i]);
                soma1 = soma1 + (fator1 * val);                 
                fator1--;                
            }
            
            int resultado1 = (soma1*10)%11;
            if(resultado1==10)
                resultado1 = 0;
            
            if(resultado1 != digito1){
                return false;
            }
            
            
            int soma2 = 0;
            int fator2 = 11;
            for(int i=0; i <= 9; i++){
                int val = Integer.parseInt(vet[i]);
                soma2 = soma2 + (fator2 * val);
                fator2--;
            }
                                   
            int resultado2 = (soma2*10)%11;
            if(resultado2 == 10)
                resultado2 = 0;
            
            if(resultado2 != digito2){
               return false;
            }
            
            
            for(int i=0; i <= 9; i++){
                int val = Integer.parseInt(vet[i]);
                int valProx = Integer.parseInt(vet[i+1]);
                if(val != valProx)
                    return true;
            }
        }
                
        
        return false;
    
    }

    static void jTableShow(JTextArea grd, TMCadImpressora tmCadImpressora, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
