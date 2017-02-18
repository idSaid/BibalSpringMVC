package com.bibal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibal.metier.Usager;

public interface IUsagerRepository extends JpaRepository<Usager, Long> {

}
