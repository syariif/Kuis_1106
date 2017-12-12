/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.controller;

import com.syarif.Kuis1106.entity.Category;
import com.syarif.Kuis1106.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public Category insert(@RequestBody Category category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Category update(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") String id) {
        return categoryService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Category getById(@PathVariable("id") String id){
        return categoryService.getByid(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> getAll(){
        return categoryService.getAll();
    }
}
