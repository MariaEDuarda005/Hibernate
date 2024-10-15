package br.com.hibernate;

public record MaterialDTO(String nome,
                          String fornecedor,
                          int quantidade,
                          Categoria categoria) {
}