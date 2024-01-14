/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fazila.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table
public class ServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_pelanggan;
    private String jenis_pelanggan;
    private Long tarif_jasa;
    private Long diskon;
    private Long total;

    public ServiceModel() {
    }

    public ServiceModel(Long id, Long id_pelanggan, String jenis_pelanggan, Long tarif_jasa, Long diskon, Long total) {
        this.id = id;
        this.id_pelanggan = id_pelanggan;
        this.jenis_pelanggan = jenis_pelanggan;
        this.tarif_jasa = tarif_jasa;
        this.diskon = diskon;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(Long id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getJenis_pelanggan() {
        return jenis_pelanggan;
    }

    public void setJenis_pelanggan(String jenis_pelanggan) {
        this.jenis_pelanggan = jenis_pelanggan;
    }

    public Long getTarif_jasa() {
        return tarif_jasa;
    }

    public void setTarif_jasa(Long tarif_jasa) {
        this.tarif_jasa = tarif_jasa;
    }

    public Long getDiskon() {
        return diskon;
    }

    public void setDiskon(Long diskon) {
        this.diskon = diskon;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ", id_pelanggan=" + id_pelanggan + ", jenis_pelanggan=" + jenis_pelanggan + ", tarif_jasa=" + tarif_jasa + ", diskon=" + diskon + ", total=" + total + '}';
    }
    
}
