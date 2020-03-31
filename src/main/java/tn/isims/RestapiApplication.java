package tn.isims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import tn.isims.dao.ProduitRepository;
import tn.isims.entites.Produit;

import java.util.List;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner {

    @Autowired
    ProduitRepository produitRepository ;

    public static void main(String[] args)  {

        SpringApplication.run(RestapiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

      produitRepository.save(new Produit(0,"Canoan 5D",10.000,2));
      produitRepository.save(new Produit(0,"IPhone 7",2.500,1));
      produitRepository.save(new Produit(0,"Macbook 4",12.548,3));
      produitRepository.save(new Produit(0,"Asus",2.000,1));

        Page<Produit> produits = produitRepository.findAll(PageRequest.of(0,2));
        Page<Produit> produits1 = produitRepository.findByDesignationContains("as",PageRequest.of(0,4));

          produits.forEach(produit -> {System.out.println(produit.toString());});

    }

}

