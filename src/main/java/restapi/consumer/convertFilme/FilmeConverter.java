package restapi.consumer.convertFilme;

import org.springframework.stereotype.Component;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.entities.FilmeModel;
import restapi.consumer.vo.FilmeVO;

@Component
public class FilmeConverter {

    public FilmeModel converteParaFilme(FilmeDTO filmeDTO) {
        var filmeModel = new FilmeModel();
        filmeModel.setTitle(filmeDTO.getTitle());
        filmeModel.setYear(filmeDTO.getYear());
        filmeModel.setGenre(filmeDTO.getGenre());
        return filmeModel;
    }

    public FilmeVO converteParaFilmeVO(FilmeModel filmeModel) {
        var filmeVO = new FilmeVO();
        filmeVO.setTitle(filmeModel.getTitle());
        filmeVO.setYear(filmeModel.getYear());
        filmeVO.setGenre(filmeModel.getGenre());
        return filmeVO;
    }
}
