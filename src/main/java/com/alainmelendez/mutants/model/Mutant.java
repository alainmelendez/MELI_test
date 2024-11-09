package com.alainmelendez.mutants.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mutant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_dna;
    private String[] dna;
    private boolean mutantOrHuman;
    
}
