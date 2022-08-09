package restapi.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import restapi.consumer.convertFilme.FilmeConverter;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.mapJson.FilmeJson;
import restapi.consumer.client.FilmeClient;
import restapi.consumer.model.FilmeModel;
import restapi.consumer.repository.FilmeRepository;

@Service
public class FilmeService {

    @Value("${imdb.apikey}")
    private String apikey;
    @Autowired
    private FilmeClient filmeClient;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeConverter filmeConverter;

    public FilmeJson getFilme(String tema) {
        return filmeClient.getFilme(tema, apikey);
    }

    public FilmeModel save(FilmeDTO filmeDTO) {
        FilmeModel filmeModel = filmeConverter.converteParaFilme(filmeDTO);
        return filmeRepository.save(filmeModel);
    }
}
