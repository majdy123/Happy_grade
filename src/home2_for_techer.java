/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Legion
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
public class home2_for_techer extends javax.swing.JFrame {

   JLabel arr1[];//for Title 
   JLabel arr2[];// for profname and Asses
   JLabel arr3[];// for CourseId
   JLabel arr4[];// for Photo courses
   JLabel arr5[];// for Photo courses title

   
    /**
     * Creates new form home
     */
   
   static int count = 0 ;
   public home2_for_techer(){
   }
    public home2_for_techer(int lenth) {
        initComponents();
        fun (lenth);
        
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        for5_courses.setVisible(false);
        for4_courses.setVisible(false);
        for6_courses.setVisible(false);
        for7_courses.setVisible(false);
        
        
        if(lenth==4){for4_courses.setVisible(true);
        for5_courses.setVisible(false);
       
        for6_courses.setVisible(false);
        for7_courses.setVisible(false);
        }
         if(lenth==5){for5_courses.setVisible(true);
          
        for4_courses.setVisible(false);
        for6_courses.setVisible(false);
        for7_courses.setVisible(false);
         }
          if(lenth==6){for6_courses.setVisible(true);
          for5_courses.setVisible(false);
        for4_courses.setVisible(false);
        
        for7_courses.setVisible(false);}
           if(lenth==7){for7_courses.setVisible(true);
           for5_courses.setVisible(false);
        for4_courses.setVisible(false);
        for6_courses.setVisible(false);
        
        
        //After Getting the name from database
        String name = "'Username Here'";
        jLabel3.setText("<html>Your Personal Page <br/>Welcome <html>"+name);
       
    }
           
           //constractor
            scaleimage__logo("src\\photo\\user_.png",user_photo);
            scaleimage__logo("src\\photo\\prop_rel.png",properties);
            scaleimage__logo("src\\photo\\botton\\cross.png",exit);
            scaleimage__logo("src\\photo\\botton\\min_rel.png",min_max);
            Setting_panel.setVisible(false);
            
    }
    
