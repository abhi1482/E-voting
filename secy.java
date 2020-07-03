/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoting1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class secy extends javax.swing.JFrame {

    /**
     * Creates new form Secret_Code_M
     */
    public secy() {
        initComponents();
        pass1.setBorder(def);
        pass2.setBorder(def);
        errorP.setText("");
        errorP1.setText("");
        pass1.requestFocus();
        pass1.setEchoChar((char)'$');
        pass2.setEchoChar((char)'$');
    }
public secy(String a){
    initComponents();
    base=a;
}
Color defC=new Color(0,153,153);
Color errorC=new Color(153,0,0);
Color grantC=new Color(51,204,0);
Border def=new LineBorder(defC,2);
Border error=new LineBorder(errorC,2);
Border grant=new LineBorder(grantC,2);
String base="";
String sec1="";
String sec2="";
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
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        checky = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        errorP = new javax.swing.JLabel();
        errorP1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evoting1/sec.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Snap ITC", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 0));
        jLabel2.setText("Secret Code...");

        jLabel3.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Secret Code    :");

        jLabel4.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Re-enter Secret Code    :");

        pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass1KeyReleased(evt);
            }
        });

        pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pass2MouseReleased(evt);
            }
        });
        pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass2KeyReleased(evt);
            }
        });

        checky.setBackground(new java.awt.Color(0, 51, 204));
        checky.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        checky.setForeground(new java.awt.Color(153, 255, 153));
        checky.setText("Show Secret Code");
        checky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkyActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        errorP.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        errorP.setForeground(new java.awt.Color(153, 255, 153));

        errorP1.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        errorP1.setForeground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checky)
                            .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorP1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(errorP1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(checky, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass1KeyReleased
    errorP.setText("");
    pass1.setBorder(def);
    sec1=new String(pass1.getPassword());
    Thread t=new Thread(){
        @Override
        public void run(){
            if (sec1.length()>=4 && sec1.length()<=16){
                errorP.setText("");
                pass1.setBorder(grant);
            } else if (sec1.equals("")){
                try{
                    sleep(100);
                }catch (InterruptedException ex){
                    Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
                }
                errorP.setText("! Enter a Secret Code");
                pass1.setBorder(error);
            }else if(sec1.length()<4){
                try{
                    sleep(100);
                }catch (InterruptedException ex){
                    Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
                }
                errorP.setText("! Secret Code too Short");
                pass1.setBorder(error);
            }else if(sec1.length()>16){
                try{
                    sleep(100);
                }catch (InterruptedException ex){
                    Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
                }
                errorP.setText("! Secret Code too Long");
                pass1.setBorder(error);
            }
        }
    };
    t.start();
    if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(sec1.length()>=4 && sec1.length()<=16){
            errorP.setText("");
            pass1.setBorder(grant);
            pass2.requestFocus();
        }
    }
    }//GEN-LAST:event_pass1KeyReleased

    private void pass2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2MouseReleased
sec1=new String(pass1.getPassword());
errorP.setText("");
pass1.setBorder(def);

errorP1.setText("");
pass1.setBorder(def);

