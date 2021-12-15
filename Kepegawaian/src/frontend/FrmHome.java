/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author taufik
 */
public class FrmHome extends javax.swing.JFrame {

    /**
     * Creates new form FrmHome
     */
    
    CardLayout cardlayout;
    
    public FrmHome() {
        initComponents();
        
        cardlayout = (CardLayout)(pnlCards.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        pnlMenu = new javax.swing.JPanel();
        pnlBtnHome = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        pnlBtnUser = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        pnlBtnGaji = new javax.swing.JPanel();
        gaji = new javax.swing.JLabel();
        pnlBtnLogout = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        pnlBtnPegawai = new javax.swing.JPanel();
        pegawai = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        pnlDashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlPegawai = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlGaji = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlJabatan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlJenisGaji = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlUser = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlPenggajian = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jSplitPane2.setBorder(null);
        jSplitPane2.setDividerSize(0);
        jSplitPane2.setEnabled(false);

        pnlMenu.setBackground(new java.awt.Color(51, 66, 87));

        pnlBtnHome.setBackground(new java.awt.Color(51, 66, 87));
        pnlBtnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 66, 87)));
        pnlBtnHome.setForeground(new java.awt.Color(254, 254, 254));
        pnlBtnHome.setPreferredSize(new java.awt.Dimension(190, 55));
        pnlBtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnHomeMouseClicked(evt);
            }
        });

        home.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(254, 254, 254));
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnHomeLayout = new javax.swing.GroupLayout(pnlBtnHome);
        pnlBtnHome.setLayout(pnlBtnHomeLayout);
        pnlBtnHomeLayout.setHorizontalGroup(
            pnlBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnHomeLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBtnHomeLayout.setVerticalGroup(
            pnlBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtnHomeLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(15, 15, 15))
        );

        pnlBtnUser.setBackground(new java.awt.Color(51, 66, 87));
        pnlBtnUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 66, 87)));
        pnlBtnUser.setForeground(new java.awt.Color(254, 254, 254));
        pnlBtnUser.setPreferredSize(new java.awt.Dimension(183, 55));
        pnlBtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnUserMouseClicked(evt);
            }
        });

        user.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(254, 254, 254));
        user.setText("User");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnUserLayout = new javax.swing.GroupLayout(pnlBtnUser);
        pnlBtnUser.setLayout(pnlBtnUserLayout);
        pnlBtnUserLayout.setHorizontalGroup(
            pnlBtnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnUserLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBtnUserLayout.setVerticalGroup(
            pnlBtnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtnUserLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(user)
                .addGap(15, 15, 15))
        );

        pnlBtnGaji.setBackground(new java.awt.Color(51, 66, 87));
        pnlBtnGaji.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 66, 87)));
        pnlBtnGaji.setForeground(new java.awt.Color(254, 254, 254));
        pnlBtnGaji.setPreferredSize(new java.awt.Dimension(177, 55));
        pnlBtnGaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnGajiMouseClicked(evt);
            }
        });

        gaji.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        gaji.setForeground(new java.awt.Color(254, 254, 254));
        gaji.setText("Gaji");
        gaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gajiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gajiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnGajiLayout = new javax.swing.GroupLayout(pnlBtnGaji);
        pnlBtnGaji.setLayout(pnlBtnGajiLayout);
        pnlBtnGajiLayout.setHorizontalGroup(
            pnlBtnGajiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnGajiLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(gaji)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBtnGajiLayout.setVerticalGroup(
            pnlBtnGajiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtnGajiLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(gaji)
                .addGap(15, 15, 15))
        );

        pnlBtnLogout.setBackground(new java.awt.Color(51, 66, 87));
        pnlBtnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 66, 87)));
        pnlBtnLogout.setForeground(new java.awt.Color(254, 254, 254));
        pnlBtnLogout.setPreferredSize(new java.awt.Dimension(199, 55));
        pnlBtnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnLogoutMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(254, 254, 254));
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnLogoutLayout = new javax.swing.GroupLayout(pnlBtnLogout);
        pnlBtnLogout.setLayout(pnlBtnLogoutLayout);
        pnlBtnLogoutLayout.setHorizontalGroup(
            pnlBtnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnLogoutLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBtnLogoutLayout.setVerticalGroup(
            pnlBtnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnLogoutLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logout)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlBtnPegawai.setBackground(new java.awt.Color(51, 66, 87));
        pnlBtnPegawai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 66, 87)));
        pnlBtnPegawai.setForeground(new java.awt.Color(254, 254, 254));
        pnlBtnPegawai.setPreferredSize(new java.awt.Dimension(316, 55));
        pnlBtnPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBtnPegawaiMouseClicked(evt);
            }
        });

        pegawai.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        pegawai.setForeground(new java.awt.Color(254, 254, 254));
        pegawai.setText("Pegawai");
        pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pegawaiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnPegawaiLayout = new javax.swing.GroupLayout(pnlBtnPegawai);
        pnlBtnPegawai.setLayout(pnlBtnPegawaiLayout);
        pnlBtnPegawaiLayout.setHorizontalGroup(
            pnlBtnPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnPegawaiLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(pegawai)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pnlBtnPegawaiLayout.setVerticalGroup(
            pnlBtnPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnPegawaiLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pegawai)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addComponent(pnlBtnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addComponent(pnlBtnGaji, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addComponent(pnlBtnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addComponent(pnlBtnPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(pnlBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBtnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBtnPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBtnGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(pnlMenu);

        pnlCards.setLayout(new java.awt.CardLayout());

        jLabel2.setText("Dashboard");

        javax.swing.GroupLayout pnlDashboardLayout = new javax.swing.GroupLayout(pnlDashboard);
        pnlDashboard.setLayout(pnlDashboardLayout);
        pnlDashboardLayout.setHorizontalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel2)
                .addGap(430, 430, 430))
        );
        pnlDashboardLayout.setVerticalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(689, Short.MAX_VALUE))
        );

        pnlCards.add(pnlDashboard, "pnlDashboard");

        pnlPegawai.setBackground(new java.awt.Color(238, 238, 238));

        jLabel3.setText("Pegawai");

        javax.swing.GroupLayout pnlPegawaiLayout = new javax.swing.GroupLayout(pnlPegawai);
        pnlPegawai.setLayout(pnlPegawaiLayout);
        pnlPegawaiLayout.setHorizontalGroup(
            pnlPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPegawaiLayout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel3)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        pnlPegawaiLayout.setVerticalGroup(
            pnlPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPegawaiLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addContainerGap(665, Short.MAX_VALUE))
        );

        pnlCards.add(pnlPegawai, "pnlPegawai");

        jLabel4.setText("Gaji");

        javax.swing.GroupLayout pnlGajiLayout = new javax.swing.GroupLayout(pnlGaji);
        pnlGaji.setLayout(pnlGajiLayout);
        pnlGajiLayout.setHorizontalGroup(
            pnlGajiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGajiLayout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(416, 416, 416))
        );
        pnlGajiLayout.setVerticalGroup(
            pnlGajiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGajiLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addContainerGap(677, Short.MAX_VALUE))
        );

        pnlCards.add(pnlGaji, "pnlGaji");

        jLabel5.setText("Jabatan");

        javax.swing.GroupLayout pnlJabatanLayout = new javax.swing.GroupLayout(pnlJabatan);
        pnlJabatan.setLayout(pnlJabatanLayout);
        pnlJabatanLayout.setHorizontalGroup(
            pnlJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJabatanLayout.createSequentialGroup()
                .addContainerGap(481, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(399, 399, 399))
        );
        pnlJabatanLayout.setVerticalGroup(
            pnlJabatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJabatanLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addContainerGap(677, Short.MAX_VALUE))
        );

        pnlCards.add(pnlJabatan, "pnlJabatan");

        jLabel6.setText("Jenis Gaji");

        javax.swing.GroupLayout pnlJenisGajiLayout = new javax.swing.GroupLayout(pnlJenisGaji);
        pnlJenisGaji.setLayout(pnlJenisGajiLayout);
        pnlJenisGajiLayout.setHorizontalGroup(
            pnlJenisGajiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJenisGajiLayout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(413, 413, 413))
        );
        pnlJenisGajiLayout.setVerticalGroup(
            pnlJenisGajiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJenisGajiLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addContainerGap(688, Short.MAX_VALUE))
        );

        pnlCards.add(pnlJenisGaji, "pnlJenisGaji");

        jLabel7.setText("User");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserLayout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(419, 419, 419))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addContainerGap(666, Short.MAX_VALUE))
        );

        pnlCards.add(pnlUser, "pnlUser");

        jLabel8.setText("Penggajian");

        javax.swing.GroupLayout pnlPenggajianLayout = new javax.swing.GroupLayout(pnlPenggajian);
        pnlPenggajian.setLayout(pnlPenggajianLayout);
        pnlPenggajianLayout.setHorizontalGroup(
            pnlPenggajianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPenggajianLayout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(417, 417, 417))
        );
        pnlPenggajianLayout.setVerticalGroup(
            pnlPenggajianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPenggajianLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel8)
                .addContainerGap(664, Short.MAX_VALUE))
        );

        pnlCards.add(pnlPenggajian, "pnlPenggajian");

        jSplitPane2.setRightComponent(pnlCards);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(38, 25));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        setColor(pnlBtnHome);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        resetColorBtn(pnlBtnHome);
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        setColor(pnlBtnHome);
    }//GEN-LAST:event_homeMouseClicked

    private void pnlBtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnHomeMouseClicked
        // TODO add your handling code here:
        setColor(pnlBtnHome);
        
        resetColorBtn(pnlBtnUser);
        resetColorBtn(pnlBtnPegawai);
        resetColorBtn(pnlBtnGaji);
        resetColorBtn(pnlBtnLogout);
        
        cardlayout.show(pnlCards, "pnlDashboard");
    }//GEN-LAST:event_pnlBtnHomeMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        // TODO add your handling code here:
        setColor(pnlBtnUser);
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        // TODO add your handling code here:
        resetColorBtn(pnlBtnUser);
    }//GEN-LAST:event_userMouseExited

    private void pnlBtnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnUserMouseClicked
        // TODO add your handling code here:
        setColor(pnlBtnUser);
                        
        resetColorBtn(pnlBtnHome);
        resetColorBtn(pnlBtnPegawai);
        resetColorBtn(pnlBtnGaji);
        resetColorBtn(pnlBtnLogout);
        
        cardlayout.show(pnlCards, "pnlUser");
    }//GEN-LAST:event_pnlBtnUserMouseClicked

    private void pegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegawaiMouseEntered
        // TODO add your handling code here:
        setColor(pnlBtnPegawai);
    }//GEN-LAST:event_pegawaiMouseEntered

    private void pegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegawaiMouseExited
        // TODO add your handling code here:
        resetColorBtn(pnlBtnPegawai);
    }//GEN-LAST:event_pegawaiMouseExited

    private void pnlBtnPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnPegawaiMouseClicked
        // TODO add your handling code here:
        setColor(pnlBtnPegawai);
                        
        resetColorBtn(pnlBtnUser);
        resetColorBtn(pnlBtnHome);
        resetColorBtn(pnlBtnGaji);
        resetColorBtn(pnlBtnLogout);
        
        cardlayout.show(pnlCards, "pnlPegawai");
    }//GEN-LAST:event_pnlBtnPegawaiMouseClicked

    private void gajiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gajiMouseEntered
        // TODO add your handling code here:
        setColor(pnlBtnGaji);
    }//GEN-LAST:event_gajiMouseEntered

    private void gajiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gajiMouseExited
        // TODO add your handling code here:
        resetColorBtn(pnlBtnGaji);
    }//GEN-LAST:event_gajiMouseExited

    private void pnlBtnGajiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnGajiMouseClicked
        // TODO add your handling code here:
        setColor(pnlBtnGaji);
                        
        resetColorBtn(pnlBtnUser);
        resetColorBtn(pnlBtnPegawai);
        resetColorBtn(pnlBtnHome);
        resetColorBtn(pnlBtnLogout);
        
        cardlayout.show(pnlCards, "pnlGaji");
    }//GEN-LAST:event_pnlBtnGajiMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        setColor(pnlBtnLogout);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        resetColorBtn(pnlBtnLogout);
    }//GEN-LAST:event_logoutMouseExited

    private void pnlBtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBtnLogoutMouseClicked
        // TODO add your handling code here:
        setColor(pnlBtnLogout);
                        
        resetColorBtn(pnlBtnUser);
        resetColorBtn(pnlBtnPegawai);
        resetColorBtn(pnlBtnGaji);
        resetColorBtn(pnlBtnHome);
    }//GEN-LAST:event_pnlBtnLogoutMouseClicked
   
    public void setColor(JPanel panel) {
        panel.setBackground(new Color(84, 140, 168));
    }
    
    public void resetColorBtn(JPanel panel) {
        panel.setBackground(new Color(51,66,87));
    }
    
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
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gaji;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel pegawai;
    private javax.swing.JPanel pnlBtnGaji;
    private javax.swing.JPanel pnlBtnHome;
    private javax.swing.JPanel pnlBtnLogout;
    private javax.swing.JPanel pnlBtnPegawai;
    private javax.swing.JPanel pnlBtnUser;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlGaji;
    private javax.swing.JPanel pnlJabatan;
    private javax.swing.JPanel pnlJenisGaji;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPegawai;
    private javax.swing.JPanel pnlPenggajian;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
