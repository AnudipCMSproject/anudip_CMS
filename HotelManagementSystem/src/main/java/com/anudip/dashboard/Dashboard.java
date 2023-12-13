
package com.anudip.dashboard;

import com.anudip.booking.Booking;
import com.anudip.customer.Customer;
import com.anudip.home.Login;
import com.anudip.home.Rooms;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dashboard extends javax.swing.JFrame {
 
    public Dashboard() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss aa");
        lbl_DateTime.setText(sdf.format(new Date()));
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
        pnl_Dashboard = new javax.swing.JPanel();
        pnl_Customers = new javax.swing.JPanel();
        lbl_Customers = new javax.swing.JLabel();
        pnl_DailyIncome = new javax.swing.JPanel();
        lbl_DailyIncome = new javax.swing.JLabel();
        cmb_roomno = new javax.swing.JComboBox<>();
        pnl_IncomeRomm = new javax.swing.JPanel();
        lbl_IncomeRoom = new javax.swing.JLabel();
        dt_BookingDate = new com.toedter.calendar.JDateChooser();
        pnl_Rooms = new javax.swing.JPanel();
        lbl_Room = new javax.swing.JLabel();
        lbl_BookingDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1315, 711));

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
                .addGap(39, 39, 39)
                .addGroup(pnl_ModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
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
                .addGap(112, 112, 112))
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
        lbl_SubHeading.setText("Dashboard");
        lbl_SubHeading.setPreferredSize(new java.awt.Dimension(300, 35));

        lbl_DateTime.setBackground(new java.awt.Color(255, 255, 255));
        lbl_DateTime.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        lbl_DateTime.setForeground(new java.awt.Color(102, 102, 102));
        lbl_DateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DateTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_DateTime.setPreferredSize(new java.awt.Dimension(250, 30));

        pnl_Dashboard.setBackground(new java.awt.Color(255, 255, 255));

        pnl_Customers.setBackground(new java.awt.Color(152, 251, 152));
        pnl_Customers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_Customers.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        pnl_Customers.setPreferredSize(new java.awt.Dimension(390, 190));

        lbl_Customers.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        lbl_Customers.setText("Customers");
        lbl_Customers.setPreferredSize(new java.awt.Dimension(140, 25));

        javax.swing.GroupLayout pnl_CustomersLayout = new javax.swing.GroupLayout(pnl_Customers);
        pnl_Customers.setLayout(pnl_CustomersLayout);
        pnl_CustomersLayout.setHorizontalGroup(
            pnl_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CustomersLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lbl_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_CustomersLayout.setVerticalGroup(
            pnl_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_DailyIncome.setBackground(new java.awt.Color(152, 251, 152));
        pnl_DailyIncome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_DailyIncome.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        pnl_DailyIncome.setPreferredSize(new java.awt.Dimension(390, 190));

        lbl_DailyIncome.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        lbl_DailyIncome.setText("Daily Income");
        lbl_DailyIncome.setPreferredSize(new java.awt.Dimension(140, 25));

        javax.swing.GroupLayout pnl_DailyIncomeLayout = new javax.swing.GroupLayout(pnl_DailyIncome);
        pnl_DailyIncome.setLayout(pnl_DailyIncomeLayout);
        pnl_DailyIncomeLayout.setHorizontalGroup(
            pnl_DailyIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DailyIncomeLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lbl_DailyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        pnl_DailyIncomeLayout.setVerticalGroup(
            pnl_DailyIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DailyIncomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_DailyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        cmb_roomno.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        cmb_roomno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmb_roomno.setPreferredSize(new java.awt.Dimension(220, 35));

        pnl_IncomeRomm.setBackground(new java.awt.Color(240, 230, 140));
        pnl_IncomeRomm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_IncomeRomm.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        pnl_IncomeRomm.setPreferredSize(new java.awt.Dimension(390, 190));

        lbl_IncomeRoom.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        lbl_IncomeRoom.setText("Income/Room");
        lbl_IncomeRoom.setPreferredSize(new java.awt.Dimension(140, 25));

        javax.swing.GroupLayout pnl_IncomeRommLayout = new javax.swing.GroupLayout(pnl_IncomeRomm);
        pnl_IncomeRomm.setLayout(pnl_IncomeRommLayout);
        pnl_IncomeRommLayout.setHorizontalGroup(
            pnl_IncomeRommLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_IncomeRommLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lbl_IncomeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        pnl_IncomeRommLayout.setVerticalGroup(
            pnl_IncomeRommLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_IncomeRommLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IncomeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dt_BookingDate.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        dt_BookingDate.setPreferredSize(new java.awt.Dimension(220, 35));

        pnl_Rooms.setBackground(new java.awt.Color(221, 160, 221));
        pnl_Rooms.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_Rooms.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        pnl_Rooms.setPreferredSize(new java.awt.Dimension(390, 190));

        lbl_Room.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        lbl_Room.setText("Rooms");
        lbl_Room.setPreferredSize(new java.awt.Dimension(140, 25));

        javax.swing.GroupLayout pnl_RoomsLayout = new javax.swing.GroupLayout(pnl_Rooms);
        pnl_Rooms.setLayout(pnl_RoomsLayout);
        pnl_RoomsLayout.setHorizontalGroup(
            pnl_RoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RoomsLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lbl_Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        pnl_RoomsLayout.setVerticalGroup(
            pnl_RoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RoomsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        lbl_BookingDate.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        lbl_BookingDate.setText("Booking Date");
        lbl_BookingDate.setPreferredSize(new java.awt.Dimension(160, 30));

        javax.swing.GroupLayout pnl_DashboardLayout = new javax.swing.GroupLayout(pnl_Dashboard);
        pnl_Dashboard.setLayout(pnl_DashboardLayout);
        pnl_DashboardLayout.setHorizontalGroup(
            pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_DashboardLayout.createSequentialGroup()
                        .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_DailyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnl_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_IncomeRomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_DashboardLayout.createSequentialGroup()
                        .addComponent(dt_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_DashboardLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(lbl_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(640, Short.MAX_VALUE)))
        );
        pnl_DashboardLayout.setVerticalGroup(
            pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DashboardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dt_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_IncomeRomm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_DailyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnl_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_DashboardLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(lbl_BookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(461, Short.MAX_VALUE)))
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
                                .addGap(315, 315, 315)
                                .addComponent(lbl_SubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnl_MainLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(pnl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(26, 26, 26)
                .addComponent(pnl_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_roomno;
    private com.toedter.calendar.JDateChooser dt_BookingDate;
    private javax.swing.JLabel lbl_Booking;
    private javax.swing.JLabel lbl_BookingDate;
    private javax.swing.JLabel lbl_Customer;
    private javax.swing.JLabel lbl_Customers;
    private javax.swing.JLabel lbl_DailyIncome;
    private javax.swing.JLabel lbl_Dashboard;
    private javax.swing.JLabel lbl_DateTime;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbl_IncomeRoom;
    private javax.swing.JLabel lbl_Logout;
    private javax.swing.JLabel lbl_Room;
    private javax.swing.JLabel lbl_Rooms;
    private javax.swing.JLabel lbl_SubHeading;
    private javax.swing.JPanel pnl_Customers;
    private javax.swing.JPanel pnl_DailyIncome;
    private javax.swing.JPanel pnl_Dashboard;
    private javax.swing.JPanel pnl_Heading;
    private javax.swing.JPanel pnl_IncomeRomm;
    private javax.swing.JPanel pnl_Main;
    private javax.swing.JPanel pnl_Module;
    private javax.swing.JPanel pnl_Rooms;
    // End of variables declaration//GEN-END:variables
}
