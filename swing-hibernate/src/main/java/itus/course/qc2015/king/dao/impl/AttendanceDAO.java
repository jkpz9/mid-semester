package itus.course.qc2015.king.dao.impl;

import itus.course.qc2015.king.dao.baseDAO;
import itus.course.qc2015.king.model.Attendance;
import itus.course.qc2015.king.model.Student;
import itus.course.qc2015.king.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AttendanceDAO implements baseDAO<Attendance> {
     public  List<Attendance> getByForSubject(String subjectId) {
                        List<Attendance> att = null;
                        Session session = HibernateUtil.getSessionFactory().openSession();
                         try {
                              
                          String hql = "FROM Attendance A WHERE A.SubjectId=:subjectId";
                            Query query = session.createQuery(hql);
                            query.setParameter("subjectId", subjectId);
                            att = query.list();
                         }
                         catch(HibernateException hex)
                         {
                             hex.printStackTrace();
                         }
                         finally {
                             session.close();
                         }
                         return  att;
    }
    public  List<Attendance> getByForStudent(String studentId, String subjectId) {
                        List<Attendance> att = null;
                        Session session = HibernateUtil.getSessionFactory().openSession();
                         try {
                              
                          String hql = "FROM Attendance A WHERE A.SubjectId=:subjectId and A.StudentId=:studentId";
                            Query query = session.createQuery(hql);
                            query.setParameter("subjectId", subjectId);
                            query.setParameter("studentId", studentId);
                            att = query.list();
                         }
                         catch(HibernateException hex)
                         {
                             hex.printStackTrace();
                         }
                         finally {
                             session.close();
                         }
                         return  att;
    }
    public Attendance getByIdentifier(String studentId, String subjectId, int week) {
                        List<Attendance> att = null;
                        Session session = HibernateUtil.getSessionFactory().openSession();
                         try {
                              
                          String hql = "FROM Attendance A WHERE A.Week = :week and A.SubjectId=:subjectId and A.StudentId=:studentId";
                            Query query = session.createQuery(hql);
                            query.setParameter("week",week);
                            query.setParameter("subjectId", subjectId);
                            query.setParameter("studentId", studentId);
                            att = query.list();
                         }
                         catch(HibernateException hex)
                         {
                             hex.printStackTrace();
                         }
                         finally {
                             session.close();
                         }
                         return  att != null ? (att.size() > 0 ? att.get(0) : null) : null;
    }
    @Override
    public boolean add(Attendance att) {
         Session session = HibernateUtil.getSessionFactory().openSession();
                        Transaction transaction = null;
                        boolean success;
                        try {
                                transaction = session.beginTransaction();
                                session.save(att);
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
    public boolean update(Attendance att) {
         Session session = HibernateUtil.getSessionFactory().openSession();
                      if (getByIdentifier(att.getSubjectId(), att.getStudentId(),att.getWeek()) == null) return false;
                      Transaction transaction = null;
                        boolean success;
                       try {
                          transaction = session.beginTransaction();
                           session.update(att);
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
    public boolean delete(Attendance entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Attendance> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attendance getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
