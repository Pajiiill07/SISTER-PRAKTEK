/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fazila.service.service;

import com.fazila.service.entity.ServiceModel;
import com.fazila.service.repository.ServiceRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    
    public void insert(ServiceModel service){
        serviceRepository.save(service);
    }
    
    public List<ServiceModel>getAll(){
        return serviceRepository.findAll();
    }
    
    public void delete(Long id){
        serviceRepository.deleteById(id);
    }
    
    @Transactional
    public void update(Long id, Long idPelanggan, String jenis, Long tarif, Long diskon, Long total) {
        ServiceModel service = serviceRepository.findById(id).orElseThrow(() -> new IllegalStateException("Mahasiswa Tidak Ada"));
        
        if (idPelanggan != null && !Objects.equals(service.getId_pelanggan(), idPelanggan)) {
            service.setId_pelanggan(idPelanggan);
            
        }
        if (jenis != null && jenis.length() > 0 && !Objects.equals(service.getJenis_pelanggan(), jenis)) {
            service.setJenis_pelanggan(jenis);
            
        }
        if (tarif != null && !Objects.equals(service.getTarif_jasa(), tarif)) {
            service.setTarif_jasa(tarif);
            
        }
        if (diskon != null && !Objects.equals(service.getDiskon(), diskon)) {
            service.setDiskon(diskon);
            
        }
        if (total != null && !Objects.equals(service.getTotal(), total)) {
            service.setTotal(total);
            
        }
        
    }
}
