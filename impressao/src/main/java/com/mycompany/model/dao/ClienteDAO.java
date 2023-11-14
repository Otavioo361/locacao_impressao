/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.factory.Database;
import com.mycompany.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;



/**
 *
 * @author Otavio
 */
public class ClienteDAO implements IDao{
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public ClienteDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public Integer getProprietarioByEmailAndSenha(String email, String senha){
        sql = " SELECT p "
                + " FROM Cliente p "
                + " WHERE email = :email"
                + " AND senha = :senha ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("email", email);
        qry.setParameter("senha", senha);
        
        List<Cliente> lst = qry.getResultList();

        if (lst.isEmpty()) {
            return 0;
        } else {
            return lst.get(0).getId();
        }
    }

    
    @Override
    public void save(Object obj) {
        Cliente cliente = (Cliente) obj;
        this.entityManager.getTransaction().begin();
        if (cliente != null) {
            this.entityManager.merge(cliente);
        } else {
            this.entityManager.persist(cliente);
        }
        this.entityManager.getTransaction().commit();
        this.entityManager.clear();
    }

    
    @Override
    public boolean delete(Object obj) {
        Cliente cliente = (Cliente) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(cliente);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT p "
                + " FROM Cliente p "
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
        
    public List<Cliente> findAll() {
        sql = " SELECT p "
                + " FROM Cliente p ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }

    public void update(Cliente novoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
