package restapi.consumer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ThemeNoFoundException extends RuntimeException {
    public ThemeNoFoundException() {
        super("Não foi possível buscar o filme, senha de acesso inválida !");
    }
}
