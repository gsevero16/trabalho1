package com.example.demo.Aplicação.Serviços;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Aplicação.DTO.EncomendaDTO;
import com.example.demo.Aplicação.DTO.OrcamentoDTO;
import com.example.demo.Dominio.Entidades.*;
import com.example.demo.Infraestrutura.Interfaces.IEncomendaRepositorio;
import com.example.demo.Infraestrutura.Interfaces.IOrcamentoRepositorio;

@Service
public class OrcamentoService {
    private IEncomendaRepositorio ie;
    private IOrcamentoRepositorio io;
    
    public OrcamentoService(IEncomendaRepositorio ie, IOrcamentoRepositorio io){
        this.ie = ie;
        this.io = io;
    }

    public Orcamento calculaOrcamento(OrcamentoDTO oDto){
        return null;
    }

    
}
