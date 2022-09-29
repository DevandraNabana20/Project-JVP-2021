/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import com.sun.org.apache.bcel.internal.generic.Select;
import java.awt.event.KeyEvent;
import java.util.Optional;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
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
public class CarListUpdate extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi();
    
    public CarListUpdate() {
        initComponents();
        setLocationRelativeTo(null);
       title();
        showdata("");
        txtLicense.requestFocus();
        table2.setDefaultEditor(Object.class, null);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
    }
    
    public void title() {
  Object[] title = {
    "License_plateid", "Status", "Brand", "Production", "Type", "Color", "Price"
  };
  tabModel = new DefaultTableModel(null, title);
  table2.setModel(tabModel);
}
    
     public void showdata(String where) {
  try {
    st = cn.createStatement();
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();
    rs = st.executeQuery("SELECT * FROM cartable Where Status like 'y' " + where);
    
    while (rs.next()) {
      Object[] data = {
        rs.getString("License_plateid"),
         rs.getString("Status"),  
        rs.getString("Brand"),
        rs.getString("Production"),
        rs.getString("Type"),
         rs.getString("Color"),
        rs.getString("Price"),
      };
        tabModel.addRow(data);
    }
  } catch(Exception e) {
    e.printStackTrace();
  }
}
     private void reset (){
         if ((((txtLicense.getText().equals(""))&&(txtBrand.getSelectedItem().equals("Please Select Brand...")&&(txtProduction.getSelectedItem().equals("Please Select Year..")&&(txtType.getSelectedItem().equals("Please Select Type...")&&(txtColor.getSelectedItem().equals("Please Select Color..")&&(txtPrice.getText().equals("")&&(cmbStatus.getSelectedItem().equals("Please Select Status.."))))))))))
         {
             JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");}
          
          else{
     txtLicense.setText("");
    txtBrand.setSelectedIndex(0);
    txtProduction.setSelectedIndex(0);
    txtType.setSelectedIndex(0);
     txtColor.setSelectedIndex(0);
     txtPrice.setText("");
        jButton4.setEnabled(true);
        txtLicense.requestFocus();
        cmbStatus.setSelectedIndex(0);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
          }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        License = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        txtLicense = new javax.swing.JTextField();
        txtBrand = new javax.swing.JComboBox<>();
        type = new javax.swing.JLabel();
        production = new javax.swing.JLabel();
        txtProduction = new javax.swing.JComboBox<>();
        txtType = new javax.swing.JComboBox<>();
        price = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        color = new javax.swing.JLabel();
        txtColor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        color1 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText("Car List Update");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 35, 418, -1));

        License.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        License.setText("LICENSE PLATE");
        jPanel1.add(License, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 179, 104, 28));

        brand.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        brand.setText("BRAND");
        jPanel1.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 246, -1, -1));
        jPanel1.add(txtLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 181, 164, 26));

        txtBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Brand...", "Toyota", "Daihatsu", "Honda" }));
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 239, 164, 28));

        type.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        type.setText("TYPE");
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 226, 145, 28));

        production.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        production.setText("PRODUCTION YEAR");
        jPanel1.add(production, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 179, 145, 28));

        txtProduction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Year..", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        jPanel1.add(txtProduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 181, 146, 26));

        txtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Type...", "Avanza", "Xenia", "Freed", "Mobilio", "Luxio", "Yaris", "Jazz" }));
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        jPanel1.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 225, 146, 28));

        price.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        price.setText("PRICE / DAY");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 314, 104, 28));

        txtPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 320, 659, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4047317_auto_automobile_car_sedan_transport_icon.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 118, 68));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LICENSE PLATE", "BRAND", "PRODUCTION YEAR", "TYPE", "COLOR", "PRICE"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 415, 839, 221));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4213475_arrow_back_left_return_icon.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 27, 58, 48));

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 368, 133, -1));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 368, 133, -1));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 368, 133, -1));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 368, 133, -1));

        color.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        color.setText("STATUS");
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Color..", "Red", "White", "Black", "Silver" }));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 274, 146, 27));

        jLabel13.setText("Rp");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 323, 20, -1));

        jPanel2.setBackground(new java.awt.Color(203, 182, 235));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 140));

        color1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        color1.setText("COLOR");
        jPanel1.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 285, -1, -1));

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Status..", "y" }));
        jPanel1.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
       
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try { 
            String ss;
    if(table2.getSelectedRowCount()==1){
       
         if ((((txtLicense.getText().equals(""))&&(cmbStatus.getSelectedItem().equals("Please Select Status..")&&(txtBrand.getSelectedItem().equals("Please Select Brand...")&&(txtProduction.getSelectedItem().equals("Please Select Year..")&&(txtType.getSelectedItem().equals("Please Select Type...")&&(txtColor.getSelectedItem().equals("Please Select Color..")&&(txtPrice.getText().equals(""))))))))))
         {
             JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");}
             
              else if (txtLicense.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill License !!");
         txtLicense.requestFocus();
            
         }
               else if (txtBrand.getSelectedItem().equals("Please Select Brand...")){
         JOptionPane.showMessageDialog(null,"Please Select Brand !!");
         txtBrand.requestFocus();
            
         }else if (cmbStatus.getSelectedItem().equals("Please Select Status..")){
         JOptionPane.showMessageDialog(null,"Please Select Status !!");
         cmbStatus.requestFocus();
            
         }
           
                else if (txtProduction.getSelectedItem().equals("Please Select Year..")){
         JOptionPane.showMessageDialog(null,"Please Select Production !!");
         txtProduction.requestFocus();
         }
                
                else if (txtType.getSelectedItem().equals("Please Select Type...")){
         JOptionPane.showMessageDialog(null,"Please Select Type !!");
         txtType.requestFocus();
         }
                     else if (txtColor.getSelectedItem().equals("Please Select Color..")){
         JOptionPane.showMessageDialog(null,"Please Select Color !!");
         txtColor.requestFocus();
         }
                          else if (txtPrice.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Price !!");
         txtPrice.requestFocus();
         }else{
   
    ss = "update cartable SET Status='"+cmbStatus.getSelectedItem()+"',Brand='"+txtBrand.getSelectedItem()+"',Production='"+txtProduction.getSelectedItem()+"',Type='"+txtType.getSelectedItem()+"',Color='"+txtColor.getSelectedItem()+"',Price='"+txtPrice.getText()+"' where License_plateid='"+txtLicense.getText()+"'";
     st = cn.createStatement();
    st.executeUpdate(ss);
        showdata("");
    JOptionPane.showMessageDialog(this,"Update Successfully..");
    
    reset();
                          }
    }                                        
    else {
    if(table2.getRowCount()==0){
        
    JOptionPane.showMessageDialog(this,"Table Is Empty..");
    }
    else {
            JOptionPane.showMessageDialog(this,"Please Select Single Row For Update");
            }  
    }
    
       }catch (Exception e) {
    JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          try {
             if ((((txtLicense.getText().equals(""))&&(cmbStatus.getSelectedItem().equals("Please Select Status..")&&(txtBrand.getSelectedItem().equals("Please Select Brand...")&&(txtProduction.getSelectedItem().equals("Please Select Year..")&&(txtType.getSelectedItem().equals("Please Select Type...")&&(txtColor.getSelectedItem().equals("Please Select Color..")&&(txtPrice.getText().equals(""))))))))))
         {
             JOptionPane.showMessageDialog(null,"Please Fill The Required Info !!");}
             
              else if (txtLicense.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill License !!");
         txtLicense.requestFocus();
            
         }
               else if (txtBrand.getSelectedItem().equals("Please Select Brand...")){
         JOptionPane.showMessageDialog(null,"Please Select Brand !!");
         txtBrand.requestFocus();
            
         }else if (cmbStatus.getSelectedItem().equals("Please Select Status..")){
         JOptionPane.showMessageDialog(null,"Please Select Status !!");
         cmbStatus.requestFocus();
            
         }
           
                else if (txtProduction.getSelectedItem().equals("Please Select Year..")){
         JOptionPane.showMessageDialog(null,"Please Select Production !!");
         txtProduction.requestFocus();
         }
                
                else if (txtType.getSelectedItem().equals("Please Select Type...")){
         JOptionPane.showMessageDialog(null,"Please Select Type !!");
         txtType.requestFocus();
         }
                     else if (txtColor.getSelectedItem().equals("Please Select Color..")){
         JOptionPane.showMessageDialog(null,"Please Select Color !!");
         txtColor.requestFocus();
         }
                          else if (txtPrice.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Fill Price !!");
         txtPrice.requestFocus();
         }
                     else{
    st = cn.createStatement();
    st.executeUpdate("INSERT INTO cartable VALUES('" 
        + txtLicense.getText() + "','"
        + cmbStatus.getSelectedItem().toString() + "','"    
        + txtBrand.getSelectedItem().toString() + "','"
        + txtProduction.getSelectedItem().toString() + "','"
        + txtType.getSelectedItem().toString() + "','"
        + txtColor.getSelectedItem().toString() + "','"    
        + txtPrice.getText() + "')");
    showdata("");
    JOptionPane.showMessageDialog(null, "Save Successfully");
         reset();

                }
    
   
  } catch (Exception e) {
    e.printStackTrace();
  }
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
       String price = txtPrice.getText();
        int length = price.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if (length<12){
               txtPrice.setEditable(true);
            }else{
             txtPrice.setEditable(false);
            }
        }else{
            if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  ) {
            txtPrice.setEditable(true);
             
            }else{
              txtPrice.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtPriceKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          try {

        if(table2.getSelectedRowCount()==1){
                         int dialog = JOptionPane.showOptionDialog(this, "Delete This Data?", "Delete",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);{
            
        
             if(dialog == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Delete Successfully");
            
            st = cn.createStatement();
      st.executeUpdate("DELETE FROM cartable WHERE License_plateid='"
          + tabModel.getValueAt(table2.getSelectedRow(), 0) + "'");
      showdata("");
      reset();
            
             
        if (dialog == JOptionPane.NO_OPTION){
            
             remove(dialog); } 
             }
        }
            
    }
 
        else{
            if(table2.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table Is Empty..");
            }else{
             JOptionPane.showMessageDialog(this, "Please Select Single Row For Delete");
            }
                      
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      reset();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
DefaultTableModel tblModel = (DefaultTableModel)table2.getModel();
        
        String data1 = tblModel.getValueAt(table2.getSelectedRow(),0).toString();
        String data2 = tblModel.getValueAt(table2.getSelectedRow(),1).toString();
        String data3 = tblModel.getValueAt(table2.getSelectedRow(),2).toString();
        String data4 = tblModel.getValueAt(table2.getSelectedRow(),3).toString();
        String data5 = tblModel.getValueAt(table2.getSelectedRow(),4).toString();
        String data6 = tblModel.getValueAt(table2.getSelectedRow(),5).toString();
         String data7 = tblModel.getValueAt(table2.getSelectedRow(),6).toString();
        
        txtLicense.setText(data1);
        cmbStatus.setSelectedItem(data2);
        txtBrand.setSelectedItem(data3);
        txtProduction.setSelectedItem(data4);
        txtType.setSelectedItem(data5);
        txtColor.setSelectedItem(data6);
        txtPrice.setText(data7);
        jButton4.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);

    }//GEN-LAST:event_table2MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel License;
    private javax.swing.JLabel brand;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel color;
    private javax.swing.JLabel color1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel production;
    private javax.swing.JTable table2;
    private javax.swing.JComboBox<String> txtBrand;
    private javax.swing.JComboBox<String> txtColor;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox<String> txtProduction;
    private javax.swing.JComboBox<String> txtType;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
