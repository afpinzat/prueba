package com.uce.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtils {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("mi-unidad-persistencia");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    
}