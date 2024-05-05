
package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;

import javax.swing.*;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;



// Main frame for the application after successful login
public class Dashboard extends javax.swing.JFrame {

    CardLayout layout;
    String userSelect;
    String username;
    String fullName;
    UserDTO userDTO;
    LocalDateTime outTime;
    /**
     * Creates new form Dashboard
     */
    public Dashboard(String username, String userType, UserDTO userDTO) {
        initComponents();

        navPanel.setVisible(true);
        menuPanel.setVisible(true);
        layout = new CardLayout();
        userSelect = userType;
        this.username = username;
        this.userDTO = userDTO;
        if("EMPLOYEE".equalsIgnoreCase(userType))
            notForEmployee();
        currentUserSession();

        // Panel Layout set to Card Layout to allow switching between different sections
        displayPanel.setLayout(layout);
        displayPanel.add("Home", new HomePage(username));
        displayPanel.add("Users", new UsersPage());
        displayPanel.add("Customers", new CustomerPage());
        displayPanel.add("Products", new ProductPage(username, this));
        displayPanel.add("Suppliers", new SupplierPage());
        displayPanel.add("Current Stock", new CurrentStockPage(username));
        displayPanel.add("Sales", new SalesPage(username, this));
        displayPanel.add("Purchase", new PurchasePage(this));

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                outTime = LocalDateTime.now();
                userDTO.setOutTime(String.valueOf(outTime));
                userDTO.setUsername(username);
                new UserDAO().addUserLogin(userDTO);
                super.windowClosing(e);
            }
        });

        setTitle("Inventory Manager");
        setVisible(true);
    }

    // Methods to display different sections in the mainframe
    public void addHomePage(){
        layout.show(displayPanel, "Home");
    }
    public void addUsersPage() {
        layout.show(displayPanel, "Users");
    }
    public void addCustPage() {
        layout.show(displayPanel, "Customers");
    }
    public void addProdPage() {
        layout.show(displayPanel, "Products");
    }
    public void addSuppPage() {
        layout.show(displayPanel, "Suppliers");
    }
    public void addStockPage() {
        layout.show(displayPanel, "Current Stock");
    }
    public void addSalesPage() {
        layout.show(displayPanel, "Sales");
    }
    public void addPurchasePage() {
        layout.show(displayPanel, "Purchase");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        prodButton = new javax.swing.JButton();
        stockButton = new javax.swing.JButton();
        custButton = new javax.swing.JButton();
        suppButton = new javax.swing.JButton();
        salesButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        purchaseButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        nameLabel1 = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Manager");
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));

        menuPanel.setPreferredSize(new java.awt.Dimension(120, 26));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        prodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/product-design (1).png"))); // NOI18N
        prodButton.setText("Products");
        prodButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prodButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prodButton.setIconTextGap(14);
        prodButton.setMargin(new java.awt.Insets(2, 20, 3, 14));
        prodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodButtonActionPerformed(evt);
            }
        });

        stockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/stock.png"))); // NOI18N
        stockButton.setText("Current Stock");
        stockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stockButton.setIconTextGap(7);
        stockButton.setMargin(new java.awt.Insets(2, 24, 3, 14));
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        custButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/customers.png"))); // NOI18N
        custButton.setText("Customers");
        custButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        custButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        custButton.setIconTextGap(12);
        custButton.setMargin(new java.awt.Insets(2, 25, 3, 14));
        custButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custButtonActionPerformed(evt);
            }
        });

        suppButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/distribution.png"))); // NOI18N
        suppButton.setText("Suppliers");
        suppButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suppButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        suppButton.setIconTextGap(20);
        suppButton.setMargin(new java.awt.Insets(2, 24, 3, 14));
        suppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppButtonActionPerformed(evt);
            }
        });

        salesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/sales.png"))); // NOI18N
        salesButton.setText("Sales");
        salesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salesButton.setIconTextGap(28);
        salesButton.setMargin(new java.awt.Insets(2, 25, 3, 14));
        salesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesButtonActionPerformed(evt);
            }
        });

        usersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/users.png"))); // NOI18N
        usersButton.setText("Users");
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usersButton.setIconTextGap(24);
        usersButton.setMargin(new java.awt.Insets(2, 28, 3, 14));
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        purchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/shopping-purchase.png"))); // NOI18N
        purchaseButton.setText("Purchase");
        purchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        purchaseButton.setIconTextGap(16);
        purchaseButton.setMargin(new java.awt.Insets(2, 28, 3, 14));
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/log-out_icon-icons.com_50106.png"))); // NOI18N
        logoutButton.setText("LogOut");
        logoutButton.setActionCommand("LogOut");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutButton.setIconTextGap(14);
        logoutButton.setMargin(new java.awt.Insets(2, 22, 3, 14));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        nameLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/download.jpg"))); // NOI18N
        nameLabel1.setText(" ");
        nameLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nameLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        nameLabel1.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suppButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(custButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(suppButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        displayPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        nameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/users.png"))); // NOI18N
        nameLabel.setText("User: ");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int opt = JOptionPane.showConfirmDialog(
                null,
                "<html>Are you sure you want to logout?<br>You will have to login again.<html>",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);
        if (opt==JOptionPane.YES_OPTION){
            outTime = LocalDateTime.now();
            userDTO.setOutTime(String.valueOf(outTime));
            userDTO.setUsername(username);
            new UserDAO().addUserLogin(userDTO);
            dispose();
            LoginPage logPage = new LoginPage();
            logPage.setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
        addUsersPage();
    }//GEN-LAST:event_usersButtonActionPerformed

    private void salesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesButtonActionPerformed
        addSalesPage();
    }//GEN-LAST:event_salesButtonActionPerformed

    private void suppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppButtonActionPerformed
        addSuppPage();
    }//GEN-LAST:event_suppButtonActionPerformed

    private void custButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custButtonActionPerformed
        addCustPage();
    }//GEN-LAST:event_custButtonActionPerformed

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        addStockPage();
    }//GEN-LAST:event_stockButtonActionPerformed

    private void prodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodButtonActionPerformed
        addProdPage();
    }//GEN-LAST:event_prodButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        addPurchasePage();
    }//GEN-LAST:event_purchaseButtonActionPerformed

    // Method to display the user currently logged in
    public void currentUserSession() {
        UserDTO userDTO = new UserDTO();
        new UserDAO().getFullName(userDTO, username);
        nameLabel.setText("User: " + userDTO.getFullName() + " ("+userSelect+")");
    }

    // Allows only the ADMINISTRATOR type user to view and manipulate 'Users' and 'User Logs'
    public void notForEmployee(){
        navPanel.remove(usersButton);
        //navPanel.remove(salesButton);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custButton;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton prodButton;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton salesButton;
    private javax.swing.JButton stockButton;
    private javax.swing.JButton suppButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables
}
