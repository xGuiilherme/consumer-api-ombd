package restapi.consumer.convertFilme;

import org.springframework.stereotype.Component;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.entities.FilmeModel;
import restapi.consumer.vo.FilmeVO;

@Component
public class FilmeConverter {

    public FilmeModel converteParaFilme(FilmeDTO filmeDTO) {
        var filmeModel = new FilmeModel();
        filmeModel.setTitulo(filmeDTO.getTitle());
        filmeModel.setAno(filmeDTO.getYear());
        filmeModel.setClassificado(filmeDTO.getRated());
        filmeModel.setLancado(filmeDTO.getReleased());
        filmeModel.setTempoDeExecucao(filmeDTO.getRuntime());
        filmeModel.setGenero(filmeDTO.getGenre());
        filmeModel.setDiretor(filmeDTO.getDirector());
        filmeModel.setEscritor(filmeDTO.getWriter());
        filmeModel.setAtores(filmeDTO.getActors());
        filmeModel.setTrama(filmeDTO.getPlot());
        filmeModel.setIdioma(filmeDTO.getLanguage());
        filmeModel.setPais(filmeDTO.getCountry());
        filmeModel.setPremios(filmeDTO.getAwards());
        filmeModel.setPosters(filmeDTO.getPoster());
        return filmeModel;
    }

    public FilmeVO converteParaFilmeVO(FilmeModel filmeModel) {
        var filmeVO = new FilmeVO();
        filmeVO.setTitle(filmeModel.getTitulo());
        filmeVO.setYear(filmeModel.getAno());
        filmeVO.setRated(filmeModel.getClassificado());
        filmeVO.setReleased(filmeModel.getLancado());
        filmeVO.setRuntime(filmeModel.getTempoDeExecucao());
        filmeVO.setGenre(filmeModel.getGenero());
        filmeVO.setDirector(filmeModel.getDiretor());
        filmeVO.setWriter(filmeModel.getEscritor());
        filmeVO.setActors(filmeModel.getAtores());
        filmeVO.setPlot(filmeModel.getTrama());
        filmeVO.setLanguage(filmeModel.getIdioma());
        filmeVO.setCountry(filmeModel.getPais());
        filmeVO.setAwards(filmeModel.getPremios());
        filmeVO.setPoster(filmeModel.getPosters());
        return filmeVO;
    }
}
