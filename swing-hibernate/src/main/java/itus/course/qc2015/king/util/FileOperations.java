/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itus.course.qc2015.king.util;

import itus.course.qc2015.king.model.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

public class FileOperations {
      public static Student extract(String str,String separator)
      {
          String[] token= str.split(separator);
          Student s = new Student();
          s.setNumberId(token[0]);
          s.setFullName(token[1]);
          s.setCourse(Integer.parseInt(token[2]));
          s.setMajor(token[3]);
          
          s.setUserName(token[0]);
          String hashedpassword = BCrypt.hashpw(s.getNumberId(), BCrypt.gensalt());
          s.setEncrytedPassword(hashedpassword);
          return s;
          
      }
      public static void makeFileTemplate(String file, int n) throws IOException 
        {
                    
            File fileDir = new File(file);
            
            // check if it's a file
            if (!fileDir.isFile()) 
                return;

            File tempFile = new File(fileDir.getAbsolutePath());
            
        
             Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile), "UTF8"));
              int line =0;
              
              while (++line <= n)
              {
                  StringBuilder sb = new StringBuilder();
                  sb.append("MSSV").append(line).append(",")
                          .append("HOvaTen").append(line).append(",")
                          .append("Khoa").append(line).append(",")
                          .append("ChuyenNganh").append(line);
                  out.write(sb.toString());
                  out.write(System.getProperty("line.separator"));
                  out.flush();
              }
    }
      public static List<Student> readLineByLineAndBuildList(String filePath) throws IOException
	{	
             List<Student> students = new ArrayList<>();
        try {
	     File fileDir = new File(filePath);
			
                try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"))) 
                {
                    String str;

                    while ((str = in.readLine()) != null) 
                    {
                        Student s = extract(str, ",");
                        students.add(s);
                    }
                }
	  } 
        catch (UnsupportedEncodingException e) 
        {
                    System.out.println(e.getMessage());
        } 
        catch (IOException e) 
        {
                    System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
                    System.out.println(e.getMessage());
        }

        return students;
	}

}
