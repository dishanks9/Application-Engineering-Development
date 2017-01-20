/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.HospitalAdminAssistant.ProcessAssistantWRequests;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private Enterprise enterprise;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (LabOrganization)organization;
        
        populateRequestTable();
        populateWorkspace();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblWorkQEvent.getModel();
        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest request : enterprise1.getWorkQueue().getWorkRequestList()) {
                    if (request.getOrganizationName().equalsIgnoreCase(labOrganization.getName())) {
                
                    Object[] row = new Object[7];

                    row[0] = request;
                    row[1] = request.getRequestDate();
                    row[2] = request.getDescription();
                    row[3] = request.getRequestedby().toString();
                    row[4] = request.getOrganizationName();
                    row[5] = request.getAssignedTo();
                    
                    row[6] = request.getStatus();
                    model.addRow(row);
                
            }
                }}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnlWorkRequestPool = new javax.swing.JPanel();
        pnlPersonalBody3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblWorkQEvent = new javax.swing.JTable();
        pnlPersonalHeader3 = new javax.swing.JPanel();
        txtPersonalHeader3 = new javax.swing.JLabel();
        btnAssigntome = new javax.swing.JButton();
        pnlMyworkSpace = new javax.swing.JPanel();
        pnlPMyWorkSpaceBody = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMyWorkSpace = new javax.swing.JTable();
        pnlMyWorkSpaceBody = new javax.swing.JPanel();
        txtPersonalHeader2 = new javax.swing.JLabel();
        btnProcessRequest = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        pnlWorkRequestPool.setBackground(new java.awt.Color(255, 255, 255));
        pnlWorkRequestPool.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        pnlPersonalBody3.setBackground(new java.awt.Color(255, 255, 255));
        pnlPersonalBody3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        tblWorkQEvent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        tblWorkQEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "WorkRequestID", "Requested On", "Description ", "Requested By", "Organization ", "Assigned To", "Status "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblWorkQEvent);

        javax.swing.GroupLayout pnlPersonalBody3Layout = new javax.swing.GroupLayout(pnlPersonalBody3);
        pnlPersonalBody3.setLayout(pnlPersonalBody3Layout);
        pnlPersonalBody3Layout.setHorizontalGroup(
            pnlPersonalBody3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalBody3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPersonalBody3Layout.setVerticalGroup(
            pnlPersonalBody3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalBody3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlPersonalHeader3.setBackground(new java.awt.Color(102, 102, 102));
        pnlPersonalHeader3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlPersonalHeader3.setForeground(new java.awt.Color(255, 255, 255));

        txtPersonalHeader3.setForeground(new java.awt.Color(255, 255, 255));
        txtPersonalHeader3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPersonalHeader3.setText("WorkRequests Pool ");

        javax.swing.GroupLayout pnlPersonalHeader3Layout = new javax.swing.GroupLayout(pnlPersonalHeader3);
        pnlPersonalHeader3.setLayout(pnlPersonalHeader3Layout);
        pnlPersonalHeader3Layout.setHorizontalGroup(
            pnlPersonalHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalHeader3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtPersonalHeader3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPersonalHeader3Layout.setVerticalGroup(
            pnlPersonalHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPersonalHeader3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        btnAssigntome.setText("Add To My Work Space");
        btnAssigntome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigntomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlWorkRequestPoolLayout = new javax.swing.GroupLayout(pnlWorkRequestPool);
        pnlWorkRequestPool.setLayout(pnlWorkRequestPoolLayout);
        pnlWorkRequestPoolLayout.setHorizontalGroup(
            pnlWorkRequestPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPersonalHeader3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlWorkRequestPoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWorkRequestPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPersonalBody3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlWorkRequestPoolLayout.createSequentialGroup()
                        .addComponent(btnAssigntome)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlWorkRequestPoolLayout.setVerticalGroup(
            pnlWorkRequestPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWorkRequestPoolLayout.createSequentialGroup()
                .addComponent(pnlPersonalHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pnlPersonalBody3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssigntome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMyworkSpace.setBackground(new java.awt.Color(255, 255, 255));
        pnlMyworkSpace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        pnlPMyWorkSpaceBody.setBackground(new java.awt.Color(255, 255, 255));
        pnlPMyWorkSpaceBody.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        tblMyWorkSpace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        tblMyWorkSpace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "WorkRequestID", "Requested On", "Description ", "Requested By", "Organization ", "Assigned To", "Status "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblMyWorkSpace);

        javax.swing.GroupLayout pnlPMyWorkSpaceBodyLayout = new javax.swing.GroupLayout(pnlPMyWorkSpaceBody);
        pnlPMyWorkSpaceBody.setLayout(pnlPMyWorkSpaceBodyLayout);
        pnlPMyWorkSpaceBodyLayout.setHorizontalGroup(
            pnlPMyWorkSpaceBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPMyWorkSpaceBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPMyWorkSpaceBodyLayout.setVerticalGroup(
            pnlPMyWorkSpaceBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPMyWorkSpaceBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMyWorkSpaceBody.setBackground(new java.awt.Color(102, 102, 102));
        pnlMyWorkSpaceBody.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMyWorkSpaceBody.setForeground(new java.awt.Color(255, 255, 255));

        txtPersonalHeader2.setForeground(new java.awt.Color(255, 255, 255));
        txtPersonalHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPersonalHeader2.setText("My Work Space");

        javax.swing.GroupLayout pnlMyWorkSpaceBodyLayout = new javax.swing.GroupLayout(pnlMyWorkSpaceBody);
        pnlMyWorkSpaceBody.setLayout(pnlMyWorkSpaceBodyLayout);
        pnlMyWorkSpaceBodyLayout.setHorizontalGroup(
            pnlMyWorkSpaceBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyWorkSpaceBodyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtPersonalHeader2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMyWorkSpaceBodyLayout.setVerticalGroup(
            pnlMyWorkSpaceBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPersonalHeader2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMyworkSpaceLayout = new javax.swing.GroupLayout(pnlMyworkSpace);
        pnlMyworkSpace.setLayout(pnlMyworkSpaceLayout);
        pnlMyworkSpaceLayout.setHorizontalGroup(
            pnlMyworkSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyworkSpaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMyworkSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMyworkSpaceLayout.createSequentialGroup()
                        .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlMyworkSpaceLayout.createSequentialGroup()
                        .addComponent(pnlPMyWorkSpaceBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(pnlMyWorkSpaceBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMyworkSpaceLayout.setVerticalGroup(
            pnlMyworkSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyworkSpaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMyWorkSpaceBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPMyWorkSpaceBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProcessRequest)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMyworkSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlWorkRequestPool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(pnlMyworkSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlWorkRequestPool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Work Request", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 710, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssigntomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigntomeActionPerformed
       int selectedRow = tblWorkQEvent.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int flag=0;
        WorkRequest request = (WorkRequest) tblWorkQEvent.getValueAt(selectedRow, 0);
        if(userAccount.getWorkQueue().getWorkRequestList().size()!=0){
            for(WorkRequest request2 : userAccount.getWorkQueue().getWorkRequestList()){
                if(request2.getWorkRequestID().equals(request.getWorkRequestID())){
                    JOptionPane.showMessageDialog(this, "This request ID is already assigned to you", "Error", JOptionPane.ERROR_MESSAGE);
                    flag=1;
                    break;
                }
                
            }
        }
        
        for (Network network : business.getNetworkList()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.getEnterpriseType().getValue().contains("NGO")) {
                    for (WorkRequest request1 : ent.getWorkQueue().getWorkRequestList()) {

                        if (request1.getOrganizationName().equals(request.getOrganizationName())) {
                            
                            if(flag==0 && !(request.getStatus().contains("Complete"))) {
                                request1.setAssignedTo(userAccount);
                            request1.setStatus("Pending");
                                //userAccount.getWorkQueue().getWorkRequestList().add(request);
                            }
                            populateWorkspace();

                            populateRequestTable();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAssigntomeActionPerformed

    public void populateWorkspace() {
        DefaultTableModel model = (DefaultTableModel) tblMyWorkSpace.getModel();
        //Organiza
        model.setRowCount(0);
        //for(Organization org)
        for (Network network : business.getNetworkList()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.getEnterpriseType().getValue().contains("NGOs")) {
                    for (WorkRequest request1 : ent.getWorkQueue().getWorkRequestList()) {
                        if(request1.getOrganizationName().contains("Lab")  && (request1.getStatus().equalsIgnoreCase("Pending") || request1.getStatus().equalsIgnoreCase("Processing")||request1.getStatus().equalsIgnoreCase("Completed"))  ){
            

            Object[] row = new Object[7];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
            row[0] = request1;
            row[1] = request1.getRequestDate();
            row[2] = request1.getDescription();
            row[3] = request1.getRequestedby().toString();
            row[4] = request1.getOrganizationName();
            row[5] = request1.getAssignedTo();

            row[6] = request1.getStatus();
            model.addRow(row);
        }
                    }}}}
    }
    
    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        int selectedRow = tblMyWorkSpace.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) tblMyWorkSpace.getValueAt(selectedRow, 0);
        if(!(request.getStatus().equalsIgnoreCase("Completed"))){
        request.setStatus("Processing");
        userProcessContainer.add("ProcessWorkRequestJPanel", new ProcessWorkRequestJPanel(userProcessContainer, request,enterprise));
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "This request ID is already processed", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //ProcessFinancialWRequests processFinancialWRequests = new ProcessFinancialWRequests(userProcessContainer, request);
        //userProcessContainer.add("processFinancialWRequests", processFinancialWRequests);
        
        
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssigntome;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlMyWorkSpaceBody;
    private javax.swing.JPanel pnlMyworkSpace;
    private javax.swing.JPanel pnlPMyWorkSpaceBody;
    private javax.swing.JPanel pnlPersonalBody3;
    private javax.swing.JPanel pnlPersonalHeader3;
    private javax.swing.JPanel pnlWorkRequestPool;
    private javax.swing.JTable tblMyWorkSpace;
    private javax.swing.JTable tblWorkQEvent;
    private javax.swing.JLabel txtPersonalHeader2;
    private javax.swing.JLabel txtPersonalHeader3;
    // End of variables declaration//GEN-END:variables
}
