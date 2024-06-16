#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.dto.${className}Request;
import ${package}.entity.${className};
import ${package}.service.${className}Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/${className.toLowerCase()}s")
public class ${className}Controller {
    private final ${className}Service ${className.toLowerCase()}Service;

    public ${className}Controller(${className}Service ${className.toLowerCase()}Service) {
        this.${className.toLowerCase()}Service = ${className.toLowerCase()}Service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<${className}> get${className}(@PathVariable Integer id) {
        return ResponseEntity.ok(${className.toLowerCase()}Service.get${className}ById(id));
    }

    @PostMapping
    public ResponseEntity<${className}> create${className}(@RequestBody ${className}Request request) {
        return ResponseEntity.ok(${className.toLowerCase()}Service.create${className}(request));
    }
}
