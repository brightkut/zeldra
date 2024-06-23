package ${package}.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import ${package}.dto.${className}CreateRequest;
import ${package}.dto.${className}Response;
import ${package}.dto.${className}UpdateRequest;
import ${package}.exception.NotImplementException;
import ${package}.service.${className}Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import java.util.UUID;

@WebMvcTest(controllers = ${className}Controller.class)
@AutoConfigureMockMvc
public class ${className}ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ${className}Service ${className.toLowerCase()}Service;

    @Autowired
    private ObjectMapper objectMapper;

    private final String PRODUCT_ENDPOINT = "/${className.toLowerCase()}s";

    private static UUID mockId;

    @BeforeAll
    static void setUp() {
        mockId = UUID.randomUUID();
    }

    /* Get ${className} Cases */
    @Test
    public void testGet${className}Success() throws Exception {
        when(${className.toLowerCase()}Service.get${className}ById(any(UUID.class))).thenReturn(new ${className}Response().setId(mockId));

        mockMvc.perform(get(PRODUCT_ENDPOINT+"/{id}", mockId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    public void testGet${className}Failed_BadRequest() throws Exception {
        mockMvc.perform(get(PRODUCT_ENDPOINT+"/{id}", "abc"))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    public void testGet${className}Failed_InternalError() throws Exception {
        when(${className.toLowerCase()}Service.get${className}ById(any(UUID.class))).thenThrow(new NotImplementException("Internal Error"));

        mockMvc.perform(get(PRODUCT_ENDPOINT+"/{id}", mockId))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    /* Create ${className} Cases */
    @Test
    public void testCreate${className}Success() throws Exception {
        ${className}CreateRequest request = new ${className}CreateRequest().setId(mockId);

        when(${className.toLowerCase()}Service.create${className}(any(${className}CreateRequest.class))).thenReturn(new ${className}Response().setId(mockId));

        mockMvc.perform(post(PRODUCT_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }

    @Test
    public void testCreate${className}Failed_InternalError() throws Exception {
        ${className}CreateRequest request = new ${className}CreateRequest();

        when(${className.toLowerCase()}Service.create${className}(any(${className}CreateRequest.class))).thenThrow(new NotImplementException("Internal Error"));

        mockMvc.perform(post(PRODUCT_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }

    /* Update ${className} Cases */
    @Test
    public void testUpdate${className}Success() throws Exception {
        ${className}UpdateRequest request = new ${className}UpdateRequest();

        when(${className.toLowerCase()}Service.update${className}(any(${className}UpdateRequest.class))).thenReturn(new ${className}Response().setId(mockId));

        mockMvc.perform(put(PRODUCT_ENDPOINT+"/{id}", mockId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }

    @Test
    public void testUpdate${className}Failed_InternalError() throws Exception {
        ${className}UpdateRequest request = new ${className}UpdateRequest();

        when(${className.toLowerCase()}Service.update${className}(any(${className}UpdateRequest.class))).thenThrow(new NotImplementException("Internal Error"));
        mockMvc.perform(put(PRODUCT_ENDPOINT+"/{id}", mockId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }

    /* Delete ${className} Cases */
    @Test
    public void testDelete${className}Success() throws Exception {
        when(${className.toLowerCase()}Service.delete${className}(any(UUID.class))).thenReturn(new ${className}Response().setId(mockId));

        mockMvc.perform(delete(PRODUCT_ENDPOINT+"/{id}", mockId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }

    @Test
    public void testDelete${className}Failed_BadRequest() throws Exception {
        mockMvc.perform(delete(PRODUCT_ENDPOINT+"/{id}", "abc"))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }

    @Test
    public void testDelete${className}Failed_InternalError() throws Exception {
        when(${className.toLowerCase()}Service.delete${className}(any(UUID.class))).thenThrow(new NotImplementException("Internal Error"));

        mockMvc.perform(delete(PRODUCT_ENDPOINT+"/{id}", mockId))
                .andExpect(status().isInternalServerError())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").value(1))
                .andDo(print());
    }
}
