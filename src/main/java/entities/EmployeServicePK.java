/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lachgar
 */
@Embeddable
public class EmployeServicePK  implements Serializable{
    private int employe;
    private int service;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    public EmployeServicePK() {
    }

    public EmployeServicePK(int employe, int service, Date dateDebut) {
        this.employe = employe;
        this.service = service;
        this.dateDebut = dateDebut;
    }

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    
    
    
}
