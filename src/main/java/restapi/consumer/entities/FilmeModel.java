package restapi.consumer.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "filmes")
public class FilmeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 5)
    private String ano;

    @Column(nullable = false, length = 10)
    private String classificado;

    @Column(nullable = false, length = 12)
    private String lancado;

    @Column(nullable = false, length = 8)
    private String tempoDeExecucao;

    @Column(nullable = false, length = 50)
    private String genero;

    @Column(nullable = false, length = 50)
    private String diretor;

    @Column(nullable = false, length = 50)
    private String escritor;

    @Column(nullable = false, length = 100)
    private String atores;

    @Column(nullable = false, length = 254)
    private String trama;

    @Column(nullable = false, length = 50)
    private String idioma;

    @Column(nullable = false, length = 50)
    private String pais;

    @Column(nullable = false, length = 100)
    private String premios;

    @Column(nullable = false, length = 254)
    private String posters;
}
