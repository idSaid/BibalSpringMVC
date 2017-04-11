package com.bibal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bibal.metier.Emprunt;
import com.bibal.metier.Exemplaire;

public interface ExemplaireRepository extends JpaRepository<Emprunt, Long> {

	@Query("select e from Exemplaire e where e.oeuvre.getIdOeuvre() = :x")
	public List<Exemplaire> findByOeuvre(@Param("x")Long idOeuvre);
	
}
