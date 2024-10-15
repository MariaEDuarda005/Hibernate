package br.com.hibernate;


import javax.persistence.EntityManager;

// crtl +  alt + o -> tira as importações desnecessarias

public class Main {
    public static void main(String[] args) {

        // Criando o entidy manager
        EntityManager entityManager = JPAUtil.getEntityManager();

       MaterialDAO materialDAO = new MaterialDAO(entityManager);
       Material material = materialDAO.buscarPorID(1);
        System.out.println(material.getNome());
    }
}