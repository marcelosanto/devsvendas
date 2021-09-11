package com.mrssantos.dsvendas.repositories;

import com.mrssantos.dsvendas.entities.Sale;
import com.mrssantos.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
