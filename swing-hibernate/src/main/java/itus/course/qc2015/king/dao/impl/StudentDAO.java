package itus.course.qc2015.king.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import itus.course.qc2015.king.dao.baseDAO;
import itus.course.qc2015.king.model.Attendance;
import itus.course.qc2015.king.model.Student;
import itus.course.qc2015.king.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.mindrot.jbcrypt.BCrypt;

public class StudentDAO implements baseDAO<Student> {

        public List<Student> getNotInCourse(String subjecID) {
            return null;
            
        }
 
        @Override
	public boolean add(Student s) {
                        Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction transaction = null;
                        boolean success;
                        try {
                                transaction = session.beginTransaction();
                                session.save(s);
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
	public boolean update(Student s) {
                    
                     Session session = HibernateUtil.getSessionFactory().openSession();
                      if (getById(s.getNumberId()) == null) return false;
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.update(s);
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
	public boolean delete(Student s) {
                    Session session = HibernateUtil.getSessionFactory().openSession();
                      if (getById(s.getNumberId()) == null) return false;
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.delete(s);
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
	public List<Student> getAll() {
     
                List<Student> ds = null;
                 Session session = HibernateUtil.getSessionFactory().openSession();
                try {
                        ds = session.createCriteria(Student.class).list();
                } catch (HibernateException ex) {
                   ex.printStackTrace();
                } 
                finally 
                {
                    session.close();
                }
                return ds;
	}

        @Override
	public Student getById(String id) {
                        Student sv = null;
                        Session session = HibernateUtil.getSessionFactory().openSession();
                         try {
                              
                             sv = (Student) session.get(Student.class, id);
                         }
                         catch(HibernateException hex)
                         {
                             hex.printStackTrace();
                         }
                         finally {
                             session.close();
                         }
                         return sv;
	}
        
                   public Student authenticate(String username, String password)
                   {
                       Student st = null;
                       Session session = HibernateUtil.getSessionFactory().openSession();
                       try {
                           session.beginTransaction();
                           Criteria criteria  = session.createCriteria(Student.class);
                           criteria.add(Restrictions.eq("UserName", username));
                           
                           st = (Student) criteria.uniqueResult();
                            session.getTransaction().commit();

                       }
                       catch (HibernateException e) {
                           e.printStackTrace();
                            session.getTransaction().rollback();
                        }
                       finally {
                           session.close();
                       }
                       if (st == null) return null;
                       else {
                           if (BCrypt.checkpw(password, st.getEncrytedPassword()))
                               return st;
                           else return null;
                       }
                   }

}
