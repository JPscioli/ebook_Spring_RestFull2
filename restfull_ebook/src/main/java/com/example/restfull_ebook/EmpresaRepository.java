package com.example.restfull_ebook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
    Empresa findByCnpj(String cnpj);
}
