package itus.course.qc2015.king.dao.impl;

import itus.course.qc2015.king.dao.baseDAO;
import itus.course.qc2015.king.model.Teacher;
import itus.course.qc2015.king.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.mindrot.jbcrypt.BCrypt;

public class TeacherDAO implements baseDAO<Teacher> {

    @Override
    public boolean add(Teacher tc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction transaction = null;
                        boolean success;
                        try {
                                transaction = session.beginTransaction();
                                session.save(tc);
                                transaction.commit();
                                success = true;
                        }
                        catch(HibernateException hex) {
                                if (transaction != null) transaction.rollback();
                                System.out.println(hex);
                                success = false;
                        }
                        finally {
                                session.close();
                        }

                        return success;	
    }

    @Override
    public boolean update(Teacher t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
                      if (getById(t.getId()) == null) return false;
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.update(t);
                           transaction.commit();
                           success = true;
                       }
                      catch (HibernateException ex) {
                          success = false;
                          if (transaction != null) transaction.rollback();
                          System.err.println(ex);
                } 
                       finally {
                           session.close();
                       }
                       return success;
    }

    @Override
    public boolean delete(Teacher t) {
       Session session = HibernateUtil.getSessionFactory().openSession();
                      if (getById(t.getId()) == null) return false;
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.delete(t);
                           transaction.commit();
                           success = true;
                       }
                      catch (HibernateException ex) {
                          success = false;
                          if (transaction != null) transaction.rollback();
                          System.err.println(ex);
                } 
                       finally {
                           session.close();
                       }
                       return success;
    }

    @Override
    public List<Teacher> getAll() {
       List<Teacher> ds = null;
                 Session session = HibernateUtil.getSessionFactory().openSession();
                try {
                        ds = session.createCriteria(Teacher.class).list();
                } catch (HibernateException ex) {
                    System.err.println(ex);
                } 
                finally 
                {
                    session.close();
                }
                return ds;
    }

    @Override
    public Teacher getById(String id) {
          Teacher tc = null;
                         try {
                              Session session = HibernateUtil.getSessionFactory().openSession();
                             tc = (Teacher) session.get(Teacher.class, id);
                         }
                         catch(HibernateException hex)
                         {
                             System.err.println(hex);
                         }
                         return tc;
    }
    
     public Teacher authenticate(String username, String password)
                   {
                       Teacher tc = null;
                       Session session = HibernateUtil.getSessionFactory().openSession();
                       try {
                           session.beginTransaction();
                           Criteria criteria  = session.createCriteria(Teacher.class);
                           criteria.add(Restrictions.eq("UserName", username));
                           
                           tc = (Teacher) criteria.uniqueResult();
                            session.getTransaction().commit();

                       }
                       catch (HibernateException e) {
                           System.err.println(e);
                            session.getTransaction().rollback();
                        }
                       if (tc == null) return null;
                       else {
                           if (BCrypt.checkpw(password, tc.getEncrytedPassword()))
                               return tc;
                           else return null;
                       }
                   }

}
