
package model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public abstract class DAO {
        protected String pathArquivo;

    public DAO() {
        this.pathArquivo = "file.csv";
    }    

    public DAO(String pathArquivo) {
        this.pathArquivo = pathArquivo;
    } 
    

    public abstract boolean delete(Object obj);
    
    public abstract Object find(Object obj);
        
    

    protected void save(String texto) {
        FileWriter arq = null;
        try {
            arq = new FileWriter(this.pathArquivo);
            PrintWriter gravaArq = new PrintWriter(arq);
            gravaArq.print(texto);
            arq.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());            
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());                
            }
        }
    }
}
