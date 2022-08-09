package restapi.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import restapi.consumer.client.FilmeClient;
import restapi.consumer.convertFilme.FilmeConverter;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.model.FilmeModel;
import restapi.consumer.repository.FilmeRepository;
import restapi.consumer.vo.FilmeJson;

@Service
public class FilmeService {

    @Value("${imdb.apikey}")
    String apiKey;
    @Autowired
    FilmeClient filmeClient;
    @Autowired
    FilmeRepository filmeRepository;
    @Autowired
    FilmeConverter filmeConverter;

    public FilmeJson getFilme(String tema) {
        return filmeClient.getFilme(tema, apiKey);
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
