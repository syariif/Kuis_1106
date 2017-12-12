/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.syarif.Kuis1106.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1106")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nilai;
    
    @Column(length = 150, nullable = false)
    private String Nilai_teori;
    
    @Column(length = 255, nullable = true)
    private String Nilai_praktikum;

    @ManyToOne
    private Category category;
    
    /**
     * @return the id_nilai
     */
    public Long getid_nilai() {
        return id_nilai;
    }

    /**
     * @param id_nilai the id_nilai to set
     */
    public void setid_nilai(Long id_nilai) {
        this.id_nilai = id_nilai;
    }

    /**
     * @return the Nilai_teori
     */
    public String getNilai_teori() {
        return Nilai_teori;
    }

    /**
     * @param Nilai_teori the Nilai_teori to set
     */
    public void setNilai_teori(String Nilai_teori) {
        this.Nilai_teori = Nilai_teori;
    }

    /**
     * @return the Nilai_praktikum
     */
    public String getNilai_praktikum() {
        return Nilai_praktikum;
    }

    /**
     * @param Nilai_praktikum the Nilai_praktikum to set
     */
    public void setNilai_praktikum(String Nilai_praktikum) {
        this.Nilai_praktikum = Nilai_praktikum;
    }
    
    
 public Category getCategory() {
        return category;
    }
    public void  setCategory (Category category) {
        this.category = category;
    }
   

   
    
}
