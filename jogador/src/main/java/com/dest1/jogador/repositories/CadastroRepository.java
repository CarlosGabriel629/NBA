package com.dest1.jogador.repositories;

import com.dest1.jogador.entity.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro,Integer> {
}
