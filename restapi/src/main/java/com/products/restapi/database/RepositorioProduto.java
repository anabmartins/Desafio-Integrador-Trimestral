package com.products.restapi.database;

import com.products.restapi.entidade.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProduto extends JpaRepository<Produto,Long>{
  
}
