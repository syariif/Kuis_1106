/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.service;

import com.syarif.Kuis1106.entity.Product;
import com.syarif.Kuis1106.repo.ProductRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("productService")
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public Product insert(Product product) {
        return repo.save(product);
    }
    public Product update(Product product) {
        return repo.save(product);
    }

    public boolean delete(String id_nilai) {
        repo.delete(id_nilai);
        return true;
    }

    public Product getByid_nilai(String id_nilai){
        return repo.findOne(id_nilai);
    }
        public List<Product> getAll(){
        return repo.findAllProduct();
    }
}
