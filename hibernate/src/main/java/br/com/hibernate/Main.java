package br.com.hibernate;


import javax.persistence.EntityManager;

// crtl +  alt + o -> tira as importações desnecessarias

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManager();

        MaterialDAO materialDAO = new MaterialDAO(entityManager);


        var buscarPorFornecedorPorNome = materialDAO.buscarPorFornecedorPorNome("Caneta");
        System.out.println(buscarPorFornecedorPorNome);

        entityManager.close();

    }
}