/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.dao;

import com.ifmg.projeto_impressora.factory.Database;
import com.ifmg.projeto_impressora.model.Fatura;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class FaturaDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;

    public FaturaDAO() {
        entityManager = Database.getInstance().getEntityManager();
    }

    public Object[] getTotalvalorFaturaFornecedorPorProprietario(Integer id,
            LocalDate dataIni, LocalDate dataFim) {
        sql = " SELECT pes.id, pes.nome, SUM(a.preco) as TOTAL_FORNECEDOR FROM pessoa pes " +
                " JOIN proprietario p ON pes.id = p.id " +
                " JOIN impressora e ON p.id = e.proprietario_id " +
                " JOIN impressora_fornecedor ea ON e.id = ea.impressora_id " +
                " JOIN fornecedor a ON ea.fornecedor_id = a.id " +
                " WHERE p.id = (?1) AND (a.timestamp BETWEEN (?2) AND (?3) ) " +
                " GROUP BY p.id ";

        qry = this.entityManager.createNativeQuery(sql).setParameter(1, id).setParameter(2, asDate(dataIni))
                .setParameter(3, asDate(dataFim));

        List<Object[]> lst = qry.getResultList();

        if (lst.isEmpty())
            return null;

        return lst.get(0);
    }

    public Object[] getTotalvalorFaturaServicoPorProprietario(Integer id,
            LocalDate dataIni, LocalDate dataFim) {
        sql = " SELECT pes.id, pes.nome, SUM(es.qtd*s.preco) as TOTAL_SERVICO FROM pessoa pes " +
                " JOIN proprietario p ON pes.id = p.id " +
                " JOIN impressora e ON p.id = e.proprietario_id " +
                " JOIN impressora_servico es ON e.id = es.impressora_id " +
                " JOIN servicoadicional s ON s.servico_adicional_id = es.servico_adicional_id " +
                " WHERE p.id = (?1) AND (es.timestamp BETWEEN (?2) AND (?3) ) " +
                " GROUP BY p.id ";

        qry = this.entityManager.createNativeQuery(sql).setParameter(1, id).setParameter(2, dataIni).setParameter(3,
                dataFim);

        List<Object[]> lst = qry.getResultList();

        if (lst.isEmpty())
            return null;

        return lst.get(0);
    }

    private static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    @Override
    public void save(Object obj) {
        Fatura fatura = (Fatura) obj;
        this.entityManager.getTransaction().begin();
        if (fatura != null) {
            this.entityManager.merge(fatura);
        } else {
            this.entityManager.persist(fatura);
        }
        this.entityManager.getTransaction().commit();
    }

    @Override
    public boolean delete(Object obj) {
        Fatura fatura = (Fatura) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(fatura);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT f "
                + " FROM Fatura f "
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

    public List<Fatura> findAll() {
        sql = " SELECT f "
                + " FROM Fatura f ";

        qry = this.entityManager.createQuery(sql);

        List lst = qry.getResultList();
        return lst;
    }
}
