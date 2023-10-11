package com.example.demo.Aplicação.DTO;

public class EncomendaDTO {
    int id;

    int enderecoOrigem;

    int enderecoDestino;

    int peso;

    public EncomendaDTO(int id, int enderecoOrigem, int enderecoDestino, int peso){
        this.id = id;
        this.enderecoOrigem = enderecoOrigem;
        this.enderecoDestino = enderecoDestino;
        this.peso = peso;
    }
}
