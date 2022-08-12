package restapi.consumer.convertFilme;

import org.springframework.stereotype.Component;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.entities.Filme;
import restapi.consumer.vo.FilmeVO;

@Component
public class FilmeConverter {

    public Filme converteParaFilme(FilmeDTO filmeDTO) {
        var filme = new Filme();
        filme.setTitle(filmeDTO.getTitle());
        filme.setYears(filmeDTO.getYear());
        filme.setRated(filmeDTO.getRated());
        filme.setReleased(filmeDTO.getReleased());
        filme.setRuntime(filmeDTO.getRuntime());
        filme.setGenre(filmeDTO.getGenre());
        filme.setDirector(filmeDTO.getDirector());
        filme.setWriter(filmeDTO.getWriter());
        filme.setActors(filmeDTO.getActors());
        filme.setPlot(filmeDTO.getPlot());
        filme.setLanguage(filmeDTO.getLanguage());
        filme.setCountry(filmeDTO.getCountry());
        filme.setAwards(filmeDTO.getAwards());
        filme.setPoster(filmeDTO.getPoster());
        return filme;
    }

    public FilmeVO converteParaFilmeVO(Filme filme) {
        var filmeVO = new FilmeVO();
        filmeVO.setTitle(filme.getTitle());
        filmeVO.setYears(filme.getYears());
        filmeVO.setRated(filme.getRated());
        filmeVO.setReleased(filme.getReleased());
        filmeVO.setRuntime(filme.getRuntime());
        filmeVO.setGenre(filme.getGenre());
        filmeVO.setDirector(filme.getDirector());
        filmeVO.setWriter(filme.getWriter());
        filmeVO.setActors(filme.getActors());
        filmeVO.setPlot(filme.getPlot());
        filmeVO.setLanguage(filme.getLanguage());
        filmeVO.setCountry(filme.getCountry());
        filmeVO.setAwards(filme.getAwards());
        filmeVO.setPoster(filme.getPoster());
        return filmeVO;
    }
}
