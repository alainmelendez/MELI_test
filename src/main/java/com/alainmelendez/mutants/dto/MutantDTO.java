package com.alainmelendez.mutants.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MutantDTO {
    
    private String[] dna;
    private boolean mutantOrHuman;
    
}
