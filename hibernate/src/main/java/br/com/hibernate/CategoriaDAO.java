package br.com.hibernate;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDAO {

    private EntityManager entityManager;

    public CategoriaDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void cadastrar(Categoria categoria){
        entityManager.getTransaction().begin();
        this.entityManager.persist(categoria);
        entityManager.getTransaction().commit();
    }

    public void atualizar(Categoria categoria){
        entityManager.getTransaction().begin();
        this.entityManager.merge(categoria);
        entityManager.getTransaction().commit();
    }

    public void remover(Categoria categoria){
        entityManager.getTransaction().begin();
        categoria = entityManager.merge(categoria); // voltar ao estado
        this.entityManager.remove(categoria);
        entityManager.getTransaction().commit();
    }

    public List<Categoria> lerDadosTabela(){
        String jpql = "SELECT c FROM Categoria c";
        return entityManager.createQuery(jpql, Categoria.class).getResultList();

    }
}
