package br.com.hibernate;

import javax.persistence.EntityManager;

public class MaterialDAO {

    private EntityManager entityManager;

    public MaterialDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void cadastrar(Material material){
        this.entityManager.persist(material);
    }

    public void atualizar(Material material){
        this.entityManager.merge(material);
    }

    public void remover(Material material){
        material = entityManager.merge(material); // voltar ao estado
        this.entityManager.remove(material);
    }

    public Material buscarPorID(int id){
        return this.entityManager.find(Material.class, id);
    }
}
