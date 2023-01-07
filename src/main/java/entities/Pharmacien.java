/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;

/**
 *
 * @author Lachgar
 */

@Entity
public class Pharmacien extends User{
    private String nom;
    private String prenom;
    private String telephone;

    public Pharmacien() {
    }



	public Pharmacien(String email, String password, int etat, String nom, String prenom, String telephone) {
		super(email, password, etat);
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


    
    
}
