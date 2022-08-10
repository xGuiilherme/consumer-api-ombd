package restapi.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import restapi.consumer.client.FilmeWebClient;
import restapi.consumer.convertFilme.FilmeConverter;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.entities.FilmeModel;
import restapi.consumer.repository.FilmeRepository;
import restapi.consumer.vo.FilmeOMDB;

@Service
public class FilmeService {

    @Value("${imdb.apikey}")
    String apiKey;
    @Autowired
    FilmeWebClient filmeWebClient;
    @Autowired
    FilmeRepository filmeRepository;
    @Autowired
    FilmeConverter filmeConverter;

    public FilmeOMDB getFilme(String tema) {
        return filmeWebClient.getFilme(tema, apiKey);
    }

    public FilmeModel save(FilmeDTO filmeDTO) {
        FilmeModel filmeModel = filmeConverter.converteParaFilme(filmeDTO);
        return filmeRepository.save(filmeModel);
    }

    public FilmeModel getById(Long id) {
        return filmeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Filme no found."));
    }
}
