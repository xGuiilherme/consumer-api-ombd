package restapi.consumer.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String title;

    @Column(length = 5)
    private String years;

    @Column(length = 10)
    private String rated;

    @Column(length = 12)
    private String released;

    @Column(length = 8)
    private String runtime;

    @Column(length = 50)
    private String genre;

    @Column(length = 50)
    private String director;

    @Column(length = 50)
    private String writer;

    @Column(length = 100)
    private String actors;

    @Column(length = 254)
    private String plot;

    @Column(length = 50)
    private String language;

    @Column(length = 50)
    private String country;

    @Column(length = 100)
    private String awards;

    @Column(length = 254)
    private String poster;
}
