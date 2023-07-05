package restapi.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restapi.consumer.convertFilme.FilmeConverter;
import restapi.consumer.dto.FilmeDTO;
import restapi.consumer.exception.SavedFilmeException;
import restapi.consumer.exception.ThemeNoFoundException;
import restapi.consumer.service.FilmeService;
import restapi.consumer.vo.FilmeIMDB;
import restapi.consumer.vo.FilmeVO;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    FilmeService filmeService;

    @Autowired
    FilmeConverter filmeConverter;

    @GetMapping(path = "/omdb/{tema}")
    public ResponseEntity<FilmeIMDB> getFilme(@PathVariable String tema) {
        try {
            FilmeIMDB filmeIMDB = filmeService.getFilme(tema);
            return ResponseEntity.status(HttpStatus.OK).body(filmeIMDB);

        } catch (Exception e) {
            throw new ThemeNoFoundException();
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<FilmeVO> getById(@PathVariable("id") long id) {
        try {
            FilmeVO filmeVO = filmeConverter.converteParaFilmeVO(filmeService.getById(id));
            return ResponseEntity.ok(filmeVO);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping(value = "/")
    public ResponseEntity<FilmeVO> savedFilme(@RequestBody FilmeDTO filmeDTO) {
        try {
            FilmeVO filmeVO = filmeConverter.converteParaFilmeVO(filmeService.save(filmeDTO));
            addHateaos(filmeVO);
            return ResponseEntity.status(HttpStatus.CREATED).body(filmeVO);

        } catch (Exception e) {
            throw new SavedFilmeException();
        }
    }


    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
        filmeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    private void addHateaos(FilmeVO filmeVO) {
        filmeVO.add(linkTo(methodOn(FilmeController.class).getById(filmeVO.getId()))
                .withSelfRel());
    }
}
