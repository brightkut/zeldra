#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.dto.${className}CreateRequest;
import ${package}.dto.${className}UpdateRequest;
import ${package}.dto.${className}Response;
import ${package}.entity.${className};
import ${package}.service.${className}Service;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@RestController
@RequestMapping("/${className.toLowerCase()}s")
@Validated
public class ${className}Controller {
    private final ${className}Service ${className.toLowerCase()}Service;

    public ${className}Controller(${className}Service ${className.toLowerCase()}Service) {
        this.${className.toLowerCase()}Service = ${className.toLowerCase()}Service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<${className}Response> get${className}(@PathVariable UUID id) {
        return ResponseEntity.ok(${className.toLowerCase()}Service.get${className}ById(id));
    }

    @PostMapping
    public ResponseEntity<${className}Response> create${className}(@RequestBody @Valid ${className}CreateRequest request) {
        return ResponseEntity.ok(${className.toLowerCase()}Service.create${className}(request));
    }

    @PutMapping
    public ResponseEntity<${className}Response> update${className}(@RequestBody @Valid ${className}UpdateRequest request) {
        return ResponseEntity.ok(${className.toLowerCase()}Service.update${className}(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<${className}Response> delete${className}(@PathVariable UUID id) {
        return ResponseEntity.ok(${className.toLowerCase()}Service.delete{className}(id));
    }
}
