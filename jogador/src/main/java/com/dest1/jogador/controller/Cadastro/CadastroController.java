package com.dest1.jogador.controller.Cadastro;

import com.dest1.jogador.entity.Cadastro;
import com.dest1.jogador.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/jogadores")
public class CadastroController {

    @Autowired
    private CadastroRepository cadastroRepository;

    @PostMapping
    public Cadastro cadastrar (@RequestBody Cadastro cadastro){
        return cadastroRepository.save(cadastro);
    }

    @GetMapping
    public List<Cadastro> cadastrar (@RequestParam String nome){
        return cadastroRepository.findAll();
    }





}
