/*
package tn.isims.webRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isims.dao.ProduitRepository;
import tn.isims.entites.Produit;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {

    @Autowired
    ProduitRepository produitRepository ;

    @GetMapping("produits")
    public List<Produit> listProd(){
        List<Produit> produits = produitRepository.findAll();
        return produits ;
    }

    @PostMapping("ajout")
    public Produit addProd(@RequestBody Produit prod){
        Produit produit = produitRepository.save(prod);
        return produit ;
    }

    @PostMapping("supprimer/{id}")
    public void delete(@PathVariable long id){
        produitRepository.deleteById(id);
    }

   */
/* @PostMapping("update/{id}")
    public Produit update(@PathVariable long id){
    }*//*

}
*/
