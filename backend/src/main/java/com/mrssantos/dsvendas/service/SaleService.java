package com.mrssantos.dsvendas.service;

import com.mrssantos.dsvendas.dto.SaleDTO;
import com.mrssantos.dsvendas.dto.SellerDTO;
import com.mrssantos.dsvendas.entities.Sale;
import com.mrssantos.dsvendas.entities.Seller;
import com.mrssantos.dsvendas.repositories.SaleRepository;
import com.mrssantos.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDTO::new);
    }
}
