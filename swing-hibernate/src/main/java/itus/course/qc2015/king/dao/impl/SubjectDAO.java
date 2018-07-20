package itus.course.qc2015.king.dao.impl;

import itus.course.qc2015.king.dao.baseDAO;
import itus.course.qc2015.king.model.Subject;
import itus.course.qc2015.king.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SubjectDAO implements baseDAO<Subject>{

    @Override
    public boolean add(Subject su) {
         Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction transaction = null;
                        boolean success;
                        try {
                                transaction = session.beginTransaction();
                                session.save(su);
                                transaction.commit();
                                success = true;
                        }
                        catch(HibernateException hex) {
                                if (transaction != null) transaction.rollback();
                                hex.printStackTrace();
                                success = false;
                        }
                        finally {
                                session.close();
                        }

                        return success;	
    }

    @Override
    public boolean update(Subject su) {
       
                      if (getById(su.getSubjID()) == null) return false;
                      Session session = HibernateUtil.getSessionFactory().openSession();
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.update(su);
                           transaction.commit();
                           success = true;
                       }
                      catch (HibernateException ex) {
                          success = false;
                          if (transaction != null) transaction.rollback();
                          ex.printStackTrace();
                } 
                       finally {
                           session.close();
                       }
                       return success;
    }

    @Override
    public boolean delete(Subject su) {
       Session session = HibernateUtil.getSessionFactory().openSession();
                      if (getById(su.getSubjID()) == null) return false;
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.delete(su);
                           transaction.commit();
                           success = true;
                       }
                      catch (HibernateException hex) {
                          success = false;
                          if (transaction != null) transaction.rollback();
                         hex.printStackTrace();
                } 
                       finally {
                           session.close();
                       }
                       return success;
    }

    @Override
    public List<Subject> getAll() {
       List<Subject> ds = null;
                 Session session = HibernateUtil.getSessionFactory().openSession();
                try {
                        ds = session.createCriteria(Subject.class).list();
                } catch (HibernateException hex) {
                    hex.printStackTrace();
                } 
                finally 
                {
                    session.close();
                }
                return ds;
    }

    @Override
    public Subject getById(String id) {
          Subject sbj = null;
          Session session = HibernateUtil.getSessionFactory().openSession();
            try {

                sbj = (Subject) session.get(Subject.class, id);
            }
            catch(HibernateException hex)
            {
                hex.printStackTrace();
            }
            finally {
                session.close();
            }
            return sbj;
    }

}
