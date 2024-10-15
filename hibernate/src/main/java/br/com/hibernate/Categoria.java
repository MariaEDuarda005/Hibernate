package br.com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "tbcategorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoria;

    // GETTERS, SETTERS E CONSTRUTOR

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Categoria(String categoria) {
        this.categoria = categoria;
    }

    public Categoria(){
        // construtor padrão
    }
}
