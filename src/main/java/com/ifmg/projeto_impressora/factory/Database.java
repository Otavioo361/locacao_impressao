/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.factory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Otavio
 */
public class Database {
    private static Database INSTANCE = null;
    
    private EntityManager entityManager;
    
    private Database(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("projetoimp");
        this.entityManager = factory.createEntityManager();
    }
    
    public EntityManager getEntityManager(){
        return this.entityManager;
    }
    
    public static Database getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Database();
        }
        return INSTANCE;
    }
}
