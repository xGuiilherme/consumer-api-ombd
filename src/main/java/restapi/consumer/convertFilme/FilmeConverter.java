package restapi.consumer.convertFilme;

import org.springframework.stereotype.Component;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.model.FilmeModel;
import restapi.consumer.vo.FilmeVO;

@Component
public class FilmeConverter {

    public FilmeModel converteParaFilme(FilmeDTO filmeDTO) {
        var filmeModel = new FilmeModel();
        filmeModel.setTitulo(filmeDTO.getTitle());
        filmeModel.setAno(filmeDTO.getYear());
        filmeModel.setGenero(filmeDTO.getGenre());
        return filmeModel;
    }

    public FilmeVO converteParaFilmeVO(FilmeModel filmeModel) {
        var filmeVO = new FilmeVO();
        filmeVO.setTitle(filmeModel.getTitulo());
        filmeVO.setYear(filmeModel.getAno());
        filmeVO.setGenre(filmeModel.getGenero());
        return filmeVO;
    }
}
