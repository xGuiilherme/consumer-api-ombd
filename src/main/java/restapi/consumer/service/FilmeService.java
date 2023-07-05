package restapi.consumer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import restapi.consumer.client.FilmeWebClient;
import restapi.consumer.convertFilme.FilmeConverter;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.entities.Filme;
import restapi.consumer.repository.FilmeRepository;
import restapi.consumer.vo.FilmeIMDB;

@RequiredArgsConstructor
@Service
public class FilmeService {

    @Value("${imdb.apikey}")
    String apiKey;

    private final FilmeWebClient filmeWebClient;
    private final FilmeRepository filmeRepository;
    private final FilmeConverter filmeConverter;

    public FilmeIMDB getFilme(String tema) {
        return filmeWebClient.getFilme(tema, apiKey);
    }

    public Filme getById(Long id) {
        return filmeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Filme not found."));
    }

    public Filme save(FilmeDTO filmeDTO) {
        Filme filme = filmeConverter.converteParaFilme(filmeDTO);
        return filmeRepository.save(filme);
    }

    public void delete(Long id) {
        filmeRepository.findById(id);
    }
}
