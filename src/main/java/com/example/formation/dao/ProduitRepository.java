package com.example.formation.dao;


import com.example.formation.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    @RestResource(path = "/byname" )
    public List<Produit> findByNomContains(@Param(value = "mc") String mc);
}

