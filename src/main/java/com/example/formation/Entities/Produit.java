package com.example.formation.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString

public class Produit {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Produit(String nom, double prix, int quantite, Categorie categorie) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
    private int id;
    private String nom;
    private double prix;
    private int quantite;
    @ManyToOne()
    private Categorie categorie;
    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                ", categorie=" + categorie +
                '}';
    }
}


