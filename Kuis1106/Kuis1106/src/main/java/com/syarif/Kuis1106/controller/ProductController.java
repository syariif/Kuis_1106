/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.controller;


import com.syarif.Kuis1106.entity.Product;
import com.syarif.Kuis1106.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
  @RequestMapping(method = RequestMethod.POST)
    public Product insert(@RequestBody Product product) {
        return productService.insert(product);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_nilai}")
    public boolean delete(@PathVariable("id_nilai") String id_nilai) {
        return productService.delete(id_nilai);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Product getByid_nilai(@PathVariable("id_nilai") String id_nilai){
        return productService.getByid_nilai(id_nilai);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getAll(){
        return productService.getAll();
    }
  
}
