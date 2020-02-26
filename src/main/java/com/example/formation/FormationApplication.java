package com.example.formation;
import com.example.formation.Entities.Categorie;
import com.example.formation.Entities.Produit;

import com.example.formation.dao.CategorieRepository;
import com.example.formation.dao.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class FormationApplication implements CommandLineRunner {
    @Autowired
    ProduitRepository produitRepository ;
    @Autowired
    CategorieRepository categorieRepository ;
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {

        SpringApplication.run(FormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categorie c1= new Categorie("informatique",0,0,null);
        categorieRepository.save(c1);
        Categorie c2= new Categorie("electronique",50,0,null);
        categorieRepository.save(c2);
        produitRepository.save(new Produit(0,"ordinateur",300,63,c1));
        produitRepository.save(new Produit(0,"Radio",200,43,c2));
        repositoryRestConfiguration.exposeIdsFor(Produit.class); //pour afficher id dans postman
         //System.out.println(produitRepository.findAll());*/

    }
}
