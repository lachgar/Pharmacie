/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Lachgar
 */
@Entity
public class EmployeService {
    @EmbeddedId
    private EmployeServicePK pk;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name = "employe", insertable = false, updatable = false)
    private Employe employe;
    @ManyToOne
    @JoinColumn(name = "service", insertable = false, updatable = false)
    private Service service;

    public EmployeService() {
    }

    public EmployeService(EmployeServicePK pk, Date dateFin, Employe employe, Service service) {
        this.pk = pk;
        this.dateFin = dateFin;
        this.employe = employe;
        this.service = service;
    }

    public EmployeServicePK getPk() {
        return pk;
    }

    public void setPk(EmployeServicePK pk) {
        this.pk = pk;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    
}
