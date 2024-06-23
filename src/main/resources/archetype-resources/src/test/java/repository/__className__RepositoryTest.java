package ${package}.repository;

import ${package}.entity.${className};
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ${className}RepositoryTest {
    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:latest");

    @Autowired
    private ${className}Repository ${className.toLowerCase()}Repository;

    @Test
    void testConnectionEstablished() {
        assertTrue(postgres.isRunning());
    }

    @Test
    void testCRUD(){
        ${className} ${className.toLowerCase()} = new ${className}().setId(UUID.randomUUID());

        // Insert
        ${className} insert${className} = ${className.toLowerCase()}Repository.save(${className.toLowerCase()});
        assertNotNull(insert${className});

        // Get
        Optional<${className}> get${className} = ${className.toLowerCase()}Repository.findById(insert${className}.getId());
        assertTrue(get${className}.isPresent());

        // Update

        // Delete
        ${className.toLowerCase()}Repository.deleteById(insert${className}.getId());
        Optional<${className}> getDelete${className} = ${className.toLowerCase()}Repository.findById(insert${className}.getId());
        assertTrue(getDelete${className}.isEmpty());
    }
}
