/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;
import com.mycompany.factory.Database;
import com.mycompany.model.ServicoAdicional;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
/**
 *
 * @author Otavio
 */
public class ServicoAdicionalDAO implements IDao {
     private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public ServicoAdicionalDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        ServicoAdicional servicoAdicional = (ServicoAdicional) obj;
        this.entityManager.getTransaction().begin();
        if (servicoAdicional != null) {
            this.entityManager.merge(servicoAdicional);
        } else {
            this.entityManager.persist(servicoAdicional);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        ServicoAdicional servicoAdicional = (ServicoAdicional) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(servicoAdicional);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT s "
                + " FROM ServicoAdicional s "
                + " WHERE id = :id ";

        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
    
    public List<ServicoAdicional> findAll() {
        sql = " SELECT s "
                + " FROM ServicoAdicional s ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
}
