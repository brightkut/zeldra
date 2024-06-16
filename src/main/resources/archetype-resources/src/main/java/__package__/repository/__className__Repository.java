#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import ${package}.entity.${className};
import ${package}.exception.NotImplementException;
import org.springframework.stereotype.Service;

@Service
public class ${className}Repository {

    public ${className} getById(Integer id) {
        // TO DO
        throw new NotImplementException("This class did not implement");
    }

    public void insert(${className} ${className.toLowerCase()}) {
        // TO DO
        throw new NotImplementException("This class did not implement");
    }
}
