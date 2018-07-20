/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itus.course.qc2015.king.gui;

import itus.course.qc2015.king.dao.impl.AttendanceDAO;
import itus.course.qc2015.king.model.Attendance;
import itus.course.qc2015.king.model.Student;
import itus.course.qc2015.king.model.Subject;
import itus.course.qc2015.king.util.PeriodUtil;
import itus.course.qc2015.king.util.ValidationAttending;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DiemDanh extends javax.swing.JFrame {

    /**
     * Creates new form DiemDanh
     * @param s
     */
    public DiemDanh(Student s) {
        initComponents();
        this.student = s;
        txt_greeting.setText(s.getFullName());
        
        cbbSubject.removeAll();
        Iterator<Subject> iter = s.getSubjectz().iterator();
        while (iter.hasNext()) {
        Subject ss = iter.next();
//            System.out.println(ss.getTitle());
         cbbSubject.addItem(ss.getTitle());
        }
    }
    
    private Student student;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbbSubject = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_title = new javax.swing.JTextField();
        txt_real_title = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_startdate = new javax.swing.JTextField();
        txt_finishdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_startperiod = new javax.swing.JTextField();
        txt_finishperiod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_dayinweek = new javax.swing.JTextField();
        txt_room = new javax.swing.JTextField();
        txt_greeting = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cbbSubject.setBackground(new java.awt.Color(0, 102, 255));
        cbbSubject.setForeground(new java.awt.Color(255, 255, 255));
        cbbSubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSubjectItemStateChanged(evt);
            }
        });
        cbbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSubjectActionPerformed(evt);
            }
        });

        jLabel1.setText("Course");

        jLabel2.setText("Subject Id");

        jLabel3.setText("Subject Name");

        jLabel4.setText("Finishing date");

        txt_title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txt_real_title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        txt_real_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_real_titleActionPerformed(evt);
            }
        });

        jLabel5.setText("Starting date");

        txt_startdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txt_finishdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jLabel6.setText("Starting Period");

        jLabel7.setText("Finishing Period");

        txt_startperiod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txt_finishperiod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        jLabel8.setText("Day In Week");

        jLabel9.setText("Room");

        txt_dayinweek.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txt_room.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txt_greeting.setText("Hi, Quoc Hoang");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 255));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/logout-1-20.png"))); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number Id", "Full name", "Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7", "Week 8", "Week 9", "Week 10", "Week 11", "Week 12", "Week 13", "Week 14", "Week 15"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(15).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(16).setPreferredWidth(20);
        }

        jButton3.setBackground(new java.awt.Color(0, 204, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/preferences-system-time.png"))); // NOI18N
        jButton3.setText("Checking Attendance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/3-24.png"))); // NOI18N
        jButton4.setText("refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/698909-icon-28-information-32.png"))); // NOI18N
        jButton1.setText("View Result In Detail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_real_title, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_finishdate)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(txt_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_startperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_finishperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dayinweek, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_room, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_greeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jButton3)
                                .addGap(53, 53, 53)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(263, 263, 263)))
                        .addGap(17, 17, 17))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txt_greeting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_real_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_startperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_dayinweek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txt_finishdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txt_finishperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(txt_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jButton1))
                                .addGap(41, 41, 41)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbSubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSubjectItemStateChanged
        if (cbbSubject.getSelectedIndex() < 0) return;
         Iterator<Subject> iter = this.student.getSubjectz().iterator();
         Subject s = null;
        while (iter.hasNext()) {
            Subject ss = iter.next();
            if (ss.getTitle().equals(cbbSubject.getSelectedItem().toString()))
            {
                txt_title.setText(ss.getSubjID());
                txt_real_title.setText(ss.getTitle());
                txt_startdate.setText(ss.getBeginDate().toString());
                txt_finishdate.setText(ss.getFinishDate().toString());
                txt_startperiod.setText(ss.getBeginPeriod());
                txt_finishperiod.setText(ss.getFinishPeriod());
                txt_dayinweek.setText(ss.getDay());
                txt_room.setText(ss.getRoom());
                 s = ss;
                 break;
                
            }
        }
         if (s == null) return;
          String mssv = this.student.getNumberId();
          String hovaten = this.student.getFullName();
         List<Attendance> atts = new AttendanceDAO().getByForStudent(mssv, s.getSubjID());
           DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
          int rowCount = dm.getRowCount();
          //Remove rows one by one from the end of the table
          for (int i = rowCount - 1; i >= 0; i--) {
              dm.removeRow(i);
          }
