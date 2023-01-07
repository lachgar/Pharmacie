package test;

import entities.Formateur;
import entities.Pharmacien;
import entities.User;
import service.UserService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lachgar
 */
public class TestHeritage {
    
    public static void main(String[] args) {
        UserService us = new UserService();
        us.create(new Formateur(10000, "safi", "Ali"));
        us.create(new Pharmacien("4848", "rami", "Amine"));
        
        for(User u : us.findAll())
            if(u instanceof Pharmacien)
                System.out.println(u);
    }
    
}
