package com.alainmelendez.mutants.service;

import com.alainmelendez.mutants.dto.MutantDTO;
import com.alainmelendez.mutants.dto.StatsDTO;
import org.springframework.http.ResponseEntity;

public interface IMutantService {

    public ResponseEntity<?> isMutant(MutantDTO mutantDTO);

    public StatsDTO getStats();

}
