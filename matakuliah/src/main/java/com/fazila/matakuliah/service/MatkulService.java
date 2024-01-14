/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fazila.matakuliah.service;

import com.fazila.matakuliah.entity.MataKuliah;
import com.fazila.matakuliah.repository.MatkulRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class MatkulService {
    @Autowired
    private MatkulRepository matkulRepository;
    
    public void insert(MataKuliah matakuliah){
        matkulRepository.save(matakuliah);
    }
    
    public List<MataKuliah>getAll(){
        return matkulRepository.findAll();
    }
    
    public MataKuliah getMatakuliahById(Long id){
        return matkulRepository.findById(id).get();
    }
    
    public void delete(Long id){
        matkulRepository.deleteById(id);
    }
    
    
    @Transactional
    public void update(long id, String kode, String nama, Integer sks) {
        MataKuliah matakuliah = matkulRepository.findById(id).orElseThrow(() -> new IllegalStateException("Matakuliah Tidak Ada"));
        
        if (nama != null && nama.length() > 0 && !Objects.equals(matakuliah.getNama(), nama)) {
            matakuliah.setNama(nama);
            
        }
        if (kode != null && kode.length() > 0 && !Objects.equals(matakuliah.getKode(), kode)) {
            Optional<MataKuliah> matkulOptionalkode = matkulRepository.findMatakuliahByKode(kode);
            if (matkulOptionalkode.isPresent()) {
                throw new IllegalStateException("Kode ini sudah ada");
            }
            matakuliah.setKode(kode);
            
        }
        if (nama != null && nama.length() > 0 && !Objects.equals(matakuliah.getNama(), nama)) {
            Optional<MataKuliah> matkulOptionalnama = matkulRepository.findMatakuliahByNama(nama);
            if (matkulOptionalnama.isPresent()) {
                throw new IllegalStateException("nama matakuliah sudah ada");
            }
            matakuliah.setNama(nama);
        }

        
        if (sks != null && !Objects.equals(matakuliah.getSks(), sks)) {
            matakuliah.setSks(sks);
            
        }
        
    }
}
