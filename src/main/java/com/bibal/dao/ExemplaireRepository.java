package com.bibal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibal.metier.Emprunt;

public interface ExemplaireRepository extends JpaRepository<Emprunt, Long> {

}
