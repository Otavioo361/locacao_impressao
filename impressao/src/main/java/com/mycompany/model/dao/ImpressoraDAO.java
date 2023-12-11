/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.dao;

import com.mycompany.factory.Database;
import com.mycompany.model.Impressora;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Otavio
 */
public class ImpressoraDAO implements IDao{
     private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public ImpressoraDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Impressora impressora = (Impressora) obj;
        this.entityManager.getTransaction().begin();
        if (impressora != null) {
            System.out.println("AQUI AQUI AQUI");
            this.entityManager.merge(impressora);
        } else {
            this.entityManager.persist(impressora);
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
                + "JOIN tinta a ON ea.tinta_id = a.id ";

        qry = this.entityManager.createNativeQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
    public List<Object[]> getLeftJoinServicoAdicional(){
        sql = " SELECT e.id, e.nome, s.servico_adicional_id, s.servico, es.qtd FROM impressora e " +
                " LEFT JOIN equino_servico es ON e.id = es.equino_id " +
                " JOIN servicoadicional s ON es.servico_adicional_id = s.servico_adicional_id ";

        qry = this.entityManager.createNativeQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
    public void deleteRelacionamentoAlimentos(Integer impressora_id, Integer tinta_id){
        System.err.println(impressora_id);
        System.err.println();
        this.entityManager.getTransaction().begin();
        sql = " DELETE FROM impressora_tinta "
                + " WHERE impressora_id = (?1)"
                + " AND tinta_id = (?2)";
        
        
        this.entityManager.createNativeQuery(sql).setParameter(1, impressora_id).setParameter(2, tinta_id).executeUpdate();
        this.entityManager.getTransaction().commit();
    }
    
    public void deleteRelacionamentoServicos(Integer impressora_id, Integer servico_id){
        this.entityManager.getTransaction().begin();
        sql = " DELETE FROM impressora_servico "
                + " WHERE impressora_id = (?1)"
                + " AND servico_adicional_id = (?2)";
        
        
        this.entityManager.createNativeQuery(sql).setParameter(1, impressora_id).setParameter(2, servico_id).executeUpdate();
        this.entityManager.getTransaction().commit();
    }
}
