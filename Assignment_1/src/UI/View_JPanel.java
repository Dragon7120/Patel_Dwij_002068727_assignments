/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Product;
/**
 *
 * @author Lenovo
 */
public class View_JPanel extends javax.swing.JPanel {
    Product product;

    /**
     * Creates new form View_JPanel
     */
    public View_JPanel(Product p) {
        initComponents();
        product = p;
        
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAL1 = new javax.swing.JLabel();
        lblAL2 = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        txtLN = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblzip = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtDLN = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblRSS = new javax.swing.JLabel();
        lblFN = new javax.swing.JLabel();
        lblBT = new javax.swing.JLabel();
        lblLN = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtRSS = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtBT = new javax.swing.JTextField();
        lblDLN = new javax.swing.JLabel();
        txtAL1 = new javax.swing.JTextField();
        lblDLS = new javax.swing.JLabel();
        txtAL2 = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblOCC = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblEC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDLS = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtOCC = new javax.swing.JTextField();
        txtEC = new javax.swing.JTextField();

        lblAL1.setText("Address line 1");

        lblAL2.setText("Address line 2");

        txtFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNActionPerformed(evt);
            }
        });

        lblcity.setText("City");

        txtLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNActionPerformed(evt);
            }
        });

        lblstate.setText("State");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblzip.setText("Zip");

        lblTel.setText("Telephone");

        lblFax.setText("Fax number");

        lblDOB.setText("Date of Birth");

        lblRSS.setText("Relation Ship Status");

        lblFN.setText("First Name");

        lblBT.setText("BloodType");

        lblLN.setText("Last Name");

        lblgender.setText("Gender");

        txtFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        txtRSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRSSActionPerformed(evt);
            }
        });

        lblPhone.setText("Phone");

        txtBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBTActionPerformed(evt);
            }
        });

        lblDLN.setText("Drivers License Number");

        txtAL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAL1ActionPerformed(evt);
            }
        });

        lblDLS.setText("Drivers License State");

        lblSSN.setText("Social Security Number");

        lblOCC.setText("Occupation");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        lblEC.setText("Emergency Contact");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("View Profile");
        jLabel11.setToolTipText("");

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        txtOCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOCCActionPerformed(evt);
            }
        });

        txtEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtECActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEC)
                        .addComponent(lblBT))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFN)
                                .addComponent(lblLN)
                                .addComponent(lblgender)
                                .addComponent(lblEmail)
                                .addComponent(lblPhone)
                                .addComponent(lblDLN))
                            .addComponent(lblDLS, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(lblSSN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAL1)
                                        .addComponent(lblAL2)
                                        .addComponent(lblcity)
                                        .addComponent(lblstate)
                                        .addComponent(lblzip)
                                        .addComponent(lblTel))
                                    .addComponent(lblFax, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(lblDOB))
                            .addComponent(lblOCC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRSS, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDLN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDLS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtOCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtZip, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFax, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDoB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRSS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAL2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(90, 90, 90))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAL1, lblAL2, lblBT, lblDLN, lblDLS, lblDOB, lblEC, lblEmail, lblFN, lblFax, lblLN, lblOCC, lblPhone, lblRSS, lblSSN, lblTel, lblcity, lblgender, lblstate, lblzip});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDLS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAL1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAL2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblzip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOCC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRSS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBT))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAL1, lblAL2, lblBT, lblDLN, lblDLS, lblDOB, lblEC, lblEmail, lblFN, lblFax, lblLN, lblOCC, lblPhone, lblRSS, lblSSN, lblTel, lblcity, lblgender, lblstate, lblzip});

    }// </editor-fold>//GEN-END:initComponents

    private void txtFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNActionPerformed

    private void txtLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtFaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxActionPerformed

    private void txtRSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRSSActionPerformed

    private void txtBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBTActionPerformed

    private void txtAL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAL1ActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtOCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOCCActionPerformed

    private void txtECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtECActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lblAL1;
    private javax.swing.JLabel lblAL2;
    private javax.swing.JLabel lblBT;
    private javax.swing.JLabel lblDLN;
    private javax.swing.JLabel lblDLS;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEC;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFN;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblLN;
    private javax.swing.JLabel lblOCC;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRSS;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblzip;
    private javax.swing.JTextField txtAL1;
    private javax.swing.JTextField txtAL2;
    private javax.swing.JTextField txtBT;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDLN;
    private javax.swing.JTextField txtDLS;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEC;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextField txtOCC;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRSS;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables


private void displayProduct(){
      txtAL1.setText(product.get());
      txtAL2.setText(product.getAL2());
      txtBT.setText(product.getClass());
      txtCity.setText(product);
      txtDLN.setText(product);
      txtDLS.setText(product);
      txtDoB.setText(product);
      txtEC.setText(product);
      txtEmail.setText(product);
      txtFN.setText(product);
      txtFax.setText(product);
      txtGender.setText(product);
      txtLN.setText(product);
      txtOCC.setText(product);
      txtPhone.setText(product);
      txtRSS.setText(product);
      txtSSN.setText(product);
      
      
      
      
      
    }

}