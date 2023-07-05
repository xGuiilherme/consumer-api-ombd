package restapi.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import restapi.consumer.vo.FilmeIMDB;

@FeignClient(value = "omdbFilmes", url = "http://www.omdbapi.com/")
public interface FilmeWebClient {

    @RequestMapping(method = RequestMethod.GET)
    FilmeIMDB getFilme(@RequestParam("t") String tema, @RequestParam("apiKey") String key);
}
