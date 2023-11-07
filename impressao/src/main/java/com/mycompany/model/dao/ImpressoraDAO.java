/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.factory.Database;
import com.mycompany.model.Impressora;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class ImpressoraDAO {
     private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public ImpressoraDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Impressora equino = (Impressora) obj;
        this.entityManager.getTransaction().begin();
        if (equino != null) {
            System.out.println("AQUI AQUI AQUI");
            this.entityManager.merge(equino);
        } else {
            this.entityManager.persist(equino);
        }
        this.entityManager.getTransaction().commit();
        this.entityManager.clear();
    }

    
    @Override
    public boolean delete(Object obj) {
        Impressora impressora = (Impressora) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(impressora);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT e "
                + " FROM Impressora e "
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
    
    public List<Impressora> findAll() {
        sql = " SELECT e "
                + " FROM Impressora e ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
    public List<Object[]> getLeftJoinAlimentos(){
        sql = " SELECT e.id, e.nome, a.id, a.nome FROM impressora e "
                + " LEFT JOIN equino_alimento ea ON e.id = ea.equino_id "
                + "JOIN alimento a ON ea.alimento_id = a.id ";

        qry = this.entityManager.createNativeQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
    public List<Object[]> getLeftJoinServicoAdicional(){
        sql = " SELECT e.id, e.nome, s.servico_adicional_id, s.servico, es.qtd FROM equino e " +
                " LEFT JOIN equino_servico es ON e.id = es.equino_id " +
                " JOIN servicoadicional s ON es.servico_adicional_id = s.servico_adicional_id ";

        qry = this.entityManager.createNativeQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
    public void deleteRelacionamentoAlimentos(Integer equino_id, Integer alimento_id){
        System.err.println(equino_id);
        System.err.println(alimento_id);
        this.entityManager.getTransaction().begin();
        sql = " DELETE FROM equino_alimento "
                + " WHERE equino_id = (?1)"
                + " AND alimento_id = (?2)";
        
        
        this.entityManager.createNativeQuery(sql).setParameter(1, equino_id).setParameter(2, alimento_id).executeUpdate();
        this.entityManager.getTransaction().commit();
    }
    
    public void deleteRelacionamentoServicos(Integer equino_id, Integer servico_id){
        this.entityManager.getTransaction().begin();
        sql = " DELETE FROM impressora_servico "
                + " WHERE equino_id = (?1)"
                + " AND servico_adicional_id = (?2)";
        
        
        this.entityManager.createNativeQuery(sql).setParameter(1, equino_id).setParameter(2, servico_id).executeUpdate();
        this.entityManager.getTransaction().commit();
    }
}
