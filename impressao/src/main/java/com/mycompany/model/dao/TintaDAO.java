/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;
import com.mycompany.factory.Database;
import com.mycompany.model.Tinta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Otavio
 */
public class TintaDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public TintaDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Tinta tinta = (Tinta) obj;
        this.entityManager.getTransaction().begin();
        if (tinta != null) {
            this.entityManager.merge(tinta);
        } else {
            this.entityManager.persist(tinta);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Tinta tinta = (Tinta) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(tinta);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT a "
                + " FROM Tinta a "
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
    
    public Tinta findByNome(String nome) {
        sql = " SELECT a "
                + " FROM Tinta a "
                + " WHERE nome = :nome ";

        qry = this.entityManager.createQuery(sql);
        qry.setParameter("nome", nome);
        
        List lst = qry.getResultList();
        if (lst.isEmpty()) {
            return null;
        } else {
            return (Tinta) lst.get(0);
        }
    }
 
    public List<Tinta> findAll() {
        sql = " SELECT a "
                + " FROM Tinta a ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
}
