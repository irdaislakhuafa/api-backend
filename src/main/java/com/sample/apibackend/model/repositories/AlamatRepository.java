package com.sample.apibackend.model.repositories;

import com.sample.apibackend.model.entities.mahasiswa.Alamat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlamatRepository extends JpaRepository<Alamat, Long> {
}