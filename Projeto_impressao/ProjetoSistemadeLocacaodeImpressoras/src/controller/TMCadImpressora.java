
package controller;

import java.util.List;
import model.Impressora;


public class TMCadImpressora {
    private List<Impressora> lista;
    
    private final int COL_NOMEIMPRESSORA = 0;   
    private final int COL_NUMERODESERIE = 1;    
      

    public TMCadImpressora(List<Impressora> lstImpressoras) {        
        lista = lstImpressoras;        
    }

  
    public int getRowCount() {
        return lista.size();
    }


    public int getColumnCount() {
        return 2;
    }

   
    public Object getValueAt(int rowIndex, int columnIndex) {               
       Impressora aux = new Impressora();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = lista.get(rowIndex);

            
            switch (columnIndex) {
                case -1:
                    return aux;
                case COL_NOMEIMPRESSORA:
                    return aux.getNomeImpressora();
                case COL_NUMERODESERIE:
                    return aux.getNumeroDeSerie();               
                default: 
                    break;
            }
        }
        return aux;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

 
    public String getColumnName(int column) {
        
        switch (column) {
            case COL_NOMEIMPRESSORA:
                return "Name";
            case COL_NUMERODESERIE:
                return "Numero de Serie";

            
            default:
                break;
        }

        return "";
    }

    
    public Class getColumnClass(int columnIndex) {

        
        return String.class;
    }

    
}