    public void scaleimage_butt1(){
        
        ImageIcon icon = new ImageIcon ("src\\photo\\white.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance( change_pass.getWidth(), change_pass.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
         change_pass.setIcon(scaledIcon);

    }
    //user_
    
    public void scaleimage__logo(String path , JLabel a){
        ImageIcon icon = new ImageIcon (path);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(a.getWidth(),a.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        a.setIcon(scaledIcon);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        min_max = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        basicbody = new javax.swing.JPanel();
        for7_courses = new javax.swing.JLabel();
        for5_courses = new javax.swing.JLabel();
        for6_courses = new javax.swing.JLabel();
        for4_courses = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        properties = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Setting_panel = new javax.swing.JPanel();
        change_pass = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        user_photo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        min_max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                min_maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                min_maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                min_maxMouseExited(evt);
            }
        });
        body.add(min_max, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 30, 30));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        body.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 30, 30));

        head.setBackground(new java.awt.Color(98, 168, 243));
        head.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        head.setForeground(new java.awt.Color(102, 102, 102));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        head.setOpaque(true);
        body.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 90));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        basicbody.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout basicbodyLayout = new javax.swing.GroupLayout(basicbody);
        basicbody.setLayout(basicbodyLayout);
        basicbodyLayout.setHorizontalGroup(
            basicbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicbodyLayout.createSequentialGroup()
                .addContainerGap(852, Short.MAX_VALUE)
                .addComponent(for4_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(for6_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(for5_courses)
                .addGap(40, 40, 40)
                .addComponent(for7_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        basicbodyLayout.setVerticalGroup(
            basicbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicbodyLayout.createSequentialGroup()
                .addGap(645, 645, 645)
                .addGroup(basicbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(for4_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(for6_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(for5_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(for7_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(basicbody);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1040, 630));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1040, 720));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propertiesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                propertiesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                propertiesMouseExited(evt);
            }
        });
        jPanel1.add(properties, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 50));

        jLabel2.setBackground(new java.awt.Color(98, 168, 243));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 90));

        jLabel3.setBackground(new java.awt.Color(98, 168, 243));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/icons8_moodle_48px_1.png"))); // NOI18N
        jLabel3.setText("Happy Grade's");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 100));

        Setting_panel.setBackground(new java.awt.Color(38, 50, 54));
        Setting_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        change_pass.setBackground(new java.awt.Color(38, 50, 54));
        change_pass.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        change_pass.setForeground(new java.awt.Color(255, 255, 255));
        change_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        change_pass.setText("Change Password");
        change_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        change_pass.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        change_pass.setOpaque(true);
        change_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                change_passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                change_passMouseExited(evt);
            }
        });
        Setting_panel.add(change_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, 320, 50));

        user_name.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setText("User Name");
        Setting_panel.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 50));
        Setting_panel.add(user_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Setting_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 20));

        jPanel1.add(Setting_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void propertiesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesMouseEntered
        // TODO add your handling code here:
        scaleimage__logo("src\\photo\\prop_press.png",properties);
    }//GEN-LAST:event_propertiesMouseEntered

    private void propertiesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesMouseExited
        // TODO add your handling code here:
        scaleimage__logo("src\\photo\\prop_rel.png",properties);
    }//GEN-LAST:event_propertiesMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        scaleimage__logo("src\\photo\\botton\\press_exit.png",exit);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        scaleimage__logo("src\\photo\\botton\\cross.png",exit);
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void min_maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_maxMouseClicked
        // TODO add your handling code here:
         this.setState(this.ICONIFIED);
    }//GEN-LAST:event_min_maxMouseClicked

    private void min_maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_maxMouseExited
        // TODO add your handling code here:
         scaleimage__logo("src\\photo\\botton\\min_rel.png",min_max);
    }//GEN-LAST:event_min_maxMouseExited

    private void min_maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_maxMouseEntered
        // TODO add your handling code here:
         scaleimage__logo("src\\photo\\botton\\min_press.png",min_max);
    }//GEN-LAST:event_min_maxMouseEntered

    private void change_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseEntered
      change_pass.setForeground(new Color(0,0,0));
      change_pass.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_change_passMouseEntered

    private void change_passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseExited
    
        change_pass.setForeground(new Color(255,255,255));
        change_pass.setBackground(new Color(38,50,54));
         change_pass.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_change_passMouseExited

    private void propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesMouseClicked
        // TODO add your handling code here:
        count++;
        if(count == 1){Setting_panel.setVisible(true);}
        if(count == 2 ){Setting_panel.setVisible(false); count = 0;}
        
    }//GEN-LAST:event_propertiesMouseClicked

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
            java.util.logging.Logger.getLogger(home_for_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_for_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_for_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_for_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home2_for_techer(5).setVisible(true);
            }
        });
        
    }
    
    public void fun (int ln){
    // iwill assume that the data base base is ready and i have 4 courses for this student 
    // now iwill generate the label i want 
    int lenth = ln ;
    Border border = BorderFactory.createLineBorder(new Color (255,204,51));
    if(lenth == 1){
        arr1 = new JLabel[1];
        arr4 = new JLabel[1];
        arr1[0]=new JLabel();
        arr4[0]=new JLabel("",JLabel.CENTER);
         arr4[0].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
    
    }
    if(lenth == 2){
        arr1 = new JLabel[1];
        arr2 = new JLabel[1];
        arr4 = new JLabel[2];
        arr1[0]=new JLabel();
        arr2[0]=new JLabel();
        arr4[0]=new JLabel("",JLabel.CENTER);
        arr4[1]=new JLabel("",JLabel.CENTER);
        arr4[0].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[1].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));

    }
    if(lenth == 3){
        arr1 = new JLabel[1];
        arr2 = new JLabel[1];
        arr3 = new JLabel[1];
        arr4 = new JLabel[3];
        arr1[0]=new JLabel();
        arr2[0]=new JLabel();
        arr3[0]=new JLabel();
        arr4[0]=new JLabel("",JLabel.CENTER);
        arr4[1]=new JLabel("",JLabel.CENTER);
        arr4[2]=new JLabel("",JLabel.CENTER);
         arr4[0].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[1].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[2].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
    
    
    }
    if(lenth == 4){
        arr1 = new JLabel[2];
        arr2 = new JLabel[1];
        arr3 = new JLabel[1];
        arr4 = new JLabel[4];
        arr1[0]=new JLabel();
        arr1[1]=new JLabel();
        arr2[0]=new JLabel();
        arr3[0]=new JLabel();
        arr4[0]=new JLabel("",JLabel.CENTER);
        arr4[1]=new JLabel("",JLabel.CENTER);
        arr4[2]=new JLabel("",JLabel.CENTER);
        arr4[3]=new JLabel("",JLabel.CENTER);
         arr4[0].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[1].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[2].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[3].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
    
    }
    if(lenth == 5){
        arr1 = new JLabel[2];
        arr2 = new JLabel[2];
        arr3 = new JLabel[1];
        arr4 = new JLabel[5];
        arr1[0]=new JLabel();
        arr1[1]=new JLabel();
        arr2[0]=new JLabel();
        arr2[1]=new JLabel();
        arr3[0]=new JLabel();
        arr4[0]=new JLabel("",JLabel.CENTER);
        arr4[1]=new JLabel("",JLabel.CENTER);
        arr4[2]=new JLabel("",JLabel.CENTER);
        arr4[3]=new JLabel("",JLabel.CENTER);
        arr4[4]=new JLabel("",JLabel.CENTER);
        arr4[0].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[1].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[2].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[3].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
        arr4[4].setFont(new Font("Trebuchet MS" ,Font.PLAIN , 14));
    }

    // initial values we will start with
    
    
    
    //first array
    int hight_photo = 100;
    int width_photo = 100; 
    int photo_Height_size = 160;
    int photo_width_size = 120;
    //2nd array
    int hight_photo2 = 300;
    int width_photo2 = 100; 
    int photo_Height_size2 = 160;
    int photo_width_size2 = 120;
    //for 3rd array
    int hight_photo3 = 500;
    int width_photo3 = 100; 
    int photo_Height_size3 = 160;
    int photo_width_size3 = 120;
    //for Desc
    int hight_des = 100;
    int width_des = 250; 
    int des_Height_size = 160;
    int des_width_size = 40;

    
       if(lenth == 5){
        arr1[0].setLocation(hight_photo,width_photo);
        arr1[0].setSize(photo_Height_size,photo_width_size);
         width_photo += 220; 
        arr1[1].setLocation(hight_photo,width_photo);
        arr1[1].setSize(photo_Height_size,photo_width_size);
        arr2[0].setLocation(hight_photo2,width_photo2);
        arr2[0].setSize(photo_Height_size2,photo_width_size2);
         width_photo2 +=220;
        arr2[1].setLocation(hight_photo2,width_photo2);
        arr2[1].setSize(photo_Height_size2,photo_width_size2);
        arr3[0].setLocation(hight_photo3,width_photo3);
        arr3[0].setSize(photo_Height_size3,photo_width_size3);
        arr4[0].setLocation(hight_des,width_des);
        arr4[0].setSize(des_Height_size,des_width_size); 
       hight_des +=200;
         arr4[1].setLocation(hight_des,width_des);
        arr4[1].setSize(des_Height_size,des_width_size); 
       hight_des +=200;
         arr4[2].setLocation(hight_des,width_des);
        arr4[2].setSize(des_Height_size,des_width_size); 
      hight_des +=200;
       hight_des = 100;
        width_des = 465; 
         arr4[3].setLocation(hight_des,width_des);
        arr4[3].setSize(des_Height_size,des_width_size); 
       hight_des +=200;
        arr4[4].setLocation(hight_des,width_des);
        arr4[4].setSize(des_Height_size,des_width_size); 
        arr4[0].setBorder(border);
        arr4[1].setBorder(border);
        arr4[2].setBorder(border);
        arr4[3].setBorder(border);
         arr4[4].setBorder(border);
        this.basicbody.add(arr1[0]);this.basicbody.add(arr1[1]);
        this.basicbody.add(arr2[1]);this.basicbody.add(arr2[0]);
        this.basicbody.add(arr3[0]);
        this.basicbody.add(arr4[0]);
        this.basicbody.add(arr4[1]);
        this.basicbody.add(arr4[2]);
        this.basicbody.add(arr4[3]);
        this.basicbody.add(arr4[4]);
    
    }
    if(lenth == 4){
        
        arr1[0].setLocation(hight_photo,width_photo);
        arr1[0].setSize(photo_Height_size,photo_width_size);
        width_photo += 220; 
        arr1[1].setLocation(hight_photo,width_photo);
        arr1[1].setSize(photo_Height_size,photo_width_size);
        arr2[0].setLocation(hight_photo2,width_photo2);
        arr2[0].setSize(photo_Height_size2,photo_width_size2);
        arr3[0].setLocation(hight_photo3,width_photo3);
        arr3[0].setSize(photo_Height_size3,photo_width_size3);
        arr4[0].setLocation(hight_des,width_des);
        arr4[0].setSize(des_Height_size,des_width_size); 
       hight_des +=200;
         arr4[1].setLocation(hight_des,width_des);
        arr4[1].setSize(des_Height_size,des_width_size); 
        hight_des +=200;
         arr4[2].setLocation(hight_des,width_des);
        arr4[2].setSize(des_Height_size,des_width_size); 
        hight_des +=200;
        hight_des = 100;
        width_des = 465; 
         arr4[3].setLocation(hight_des,width_des);
        arr4[3].setSize(des_Height_size,des_width_size); 
        arr4[0].setBorder(border);
        arr4[1].setBorder(border);
        arr4[2].setBorder(border);
        arr4[3].setBorder(border);
        this.basicbody.add(arr1[0]);this.basicbody.add(arr1[1]);
        this.basicbody.add(arr2[0]);
        this.basicbody.add(arr3[0]);
        this.basicbody.add(arr4[0]);
        this.basicbody.add(arr4[1]);
        this.basicbody.add(arr4[2]);
        this.basicbody.add(arr4[3]);
    
    }
     if(lenth == 3){
        
        arr1[0].setLocation(hight_photo,width_photo);
        arr1[0].setSize(photo_Height_size,photo_width_size);
        arr2[0].setLocation(hight_photo2,width_photo2);
        arr2[0].setSize(photo_Height_size2,photo_width_size2);
        arr3[0].setLocation(hight_photo3,width_photo3);
        arr3[0].setSize(photo_Height_size3,photo_width_size3);
        arr4[0].setLocation(hight_des,width_des);
        arr4[0].setSize(des_Height_size,des_width_size); 
       hight_des +=200;
        arr4[1].setLocation(hight_des,width_des);
        arr4[1].setSize(des_Height_size,des_width_size); 
       hight_des +=200;
        arr4[2].setLocation(hight_des,width_des);
        arr4[2].setSize(des_Height_size,des_width_size); 
        arr4[0].setBorder(border);
        arr4[1].setBorder(border);
        arr4[2].setBorder(border);
        this.basicbody.add(arr1[0]);
        this.basicbody.add(arr2[0]);
        this.basicbody.add(arr3[0]);
        this.basicbody.add(arr4[0]);
        this.basicbody.add(arr4[1]);
        this.basicbody.add(arr4[2]);
       
    
    }
      if(lenth == 2){
        
        arr1[0].setLocation(hight_photo,width_photo);
        arr1[0].setSize(photo_Height_size,photo_width_size);
        arr2[0].setLocation(hight_photo2,width_photo2);
        arr2[0].setSize(photo_Height_size2,photo_width_size2);
        arr4[0].setLocation(hight_des,width_des);
        arr4[0].setSize(des_Height_size,des_width_size); 
        hight_des +=200;
        arr4[1].setLocation(hight_des,width_des);
        arr4[1].setSize(des_Height_size,des_width_size); 
        arr4[0].setBorder(border);
        arr4[1].setBorder(border);
       
    
    }
       if(lenth == 1){
        
        arr1[0].setLocation(hight_photo,width_photo);
        arr1[0].setSize(photo_Height_size,photo_width_size);
        arr4[0].setLocation(hight_des,width_des);
        arr4[0].setSize(des_Height_size,des_width_size); 
        arr4[0].setBorder(border);

    
    }
      
   
        
        
        
    //ImageIcon icon = new ImageIcon ("src\\photo\\logo_1.png");
    
    //Adding some Dummy Data to try them 
    arr1[0].setIcon(new ImageIcon("src/CoursesGIFs/CProgrammingLanguage.gif"));
    arr2[0].setIcon(new ImageIcon("src/CoursesGIFs/ComputerArchitecture1.gif"));
    arr3[0].setIcon(new ImageIcon("src/CoursesGIFs/CriticalThinking.gif"));
    arr1[1].setIcon(new ImageIcon("src/CoursesGIFs/ComputerNetworks.gif"));
    arr2[1].setIcon(new ImageIcon("src/CoursesGIFs/DigitalElectronicDesign.gif"));
    arr4[0].setText("this is course Name");
    arr4[1].setText("this is course Name");
    arr4[2].setText("this is course Name");
    arr4[3].setText("this is course Name");
    arr4[4].setText("this is course Name");
    
    
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Setting_panel;
    private javax.swing.JPanel basicbody;
    private javax.swing.JPanel body;
    private javax.swing.JLabel change_pass;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel for4_courses;
    private javax.swing.JLabel for5_courses;
    private javax.swing.JLabel for6_courses;
    private javax.swing.JLabel for7_courses;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel min_max;
    private javax.swing.JLabel properties;
    private javax.swing.JLabel user_name;
    private javax.swing.JLabel user_photo;
    // End of variables declaration//GEN-END:variables
}
