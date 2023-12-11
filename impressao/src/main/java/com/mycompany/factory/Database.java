/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Otavio
 */
public class Database {
    private static Database INSTANCE = null;
    
    private EntityManager entityManager;
    
    private Database(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("impressoralps");
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
