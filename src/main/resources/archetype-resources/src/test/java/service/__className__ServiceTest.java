package ${package}.service;

import ${package}.dto.${className}CreateRequest;
import ${package}.dto.${className}UpdateRequest;
import ${package}.exception.NotImplementException;
import ${package}.repository.${className}Repository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ${className}ServiceTest {
    @InjectMocks
    private ${className}Service ${className.toLowerCase()}Service;

    @Mock
    private ${className}Repository ${className.toLowerCase()}Repository;

    @Test
    void testGet${className}Success() {
        assertThrows(NotImplementException.class, () -> {
            ${className.toLowerCase()}Service.get${className}ById(UUID.randomUUID());
        });
    }

    @Test
    void testCreate${className}Success() {
        ${className}CreateRequest request = new ${className}CreateRequest();

        assertThrows(NotImplementException.class, () -> {
            ${className.toLowerCase()}Service.create${className}(request);
        });
    }

    @Test
    void testUpdate${className}Success() {
        ${className}UpdateRequest request = new ${className}UpdateRequest();

        assertThrows(NotImplementException.class, () -> {
            ${className.toLowerCase()}Service.update${className}(request);
        });
    }

    @Test
    void testDelete${className}Success() {
        assertThrows(NotImplementException.class, () -> {
            ${className.toLowerCase()}Service.delete${className}(UUID.randomUUID());
        });
    }
}
