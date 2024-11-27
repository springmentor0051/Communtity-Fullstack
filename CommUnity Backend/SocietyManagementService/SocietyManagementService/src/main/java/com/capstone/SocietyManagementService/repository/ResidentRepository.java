package com.capstone.SocietyManagementService.repository;

import com.capstone.SocietyManagementService.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Long> {
//    Optional<Resident> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<Resident> findByEmail(String email);

    List<Resident> findAllBySocietyId(long societyId);
}