#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.dto.ProductRequest;
import ${package}.entity.Product;
import ${package}.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ${className}Service {
    private final ${className}Repository ${className.toLowerCase()}Repository;

    // Inject Dependency ผ่าน constructor injection
    public ${className}Service(${className}Repository ${className.toLowerCase()}Repository) {
        this.${className.toLowerCase()}Repository = ${className.toLowerCase()}Repository;
    }

    public ${className} get${className}ById(Integer id) {
        return ${className.toLowerCase()}Repository.getById(id);
    }

    public ${className} create${className}(${className}Request request) {
        ${className} ${className.toLowerCase()} = new ${className}()
                .setId("1")
                .setName(request.getName())
                .setPrice(request.getPrice())
                .setType("PRODUCT_TYPE_A");

        ${className.toLowerCase()}Repository.insert(${className.toLowerCase()});

        return ${className.toLowerCase()};
    }
}
