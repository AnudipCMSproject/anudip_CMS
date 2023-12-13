package com.anudip.home;

import com.anudip.booking.Booking;
import com.anudip.customer.Customer;
import com.anudip.dashboard.Dashboard;
import com.anudip.jdbc.DBConnection;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Rooms extends javax.swing.JFrame {

    Connection con = DBConnection.connectDB();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Rooms() {
        initComponents();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss aa");
        lbl_DateTime.setText(sdf.format(new Date()));

        tbl_ManageRoom.getTableHeader().setFont(new Font("Book Antiqua", Font.PLAIN, 18));

        addDbDataIntoTable();
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
        tbl_ManageRoom = new javax.swing.JTable();
        pnl_Operation = new javax.swing.JPanel();
        txt_Name = new javax.swing.JTextField();
        cmb_Status = new javax.swing.JComboBox<>();
        cmb_Category = new javax.swing.JComboBox<>();
        btn_Reset = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        lbl_Category = new javax.swing.JLabel();
        lbl_Status = new javax.swing.JLabel();
        txt_Price = new javax.swing.JTextField();
        lbl_Price = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();

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
                .addGap(56, 56, 56)
                .addGroup(pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnl_ModuleLayout.setVerticalGroup(
            pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ModuleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
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
                .addContainerGap(390, Short.MAX_VALUE))
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
        lbl_SubHeading.setText("Manage Rooms");
        lbl_SubHeading.setPreferredSize(new java.awt.Dimension(300, 35));

        lbl_DateTime.setBackground(new java.awt.Color(255, 255, 255));
        lbl_DateTime.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_DateTime.setForeground(new java.awt.Color(102, 102, 102));
        lbl_DateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DateTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_DateTime.setPreferredSize(new java.awt.Dimension(250, 30));

        tbl_ManageRoom.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        tbl_ManageRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room No", "Name", "Type", "Status", "Price"
            }
        ));
        tbl_ManageRoom.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_ManageRoom.setPreferredSize(new java.awt.Dimension(300, 65));
        tbl_ManageRoom.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_ManageRoom);

        txt_Name.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_Name.setPreferredSize(new java.awt.Dimension(255, 40));

        cmb_Status.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        cmb_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "AVAILABLE", "BOOKED" }));
        cmb_Status.setPreferredSize(new java.awt.Dimension(255, 40));

        cmb_Category.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        cmb_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "VIP", "DOUBLE BED", "SINGLE BED", "FAMILY" }));
        cmb_Category.setPreferredSize(new java.awt.Dimension(255, 40));

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

        lbl_Category.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Category.setText("Category");
        lbl_Category.setPreferredSize(new java.awt.Dimension(100, 30));

        lbl_Status.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Status.setText("Status");
        lbl_Status.setPreferredSize(new java.awt.Dimension(100, 30));

        txt_Price.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_Price.setPreferredSize(new java.awt.Dimension(255, 40));

        lbl_Price.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Price.setText("Price");
        lbl_Price.setPreferredSize(new java.awt.Dimension(100, 30));

        lbl_Name.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Name.setText("Name");
        lbl_Name.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout pnl_OperationLayout = new javax.swing.GroupLayout(pnl_Operation);
        pnl_Operation.setLayout(pnl_OperationLayout);
        pnl_OperationLayout.setHorizontalGroup(
            pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OperationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_OperationLayout.createSequentialGroup()
                        .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_OperationLayout.setVerticalGroup(
            pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_MainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addContainerGap())))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
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

    // Add Button (Save Room Information Into Database) 
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        addRoomInfo();
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

    // Method For Saving Room Information
    private void addRoomInfo() {

        String countQuery = "select count(room_no) from room";
        String insertQuery = "Insert into room(room_no, room_name, room_type, room_status, room_price) values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(countQuery);
            rs = ps.executeQuery();

            final String roomPrefix = "R";
            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
            }
            ++id;
            String generatedRoomNo = roomPrefix.concat(Integer.toString(id));

            ps = con.prepareStatement(insertQuery);
            ps.setString(1, generatedRoomNo);
            ps.setString(2, txt_Name.getText());
            ps.setString(3, cmb_Category.getSelectedItem().toString());
            ps.setString(4, cmb_Status.getSelectedItem().toString());
            double price = Double.parseDouble(txt_Price.getText());
            ps.setDouble(5, price);

            ps.execute();

            JOptionPane.showMessageDialog(this, "<html><h2 style='font-family: courier new; size='30' color='red'> Room Information Saved !! ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    // Insert Data into Data Table
    private void addDbDataIntoTable() {
        try {
            //DefaultTableModel model = (DefaultTableModel) tbl_ManageRoom.getModel();
        
        String selectQuery = "Select * from room";
        
        ps = con.prepareStatement(selectQuery);
        rs = ps.executeQuery();
        int columns = rs.getMetaData().getColumnCount();   
        while (rs.next()) {
            Object[] row = new Object[columns];    
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i); // 1
            }
            ((DefaultTableModel) tbl_ManageRoom.getModel()).insertRow(rs.getRow() - 1,row);
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Mehtod for clearing field
    private void clear() {
        txt_Name.setText("");
        txt_Price.setText("");
        cmb_Category.setSelectedIndex(0);
        cmb_Status.setSelectedIndex(0);
        txt_Name.requestFocusInWindow();
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
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JComboBox<String> cmb_Category;
    private javax.swing.JComboBox<String> cmb_Status;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Booking;
    private javax.swing.JLabel lbl_Category;
    private javax.swing.JLabel lbl_Customer;
    private javax.swing.JLabel lbl_Dashboard;
    private javax.swing.JLabel lbl_DateTime;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbl_Logout;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Price;
    private javax.swing.JLabel lbl_Rooms;
    private javax.swing.JLabel lbl_Status;
    private javax.swing.JLabel lbl_SubHeading;
    private javax.swing.JPanel pnl_Heading;
    private javax.swing.JPanel pnl_Main;
    private javax.swing.JPanel pnl_Module;
    private javax.swing.JPanel pnl_Operation;
    private javax.swing.JTable tbl_ManageRoom;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Price;
    // End of variables declaration//GEN-END:variables

}
