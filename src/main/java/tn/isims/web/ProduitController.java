package tn.isims.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tn.isims.dao.ProduitRepository;
import tn.isims.entites.Produit;

import java.util.List;

@Controller
public class ProduitController {

    @Autowired
    ProduitRepository produitRepository ;

    @GetMapping("produits")
    public String listProd(Model model){
        List<Produit> produits = produitRepository.findAll();
        model.addAttribute("produits",produits);
        return "produits" ;
    }

    @GetMapping("delete")
    public String delete(long id){
        produitRepository.deleteById(id);
        return "produits";
    }

    @PostMapping("ajout")
    public Produit addProd(Produit prod){
        Produit produit = produitRepository.save(prod);
        return produit ;
    }

}
