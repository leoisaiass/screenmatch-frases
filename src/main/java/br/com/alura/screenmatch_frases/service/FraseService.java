package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFrases() {
        var frase = repositorio.fraseAleatoria();
        return new FraseDTO(frase.getFrase(), frase.getPersonagem(), frase.getTitulo(), frase.getPoster());
    }
}
