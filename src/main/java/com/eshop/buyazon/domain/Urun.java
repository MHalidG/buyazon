package com.eshop.buyazon.domain;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Setter(AccessLevel.NONE)
    private Long id;

    @Column(length=30,nullable =false)
    private String isim;

    @Column(nullable =false)
    private String satici;

    @Column(nullable =false)
    private Double fiyat;

    private String resimler;

    @Column(nullable =false)
    private Long stokAdedi;


}
