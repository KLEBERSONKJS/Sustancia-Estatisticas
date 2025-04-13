package com.ads.sustancia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "TB_PAPEL")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Papel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String papel;

}
