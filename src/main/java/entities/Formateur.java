/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author Lachgar
 */

@Entity
public class Formateur extends User{
    
    private double salaire;
    @ManyToMany (fetch = FetchType.EAGER)
    private List <Matiere> matieres;

    public Formateur() {
    }

    public Formateur(double salaire, String nom, String prenom) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }
    
    
}
