package test;

import entities.Etudiant;
import java.util.Date;
import service.EtudiantService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lachgar
 */
public class TestHQL {
    public static void main(String[] args) {
        EtudiantService es = new EtudiantService();
        for(Etudiant e : es.findBetweenDate(new Date("2021/01/01"), new Date("2023/01/01")))
            System.out.println(e.getNom());
         
    }
    
}
