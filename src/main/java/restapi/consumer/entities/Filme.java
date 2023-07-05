package restapi.consumer.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(length = 50)
    private String title;
    @NotBlank
    @Column(length = 5)
    private String years;
    @NotBlank
    @Column(length = 10)
    private String rated;
    @NotBlank
    @Column(length = 12)
    private String released;
    @NotBlank
    @Column(length = 8)
    private String runtime;
    @NotBlank
    @Column(length = 50)
    private String genre;
    @NotBlank
    @Column(length = 50)
    private String director;
    @NotBlank
    @Column(length = 50)
    private String writer;
    @NotBlank
    @Column(length = 100)
    private String actors;
    @NotBlank
    @Column(length = 254)
    private String plot;
    @NotBlank
    @Column(length = 50)
    private String language;
    @NotBlank
    @Column(length = 50)
    private String country;
    @NotBlank
    @Column(length = 100)
    private String awards;
    @NotBlank
    @Column(length = 254)
    private String poster;
}
