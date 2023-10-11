package com.example.demo.Aplicação.DTO;

import java.time.LocalDate;

import com.example.demo.Dominio.Entidades.Encomenda;

public class OrcamentoDTO {
    int id;
    int custoBasico;
    int adicionalPeso;
    Encomenda encomenda;
    int desconto;
    int imposto;
    int custoFinal;
    LocalDate dataSimulacao;

    public OrcamentoDTO(int id, int custoBasico, int adicionalPeso, Encomenda encomenda, int desconto, int imposto, int custoFinal, LocalDate dataSimulacao) {
        this.id = id;
        this.custoBasico = custoBasico;
        this.adicionalPeso = adicionalPeso;
        this.encomenda = encomenda;
        this.desconto = desconto;
        this.imposto = imposto;
        this.custoFinal = custoFinal;
        this.dataSimulacao = dataSimulacao;
    }
}
