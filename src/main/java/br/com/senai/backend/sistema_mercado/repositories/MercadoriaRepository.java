package br.com.senai.backend.sistema_mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;

public interface MercadoriaRepository extends JpaRepository<Mercadoria, Integer> {
    
}
