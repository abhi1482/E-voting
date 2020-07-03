/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoting1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author dell
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        tf1.setBorder(def);
        pass.setBorder(def);
        
        tf1.requestFocus();
        
        pass.setEchoChar((char)'$');
    }
    
    int fails=0;
    
    Color defC=new Color(0,153,153);
    Color errorC=new Color(153,0,0);
    Color grantC=new Color(51,204,0);
    
    Border def=new LineBorder(defC,2);
    Border error=new LineBorder(errorC,2);
    Border grant=new LineBorder(grantC,2);
    
    String name="";
    String status="login";
    String access="";
    String code="";    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        log = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        errorU = new javax.swing.JLabel();
        errorP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evoting1/login lock.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("User Name    :");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Password      :");

        tf1.setForeground(new java.awt.Color(102, 102, 255));
        tf1.setToolTipText("UserName");
        tf1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tf1.setOpaque(false);
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });

        pass.setForeground(new java.awt.Color(102, 102, 255));
        pass.setToolTipText("Password");
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        pass.setOpaque(false);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        log.setBackground(new java.awt.Color(0, 0, 102));
        log.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        log.setForeground(new java.awt.Color(255, 153, 153));
        log.setText("Login");
        log.setOpaque(false);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        reg.setBackground(new java.awt.Color(0, 0, 102));
        reg.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 153, 153));
        reg.setText("Register");
        reg.setOpaque(false);
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        errorU.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        errorU.setForeground(new java.awt.Color(255, 204, 51));

        errorP.setForeground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf1)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errorP, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(595, 595, 595))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errorU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass))
                .addGap(86, 86, 86)
                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    if(code.equals("")){
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            String query="select *from SecretCode;";
            ResultSet rs=stmt.executeQuery(query);
            while (rs.next()){
                code=rs.getString(1);
                }
            con.close();
            stmt.close();
            rs.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    }//GEN-LAST:event_formWindowGainedFocus

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
name=tf1.getText().trim();
String pas=new String(pass.getPassword());
String password=null;

errorU.setText("");
tf1.setBorder(def);
pass.setBorder(def);
errorP.setText("");

switch(status){
    case "login":
        Thread t=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(100);
                    if(name.equals("")){
                        errorU.setText("! Enter your User Name");
                        tf1.setBorder(error);
                    }else if(name.length()<5){
                        errorU.setText("! User Name too Short");
                        tf1.setBorder(error);
                    }else{
                        try{
                            Class.forName("java.sql.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            String query="select *from admins where name='"+name+"';";
            
            ResultSet rs=stmt.executeQuery(query);
            
            if(rs.next()==true){
                            pass.requestFocus();
                            errorU.setText("");
                            tf1.setBorder(grant);
                            status="login";
                        }else{
                int confirm=JOptionPane.showConfirmDialog(null,"User Name does not Exist \nDo you want to Register as "+name+"?","Login info",JOptionPane.YES_OPTION,WIDTH);
                
                switch (confirm){
                    case 0:
                        status="register";
                        pass.requestFocus();
                        errorU.setText("");
                        tf1.setBorder(grant);
                        errorP.setText("");
                        pass.setBorder(def);
                        break;
                        
                    case 1:
                        status="login";
                        errorU.setText("! Wrong User Name");
                        tf1.setBorder(error);
                }
            }
            con.close();
            rs.close();
            stmt.close();
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null,e.getMessage());
                        }
                    }
                }catch (InterruptedException ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        };
        t.start();
        
        if(tf1.getBorder()==error){
            errorP.setText("");
            pass.setBorder(def);
            Thread t1=new Thread(){
               @Override
               public void run(){
                try{
                sleep(100);
                pass.setBorder(error);
                errorP.setText("! Check the User Name");
            }catch (InterruptedException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
            }
            }
        };
        t1.start();
}else if(pas.equals("")){
        errorP.setText("");
        pass.setBorder(def);
        
        Thread t1=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(100);
                    pass.setBorder(error);
                    errorP.setText("! Enter your Password");
                    
                }catch (InterruptedException ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        };
        t1.start();
        
        
        }else{
        try{
           Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            String query="Select password from admins where name='"+name+"';";
            ResultSet rs=stmt.executeQuery(query);
            
            while (rs.next()){
               password=rs.getString("password");
            
            }
          /*  con.close();
            stmt.close();
            rs.close();*/
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
       if(pass.getText().equals(password)){
            errorP.setText("");
            pass.setBorder(def);
            
            Thread t1=new Thread(){
                @Override
                public void run(){
                    try{
                        sleep(100);
                        errorP.setText("");
                        pass.setBorder(grant);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,ex.getMessage());
                    }
                }
            };
            t1.start();
            
            access="Granted";
            JOptionPane.showMessageDialog(null,"Access Granted","ACCESS INFO",JOptionPane.WIDTH);
            JOptionPane.showMessageDialog(null,"Welcome " +name.toUpperCase(), "Welcome ",JOptionPane.WIDTH);
            Main main=new Main();
            main.setVisible(true);
            this.dispose();
        }else{
            errorP.setText("");
            pass.setBorder(def);
            
            Thread t1=new Thread(){
                @Override
                public void run(){
                    try{
                        sleep(100);
                        errorP.setText("! Wrong Password");
                        pass.setBorder(error);
                    }catch(InterruptedException ex){
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            };
            t1.start();
            fails +=1;
            access="Denied";
            
            switch (fails){
                case 3:
                    JOptionPane.showMessageDialog(null,"FINAL ATTEMPT \nPlease Check your Info and try again","ALERT",JOptionPane.WIDTH);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null,"YOU HAVE BEEN CAUGHT","ACCESS DENIED",JOptionPane.WIDTH);
                    System.exit(0);
                    break;
            }
        }
       
        
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            
            String query="insert into login_info values('"+name+"',now(),'"+access+"');";
            stmt.executeUpdate(query);
            con.close();
            stmt.close();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        }
        break;
    case "register":
        JOptionPane.showMessageDialog(this,"The User Name does not exist \nPlease Click on Register","info",WIDTH);
        break;
        }
    }//GEN-LAST:event_logActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
