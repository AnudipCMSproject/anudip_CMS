package com.anudip.customer;

import com.anudip.booking.Booking;
import com.anudip.dashboard.Dashboard;
import com.anudip.home.Login;
import com.anudip.home.Rooms;
import com.anudip.jdbc.DBConnection;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JFrame {

    Connection con = DBConnection.connectDB();
    PreparedStatement ps = null;
    ResultSet rs = null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss aa");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");

    public Customer() {
        initComponents();

        lbl_DateTime.setText(sdf.format(new Date()));
        tbl_ManageCustomer.getTableHeader().setFont(new Font("Book Antiqua", Font.PLAIN, 18));
        
        addDbDataIntoTable();
    }
    
     private void addDbDataIntoTable() {
         try {
            //DefaultTableModel model = (DefaultTableModel) tbl_ManageRoom.getModel();
        
        String selectQuery = "Select * from customer";
        
        ps = con.prepareStatement(selectQuery);
        rs = ps.executeQuery();
        int columns = rs.getMetaData().getColumnCount();   
        while (rs.next()) {
            Object[] row = new Object[columns];    
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i); // 1
            }
            ((DefaultTableModel) tbl_ManageCustomer.getModel()).insertRow(rs.getRow() - 1,row);
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Main = new javax.swing.JPanel();
        pnl_Module = new javax.swing.JPanel();
        lbl_Rooms = new javax.swing.JLabel();
        lbl_Customer = new javax.swing.JLabel();
        lbl_Booking = new javax.swing.JLabel();
        lbl_Dashboard = new javax.swing.JLabel();
        lbl_Logout = new javax.swing.JLabel();
        pnl_Heading = new javax.swing.JPanel();
        lbl_Heading = new javax.swing.JLabel();
        lbl_SubHeading = new javax.swing.JLabel();
        lbl_DateTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ManageCustomer = new javax.swing.JTable();
        pnl_Operation = new javax.swing.JPanel();
        txt_Phone = new javax.swing.JTextField();
        cmb_Gender = new javax.swing.JComboBox<>();
        btn_Reset = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        lbl_Gender = new javax.swing.JLabel();
        lbl_Phone = new javax.swing.JLabel();
        lbl_DateOfBirth = new javax.swing.JLabel();
        lbl_lblCustName = new javax.swing.JLabel();
        txt_CustName = new javax.swing.JTextField();
        dt_DOB = new com.toedter.calendar.JDateChooser();
        lbl_Address = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_Address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_Main.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Module.setBackground(new java.awt.Color(0, 102, 102));

        lbl_Rooms.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_Rooms.setText("Rooms");
        lbl_Rooms.setPreferredSize(new java.awt.Dimension(130, 45));
        lbl_Rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RoomsMouseClicked(evt);
            }
        });

        lbl_Customer.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_Customer.setText("Customer");
        lbl_Customer.setPreferredSize(new java.awt.Dimension(130, 45));
        lbl_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CustomerMouseClicked(evt);
            }
        });

        lbl_Booking.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_Booking.setText("Bookings");
        lbl_Booking.setPreferredSize(new java.awt.Dimension(130, 45));
        lbl_Booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BookingMouseClicked(evt);
            }
        });

        lbl_Dashboard.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_Dashboard.setText("Dashboard");
        lbl_Dashboard.setPreferredSize(new java.awt.Dimension(130, 45));
        lbl_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DashboardMouseClicked(evt);
            }
        });

        lbl_Logout.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_Logout.setText("Logout");
        lbl_Logout.setPreferredSize(new java.awt.Dimension(130, 45));
        lbl_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_ModuleLayout = new javax.swing.GroupLayout(pnl_Module);
        pnl_Module.setLayout(pnl_ModuleLayout);
        pnl_ModuleLayout.setHorizontalGroup(
            pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ModuleLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnl_ModuleLayout.setVerticalGroup(
            pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ModuleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pnl_Heading.setBackground(new java.awt.Color(0, 153, 153));

        lbl_Heading.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_Heading.setForeground(new java.awt.Color(0, 255, 255));
        lbl_Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Heading.setText("Hotel Management System");
        lbl_Heading.setPreferredSize(new java.awt.Dimension(300, 35));

        javax.swing.GroupLayout pnl_HeadingLayout = new javax.swing.GroupLayout(pnl_Heading);
        pnl_Heading.setLayout(pnl_HeadingLayout);
        pnl_HeadingLayout.setHorizontalGroup(
            pnl_HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HeadingLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(lbl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        pnl_HeadingLayout.setVerticalGroup(
            pnl_HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_SubHeading.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        lbl_SubHeading.setForeground(new java.awt.Color(0, 153, 153));
        lbl_SubHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SubHeading.setText("Manage Customer");
        lbl_SubHeading.setPreferredSize(new java.awt.Dimension(300, 35));

        lbl_DateTime.setBackground(new java.awt.Color(255, 255, 255));
        lbl_DateTime.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_DateTime.setForeground(new java.awt.Color(102, 102, 102));
        lbl_DateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DateTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_DateTime.setPreferredSize(new java.awt.Dimension(250, 30));

        tbl_ManageCustomer.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        tbl_ManageCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Phone", "Date Of Birth", "Address"
            }
        ));
        tbl_ManageCustomer.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ManageCustomer.setPreferredSize(new java.awt.Dimension(300, 65));
        jScrollPane1.setViewportView(tbl_ManageCustomer);

        txt_Phone.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_Phone.setPreferredSize(new java.awt.Dimension(255, 35));

        cmb_Gender.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        cmb_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MALE", "FEMALE" }));
        cmb_Gender.setPreferredSize(new java.awt.Dimension(255, 35));

        btn_Reset.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.setPreferredSize(new java.awt.Dimension(80, 35));
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Add.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.setPreferredSize(new java.awt.Dimension(80, 35));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Delete.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.setPreferredSize(new java.awt.Dimension(80, 35));

        lbl_Gender.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Gender.setText("Gender");
        lbl_Gender.setPreferredSize(new java.awt.Dimension(100, 30));

        lbl_Phone.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Phone.setText("Phone");
        lbl_Phone.setPreferredSize(new java.awt.Dimension(100, 30));

        lbl_DateOfBirth.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_DateOfBirth.setText("Date Of Birth");
        lbl_DateOfBirth.setPreferredSize(new java.awt.Dimension(110, 30));
        lbl_DateOfBirth.setVerifyInputWhenFocusTarget(false);

        lbl_lblCustName.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_lblCustName.setText("Name");
        lbl_lblCustName.setPreferredSize(new java.awt.Dimension(100, 30));

        txt_CustName.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_CustName.setPreferredSize(new java.awt.Dimension(255, 35));

        dt_DOB.setDateFormatString("dd-MM-yyyy");
        dt_DOB.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        dt_DOB.setPreferredSize(new java.awt.Dimension(255, 35));

        lbl_Address.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Address.setText("Addresss");
        lbl_Address.setPreferredSize(new java.awt.Dimension(110, 30));
        lbl_Address.setVerifyInputWhenFocusTarget(false);

        txtA_Address.setColumns(20);
        txtA_Address.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtA_Address.setRows(5);
        jScrollPane2.setViewportView(txtA_Address);

        javax.swing.GroupLayout pnl_OperationLayout = new javax.swing.GroupLayout(pnl_Operation);
        pnl_Operation.setLayout(pnl_OperationLayout);
        pnl_OperationLayout.setHorizontalGroup(
            pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OperationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnl_OperationLayout.createSequentialGroup()
                        .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_lblCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_OperationLayout.createSequentialGroup()
                                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_OperationLayout.setVerticalGroup(
            pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_lblCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txt_CustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_DateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_MainLayout = new javax.swing.GroupLayout(pnl_Main);
        pnl_Main.setLayout(pnl_MainLayout);
        pnl_MainLayout.setHorizontalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainLayout.createSequentialGroup()
                .addComponent(pnl_Module, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MainLayout.createSequentialGroup()
                        .addGroup(pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_MainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnl_Operation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_MainLayout.createSequentialGroup()
                                        .addComponent(lbl_SubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl_MainLayout.setVerticalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Module, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_MainLayout.createSequentialGroup()
                .addComponent(pnl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lbl_SubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Operation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LogoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_LogoutMouseClicked

    // Reset Button
    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        clear();
    }//GEN-LAST:event_btn_ResetActionPerformed

    // Method for Reset Fields
    private void clear() {

        txt_CustName.setText("");
        cmb_Gender.setSelectedIndex(0);
        txt_Phone.setText("");
        dt_DOB.setDate(null);
        txtA_Address.setText("");
        txt_CustName.requestFocusInWindow();

    }

    // Add Button
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        insertCustomerInfo();
    }//GEN-LAST:event_btn_AddActionPerformed

    private void lbl_RoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RoomsMouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_RoomsMouseClicked

    private void lbl_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CustomerMouseClicked
       new Customer().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbl_CustomerMouseClicked

    private void lbl_BookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BookingMouseClicked
      new Booking().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_lbl_BookingMouseClicked

    private void lbl_DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DashboardMouseClicked
       new Dashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbl_DashboardMouseClicked

    // Method for Insert Customer Info Into Database
    private void insertCustomerInfo() {

        String countQuery = "select count(customer_id) from customer";
        String insertQuery = "Insert into customer(customer_id, customer_name, customer_gender, customer_phone, customer_address, customer_dob) values(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(countQuery);
            rs = ps.executeQuery();
            final String customerPrefix = "C";
            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
            }
            ++id;
            String generatedCustomerId = customerPrefix.concat(Integer.toString(id));

            ps = con.prepareStatement(insertQuery);

            ps.setString(1, generatedCustomerId);
            ps.setString(2, txt_CustName.getText());
            ps.setString(3, cmb_Gender.getSelectedItem().toString());
            ps.setString(4, txt_Phone.getText());
            ps.setString(5, txtA_Address.getText());

            Date date = dt_DOB.getDate();
            DateFormat oDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String dob = oDateFormat.format(date);
            ps.setString(6, dob);

            ps.execute();
            addDbDataIntoTable();
            
            JOptionPane.showMessageDialog(this, "<html><h2 style='font-family: courier new; size='30' color='red'> Customer Information Saved !! ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "<html><h2 style='font-family: courier new; size='30' color='red'>" + e);
        }
    }

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JComboBox<String> cmb_Gender;
    private com.toedter.calendar.JDateChooser dt_DOB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Booking;
    private javax.swing.JLabel lbl_Customer;
    private javax.swing.JLabel lbl_Dashboard;
    private javax.swing.JLabel lbl_DateOfBirth;
    private javax.swing.JLabel lbl_DateTime;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbl_Logout;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Rooms;
    private javax.swing.JLabel lbl_SubHeading;
    private javax.swing.JLabel lbl_lblCustName;
    private javax.swing.JPanel pnl_Heading;
    private javax.swing.JPanel pnl_Main;
    private javax.swing.JPanel pnl_Module;
    private javax.swing.JPanel pnl_Operation;
    private javax.swing.JTable tbl_ManageCustomer;
    private javax.swing.JTextArea txtA_Address;
    private javax.swing.JTextField txt_CustName;
    private javax.swing.JTextField txt_Phone;
    // End of variables declaration//GEN-END:variables

   

}
