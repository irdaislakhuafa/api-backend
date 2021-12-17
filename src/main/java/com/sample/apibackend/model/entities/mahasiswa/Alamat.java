package com.sample.apibackend.model.entities.mahasiswa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alamat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kota;
    private String tlpRumah;
    private String jalan;
}