name=tf1.getText().trim();
String pas=new String(pass.getPassword());
errorU.setText("");
tf1.setBorder(def);
pass.setBorder(def);
errorP.setText("");

try{
    sleep(100);
    if(name.equals("")){
        errorU.setText("! Enter you User Name");
        tf1.setBorder(error);
    }else if (name.length()<5){
        errorU.setText("! User Name too Short");
        tf1.setBorder(error);
    }else{
        
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            String query="Select *from admins where name='"+name+"';";
            ResultSet rs=stmt.executeQuery(query);
            
            if(rs.next()==true){
                errorU.setText("");
                tf1.setBorder(grant);
                JOptionPane.showMessageDialog(null,"User Name already exists \nPlease Click on Login","Info",WIDTH);
                status="login";
            }else{
                errorU.setText("");
                tf1.setBorder(grant);
                status="register";
            }
            con.close();
            rs.close();
            stmt.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}catch(InterruptedException ex){
    Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
}
if(status.equals("register")){
    if(pas.length()<8){
        errorP.setText("");
        pass.setBorder(def);
        pass.requestFocus();
        
        Thread t1=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(100);
                    errorP.setText("! Password less than 8 Characters");
                    pass.setBorder(error);
                }catch(InterruptedException ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        t1.start();
    }else{
        errorP.setText("");
        pass.setBorder(grant);
        
        String Reg=JOptionPane.showInputDialog(this,"Please Enter the Secret Code to Register","Secret Code");
        
        if(Reg.equals(code)){
            errorP.setText("");
            pass.setBorder(grant);
            access="Registered";
            try{
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
                Statement stmt=con.createStatement();
                
                String query="insert into admins values('"+tf1.getText()+"','"+pass.getText()+"');";
                
                stmt.executeUpdate(query);
                
                con.close();
                stmt.close();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
            JOptionPane.showMessageDialog(null,"Welcome" +name.toUpperCase(),"Welcome",JOptionPane.WIDTH);
            new Main().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Wrong Secret Code");
        }
    }
}
    }//GEN-LAST:event_regActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    pass.requestFocus(true);
}
    }//GEN-LAST:event_tf1KeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    name=tf1.getText().trim();
String pas=new String(pass.getPassword());
String password=null;

errorU.setText("");
tf1.setBorder(def);
pass.setBorder(def);
errorP.setText("");

