package com.eshop.buyazon.domain;


import com.eshop.buyazon.domain.enums.KullaniciRolu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rol {


    @Id
    @GeneratedValue
    private Long id;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private KullaniciRolu isim;




}
