/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author yuman
 */
public class CustomerInput extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi();
    
    
    public CustomerInput() {
        initComponents();
        setLocationRelativeTo(null);
        title();
        showdata("");
       txtKtp.requestFocus();
       table1.setDefaultEditor(Object.class, null);
       jButton5.setEnabled(false);
        jButton1.setEnabled(false);
    }
   
   
    
    
     private void title() {
  Object[] title = {
    "Ktp_id", "Name", "Phone_number", "Address"
  };
  tabModel = new DefaultTableModel(null, title);
  table1.setModel(tabModel);
}
     
    
     
     
     private void showdata(String where) {
  try {
    st = cn.createStatement();
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();
    rs = st.executeQuery("SELECT * FROM customerinput " + where);
    
    while (rs.next()) {
      Object[] data = {
        rs.getString("Ktp_id"),
        rs.getString("Name"),
        rs.getString("Phone_number"),
        rs.getString("Address"),
      };
        tabModel.addRow(data);
    }
  } catch(Exception e) {
    e.printStackTrace();
  }
}
     
     private void reset (){
          if ((((txtKtp.getText().equals(""))&&(txtName.getText().equals("")&&(txtAddress.getText().equals("")&&(txtPhonenumber.getText().equals("")))))))
         {
             JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");
             txtKtp.requestFocus();
         }
          
          else{
     txtKtp.setText(null);
        txtName.setText(null);
        txtAddress.setText(null);
        txtPhonenumber.setText(null);   
        txtorder.setText(null);
        txtKtp.requestFocus();
        jButton4.setEnabled(true);
        jButton5.setEnabled(false);
        jButton1.setEnabled(false);
        txtFind2.setText(null);
          }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKtp = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhonenumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        txtorder = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        txtFind = new javax.swing.JButton();
        txtFind2 = new javax.swing.JTextField();
        cmb1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 186, 231));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Customer Data");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 286, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("KTP ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 160, 89, 27));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 205, 104, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("ORDER BY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 130, 27));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText("PHONE NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 165, -1, -1));

        txtKtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKtpActionPerformed(evt);
            }
        });
        txtKtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKtpKeyPressed(evt);
            }
        });
        jPanel1.add(txtKtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 161, 194, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 208, 192, -1));

        txtPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhonenumberActionPerformed(evt);
            }
        });
        txtPhonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhonenumberKeyPressed(evt);
            }
        });
        jPanel1.add(txtPhonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 161, 181, -1));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 181, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 128, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 128, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6934310_delivery_send_share_icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 120, 50));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 128, -1));

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 128, -1));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4213475_arrow_back_left_return_icon.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 34, 58, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1564534_customer_man_user_account_profile_icon.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        txtorder.setEditable(false);
        txtorder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtorderKeyPressed(evt);
            }
        });
        jPanel1.add(txtorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 181, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel7.setText("ADDRESS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 207, 83, 27));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 860, 220));

        txtFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3669253_ic_search_icon.png"))); // NOI18N
        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });
        jPanel1.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 50, 40));

        txtFind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFind2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 190, 30));

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KTP ID", "NAME", "PHONE NUMBER", "ADDRESS" }));
        jPanel1.add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reset();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtKtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKtpActionPerformed
    
        
    }//GEN-LAST:event_txtKtpActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try {
             if ((((txtKtp.getText().equals(""))&&(txtName.getText().equals("")&&(txtAddress.getText().equals("")&&(txtPhonenumber.getText().equals("")))))))
         {
             JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");}
             
              else if (txtKtp.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Ktp !!");
         txtKtp.requestFocus();
            
         }
               else if (txtName.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Name !!");
         txtName.requestFocus();
            
         }
           
                else if (txtPhonenumber.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Phonenumber !!");
         txtPhonenumber.requestFocus();
         }
                
                else if (txtAddress.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Address !!");
         txtAddress.requestFocus();
         }else{
    st = cn.createStatement();
    st.executeUpdate("INSERT INTO customerinput VALUES('" 
        + txtKtp.getText() + "','"
        + txtName.getText() + "','"
        + txtPhonenumber.getText() + "','"
        + txtAddress.getText() + "')");
    showdata("");
    JOptionPane.showMessageDialog(null, "Save Successfully");
   reset();
                }
    
   
  } catch (Exception e) {
    e.printStackTrace();
  }
        
               
        
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        try { 
            String ss;
    if(table1.getSelectedRowCount()==1){
      
         if ((((txtKtp.getText().equals(""))&&(txtName.getText().equals("")&&(txtAddress.getText().equals("")&&(txtPhonenumber.getText().equals("")))))))
         {
             JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");}
             
              else if (txtKtp.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Ktp !!");
         txtKtp.requestFocus();
            
         }
               else if (txtName.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Name !!");
         txtName.requestFocus();
            
         }
           
                else if (txtPhonenumber.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Phonenumber !!");
         txtPhonenumber.requestFocus();
         }
                
                else if (txtAddress.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Address !!");
         txtAddress.requestFocus();
                }else{
   
    ss = "update customerinput SET Name='"+txtName.getText()+"',Phone_number='"+txtPhonenumber.getText()+"',Address='"+txtAddress.getText()+"' where Ktp_id='"+txtKtp.getText()+"'";
     st = cn.createStatement();
    st.executeUpdate(ss);
    
    showdata("");
    JOptionPane.showMessageDialog(this,"Update Successfully..");
    
    reset();
                }
    }                                        
    else {
    if(table1.getRowCount()==0){
        
    JOptionPane.showMessageDialog(this,"Table Is Empty..");
    }
    else {
            JOptionPane.showMessageDialog(this,"Please Select Single Row For Update");
            }  
    }
    
       }catch (Exception e) {
    JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
       }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {

        if(table1.getSelectedRowCount()==1){
                         int dialog = JOptionPane.showOptionDialog(this, "Delete This Data?", "Delete",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);{
            
        
             if(dialog == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Delete Successfully");
            
            st = cn.createStatement();
      st.executeUpdate("DELETE FROM customerinput WHERE Ktp_id='"
          + tabModel.getValueAt(table1.getSelectedRow(), 0) + "'");
      showdata("");
      reset();
            
             
        if (dialog == JOptionPane.NO_OPTION){
            
             remove(dialog); } 
             }
        }
            
    }
 
        else{
            if(table1.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table Is Empty..");
            }else{
             JOptionPane.showMessageDialog(this, "Please Select Single Row For Delete");
            }
                      
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtKtpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKtpKeyPressed
        String Ktp = txtKtp.getText();
        int length = Ktp.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            
            
            if (length<16){
                txtKtp.setEditable(true);
            }else{
              txtKtp.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  ) {
             txtKtp.setEditable(true);
             
            }else{
                txtKtp.setEditable(false);
            }
            
        }
            
        
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtName.requestFocus();
    }//GEN-LAST:event_txtKtpKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtPhonenumber.requestFocus();
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPhonenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhonenumberKeyPressed
        String phonenumber = txtPhonenumber.getText();
        int length = phonenumber.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if (length<12){
                txtPhonenumber.setEditable(true);
            }else{
              txtPhonenumber.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  ) {
             txtPhonenumber.setEditable(true);
             
            }else{
                txtPhonenumber.setEditable(false);
            }
            
        }
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            txtAddress.requestFocus();
    }//GEN-LAST:event_txtPhonenumberKeyPressed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButton4.doClick();
    }//GEN-LAST:event_txtAddressKeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int dialogreturn = JOptionPane.showOptionDialog(this, "Are You Sure?", "Return",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);{
        
        if(dialogreturn == JOptionPane.YES_OPTION){
         Dashbord jf1 = new Dashbord();
        jf1.show();
        dispose();
        
          if (dialogreturn == JOptionPane.NO_OPTION){
             remove(dialogreturn); 
          }
        }
    }
                                  

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhonenumberActionPerformed

    private void txtorderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtorderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorderKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtorder.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");
        }else{
        int dialogreturn = JOptionPane.showOptionDialog(this, "Are You Sure?", "Confirmation",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);{

            if(dialogreturn == JOptionPane.YES_OPTION){
                CarSelection page2 =new CarSelection();
       CarSelection.txtOrderBY1.setText(txtorder.getText());
        page2.setVisible(true);
        dispose();

                if (dialogreturn == JOptionPane.NO_OPTION){
                    remove(dialogreturn);
                }
            }
        }
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       txtKtp.setText(table1.getValueAt(table1.getSelectedRow(), 0).toString());
  txtName.setText(table1.getValueAt(table1.getSelectedRow(), 1).toString());
  txtPhonenumber.setText(table1.getValueAt(table1.getSelectedRow(), 2).toString());
    txtAddress.setText(table1.getValueAt(table1.getSelectedRow(), 3).toString());
    txtorder.setText(txtName.getText());
    jButton4.setEnabled(false);
    jButton1.setEnabled(true);
    jButton5.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        DefaultTableModel table = new DefaultTableModel();
        
        table.addColumn("Ktp_id");
         table.addColumn("Name");
          table.addColumn("Phone_number");
           table.addColumn("Address");
           
           
            
           try { if (cmb1.getSelectedItem()=="KTP ID") {
               String Sql = "SELECT * FROM customerinput WHERE Ktp_id LIKE '%"+txtFind2.getText()+"%'";
                   st = cn.createStatement();
            rs = st.executeQuery(Sql );
                
               while (rs.next()) {
                   table.addRow(new Object[]{
                       rs.getString("Ktp_id"),
                       rs.getString("Name"),
                       rs.getString("Phone_number"),
                       rs.getString("Address"),
                   });
                 
               }
               table1.setModel(table);
               showdata(""); 
               
               }
           
           if (cmb1.getSelectedItem()=="NAME") {
               String a = "SELECT * FROM customerinput WHERE Name LIKE '%"+txtFind2.getText()+"%'";
                   st = cn.createStatement();
            rs = st.executeQuery(a );
                
               while (rs.next()) {
                   table.addRow(new Object[]{
                       rs.getString("Ktp_id"),
                       rs.getString("Name"),
                       rs.getString("Phone_number"),
                       rs.getString("Address"),
                   });
                 
               }
               table1.setModel(table);
               showdata(""); 
               
               }
           
            if (cmb1.getSelectedItem()=="PHONE NUMBER") {
               String b = "SELECT * FROM customerinput WHERE Phone_number LIKE '%"+txtFind2.getText()+"%'";
                   st = cn.createStatement();
            rs = st.executeQuery(b );
                
               while (rs.next()) {
                   table.addRow(new Object[]{
                       rs.getString("Ktp_id"),
                       rs.getString("Name"),
                       rs.getString("Phone_number"),
                       rs.getString("Address"),
                   });
                 
               }
               table1.setModel(table);
               showdata(""); 
               
               }
            
            if (cmb1.getSelectedItem()=="ADDRESS") {
               String c = "SELECT * FROM customerinput WHERE Address LIKE '%"+txtFind2.getText()+"%'";
                   st = cn.createStatement();
            rs = st.executeQuery(c );
                
               while (rs.next()) {
                   table.addRow(new Object[]{
                       rs.getString("Ktp_id"),
                       rs.getString("Name"),
                       rs.getString("Phone_number"),
                       rs.getString("Address"),
                   });
                 
               }
               table1.setModel(table);
               showdata(""); 
               
               }
            
        } catch (Exception e) {
                System.out.println("Find Error");
                
               }
    }//GEN-LAST:event_txtFindActionPerformed

    private void txtFind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFind2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFind2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable table1;
    public static javax.swing.JTextField txtAddress;
    private javax.swing.JButton txtFind;
    private javax.swing.JTextField txtFind2;
    public static javax.swing.JTextField txtKtp;
    public static javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtPhonenumber;
    public static javax.swing.JTextField txtorder;
    // End of variables declaration//GEN-END:variables
}
