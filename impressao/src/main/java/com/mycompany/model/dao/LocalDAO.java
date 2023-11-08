/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;
import com.mycompany.factory.Database;
import com.mycompany.model.Local;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class LocalDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;

    public LocalDAO() {
        entityManager = Database.getInstance().getEntityManager();
    }

    @Override
    public void save(Object obj) {
        Local local = (Local) obj;
        this.entityManager.getTransaction().begin();
        if (local != null) {
            this.entityManager.merge(local);
        } else {
            this.entityManager.persist(local);
        }
        this.entityManager.getTransaction().commit();
    }

    @Override
    public boolean delete(Object obj) {
        Local local = (Local) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(local);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT b "
                + " FROM Local b "
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

    public List<Local> findAll() {
        sql = " SELECT b "
                + " FROM Local b ";

        qry = this.entityManager.createQuery(sql);

        List lst = qry.getResultList();
        return lst;
    }
}

