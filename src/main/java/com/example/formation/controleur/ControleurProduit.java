package com.example.formation.controleur;

import com.example.formation.Entities.Produit;
import com.example.formation.dao.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //This means you don't need to annotate each method in this controller with the @ResponseBody annotation
@RequestMapping("/api") // afficher produit + categorie sur /api/produits.
public class ControleurProduit {
    @Autowired
    ProduitRepository produitRepository;
    @GetMapping("/produits")
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    } //afficher la liste de tous les produits sur /produits.
    @GetMapping("/produits/{id}")
    public Produit getProduit(@PathVariable("id") int id) {
        return produitRepository.findById(id).get();
    } //afficher le produit par id sur /produits/id.
    @PostMapping("/produits")
    public void addProduit(Produit p){
        produitRepository.save(p);
    } //ajouter un produit.
}
