package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.entities.Seller;

@Service
public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
