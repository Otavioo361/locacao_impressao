/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.dao;

import com.ifmg.projeto_impressora.factory.Database;
import com.ifmg.projeto_impressora.model.Administrador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class AdministradorDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;

    public AdministradorDAO() {
        entityManager = Database.getInstance().getEntityManager();
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

    public List<Object> findAll() {
        sql = " SELECT a "
                + " FROM Administrador a ";

        qry = this.entityManager.createQuery(sql);

        List lst = qry.getResultList();
        return lst;
    }
}
