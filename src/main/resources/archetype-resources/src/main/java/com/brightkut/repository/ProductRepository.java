package com.brightkut.repository;

import com.brightkut.entity.Product;
import com.brightkut.exception.NotImplementException;
import org.springframework.stereotype.Service;

@Service
public class ProductRepository {
    // class นี้ทำเป็น mockup ไว้ต้องแก้ไขเป็นส่วนที่ต่อกับ DB หรือมี query

    public Product getById(Integer id) {
        // TO DO
        throw new NotImplementException("This class did not implement");
    }

    public void insert(Product product) {
        // TO DO
        throw new NotImplementException("This class did not implement");
    }
}
