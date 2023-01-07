/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.IDao;
import entities.Etudiant;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Lachgar
 */
public class EtudiantService implements IDao<Etudiant> {

    @Override
    public boolean create(Etudiant o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public boolean update(Etudiant o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Etudiant o
    ) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public Etudiant findById(int id
    ) {
        Session session = null;
        Transaction tx = null;
        Etudiant etudiant = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            etudiant = (Etudiant) session.get(Etudiant.class, id);
            tx.commit();
            return etudiant;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return null;
    }

    @Override
    public List<Etudiant> findAll() {
        Session session = null;
        Transaction tx = null;
        List<Etudiant> etudiants = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            etudiants = session.createQuery("from Etudiant").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return etudiants;
   
    }
    
    public List<Etudiant> findBetweenDate(Date d1, Date d2) {
        Session session = null;
        Transaction tx = null;
        List<Etudiant> etudiants = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Query query = session.getNamedQuery("findBetweenDate");
            query.setParameter("d1", d1);
            query.setParameter("d2", d2);
            etudiants = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return etudiants;
   
    }


}

