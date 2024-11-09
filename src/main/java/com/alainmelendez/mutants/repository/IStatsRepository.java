package com.alainmelendez.mutants.repository;

import com.alainmelendez.mutants.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatsRepository extends JpaRepository<Stats, Long>{
    
}
