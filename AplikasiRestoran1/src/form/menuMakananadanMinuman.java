
package form;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import form.pemesanandanPembayaran;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class menuMakananadanMinuman extends javax.swing.JFrame {


    DefaultTableModel model;
    
     private JComboBox<String> comboBoxMenu;
    
    

    public menuMakananadanMinuman() {
             initComponents();
        String [] judul ={"Kode Makanan", "Nama Makanan", "Harga"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        tampilkan();
        
        comboBoxMenu = new JComboBox<>();
        refreshComboBoxMenu();
        
    }
       private void tampilkan() {
    int row = jTable1.getRowCount();
        for (int a= 0; a<row;a++){
        }
        
    try {
        // Membersihkan data lama sebelum menambahkan data baru
        model.getDataVector().removeAllElements();

        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
        ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM menu_makanan");
        while (rs.next()) {
            String data[] = { rs.getString(1), rs.getString(2), rs.getString(3) };
            model.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(menuMakananadanMinuman.class.getName()).log(Level.SEVERE, null, ex);
    }
}
      

       
        
        
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Makanan dan Minuman");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Makanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Makanan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 215, 28));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 215, 28));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 215, 28));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 320, 140, 30));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jButton2.setText("Simpan ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 740, 210));

        jButton3.setText("Ubah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 80, -1));

        jButton5.setText("Reset");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 70, 30));

        jButton6.setText("Batal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jButton7.setText("HOME");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AA1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 780, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
   
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
        PreparedStatement pst = cn.prepareStatement("INSERT INTO menu_makanan (kode_makanan, nama_makanan, harga) VALUES (?, ?, ?)");
        pst.setString(1, jTextField1.getText());
        pst.setString(2, jTextField2.getText());
        pst.setString(3, jTextField3.getText());
        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Menu makanan berhasil ditambahkan!");

        // Refresh combo box pada form pemesanandanPembayaran
       

      
        tampilkan();
        reset();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Gagal menambahkan menu makanan!");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
            cn.createStatement().executeUpdate("update menu_makanan set nama_makanan='"+jTextField2.getText()+"', harga='"+jTextField3.getText()+"' where kode_makanan = '"+jTextField1.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(menuMakananadanMinuman.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        
        if(i>-1){
            jTextField1.setText(model.getValueAt(i, 0).toString());
            jTextField2.setText(model.getValueAt(i, 1).toString());
            jTextField3.setText(model.getValueAt(i, 2).toString());
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
            cn.createStatement().executeUpdate("delete from menu_makanan where kode_makanan ='"+jTextField1.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(menuMakananadanMinuman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
   
    private void reset(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String kataKunci = jTextField4.getText().trim(); // Mengambil kata kunci dari inputan teks
    if (!kataKunci.isEmpty()) {
        cariData(kataKunci);
    } else {
        JOptionPane.showMessageDialog(this, "Masukkan kata kunci untuk melakukan pencarian.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
    }
    }
private void cariData(String kataKunci) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jTable1.setRowSorter(sorter);
    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + kataKunci)); // Menggunakan regex filter untuk pencarian, dengan (?i) untuk mengabaikan case-sensitive

    if (jTable1.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Data tidak ditemukan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
        sorter.setRowFilter(null);
        jTextField4.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        menuUtama menu = new menuUtama();
          menu.setVisible(true);
          menu.pack();
          menu.setLocationRelativeTo(null);
          this.dispose(); 
         
            
            
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(menuMakananadanMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuMakananadanMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuMakananadanMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuMakananadanMinuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuMakananadanMinuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

   
    private void refreshComboBoxMenu() {
    try {
            comboBoxMenu.removeAllItems();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT kode_makanan, nama_makanan, harga FROM menu_makanan");
            while (rs.next()) {
                String kodeMakanan = rs.getString("kode_makanan");
                String namaMakanan = rs.getString("nama_makanan");
                String harga = rs.getString("harga");
                comboBoxMenu.addItem(kodeMakanan + " - " + namaMakanan);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data menu makanan!");
        
}
    }}
