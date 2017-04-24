package com.bibal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bibal.metier.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	@Query("select r from Reservation r where r.etatReservation='EnCours' order by r.date asc")
	public List<Reservation> getReservationsEnCours();
}
