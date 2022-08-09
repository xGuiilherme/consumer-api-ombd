package restapi.consumer.vo;

import lombok.Data;

@Data
public class FilmeVO extends ReprentationModel<FilmeVO> {

    private Long id;

    private String title;

    private String year;

    private String genre;
}
