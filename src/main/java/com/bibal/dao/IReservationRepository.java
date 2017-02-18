package com.bibal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibal.metier.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long>{

}
