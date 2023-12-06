package com.eshop.buyazon.service;

import com.eshop.buyazon.domain.Urun;
import com.eshop.buyazon.dto.UrunKayitIstegi;
import com.eshop.buyazon.repository.UrunRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UrunServis {


    private UrunRepository urunRepository;
/*
    public Urun urunKaydet(UrunKayitIstegi urunKayitIstegi){






        return urunRepository.save(urun);


    }
*/
}
