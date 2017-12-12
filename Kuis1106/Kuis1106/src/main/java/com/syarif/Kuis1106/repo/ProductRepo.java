/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.repo;

import com.syarif.Kuis1106.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface ProductRepo extends CrudRepository<Product, String>{
    
    @Query("select p from Product p")
    public List<Product> findAllProduct();
    
    @Query("select p from Product p where p.category.id= :id")
    public List<Product> findByProduct(@Param("Kode_parfum") String Kode_parfum);
    
    @Query("select p from Product p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Product> findByName(@Param("Nama_parfum") String Nama_parfum);
}
