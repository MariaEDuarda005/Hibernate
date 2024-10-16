package br.com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "tbcategorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    // GETTERS, SETTERS E CONSTRUTOR

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(){
        // construtor padrão
    }
}
