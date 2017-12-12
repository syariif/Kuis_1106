/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.service;

import com.syarif.Kuis1106.entity.Category;
import com.syarif.Kuis1106.repo.CategoryRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("categoryService")
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepo repo;

    public Category insert(Category category) {
        return repo.save(category);
    }
    
    public Category update(Category category) {
        return repo.save(category);
    }
    
    public boolean delete(String id){
        repo.delete(id);
        return true;
    }
    
    public Category getByid(String id){
        return repo.findOne(id);
    }
    
    public List<Category> getAll(){
        return repo.findAllCategory();
    }
}
