package br.com.hibernate;

import javax.persistence.EntityManager;

public class CategoriaDAO {

    private EntityManager entityManager;

    public CategoriaDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void cadastrar(Categoria categoria){
        this.entityManager.persist(categoria);
    }

    public void atualizar(Categoria categoria){
        this.entityManager.merge(categoria);
    }

    public void remover(Categoria categoria){
        categoria = entityManager.merge(categoria); // voltar ao estado
        this.entityManager.remove(categoria);
    }
}
