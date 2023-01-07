package test;

import entities.Formateur;
import entities.Matiere;
import entities.User;
import service.MatiereService;
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
public class TestManyToMany {
    
    public static void main(String[] args) {
        MatiereService ms = new MatiereService();
        UserService us = new UserService();
        ms.create(new Matiere("java"));
        ms.create(new Matiere("web"));
        Formateur formateur = (Formateur) us.findById(1);
        formateur.getMatieres().add(ms.findById(1));
        formateur.getMatieres().add(ms.findById(2));
        us.update(formateur);
    }
    
}
