#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import ${package}.entity.${className};
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ${className}Repository extends JpaRepository<${className}, UUID> {
}
