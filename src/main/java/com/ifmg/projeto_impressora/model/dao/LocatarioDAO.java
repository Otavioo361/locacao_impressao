/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.dao;

import com.ifmg.projeto_impressora.factory.Database;
import com.ifmg.projeto_impressora.model.Tecnico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class LocatarioDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;

    public LocatarioDAO() {
        entityManager = Database.getInstance().getEntityManager();
    }

    public Integer getTecnicoByEmailAndSenha(String email, String senha) {
        sql = " SELECT c "
                + " FROM Tecnico c "
                + " WHERE email = :email"
                + " AND senha = :senha ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("email", email);
        qry.setParameter("senha", senha);

        List<Tecnico> lst = qry.getResultList();

        if (lst.isEmpty()) {
            return 0;
        } else {
            return lst.get(0).getId();
        }
    }

    @Override
    public void save(Object obj) {
        Tecnico tecnico = (Tecnico) obj;
        this.entityManager.getTransaction().begin();
        if (tecnico != null) {
            this.entityManager.merge(tecnico);
        } else {
            this.entityManager.persist(tecnico);
        }
        this.entityManager.getTransaction().commit();
    }

    @Override
    public boolean delete(Object obj) {
        Tecnico tecnico = (Tecnico) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(tecnico);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT c "
                + " FROM Tecnico c "
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

    public List<Tecnico> findAll() {
        sql = " SELECT c "
                + " FROM Tecnico c ";

        qry = this.entityManager.createQuery(sql);

        List lst = qry.getResultList();
        return lst;
    }
}
