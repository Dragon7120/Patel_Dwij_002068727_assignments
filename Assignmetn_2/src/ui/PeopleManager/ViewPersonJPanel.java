/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PeopleManager;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class ViewPersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Person person;
    /**
     * Creates new form ViewPersonJPanel
     */
    public ViewPersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        
        refreshTextFields();
        setViewMode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblHAState = new javax.swing.JLabel();
        lblHAPhoneNumber = new javax.swing.JLabel();
        lblHAZipCode = new javax.swing.JLabel();
        txtHAZipCode = new javax.swing.JTextField();
        txtHAPhoneNumber = new javax.swing.JTextField();
        lblWAState = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblWAPhoneNumber = new javax.swing.JLabel();
        lblWAZipCode = new javax.swing.JLabel();
        txtWAZipCode = new javax.swing.JTextField();
        lblWACity = new javax.swing.JLabel();
        txtWAPhoneNumber = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtWACity = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblWAStreetAddress = new javax.swing.JLabel();
        lblWorkAddress = new javax.swing.JLabel();
        lblWAUnitNumber = new javax.swing.JLabel();
        lblHomeAddress = new javax.swing.JLabel();
        txtWAUnitNumber = new javax.swing.JTextField();
        lblHACity = new javax.swing.JLabel();
        txtWAStreetAddress = new javax.swing.JTextField();
        txtHACity = new javax.swing.JTextField();
        lblHAStreetAddress = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtWAState = new javax.swing.JTextField();
        lblHAUnitNumber = new javax.swing.JLabel();
        txtHAUnitNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtHAStreetAddress = new javax.swing.JTextField();
        txtHAState = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 6, -1, -1));

        lblHAState.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHAState.setForeground(new java.awt.Color(255, 102, 102));
        lblHAState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHAState.setText("State");
        add(lblHAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 318, 124, 25));

        lblHAPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHAPhoneNumber.setForeground(new java.awt.Color(255, 102, 102));
        lblHAPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHAPhoneNumber.setText("Phone");
        add(lblHAPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 380, 124, 25));

        lblHAZipCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHAZipCode.setForeground(new java.awt.Color(255, 102, 102));
        lblHAZipCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHAZipCode.setText("Zip code");
        add(lblHAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 349, 124, 25));
        add(txtHAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 351, 114, -1));
        add(txtHAPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 382, 114, -1));

        lblWAState.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWAState.setForeground(new java.awt.Color(255, 102, 102));
        lblWAState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWAState.setText("State");
        add(lblWAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 320, 93, -1));

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 102, 102));
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFirstName.setText("First Name");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 136, 68, -1));

        lblWAPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWAPhoneNumber.setForeground(new java.awt.Color(255, 102, 102));
        lblWAPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWAPhoneNumber.setText("Phone");
        add(lblWAPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 382, 93, -1));

        lblWAZipCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWAZipCode.setForeground(new java.awt.Color(255, 102, 102));
        lblWAZipCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWAZipCode.setText("Zip code");
        add(lblWAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 351, 93, -1));
        add(txtWAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 349, 114, -1));

        lblWACity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWACity.setForeground(new java.awt.Color(255, 102, 102));
        lblWACity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWACity.setText("City");
        add(lblWACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 289, 93, -1));
        add(txtWAPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 382, 114, -1));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 102, 102));
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLastName.setText("Last Name");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 136, 68, -1));
        add(txtWACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 289, 114, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 136, 114, -1));

        lblWAStreetAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWAStreetAddress.setForeground(new java.awt.Color(255, 102, 102));
        lblWAStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWAStreetAddress.setText("Street Addres");
        add(lblWAStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 227, 93, -1));

        lblWorkAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblWorkAddress.setForeground(new java.awt.Color(255, 102, 102));
        lblWorkAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWorkAddress.setText("Work Address");
        add(lblWorkAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 188, 124, -1));

        lblWAUnitNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWAUnitNumber.setForeground(new java.awt.Color(255, 102, 102));
        lblWAUnitNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWAUnitNumber.setText("Unit Number");
        add(lblWAUnitNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 258, 93, -1));

        lblHomeAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHomeAddress.setForeground(new java.awt.Color(255, 102, 102));
        lblHomeAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHomeAddress.setText("Home Address");
        add(lblHomeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 188, -1, -1));
        add(txtWAUnitNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 258, 114, -1));

        lblHACity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHACity.setForeground(new java.awt.Color(255, 102, 102));
        lblHACity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHACity.setText("City");
        add(lblHACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 287, 124, 25));
        add(txtWAStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 227, 114, -1));
        add(txtHACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 289, 114, -1));

        lblHAStreetAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHAStreetAddress.setForeground(new java.awt.Color(255, 102, 102));
        lblHAStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHAStreetAddress.setText("Street Address");
        add(lblHAStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 225, 124, 25));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 102, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Profile");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 56, 584, -1));
        add(txtWAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 114, -1));

        lblHAUnitNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHAUnitNumber.setForeground(new java.awt.Color(255, 102, 102));
        lblHAUnitNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHAUnitNumber.setText("House Number");
        add(lblHAUnitNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 256, 124, 25));
        add(txtHAUnitNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 258, 114, -1));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 136, 114, -1));
        add(txtHAStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 227, 114, -1));
        add(txtHAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 320, 114, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 102, 102));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 440, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        Component[] panelStack = userProcessContainer.getComponents();
        JPanel lastPanel = (JPanel) panelStack[panelStack.length - 1];
        ManagePeopleJPanel managePeopleJPanel = (ManagePeopleJPanel) lastPanel;
        managePeopleJPanel.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String HAStreetAddress = txtHAStreetAddress.getText();
        int HAUnitNumber = Integer.parseInt(txtHAUnitNumber.getText());
        String HACity = txtHACity.getText();
        String HAState = txtHAState.getText();
        short HAZipCode = Short.parseShort(txtHAZipCode.getText());
        long HAPhoneNumber = Long.parseLong(txtHAPhoneNumber.getText());
        
        String WAStreetAddress = txtWAStreetAddress.getText();
        int WAUnitNumber = Integer.parseInt(txtWAUnitNumber.getText());
        String WACity = txtWACity.getText();
        String WAState = txtWAState.getText();
        short WAZipCode = Short.parseShort(txtWAZipCode.getText());
        long WAPhoneNumber = Long.parseLong(txtWAPhoneNumber.getText());
        
        if (firstName.isBlank()|lastName.isBlank()|HAStreetAddress.isBlank()|HACity.isBlank()|HAState.isBlank()|
            WAStreetAddress.isBlank()|WACity.isBlank()|WAState.isBlank()){
            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        person.setFirstName(firstName);
        person.setLastName(lastName);
        
        Address homeAddress = new Address(HAStreetAddress, HAUnitNumber, HACity, HAState, HAZipCode, HAPhoneNumber);
        Address workAddress = new Address(WAStreetAddress, WAUnitNumber, WACity, WAState, WAZipCode, WAPhoneNumber);
        
        person.setHomeAddress(homeAddress);
        person.setWorkAddress(workAddress);
        
        JOptionPane.showMessageDialog(this, "Updated successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHACity;
    private javax.swing.JLabel lblHAPhoneNumber;
    private javax.swing.JLabel lblHAState;
    private javax.swing.JLabel lblHAStreetAddress;
    private javax.swing.JLabel lblHAUnitNumber;
    private javax.swing.JLabel lblHAZipCode;
    private javax.swing.JLabel lblHomeAddress;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWACity;
    private javax.swing.JLabel lblWAPhoneNumber;
    private javax.swing.JLabel lblWAState;
    private javax.swing.JLabel lblWAStreetAddress;
    private javax.swing.JLabel lblWAUnitNumber;
    private javax.swing.JLabel lblWAZipCode;
    private javax.swing.JLabel lblWorkAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHACity;
    private javax.swing.JTextField txtHAPhoneNumber;
    private javax.swing.JTextField txtHAState;
    private javax.swing.JTextField txtHAStreetAddress;
    private javax.swing.JTextField txtHAUnitNumber;
    private javax.swing.JTextField txtHAZipCode;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtWACity;
    private javax.swing.JTextField txtWAPhoneNumber;
    private javax.swing.JTextField txtWAState;
    private javax.swing.JTextField txtWAStreetAddress;
    private javax.swing.JTextField txtWAUnitNumber;
    private javax.swing.JTextField txtWAZipCode;
    // End of variables declaration//GEN-END:variables
    private void refreshTextFields(){
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        
        Address homeAddress = person.getHomeAddress();
        Address workAddress = person.getWorkAddress();
        
        txtHAStreetAddress.setText(homeAddress.getStreetAddress());
        txtHAUnitNumber.setText(String.valueOf(homeAddress.getUnitNumber()));
        txtHACity.setText(homeAddress.getCity());
        txtHAZipCode.setText(String.valueOf(homeAddress.getZipcode()));
        txtHAState.setText(homeAddress.getState());
        txtHAPhoneNumber.setText(String.valueOf(homeAddress.getPhoneNumber()));
        
        txtWAStreetAddress.setText(workAddress.getStreetAddress());
        txtWAUnitNumber.setText(String.valueOf(workAddress.getUnitNumber()));
        txtWACity.setText(workAddress.getCity());
        txtWAZipCode.setText(String.valueOf(workAddress.getZipcode()));
        txtWAState.setText(workAddress.getState());
        txtWAPhoneNumber.setText(String.valueOf(workAddress.getPhoneNumber()));
        
    }
    
    private void setViewMode(){
    
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        
        txtHAStreetAddress.setEnabled(false);
        txtHAUnitNumber.setEnabled(false);
        txtHACity.setEnabled(false);
        txtHAZipCode.setEnabled(false);
        txtHAState.setEnabled(false);
        txtHAPhoneNumber.setEnabled(false);
        
        txtWAStreetAddress.setEnabled(false);
        txtWAUnitNumber.setEnabled(false);
        txtWACity.setEnabled(false);
        txtWAZipCode.setEnabled(false);
        txtWAState.setEnabled(false);
        txtWAPhoneNumber.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void setEditMode(){
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        
        txtHAStreetAddress.setEnabled(true);
        txtHAUnitNumber.setEnabled(true);
        txtHACity.setEnabled(true);
        txtHAZipCode.setEnabled(true);
        txtHAState.setEnabled(true);
        txtHAPhoneNumber.setEnabled(true);
        
        txtWAStreetAddress.setEnabled(true);
        txtWAUnitNumber.setEnabled(true);
        txtWACity.setEnabled(true);
        txtWAZipCode.setEnabled(true);
        txtWAState.setEnabled(true);
        txtWAPhoneNumber.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }
}
