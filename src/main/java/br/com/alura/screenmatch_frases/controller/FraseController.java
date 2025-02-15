package br.com.alura.screenmatch_frases.controller;

import br.com.alura.screenmatch_frases.dto.SerieDTO;
import br.com.alura.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/frases")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping()
    public SerieDTO obterFrases() {
        return servico.obterFrases();
    }
}
