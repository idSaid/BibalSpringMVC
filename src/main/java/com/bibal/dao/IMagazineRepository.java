package com.bibal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibal.metier.Magazine;

public interface IMagazineRepository extends JpaRepository<Magazine, Long>{

}