//          int idx = 1;
          
            int ii=2;
           // loop through attendance
           Object[] row = new Object[17];
            
              row[0] = mssv;
              row[1] =  hovaten;
         
              for (Attendance att : atts)
                  if (ii<17)
                          row[ii++] = att.getPresence() == 1;
               while(ii <17)
              {
                  row[ii] = false;
                  ii++;
              }
               dm.addRow( row);
    }//GEN-LAST:event_cbbSubjectItemStateChanged

    private void cbbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSubjectActionPerformed
   
    }//GEN-LAST:event_cbbSubjectActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (cbbSubject.getSelectedIndex() < 0) return;
         Iterator<Subject> iter = this.student.getSubjectz().iterator();
         Subject s = null;
        while (iter.hasNext()) {
             s = iter.next();
            if (s.getTitle().equals(cbbSubject.getSelectedItem().toString()))
            {
                break;
            }
        }
        if (s == null) return;
         
         List<Attendance> atts = new AttendanceDAO().getByForStudent(this.student.getNumberId(), s.getSubjID());
           DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
          int rowCount = dm.getRowCount();
          //Remove rows one by one from the end of the table
          for (int i=0; i<rowCount;i++)
               for (int j=2;j<17;j++) {
                
            try {
                if(ValidationAttending.isValid(s.getBeginDate(),s.getBeginPeriod(), s.getFinishPeriod(), (j-1)-1))
                {
                    int week = (j-1);
                    int presence = (true== Boolean.parseBoolean(dm.getValueAt(i, j).toString())) ? 1:0;
                    AttendanceDAO attDAO =  new AttendanceDAO();
                    Attendance att = null;
                    System.out.println(new StringBuilder().append("subjectID: ").append(s.getSubjID()).append("\n")
                            .append("studentID: ").append(this.student.getNumberId()).append("\n")
                            .append("Week: ").append(week).append("\n")
                            .append("Presence: ").append(presence)
                            .toString());
                    
                    att = new Attendance();
                    att.setStudentId(this.student.getNumberId());
                    att.setSubjectId(s.getSubjID());
                    att.setPresence(presence);
                    att.setWeek(week);
                    attDAO.add(att);
                    
                }
                else {
                    JOptionPane.showMessageDialog(null, "You're not allow to do this checking attendance cuz time over or future");
                    
                }
            } catch (ParseException ex) {
                Logger.getLogger(DiemDanh.class.getName()).log(Level.SEVERE, null, ex);
            }
 
               }
              
    }//GEN-LAST:event_jButton3ActionPerformed
private void update(JComboBox cbb, Set<Subject> list)
    {
       cbb.removeAllItems();
      Iterator<Subject> iter = list.iterator();
        while (iter.hasNext()) {
        Subject ss = iter.next();
//            System.out.println(ss.getTitle());
         cbb.addItem(ss.getTitle());
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        this.update(this.cbbSubject,this.student.getSubjectz());
        cbbSubject.setSelectedIndex(-1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (cbbSubject.getSelectedIndex() < 0) return;
         Iterator<Subject> iter = this.student.getSubjectz().iterator();
         Subject s = null;
        while (iter.hasNext()) {
             s = iter.next();
            if (s.getTitle().equals(cbbSubject.getSelectedItem().toString()))
            {
                break;
            }
        }
        if (s == null) return;
        AttendancesResult attsRes = new AttendancesResult(this.student,s );
      attsRes.setLocationRelativeTo(null);
      attsRes.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
        LoginForm login = LoginForm.getInstance();
        login.clearData();
       login.setLocationRelativeTo(null);
       login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       dispose();
        LoginForm login = LoginForm.getInstance();
        login.clearData();
       login.setLocationRelativeTo(null);
       login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txt_real_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_real_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_real_titleActionPerformed
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbSubject;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_dayinweek;
    private javax.swing.JTextField txt_finishdate;
    private javax.swing.JTextField txt_finishperiod;
    private javax.swing.JLabel txt_greeting;
    private javax.swing.JTextField txt_real_title;
    private javax.swing.JTextField txt_room;
    private javax.swing.JTextField txt_startdate;
    private javax.swing.JTextField txt_startperiod;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
}
