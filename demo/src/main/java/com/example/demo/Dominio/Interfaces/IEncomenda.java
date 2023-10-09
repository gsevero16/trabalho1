package com.example.demo.Dominio.Interfaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dominio.Entidades.Encomenda;

public interface IEncomenda {
    List<Encomenda> findAll();
    Encomenda findEncomenda(int id_encomenda);
}
