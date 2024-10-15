package br.com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    // Está maiusculo pois é uma regra de nomeação para constante
    private static final EntityManagerFactory FACTORY =
            Persistence.createEntityManagerFactory("Almoxarifado");

    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
