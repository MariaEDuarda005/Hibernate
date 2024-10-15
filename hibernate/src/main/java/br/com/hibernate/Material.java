package br.com.hibernate;

import javax.persistence.*;
import java.time.LocalDate;

// relação do java com as tabelas do banco de dados

@Entity
@Table(name = "TbMateriaisIndiretos")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String fornecedor;

    private int quantidade;

    private LocalDate dataCadastro = LocalDate.now();

    @ManyToOne
    private Categoria categoria;


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

    public String getFornecedor() {
      return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
      this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
      return quantidade;
    }

    public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Material(MaterialDTO materialDTO) {
      this.nome = materialDTO.nome();
      this.fornecedor = materialDTO.fornecedor();
      this.quantidade = materialDTO.quantidade();
      this.categoria = materialDTO.categoria();
    }

    // merge precisa de um construtor padrão
    public Material(){
        // aqui é um construtor padrão
    }
}
