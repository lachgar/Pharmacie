package test;

import entities.Etudiant;
import entities.Filiere;
import java.util.Date;
import service.EtudiantService;
import service.FiliereService;
import util.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lachgar
 */
public class Test {

    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        FiliereService fs = new FiliereService();
        fs.create(new Filiere("IIR", "info"));
        fs.create(new Filiere("GI", "Civil"));

        EtudiantService es = new EtudiantService();
        es.create(new Etudiant("alami", "kamal", new Date(), "012588888", fs.findById(1)));
        es.create(new Etudiant("rami", "amal", new Date("1999/01/01"), "0125854656", fs.findById(2)));

       // for(Etudiant e : es.findAll())
         //   System.out.println(e.getNom());
        
        for(Etudiant e : fs.findById(1).getEtudiants())
            System.out.println(e);
    }

}
