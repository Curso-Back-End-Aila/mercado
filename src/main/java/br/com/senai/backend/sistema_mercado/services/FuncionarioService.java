package br.com.senai.backend.sistema_mercado.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senai.backend.sistema_mercado.models.Funcionario;
import br.com.senai.backend.sistema_mercado.repositories.FuncionarioRepository;

public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funcionarioRepo;

    public Funcionario cadastrar(Funcionario mercadoria) {
        return  funcionarioRepo.save(mercadoria);
    }

    public Funcionario recuperarPorId(Integer id) {
        return  funcionarioRepo.getById(id);
    }
    
}
