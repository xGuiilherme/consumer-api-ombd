package restapi.consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class FilmeDTO {

    @NotBlank
    @JsonProperty("Title")
    private String title;
    @NotBlank
    @JsonProperty("Year")
    private String year;
    @NotBlank
    @JsonProperty("Rated")
    private String rated;
    @NotBlank
    @JsonProperty("Released")
    private String released;
    @NotBlank
    @JsonProperty("Runtime")
    private String runtime;
    @NotBlank
    @JsonProperty("Genre")
    private String genre;
    @NotBlank
    @JsonProperty("Director")
    private String director;
    @NotBlank
    @JsonProperty("Writer")
    private String writer;
    @NotBlank
    @JsonProperty("Actors")
    private String actors;
    @NotBlank
    @JsonProperty("Plot")
    private String plot;
    @NotBlank
    @JsonProperty("Language")
    private String language;
    @NotBlank
    @JsonProperty("Country")
    private String country;
    @NotBlank
    @JsonProperty("Awards")
    private String awards;
    @NotBlank
    @JsonProperty("Poster")
    private String poster;
}
