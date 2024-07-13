#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.dto.${className}CreateRequest;
import ${package}.dto.${className}UpdateRequest;
import ${package}.dto.${className}Response;

import ${package}.repository.${className}Repository;
import ${package}.exception.NotImplementException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ${className}Service {
    private final ${className}Repository ${className.toLowerCase()}Repository;

    // Inject Dependency ผ่าน constructor injection
    public ${className}Service(${className}Repository ${className.toLowerCase()}Repository) {
        this.${className.toLowerCase()}Repository = ${className.toLowerCase()}Repository;
    }

    public ${className}Response get${className}ById(UUID id) {
        throw new NotImplementException("This service class does not implement.");
    }

    public ${className}Response create${className}(${className}CreateRequest request) {
        throw new NotImplementException("This service class does not implement.");
    }

    public ${className}Response update${className}(${className}UpdateRequest request) {
        throw new NotImplementException("This service class does not implement.");
    }

    public ${className}Response delete${className}(UUID id) {
        throw new NotImplementException("This service class does not implement.");
    }
}
