package com.eshop.buyazon.domain;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;


@Data
@Entity
@Builder(toBuilder = true)
public class Urun {

    private Long id;

    private String isim;

    private String satici;

    private Double fiyat;

    private String resim;


}
