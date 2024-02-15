package com.example.businessfranchisebackend.repository;

import com.example.businessfranchisebackend.model.Franchise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FranchiseRepository extends JpaRepository<Franchise,Long> {
}
