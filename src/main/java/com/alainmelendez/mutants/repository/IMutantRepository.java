package com.alainmelendez.mutants.repository;

import com.alainmelendez.mutants.model.Mutant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMutantRepository extends JpaRepository<Mutant, Long>{
    
}
