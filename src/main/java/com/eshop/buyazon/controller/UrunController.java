package com.eshop.buyazon.controller;


import com.eshop.buyazon.dto.StatusResponse;
import com.eshop.buyazon.dto.UrunKayitIstegi;
import com.eshop.buyazon.service.UrunServis;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/urun")
@AllArgsConstructor
public class UrunController {


    private UrunServis urunServis;
/*
    @PostMapping
    @RequestMapping("/kaydet")
    public ResponseEntity<StatusResponse> urunKaydet(@Valid @RequestBody UrunKayitIstegi urunKayitIstegi) {

      urunServis.urunKaydet(urunKayitIstegi);

      StatusResponse response=new StatusResponse();
      response.setMesage("Urun Kaydedildi");
      response.setSuccess(true);

      return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
*/

}