switch(status){
    case "login":
        Thread t=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(100);
                    if(name.equals("")){
                        errorU.setText("! Enter your User Name");
                        tf1.setBorder(error);
                    }else if(name.length()<5){
                        errorU.setText("! User Name too Short");
                        tf1.setBorder(error);
                    }else{
                        try{
                            Class.forName("java.sql.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            String query="select *from admins where name='"+name+"';";
            
            ResultSet rs=stmt.executeQuery(query);
            
            if(rs.next()==true){
                            pass.requestFocus();
                            errorU.setText("");
                            tf1.setBorder(grant);
                            status="login";
                        }else{
                int confirm=JOptionPane.showConfirmDialog(null,"User Name does not Exist \nDo you want to Register as "+name+"?","Login info",JOptionPane.YES_OPTION,WIDTH);
                
                switch (confirm){
                    case 0:
                        status="register";
                        pass.requestFocus();
                        errorU.setText("");
                        tf1.setBorder(grant);
                        errorP.setText("");
                        pass.setBorder(def);
                        break;
                        
                    case 1:
                        status="login";
                        errorU.setText("! Wrong User Name");
                        tf1.setBorder(error);
                }
            }
            con.close();
            rs.close();
            stmt.close();
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(null,e.getMessage());
                        }
                    }
                }catch (InterruptedException ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        };
        t.start();
        
        if(tf1.getBorder()==error){
            errorP.setText("");
            pass.setBorder(def);
            Thread t1=new Thread(){
               @Override
               public void run(){
                try{
                sleep(100);
                pass.setBorder(error);
                errorP.setText("! Check the User Name");
            }catch (InterruptedException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
            }
            }
        };
        t1.start();
}else if(pas.equals("")){
        errorP.setText("");
        pass.setBorder(def);
        
        Thread t1=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(100);
                    pass.setBorder(error);
                    errorP.setText("! Enter your Password");
                    
                }catch (InterruptedException ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        };
        t1.start();
        
        
        }else{
        try{
           Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            String query="Select password from admins where name='"+name+"';";
            ResultSet rs=stmt.executeQuery(query);
            
            while (rs.next()){
               password=rs.getString("password");
            
            }
          /*  con.close();
            stmt.close();
            rs.close();*/
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
       if(pass.getText().equals(password)){
            errorP.setText("");
            pass.setBorder(def);
            
            Thread t1=new Thread(){
                @Override
                public void run(){
                    try{
                        sleep(100);
                        errorP.setText("");
                        pass.setBorder(grant);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,ex.getMessage());
                    }
                }
            };
            t1.start();
            
            access="Granted";
            JOptionPane.showMessageDialog(null,"Access Granted","ACCESS INFO",JOptionPane.WIDTH);
            JOptionPane.showMessageDialog(null,"Welcome " +name.toUpperCase(), "Welcome ",JOptionPane.WIDTH);
            Main main=new Main();
            main.setVisible(true);
            this.dispose();
        }else{
            errorP.setText("");
            pass.setBorder(def);
            
            Thread t1=new Thread(){
                @Override
                public void run(){
                    try{
                        sleep(100);
                        errorP.setText("! Wrong Password");
                        pass.setBorder(error);
                    }catch(InterruptedException ex){
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            };
            t1.start();
            fails +=1;
            access="Denied";
            
            switch (fails){
                case 3:
                    JOptionPane.showMessageDialog(null,"FINAL ATTEMPT \nPlease Check your Info and try again","ALERT",JOptionPane.WIDTH);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null,"YOU HAVE BEEN CAUGHT","ACCESS DENIED",JOptionPane.WIDTH);
                    System.exit(0);
                    break;
            }
        }
       
        
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
            Statement stmt=con.createStatement();
            
            String query="insert into login_info values('"+name+"',now(),'"+access+"');";
            stmt.executeUpdate(query);
            con.close();
            stmt.close();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        }
        break;
    case "register":
        JOptionPane.showMessageDialog(this,"The User Name does not exist \nPlease Click on Register","info",WIDTH);
        break;
        }
}
    }//GEN-LAST:event_passKeyPressed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 for(double a=0.0;a<=1.0;a+=0.1){
        String b=a+"F";
        Float f=Float.valueOf(b);
        this.setOpacity(f);
        try{
            Thread.sleep(100);
        }catch(Exception e){
            
        }}
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorP;
    private javax.swing.JLabel errorU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton reg;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
