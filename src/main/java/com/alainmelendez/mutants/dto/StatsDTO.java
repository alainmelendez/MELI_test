package com.alainmelendez.mutants.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatsDTO {
    
    private int count_mutant_dna;
    private int count_human_dna;
    private double ratio;
    
}
