/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itus.course.qc2015.king.gui;

import itus.course.qc2015.king.dao.impl.StudentDAO;
import itus.course.qc2015.king.dao.impl.SubjectDAO;
import itus.course.qc2015.king.model.Subject;
import java.util.List;

import javax.swing.JFileChooser;

import javax.swing.filechooser.FileNameExtensionFilter;
import itus.course.qc2015.king.model.Student;
import itus.course.qc2015.king.util.FileOperations;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CreateOption extends javax.swing.JFrame {

    /**
     * Creates new form CreateOption
     * @param sub
     */
    public CreateOption(Subject sub) {
        initComponents();
        this.subject = sub;
         System.out.print("GO TO MAKE OPTION FOR: ");
        System.out.print(this.subject.toString());
    }
    
    private Subject subject;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        radio_manual = new javax.swing.JRadioButton();
        radio_from_available_list = new javax.swing.JRadioButton();
        radio_from_file = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Option");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setFocusTraversalPolicyProvider(true);

        radio_manual.setBackground(new java.awt.Color(0, 204, 102));
        radio_manual.setForeground(new java.awt.Color(255, 255, 255));
        radio_manual.setText("Manual");
        radio_manual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        radio_from_available_list.setBackground(new java.awt.Color(0, 204, 102));
        radio_from_available_list.setForeground(new java.awt.Color(255, 255, 255));
        radio_from_available_list.setText("From Available list");

        radio_from_file.setBackground(new java.awt.Color(0, 204, 102));
        radio_from_file.setForeground(new java.awt.Color(255, 255, 255));
        radio_from_file.setText("From csv file");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_from_file)
                    .addComponent(radio_from_available_list)
                    .addComponent(radio_manual))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(radio_manual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_from_available_list)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_from_file)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/13-24.png"))); // NOI18N
        jButton1.setText("Next");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (radio_manual.isSelected())
        {
            NewStudent ST = new NewStudent(this.subject);
            ST.setLocationRelativeTo(null);
            ST.setVisible(true);
        }
        else if (radio_from_available_list.isSelected())
            new ListStudent("").setVisible(true);
        else if (radio_from_file.isSelected())
        {
             JFileChooser chooser = new JFileChooser("C:/users");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV files (*csv)", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
                 
                 try {
                     //System.out.println(chooser.getSelectedFile().getAbsolutePath());
                     List<Student> students = FileOperations.readLineByLineAndBuildList(chooser.getSelectedFile().getAbsolutePath());
                     StudentDAO stuDAO = new StudentDAO();
                     SubjectDAO subDAO = new SubjectDAO();
                     students.stream().map((s) -> {
                         System.out.println("NumberID length: "+s.getNumberId().length());
                         return s;
                     }).map((s) -> {
                         stuDAO.add(s);
                         return s;
                     }).forEachOrdered((s) -> {
                         this.subject.getStudents().add(s);
                     });
                     if (subDAO.update(this.subject))
                     {
                         JOptionPane.showMessageDialog(null,"Create successfully!"); 
                     }
            
//           {
//               preSetting(chooser.getSelectedFile());
//                JOptionPane.showMessageDialog(this, "Setting done. It's time to ?njoying!");
//                SettingDone = true;
//                updateDatabaseResources();
//                jTextField1.grabFocus();
//               
//           } catch (IOException ex) {
//               Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
//           }
//JOptionPane.showMessageDialog(null,"Create successfully!"); 
                 } catch (IOException ex) {
                     Logger.getLogger(CreateOption.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radio_from_available_list;
    private javax.swing.JRadioButton radio_from_file;
    private javax.swing.JRadioButton radio_manual;
    // End of variables declaration//GEN-END:variables
}
