/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DataTeamRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DatateamOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DataWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class DataTeamWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DataTeamWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;

    public DataTeamWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss a");
        String formattedDate = sdf.format(date);
        txtDate.setText(formattedDate);
        txtRequestedBy.setText(userAccount.getEmployee().getName());
        popOrganizationComboBoxT3();
    }

    public void popOrganizationComboBoxT3() {
        comboOrg.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().contains("EventManagement")) {
                comboOrg.addItem(organization);
            }
        }
    }

    public boolean validation() {
        if (txtLocation.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtEvent.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter event name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (comboOrg.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select the organization to whom the request is to be assigned", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblOrganization = new javax.swing.JLabel();
        lblRequestedBy = new javax.swing.JLabel();
        txtEvent = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblEvent = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        txtRequestedBy = new javax.swing.JTextField();
        txtMessage = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        comboOrg = new javax.swing.JComboBox();
        lblMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Raise Request");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrganization.setText("Assign to organization:");
        lblOrganization.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblOrganization.setOpaque(true);
        jPanel1.add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 180, 182, -1));

        lblRequestedBy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRequestedBy.setText("Requested by:");
        lblRequestedBy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRequestedBy.setOpaque(true);
        jPanel1.add(lblRequestedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 226, 182, -1));
        jPanel1.add(txtEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 3, 209, -1));

        btnSubmit.setText("Submit Request");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        lblEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvent.setText("Event name:");
        lblEvent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEvent.setOpaque(true);
        jPanel1.add(lblEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 5, 182, -1));

        lblRequestDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRequestDate.setText("Request date:");
        lblRequestDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblRequestDate.setOpaque(true);
        jPanel1.add(lblRequestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 137, 182, -1));
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 47, 209, -1));

        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocation.setText("Location:");
        lblLocation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblLocation.setOpaque(true);
        jPanel1.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 49, 182, -1));

        txtRequestedBy.setEditable(false);
        jPanel1.add(txtRequestedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 224, 209, -1));
        jPanel1.add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 91, 209, -1));

        txtDate.setEditable(false);
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 135, 209, -1));

        comboOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });
        jPanel1.add(comboOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 179, 209, -1));

        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("Message:");
        lblMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMessage.setOpaque(true);
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 93, 182, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 75, 1046, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (validation()) {
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof DatateamOrganization) {
                    org = organization;
                    break;
                }
            }
            DataWorkRequest request = new DataWorkRequest();
            request.setEventName(txtEvent.getText());
            request.setLocation(txtLocation.getText());
            request.setMessage(txtMessage.getText());
            request.setRequestedby(userAccount);
            request.setDescription(txtEvent.getText() + " event at " + txtLocation.getText());
            request.setOrganizationName(comboOrg.getSelectedItem().toString());
            request.setReqByorganizationName(org.getName());
            request.setStatus("Sent");
            request.setRequestDate(txtDate.getText());

            if (org != null) {
//            org.getWorkQueue().getWorkRequestList().add(request);
//            userAccount.getWorkQueue().getWorkRequestList().add(request);
                enterprise.getWorkQueue().getWorkRequestList().add(request);
                userProcessContainer.remove(this);

                //re-populate
                Component[] component = userProcessContainer.getComponents();
                Component previous = component[component.length - 1];
                DataTeamWorkAreaJPanel manageproduct = (DataTeamWorkAreaJPanel) previous;
                manageproduct.populateRequestTable();
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
            }
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        //re-populate
        Component[] component = userProcessContainer.getComponents();
        Component previous = component[component.length - 1];
        DataTeamWorkAreaJPanel manageproduct = (DataTeamWorkAreaJPanel) previous;
        manageproduct.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEvent;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestedBy;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtRequestedBy;
    // End of variables declaration//GEN-END:variables
}
