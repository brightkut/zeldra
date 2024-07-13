#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.handler;

import ${package}.exception.NotImplementException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({MethodArgumentTypeMismatchException.class, MethodArgumentNotValidException.class})
    ResponseEntity<String> handleBadRequest(Exception ex) {
        return ResponseEntity
                .badRequest()
                .contentType(MediaType.APPLICATION_JSON)
                .body(ex.getMessage());
    }

    @ExceptionHandler({NotImplementException.class, Exception.class})
    ResponseEntity<String> handleInternal(Exception ex) {
        return ResponseEntity
                .internalServerError()
                .contentType(MediaType.APPLICATION_JSON)
                .body(ex.getMessage());
    }
}
