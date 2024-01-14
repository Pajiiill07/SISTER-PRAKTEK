/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fazila.matakuliah.controller;

import com.fazila.matakuliah.entity.MataKuliah;
import com.fazila.matakuliah.service.MatkulService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("api/v1/matakuliah")
public class MatkulController {
    @Autowired
    private MatkulService matkulService;
    
    @GetMapping
    public List<MataKuliah>getAll(){
        return matkulService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public MataKuliah getMatakuliahById(@PathVariable("id") Long id){
        return matkulService.getMatakuliahById(id);
    }
    
    @PutMapping(path = "{id}")
    public void update(@PathVariable("id") long id,
            @RequestParam(required = false) String kode,
              @RequestParam(required = false) String nama,
                @RequestParam(required = false) Integer sks ){
        matkulService.update(id, kode, nama, sks);
    }
    
    @PostMapping
    public void insert(@RequestBody MataKuliah matakuliah){
        matkulService.insert(matakuliah);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id){
        matkulService.delete(id);
    }
}
