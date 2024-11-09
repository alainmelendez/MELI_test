package com.alainmelendez.mutants.service;

import com.alainmelendez.mutants.dto.MutantDTO;
import com.alainmelendez.mutants.dto.StatsDTO;
import com.alainmelendez.mutants.model.Mutant;
import com.alainmelendez.mutants.model.Stats;
import com.alainmelendez.mutants.repository.IMutantRepository;
import com.alainmelendez.mutants.repository.IStatsRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MutantService implements IMutantService{
    
    @Autowired
    private IMutantRepository mutantRepo;
    
    @Autowired
    private IStatsRepository statsRepo;
    
    @Override
    public ResponseEntity<?> isMutant(MutantDTO mutantDTO){
        //Create mutant object
        Mutant mutant = new Mutant();
        String[] dna = mutantDTO.getDna();
        
        //Convert the dna to String
        String dna_toCheck = "";
        for (String dna_part : dna) {
            dna_toCheck += dna_part;
        }
        
        //Check if is Mutant
	String dna_human = "ATGCGACAGTGCTTATTTAGACGGGCGTCATCACTG";
        boolean checkedMutant = (dna_toCheck.equals(dna_human));
        
        //Save new object in dataBase, table Mutant
        mutant.setDna(dna);
        mutant.setMutantOrHuman(checkedMutant);
        saveMutant(mutant);
        
        //updating Stats
        updateStats(checkedMutant);
        
        return checkedMutant ? ResponseEntity.ok().build() : ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
    
    @Override
    public StatsDTO getStats(){
        Stats statsTotal = statsRepo.findById(1L).orElse(new Stats());
        StatsDTO statistics = new StatsDTO();
        statistics.setCount_human_dna(statsTotal.getCount_human_dna());
        statistics.setCount_mutant_dna(statsTotal.getCount_mutant_dna());
        statistics.setRatio(statsTotal.getRatio());
        return statistics;
    }
    
    public void saveMutant(Mutant mutant) {
        mutantRepo.save(mutant);
    }
    
    private void updateStats(boolean checkedMutant){
        Stats stats = statsRepo.findById(1L).orElse(new Stats());

        if (checkedMutant) {
            stats.setCount_mutant_dna(stats.getCount_mutant_dna() + 1);
        } else {
            stats.setCount_human_dna(stats.getCount_human_dna() + 1);
        }

        int humanCount = stats.getCount_human_dna();
        int mutantCount = stats.getCount_mutant_dna();
        stats.setRatio(humanCount > 0 ? (double) mutantCount / humanCount : 0);

        statsRepo.save(stats);
    }
}
