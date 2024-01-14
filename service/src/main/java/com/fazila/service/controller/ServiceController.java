/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fazila.service.controller;

import com.fazila.service.entity.ServiceModel;
import com.fazila.service.service.ServiceService;
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
@RequestMapping("api/v1/service")
public class ServiceController {
    @Autowired
    private ServiceService serviceSer;
    
    @GetMapping
    public List<ServiceModel>getAll(){
        return serviceSer.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody ServiceModel service){
        serviceSer.insert(service);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id){
        serviceSer.delete(id);
    }
    
    @PutMapping(path = "{id}")
    public void update(@PathVariable("id") long id,
            @RequestParam(required = false) long idpelanggan,
              @RequestParam(required = false) String jenis,
            @RequestParam(required = false) long tarif,
              @RequestParam(required = false) long diskon,
                @RequestParam(required = false) long total ){
        serviceSer.update(id, idpelanggan, jenis, tarif, diskon, total);
    }
}