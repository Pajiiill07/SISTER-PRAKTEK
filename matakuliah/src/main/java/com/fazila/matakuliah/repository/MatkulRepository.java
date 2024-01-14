/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fazila.matakuliah.repository;

import com.fazila.matakuliah.entity.MataKuliah;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
public interface MatkulRepository extends JpaRepository<MataKuliah, Long>{

    public Optional<MataKuliah> findMatakuliahByKode(String kode);

    public Optional<MataKuliah> findMatakuliahByNama(String nama);
    
}
