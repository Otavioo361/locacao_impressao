/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.factory.Database;
import com.mycompany.model.Atendente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class AtendenteDAO implements IDao{
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public AtendenteDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public Integer getAtendenteByEmailAndSenha(String email, String senha){
        sql = " SELECT c "
                + " FROM Atendente c "
                + " WHERE email = :email"
                + " AND senha = :senha ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("email", email);
        qry.setParameter("senha", senha);
        
        List<Atendente> lst = qry.getResultList();

        if (lst.isEmpty()) {
            return 0;
        } else {
            return lst.get(0).getId();
        }
    }

    
    @Override
    public void save(Object obj) {
        Atendente cuidador = (Atendente) obj;
        this.entityManager.getTransaction().begin();
        if (cuidador != null) {
            this.entityManager.merge(cuidador);
        } else {
            this.entityManager.persist(cuidador);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Atendente atendente = (Atendente) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(atendente);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT c "
                + " FROM Atendente c "
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
    
    public List<Atendente> findAll() {
        sql = " SELECT c "
                + " FROM Atendente c ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
}
