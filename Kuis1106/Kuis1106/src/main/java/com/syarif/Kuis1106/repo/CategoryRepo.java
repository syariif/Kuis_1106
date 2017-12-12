/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.repo;

import com.syarif.Kuis1106.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface CategoryRepo extends CrudRepository<Category, String> {

    @Query("select d from Category d")
    public List<Category> findAllCategory();
}
