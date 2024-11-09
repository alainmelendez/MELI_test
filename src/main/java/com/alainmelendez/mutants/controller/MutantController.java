package com.alainmelendez.mutants.controller;

import com.alainmelendez.mutants.dto.MutantDTO;
import com.alainmelendez.mutants.dto.StatsDTO;
import com.alainmelendez.mutants.service.IMutantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutantController {
    
    @Autowired IMutantService mutantServ;
    
    //check a possible mutant
    @PostMapping("/mutant")
    public ResponseEntity<?> isMutant(@RequestBody MutantDTO mutantDTO){
        return mutantServ.isMutant(mutantDTO);
    }
    
    //check statistics of mutants
    @GetMapping("/stats")
    public StatsDTO getStats(){
        return mutantServ.getStats();
    }
    
}
