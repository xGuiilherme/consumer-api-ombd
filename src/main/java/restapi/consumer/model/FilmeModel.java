package restapi.consumer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class FilmeModel {

    @Id
    private Long id;

    private String titulo;

    private String ano;

    private String genero;
}