Thread t=new Thread(){
    @Override
    
    public void run(){
        try{
            sleep(100);
            if(sec1.length()>=4 && sec1.length()<=16){
                errorP.setText("");
                pass1.setBorder(grant);
            }else if(sec1.equals("")){
                errorP.setText("! Enter a Secret Code");
                pass1.setBorder(error);
            }else if(sec1.length()<4){
                errorP.setText("! Secret Code too Short");
                pass1.setBorder(error);
            }else if(sec1.length()>16){
                errorP.setText("! Secret Code too Long");
                pass1.setBorder(error);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
};
t.start();
    }//GEN-LAST:event_pass2MouseReleased

    private void checkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkyActionPerformed
if(checky.isSelected()){
    pass1.setEchoChar((char)0);
    pass2.setEchoChar((char)0);
}else{
    pass1.setEchoChar((char)'$');
    pass2.setEchoChar((char)'$');
}
    }//GEN-LAST:event_checkyActionPerformed

    private void pass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass2KeyReleased
sec2=new String(pass2.getPassword());
errorP1.setText("");
pass2.setBorder(def);

if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    if(sec2.equals(sec1)&&pass1.getBorder()==grant){
        if(base.equals("proceed")){
            try{
                Class.forName("java.sql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
                Statement stmt=con.createStatement();
                
                String query="insert into SecretCode values('"+sec1+"');";
                stmt.executeQuery(query);
                
                con.close();
                stmt.close();
                
                JOptionPane.showMessageDialog(null,"Added new Secret Code");
                String a="secy";
                
                new Instructions(a).setVisible(true);
                this.dispose();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(base.equals("Tools")){
            try{
                Class.forName("java.sql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
                Statement stmt=con.createStatement();
                
                String query="update SecretCode set code='"+sec1+"';";
                stmt.executeUpdate(query);
                
                con.close();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Secret Code Changed");
                
                new Tools().setVisible(true);
                this.dispose();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }
}
Thread t=new Thread(){
    @Override
    public void run(){
        if (sec1.length()>=4&&sec1.length()<=16){
            errorP.setText("");
            pass1.setBorder(grant);
        }else if(sec1.equals("")){
            try{
                sleep(100);
            }catch (InterruptedException ex){
                Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
            }
            errorP.setText("! Enter a Secret Code");
            pass1.setBorder(error);
        }else if(sec1.length()<4){
            try{
                sleep(100);
            }catch (InterruptedException ex){
                Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
            }
            errorP.setText("! Secret Code too Short");
            pass1.setBorder(error);
        }else if(sec1.length()>16){
            try{
                sleep(100);
            }catch (InterruptedException ex){
                Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
            }
            errorP.setText("! Secret Code too Long");
            pass1.setBorder(error);
        }
        if (sec2.equals(sec1)&&pass1.getBorder()==grant){
            errorP1.setText("");
            pass2.setBorder(grant);
        }else{
            errorP1.setText("! Secret Codes do not Match");
            pass2.setBorder(error);
        }
    }
};
t.start();
    }//GEN-LAST:event_pass2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (pass1.getBorder()==grant && pass2.getBorder()==grant){
    if(jButton1.getText().equals("proceed")){
        try{
           Class.forName("java.sql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
                Statement stmt=con.createStatement();
                
                String query="insert into SecretCode values('"+sec1+"');";
                stmt.executeQuery(query);
                
                con.close();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Added new Secret Code");
                String a="secy";
                new Instructions(a).setVisible(true);
                this.dispose();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }base="Tools";
    if(base.equals("Tools")){
        try{
            Class.forName("java.sql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://localhost/skullx","root","admin");
                Statement stmt=con.createStatement();
                
                String query="update SecretCode set code='"+sec1+"';";
                stmt.executeUpdate(query);
                
                con.close();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Secret Code Changed");
                
                new Instructions().setVisible(true);
                this.dispose();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}else{
    errorP.setText("");
    pass1.setBorder(def);
    errorP1.setText("");
    pass2.setBorder(def);
    
    Thread t=new Thread(){
        @Override
        public void run(){
            try{
                sleep(100);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            if(sec1.length()>=4 && sec1.length()<=16){
                errorP.setText("");
                pass1.setBorder(grant);
            }else if(sec1.equals("")){
                try{
                    
                    sleep(100);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                errorP.setText("! Enter a Secret Code");
                pass1.setBorder(error);
            }else if(sec1.length()<4){
                try{
                    sleep(100);
                }catch (InterruptedException ex){
                    Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
                }
                errorP.setText("! Secret Code too Short");
                pass1.setBorder(error);
            }else if(sec1.length()>16){
                try{
                    sleep(100);
                }catch(InterruptedException ex){
                    Logger.getLogger(secy.class.getName()).log(Level.SEVERE,null,ex);
                }
                errorP.setText("! Secret Code too Long");
                pass1.setBorder(error);
            }
            if(sec2.equals(sec1)&& pass1.getBorder()==grant){
                errorP1.setText("");
                pass2.setBorder(grant);
            }else{
                errorP1.setText("! Secret Codes do not Match");
                pass2.setBorder(error);
            }
        }
    };
    t.start();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
/*try{
    String a="1234";
        Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/skullx/SecretCode","root","admin");
    Statement stmt=con.createStatement();
    String secode="insert into SecretCode values (a);";
    stmt.executeUpdate(secode);
    con.close();
    stmt.close();
}catch(Exception e){
}*/
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 /*for(double a=0.0;a<=1.0;a+=0.1){
        String b=a+"F";
        Float f=Float.valueOf(b);
        this.setOpacity(f);
        try{
            Thread.sleep(100);
        }catch(Exception e){
            
        }}*/
    }//GEN-LAST:event_formWindowActivated

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(secy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checky;
    private javax.swing.JLabel errorP;
    private javax.swing.JLabel errorP1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    // End of variables declaration//GEN-END:variables
}
