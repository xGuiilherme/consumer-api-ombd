package restapi.consumer.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class FilmeVO extends RepresentationModel<FilmeVO> {

    @NotBlank
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String years;
    @NotBlank
    private String rated;
    @NotBlank
    private String released;
    @NotBlank
    private String runtime;
    @NotBlank
    private String genre;
    @NotBlank
    private String director;
    @NotBlank
    private String writer;
    @NotBlank
    private String actors;
    @NotBlank
    private String plot;
    @NotBlank
    private String language;
    @NotBlank
    private String country;
    @NotBlank
    private String awards;
    @NotBlank
    private String poster;
}
