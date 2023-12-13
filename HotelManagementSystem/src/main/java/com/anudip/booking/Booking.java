package com.anudip.booking;

import com.anudip.home.Login;
import com.anudip.jdbc.DBConnection;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Booking extends javax.swing.JFrame {

    Connection con = DBConnection.connectDB();
    PreparedStatement ps = null;
    ResultSet rs = null;

    double roomCost;
    DecimalFormat df = new DecimalFormat("#.00");

    public Booking() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss aa");
        lbl_DateTime.setText(sdf.format(new Date()));
        txt_RoomCost.setEditable(false);
        showRoomNo();
        showCustomer();
        
         tbl_RoomBooking.getTableHeader().setFont(new Font("Book Antiqua", Font.PLAIN, 16));
         addDataIntoTable();
    }

    // Method for Adding Data Into Table
    private void addDataIntoTable() {
       try {
            //DefaultTableModel model = (DefaultTableModel) tbl_ManageRoom.getModel();
        
        String selectQuery = "Select * from booking";
        
        ps = con.prepareStatement(selectQuery);
        rs = ps.executeQuery();
        int columns = rs.getMetaData().getColumnCount();   
        while (rs.next()) {
            Object[] row = new Object[columns];    
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i); // 1
            }
            ((DefaultTableModel) tbl_RoomBooking.getModel()).insertRow(rs.getRow() - 1,row);
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Method For Room Show In ComboBox
    private void showRoomNo() {
        try {
            String selectQuery = "Select * from room";
            ps = con.prepareStatement(selectQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
                String roomNo = rs.getString("room_no");
                cmb_RoomNo.addItem(roomNo);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    // Method for Customer Show In ComboBox
    private void showCustomer() {
        try {
            String selectQuery = "Select * from customer ";
            ps = con.prepareStatement(selectQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
                String custName = rs.getString("customer_id");
                cmb_Customer.addItem(custName);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
        tbl_RoomBooking = new javax.swing.JTable();
        pnl_Operation = new javax.swing.JPanel();
        txt_DurationInDays = new javax.swing.JTextField();
        cmb_RoomNo = new javax.swing.JComboBox<>();
        btn_CalculateTotalAmt = new javax.swing.JButton();
        btn_Book = new javax.swing.JButton();
        lbl_Customer1 = new javax.swing.JLabel();
        lbl_DurationInDays = new javax.swing.JLabel();
        lbl_BookingDate = new javax.swing.JLabel();
        lbl_RoomNo = new javax.swing.JLabel();
        dt_BookingDate = new com.toedter.calendar.JDateChooser();
        lbl_RoomCost = new javax.swing.JLabel();
        txt_RoomCost = new javax.swing.JTextField();
        cmb_Customer = new javax.swing.JComboBox<>();
        btn_Cancel = new javax.swing.JButton();

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
                .addGap(44, 44, 44)
                .addGroup(pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
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
                .addGap(115, 115, 115))
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
        lbl_SubHeading.setText("Room's Booking");
        lbl_SubHeading.setPreferredSize(new java.awt.Dimension(300, 35));

        lbl_DateTime.setBackground(new java.awt.Color(255, 255, 255));
        lbl_DateTime.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_DateTime.setForeground(new java.awt.Color(102, 102, 102));
        lbl_DateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DateTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_DateTime.setPreferredSize(new java.awt.Dimension(250, 30));

        tbl_RoomBooking.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        tbl_RoomBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Booking Id", "Room No", "Customer Id", "Booking Date", "Duration", "Cost "
            }
        ));
        tbl_RoomBooking.setPreferredSize(new java.awt.Dimension(300, 65));
        tbl_RoomBooking.setRowHeight(25);
        jScrollPane1.setViewportView(tbl_RoomBooking);

        txt_DurationInDays.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_DurationInDays.setPreferredSize(new java.awt.Dimension(100, 35));

        cmb_RoomNo.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        cmb_RoomNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));
        cmb_RoomNo.setPreferredSize(new java.awt.Dimension(255, 35));
        cmb_RoomNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_RoomNoItemStateChanged(evt);
            }
        });

        btn_CalculateTotalAmt.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btn_CalculateTotalAmt.setText("Total Cost");
        btn_CalculateTotalAmt.setPreferredSize(new java.awt.Dimension(120, 35));
        btn_CalculateTotalAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculateTotalAmtActionPerformed(evt);
            }
        });

        btn_Book.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btn_Book.setText("Book");
        btn_Book.setPreferredSize(new java.awt.Dimension(90, 35));
        btn_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BookActionPerformed(evt);
            }
        });

        lbl_Customer1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_Customer1.setText("Customer");
        lbl_Customer1.setPreferredSize(new java.awt.Dimension(100, 30));

        lbl_DurationInDays.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_DurationInDays.setText("Duration In Days");
        lbl_DurationInDays.setPreferredSize(new java.awt.Dimension(150, 30));

        lbl_BookingDate.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_BookingDate.setText("Booking Date");
        lbl_BookingDate.setPreferredSize(new java.awt.Dimension(110, 30));
        lbl_BookingDate.setVerifyInputWhenFocusTarget(false);

        lbl_RoomNo.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_RoomNo.setText("Room No");
        lbl_RoomNo.setPreferredSize(new java.awt.Dimension(100, 30));

        dt_BookingDate.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        dt_BookingDate.setPreferredSize(new java.awt.Dimension(255, 35));

        lbl_RoomCost.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_RoomCost.setText("Room's Cost");
        lbl_RoomCost.setPreferredSize(new java.awt.Dimension(150, 30));

        txt_RoomCost.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_RoomCost.setPreferredSize(new java.awt.Dimension(120, 35));

        cmb_Customer.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        cmb_Customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));
        cmb_Customer.setPreferredSize(new java.awt.Dimension(255, 35));

        btn_Cancel.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setPreferredSize(new java.awt.Dimension(90, 35));

        javax.swing.GroupLayout pnl_OperationLayout = new javax.swing.GroupLayout(pnl_Operation);
        pnl_Operation.setLayout(pnl_OperationLayout);
        pnl_OperationLayout.setHorizontalGroup(
            pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OperationLayout.createSequentialGroup()
                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_OperationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_OperationLayout.createSequentialGroup()
                                .addComponent(txt_RoomCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_CalculateTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_OperationLayout.createSequentialGroup()
                                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Customer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_RoomNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_DurationInDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_RoomCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_Customer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dt_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnl_OperationLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_OperationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_DurationInDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_OperationLayout.setVerticalGroup(
            pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_OperationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Customer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_BookingDate, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dt_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_DurationInDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_DurationInDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_RoomCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RoomCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CalculateTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_OperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
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
                .addGap(0, 7, Short.MAX_VALUE))
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

    private void lbl_RoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RoomsMouseClicked

    }//GEN-LAST:event_lbl_RoomsMouseClicked

    private void lbl_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CustomerMouseClicked

    }//GEN-LAST:event_lbl_CustomerMouseClicked

    private void lbl_BookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BookingMouseClicked

    }//GEN-LAST:event_lbl_BookingMouseClicked

    private void lbl_DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DashboardMouseClicked

    }//GEN-LAST:event_lbl_DashboardMouseClicked

    // Get Room Cost
    private void cmb_RoomNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_RoomNoItemStateChanged

        getRoomCost();

    }//GEN-LAST:event_cmb_RoomNoItemStateChanged

    // Get Room Cost
    private void getRoomCost() {

        try {
            //NumberFormat amountFormat = NumberFormat.getCurrencyInstance();
            // String s="\u20B9";

            String rno = cmb_RoomNo.getSelectedItem().toString();
            ps = con.prepareStatement("Select room_price from room where room_no = ? ");
            ps.setString(1, rno);
            rs = ps.executeQuery();
            while (rs.next()) {
                roomCost = rs.getDouble("room_price");
                //txt_RoomCost.setText(String.format("%.2f", roomCost));
                txt_RoomCost.setText(df.format(roomCost));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Calculate Total Room Cost
    private void btn_CalculateTotalAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalculateTotalAmtActionPerformed
        calculateTotalRoomCost();

    }//GEN-LAST:event_btn_CalculateTotalAmtActionPerformed

    // Calculate Total Room Cost
    private void calculateTotalRoomCost() {
        int noOfDays = Integer.parseInt(txt_DurationInDays.getText());
        double calTotalCost = roomCost * noOfDays;
        txt_RoomCost.setText(df.format(calTotalCost));
    }

    // For Booking Room 
    private void btn_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookActionPerformed

        bookedRoom();
    }//GEN-LAST:event_btn_BookActionPerformed

    // Method for Booked Room
    private void bookedRoom() {
        Date dateNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyhhmmss");     // 'B4 - 13 12 23 02 11 03'
        String dateId = ft.format(dateNow);

        String countQuery = "select count(booking_id) from booking";
        String insertQuery = "Insert into booking(booking_id, room, customer, booking_date, duration, totalcost) values(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(countQuery);
            rs = ps.executeQuery();
            final String bookingRoomPrefix = "B";

            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
            }
            ++id;
            String generatedBookingId = bookingRoomPrefix.concat(Integer.toString(id).concat("-").concat(dateId));

            ps = con.prepareStatement(insertQuery);
            ps.setString(1, generatedBookingId);
            ps.setString(2, cmb_RoomNo.getSelectedItem().toString());
            ps.setString(3, cmb_Customer.getSelectedItem().toString());
            Date date = dt_BookingDate.getDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String bookingDate = df.format(date);
            ps.setString(4, bookingDate);
            ps.setString(5, txt_DurationInDays.getText());
            double totprice = Double.parseDouble(txt_RoomCost.getText());
            ps.setDouble(6, totprice);
            ps.execute();

            JOptionPane.showMessageDialog(this, "<html><h2 style='font-family: courier new; size='30' color='red'> Room Booking Information Saved !! ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Book;
    private javax.swing.JButton btn_CalculateTotalAmt;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JComboBox<String> cmb_Customer;
    private javax.swing.JComboBox<String> cmb_RoomNo;
    private com.toedter.calendar.JDateChooser dt_BookingDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Booking;
    private javax.swing.JLabel lbl_BookingDate;
    private javax.swing.JLabel lbl_Customer;
    private javax.swing.JLabel lbl_Customer1;
    private javax.swing.JLabel lbl_Dashboard;
    private javax.swing.JLabel lbl_DateTime;
    private javax.swing.JLabel lbl_DurationInDays;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbl_Logout;
    private javax.swing.JLabel lbl_RoomCost;
    private javax.swing.JLabel lbl_RoomNo;
    private javax.swing.JLabel lbl_Rooms;
    private javax.swing.JLabel lbl_SubHeading;
    private javax.swing.JPanel pnl_Heading;
    private javax.swing.JPanel pnl_Main;
    private javax.swing.JPanel pnl_Module;
    private javax.swing.JPanel pnl_Operation;
    private javax.swing.JTable tbl_RoomBooking;
    private javax.swing.JTextField txt_DurationInDays;
    private javax.swing.JTextField txt_RoomCost;
    // End of variables declaration//GEN-END:variables

    

}
