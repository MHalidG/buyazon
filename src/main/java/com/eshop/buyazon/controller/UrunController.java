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

    @PostMapping
    public ResponseEntity<StatusResponse> urunKaydet(@Valid @RequestBody UrunKayitIstegi urunKayitIstegi) {

      urunServis.urunKaydet(urunKayitIstegi);

      StatusResponse response=new StatusResponse();
      response.setMesage("Urun Kaydedildi");
      response.setSuccess(true);

      return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    /*
    public ResponseEntity<> saveCar(@PathVariable  @Valid @RequestBody CarDTO carDTO) {
        carService.saveCar(carDTO, imageId);

        HRResponse response = new HRResponse();
        response.setMessage("Car successfully saved");
        response.setSuccess(true);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
*/


}
