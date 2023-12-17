/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.dao;

import com.ifmg.projeto_impressora.factory.Database;
import com.ifmg.projeto_impressora.model.Fornecedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class FornecedorDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;

    public FornecedorDAO() {
        entityManager = Database.getInstance().getEntityManager();
    }

    @Override
    public void save(Object obj) {
        Fornecedor fornecedor = (Fornecedor) obj;
        this.entityManager.getTransaction().begin();
        if (fornecedor != null) {
            this.entityManager.merge(fornecedor);
        } else {
            this.entityManager.persist(fornecedor);
        }
        this.entityManager.getTransaction().commit();
    }

    @Override
    public boolean delete(Object obj) {
        Fornecedor fornecedor = (Fornecedor) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(fornecedor);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT a "
                + " FROM Fornecedor a "
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

    public Fornecedor findByNome(String nome) {
        sql = " SELECT a "
                + " FROM Fornecedor a "
                + " WHERE nome = :nome ";

        qry = this.entityManager.createQuery(sql);
        qry.setParameter("nome", nome);

        List lst = qry.getResultList();
        if (lst.isEmpty()) {
            return null;
        } else {
            return (Fornecedor) lst.get(0);
        }
    }

    public List<Fornecedor> findAll() {
        sql = " SELECT a "
                + " FROM Fornecedor a ";

        qry = this.entityManager.createQuery(sql);

        List lst = qry.getResultList();
        return lst;
    }

}
