/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;
import com.mycompany.factory.Database;
import com.mycompany.model.Administrador;
import com.mycompany.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Otavio
 */
public class AdministradorDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public AdministradorDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    //adicionado esse metodo para utilizar no autenticadorLoginController
    public Integer getClienteByEmailAndSenha(String email, String senha){
        sql = " SELECT p "
                + " FROM Administardor a "
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
        Administrador admin = (Administrador) obj;
        this.entityManager.getTransaction().begin();
        if (admin != null) {
            this.entityManager.merge(admin);
        } else {
            this.entityManager.persist(admin);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Administrador admin = (Administrador) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(admin);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT a "
                + " FROM Administrador a "
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
    
    public List<Administrador> findAll() {
        sql = " SELECT a "
                + " FROM Administrador a ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    public Administrador findByCpf(String cpf){
        
        for(Administrador b: this.findAll()){
            if(b.getCpf().equals(cpf))
                return b;
        }
        
        return null;
    }

    public void update(Administrador novoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
