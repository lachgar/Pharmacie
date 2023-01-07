package service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.IDao;
import entities.Ville;
import util.HibernateUtil;

public class VilleService  implements IDao<Ville> {

    @Override
    public boolean create(Ville o) {
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
    public boolean update(Ville o) {
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
    public boolean delete(Ville o
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
    public Ville findById(int id
    ) {
        Session session = null;
        Transaction tx = null;
        Ville ville = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            ville = (Ville) session.get(Ville.class, id);
            tx.commit();
            return ville;
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
    public List<Ville> findAll() {
        Session session = null;
        Transaction tx = null;
        Ville ville = null;
        List<Ville> villes = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            villes = session.createQuery("from Ville").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }finally{
            if(session != null)
                session.close();
        }
        return villes;
   
    }

}

