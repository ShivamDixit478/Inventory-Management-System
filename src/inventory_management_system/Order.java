/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory_management_system;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.time.format.DateTimeFormatter;
import java. time. LocalDateTime;
import  java. util.*;


public class Order extends javax.swing.JFrame {

   
    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }

    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    
    public void SelectProd(){
        try{
            Con = new DatabaseConnection().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from PRODUCTTABLE Order by PRODID");
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            model.setRowCount(0);
           while(Rs.next()){
               String[] row = {Rs.getString(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5)};
               model.addRow(row);
           }
           
           St.close();
           Rs.close();
           Con.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void SelectCust(){
        try{
            Con = new DatabaseConnection().getConn();
            St =  Con.createStatement();
            Rs = St.executeQuery("Select * from CUSTOMERTABLE Order by CUSTID");
            DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
            model.setRowCount(0);
           while(Rs.next()){
               String[] row = {Rs.getString(1),Rs.getString(2),Rs.getString(3)};
               model.addRow(row);
           }
           
           St.close();
           Rs.close();
           Con.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CrossSign = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PRICE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        ViewOrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        TotalAmount = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        ORDERID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        CustomerName = new javax.swing.JLabel();
        QUANTITY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AddToButton = new javax.swing.JButton();
        Rupee = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVENTORY MANAGEMENT SYSTEM");

        CrossSign.setBackground(new java.awt.Color(0, 0, 51));
        CrossSign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CrossSign.setForeground(new java.awt.Color(255, 255, 255));
        CrossSign.setText("X");
        CrossSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossSignMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE ORDERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CrossSign, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrossSign)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("OrderID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Customer Name");

        PRICE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Date");

        Print.setBackground(new java.awt.Color(0, 0, 51));
        Print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(0, 0, 51));
        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add Order");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        HomeButton.setBackground(new java.awt.Color(0, 0, 51));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });

        ViewOrderButton.setBackground(new java.awt.Color(0, 0, 51));
        ViewOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewOrderButton.setText("View Order");
        ViewOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrderButtonMouseClicked(evt);
            }
        });

        BillTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        BillTable.setRowHeight(25);
        BillTable.setSelectionBackground(new java.awt.Color(0, 0, 51));
        BillTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillTable);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Customers List");

        CustomerTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cust.ID", "Name", "Phone"
            }
        ));
        CustomerTable.setRowHeight(25);
        CustomerTable.setSelectionBackground(new java.awt.Color(0, 0, 51));
        CustomerTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Products List");

        TotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalAmount.setForeground(new java.awt.Color(0, 0, 51));
        TotalAmount.setText("Amount");

        Date.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 51));
        Date.setText("Date");

        ORDERID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ProductTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ProdID", "Name", "Quantity", "Description", "Category"
            }
        ));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(0, 0, 51));
        ProductTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ProductTable);

        CustomerName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(0, 0, 51));
        CustomerName.setText("Customer Name");

        QUANTITY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Price");

        AddToButton.setBackground(new java.awt.Color(0, 0, 51));
        AddToButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddToButton.setForeground(new java.awt.Color(255, 255, 255));
        AddToButton.setText("AddTo Order");
        AddToButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToButtonMouseClicked(evt);
            }
        });

        Rupee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Rupee.setForeground(new java.awt.Color(0, 0, 51));
        Rupee.setText("Rs.");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Customer ID");

        CustomerID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ViewOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ORDERID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(24, 24, 24)
                            .addComponent(QUANTITY, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rupee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(144, 144, 144))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(QUANTITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ORDERID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(AddToButton)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CustomerName)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Date))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ViewOrderButton)
                            .addComponent(AddButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalAmount)
                    .addComponent(Print)
                    .addComponent(Rupee))
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrossSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossSignMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CrossSignMouseClicked

    //int NewQuantity=OldQuantity;
    private void update()
    {
        int NewQuantity=OldQuantity-Integer.valueOf(QUANTITY.getText());
        try
            {
                Con = new DatabaseConnection().getConn();
                String UpdateQuery="Update User1.PRODUCTTABLE set QUANTITY="+NewQuantity+""+"where PRODID="+ProductID;
                Statement Add=Con.createStatement();
                Add.executeUpdate(UpdateQuery);
//                if(a==0)
//                   JOptionPane.showMessageDialog(this,"Category not Updated");
//               else
//                   JOptionPane.showMessageDialog(this,"Category Updated Successfully");
                SelectProd();
                
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked

        try
        {
            BillTable.print();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       /* if(QUANTITY.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter the ProductID to be Deleted");
        }
        else
        {
            try
            {
                Con = new DatabaseConnection().getConn();
                String Id=QUANTITY.getText();
                String Query="Delete from User1.PRODUCTTABLE where PRODID="+Id;
                Statement Add=Con.createStatement();
                int a=Add.executeUpdate(Query);
                if(a==0)
                JOptionPane.showMessageDialog(this,"Product was not in the List");
                else
                JOptionPane.showMessageDialog(this,"Product Deleted Successfully");
                SelectProd();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }*/
    }//GEN-LAST:event_PrintMouseClicked

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(ORDERID.getText().isEmpty() || CustomerName.getText().isEmpty() || CustomerID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try
           {
               Con=new DatabaseConnection().getConn();
               DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
                int N = model.getRowCount();                
                String bill = "";
                int j =0;
                //System.out.print("start");
                while(j<N)
                {
                    String num = model.getValueAt(j, 0).toString();
                    String pName = model.getValueAt(j, 1).toString();
                    String qty = model.getValueAt(j, 2).toString();
                    String price = model.getValueAt(j,3).toString();
                    String total = model.getValueAt(j, 4).toString();

                    bill += num+","+pName+","+qty+","+price+","+total +" : ";
                    j++;
                 }
                   //System.out.println(bill);
                
                
                
                PreparedStatement add = Con.prepareStatement("insert into ORDERTABLE values(?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(ORDERID.getText()));
                add.setInt(2, Integer.valueOf(CustomerID.getText()));
                add.setString(3,CustomerName.getText());
                add.setString(4,Date.getText());
                add.setDouble(5,Double.valueOf(TotalAmount.getText()));
                add.setString(6,bill);                
                add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Order Added Successfully");
                Con.close();
            }
           catch(SQLException e)
           {
            e.printStackTrace();
           }
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void ViewOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderButtonMouseClicked
       if(ORDERID.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Enter Order Id");
        }
        else{
            try{
                Con = new DatabaseConnection().getConn();
                String query = "select * from ORDERTABLE  where ORDERID = " + ORDERID.getText() ;
                St = Con.createStatement();
                Rs = St.executeQuery(query);
                
                if(!Rs.next())
                    JOptionPane.showMessageDialog(this, "Enter Correct Order Id");
                else{
                    DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
                    model.setRowCount(0);
                    String bill = Rs.getString("BILL");
                    CustomerID.setText(Rs.getString("CUSTID"));
                    CustomerName.setText(Rs.getString("CUSTNAME"));                    
                    Date.setText(Rs.getString("DATE"));
                    String[] AllOrder = bill.split(" : ");
                    int total=0;
                    for(int j=0;j<AllOrder.length;j++)
                    {
                        String[] item = AllOrder[j].split(",");
                        total+=Integer.valueOf(item[item.length-1]);
                        model.addRow(item);
                    }
                    TotalAmount.setText(total+"");
                    
                   
                }
                Con.close();
                St.close();
                Rs.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
       }
           // Blackcolor();
    }//GEN-LAST:event_ViewOrderButtonMouseClicked

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
       /* DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        int MyIndex=BillTable.getSelectedRow();
        QUANTITY.setText(model.getValueAt(MyIndex,0).toString());
        NAME.setText(model.getValueAt(MyIndex,1).toString());
        ABC.setText(model.getValueAt(MyIndex,2).toString());
        DESCRIPTION.setText(model.getValueAt(MyIndex,3).toString());*/

    }//GEN-LAST:event_BillTableMouseClicked

    private void GetToday()
    {
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDateTime now=LocalDateTime.now();
        Date.setText(dt.format(now));
    }
    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
      DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        int MyIndex=CustomerTable.getSelectedRow();
        CustomerID.setText(model.getValueAt(MyIndex,0).toString());
        CustomerName.setText(model.getValueAt(MyIndex,1).toString());
        //CUSTPHONE.setText(model.getValueAt(MyIndex,2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    
    int flag=0;
    int ProductID;
    int OldQuantity;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
       DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
       int MyIndex=ProductTable.getSelectedRow();
       ProductID=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
       ProdName=model.getValueAt(MyIndex,1).toString();
       OldQuantity=Integer.valueOf(model.getValueAt(MyIndex,2).toString());
       flag=1;
    }//GEN-LAST:event_ProductTableMouseClicked

    int i=1;
    int UPrice;
    int Total=0;
    String ProdName;
    int tot;
    private void AddToButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToButtonMouseClicked
        if(flag==0 || QUANTITY.getText().isEmpty() || PRICE.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Select Product and Enter Quantity");
      }
      else
      {
        UPrice=Integer.valueOf(PRICE.getText());
        Total=UPrice*Integer.valueOf(QUANTITY.getText());
       Vector v=new Vector();
       v.add(i);
       v.add(ProdName);
       v.add(QUANTITY.getText());
       v.add(UPrice);
       v.add(Total);
       DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
       model.addRow(v);
       tot=Total+tot;
       TotalAmount.setText(""+tot);
       update();
       i++;
      }
    }//GEN-LAST:event_AddToButtonMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddToButton;
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel CrossSign;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel Date;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField ORDERID;
    private javax.swing.JTextField PRICE;
    private javax.swing.JButton Print;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField QUANTITY;
    private javax.swing.JLabel Rupee;
    private javax.swing.JLabel TotalAmount;
    private javax.swing.JButton ViewOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
