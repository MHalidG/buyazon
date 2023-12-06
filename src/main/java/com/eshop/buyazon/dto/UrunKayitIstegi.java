package com.eshop.buyazon.dto;

import com.eshop.buyazon.domain.ResimDosyasi;
import com.eshop.buyazon.domain.Satici;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrunKayitIstegi {



    private String isim;

    private Double fiyat;

 //   private Set<ResimDosyasi> resimler;
    private String resimler;

    private Long stokAdedi;

    private Satici satici;


}
