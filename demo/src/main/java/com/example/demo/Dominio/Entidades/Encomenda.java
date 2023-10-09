package com.example.demo.Dominio.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Encomendas")
public class Encomenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int enderecoOrigem;
    int enderecoDestino;
    int peso;

    public Encomenda(){
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnderecoOrigem() {
        return this.enderecoOrigem;
    }

    public void setEnderecoOrigem(int enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }

    public int getEnderecoDestino() {
        return this.enderecoDestino;
    }

    public void setEnderecoDestino(int enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
