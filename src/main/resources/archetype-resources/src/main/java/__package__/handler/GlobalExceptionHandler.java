#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.handler;

import ${package}.exception.NotImplementException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotImplementException.class)
    public ResponseEntity<String> handleException(Exception ex, HttpServletRequest request) {
        return ResponseEntity
                .internalServerError()
                .body("Some part of code did not implement");
    }
}
