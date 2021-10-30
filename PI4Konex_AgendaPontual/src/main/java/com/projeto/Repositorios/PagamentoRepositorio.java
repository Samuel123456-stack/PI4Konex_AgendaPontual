package com.projeto.Repositorios;

import com.projeto.Entidades.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositorio extends JpaRepository<Pagamento,Integer> {
    
}
