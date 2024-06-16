package com.brightkut.service;

import com.brightkut.dto.ProductRequest;
import com.brightkut.entity.Product;
import com.brightkut.repository.ProductRepository;
import com.brightkut.util.UUIDUtils;
import org.springframework.stereotype.Service;

import static com.brightkut.constant.Constant.PRODUCT_TYPE_A;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    // Inject Dependency ผ่าน constructor injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Integer id) {
        return productRepository.getById(id);
    }

    public Product createProduct(ProductRequest request) {
        Product product = new Product()
                .setId(UUIDUtils.genUUID())// generate random UUID
                .setName(request.getName())
                .setPrice(request.getPrice())
                .setType(PRODUCT_TYPE_A);

        productRepository.insert(product);

        return product;
    }
}
