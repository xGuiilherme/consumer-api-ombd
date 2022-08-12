package restapi.consumer.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@RequiredArgsConstructor
public class FilmeVO extends RepresentationModel<FilmeVO> {

    private Long id;
    private String title;
    private String years;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;
}
