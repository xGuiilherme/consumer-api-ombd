package restapi.consumer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class SavedFilmeException extends RuntimeException {

    public SavedFilmeException() {
        super("Erro ao salvar, filme já existente !");
    }
}
