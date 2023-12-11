/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.factory.Database;
import com.mycompany.model.Login;
import com.mycompany.model.Pessoa;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.Query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Otavio
 */
public class LoginDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public LoginDao(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public void save(Login login){
        this.entityManager.getTransaction().begin();
        if(login != null && login.getId() > 0){
            this.entityManager.merge(login);
        }else{
            this.entityManager.persist(login);
        }
        this.entityManager.getTransaction().commit();
    }
    
    public void delete(Login login){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(login);
        this.entityManager.getTransaction().commit();
    }
    
    public Pessoa find(String email, String senha){
        sql = " SELECT l "
                + " FROM Pessoa l "
                + " WHERE email LIKE :email "
                + " AND senha LIKE :senha ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("email", email);
        qry.setParameter("senha", senha);
        
        List lst = qry.getResultList();
        if(lst.isEmpty()){
            return null;
        }else{
            return (Pessoa) lst.get(0);
        }
    }
}
