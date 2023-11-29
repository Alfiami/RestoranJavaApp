
package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class pemesanandanPembayaran extends javax.swing.JFrame {
   
    DefaultTableModel model;
   
    public pemesanandanPembayaran() {
        initComponents();
        
        String [] judul ={"Kode Transaksi", "Admin", "Nama Makanan", "Harga", "Jumlah", "Total", "Kode Pelanggan"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
       
        tampilkan();
        
        
    
    }

   
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Transaksi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 112, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Makanan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 244, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 112, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 197, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 156, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 109, 115, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 153, 115, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 197, 115, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 109, 159, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 197, 159, -1));

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pemesanan dan Pembayaran");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 25, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 549, 200));

        jButton1.setText("Proses Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 371, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bayar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 330, -1, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 327, 116, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 371, 116, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 460, 116, -1));

        jButton2.setText("Hitung");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 415, -1, -1));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 16, -1, -1));

        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 25, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nasi Goreng", "Mie Goreng", "Ayam Bakar", "Sate Ayam", "Soto Ayam", "Bakso", "Gado-gado", "Rendang", "Soto Betawi", "Nasi Padang", "Sushi", "Sashimi", "Tempura", "Udon", "Ramen", "Burger", "Pizza", "Spaghetti", "Steak", "Lobster", " " }));
        jComboBox1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBox1ComponentAdded(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 241, 159, -1));

        jButton4.setText("Simpan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 340, -1, -1));

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 340, -1, -1));

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 340, -1, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 153, 159, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kode Pelangggan");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 156, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a-bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          menuUtama menu = new menuUtama();
          menu.setVisible(true);
          menu.pack();
          menu.setLocationRelativeTo(null);
          menu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBox1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ComponentAdded

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 int index = jComboBox1.getSelectedIndex();
    if (index >= 0) {
        String[] hargaArr = {"20000", "25000", "15000", "10000", "13000", "12000", "55000", "57000", "95000", "55000", "25000", "55000", "55000", "53000", "43000", "19000", "23000", "15000", "25000", "52000"};
        String harga = hargaArr[index];
        jTextField1.setText(harga);
    } else {
        jTextField1.setText("");
    


        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed
}

    
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String input1 = jTextField1.getText();
        String input2 = jTextField2.getText();
        if (!input1.isEmpty() && !input2.isEmpty()) {
            double angka1 = Double.parseDouble(jTextField1.getText());
        double angka2 = Double.parseDouble(jTextField2.getText());
        double hasil = angka1 * angka2;
            jTextField3.setText(Double.toString(hasil));
            jTextField8.setText(Double.toString(hasil));
        } else {
            JOptionPane.showMessageDialog(null, "Harap isi kedua input dengan angka.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
        cn.createStatement().execute("insert into data_pesan_bayar values"+"('"+jTextField4.getText()+"', '"+jTextField5.getText()+"', '"+jComboBox1.getSelectedItem()+"', '"+jTextField1.getText()+"', '"+jTextField2.getText()+"' , '"+jTextField3.getText()+"','"+jTextField6.getText()+"')");
        tampilkan();
        reset();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ada data yang belum di isi!!");
        }
    }
    
    private void reset(){
        jTextField4.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedItem("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tampilkan() {
    try {
        model.setRowCount(0);
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
        ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM data_pesan_bayar");
        while (rs.next()) {
            String data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
            };
            model.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(pemesanandanPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
            cn.createStatement().executeUpdate("delete from data_pesan_bayar where kode_transaksi ='"+jTextField4.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(pemesanandanPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if(i>-1){
            jTextField4.setText(model.getValueAt(i, 0).toString());
            jTextField5.setText(model.getValueAt(i, 1).toString());
            jComboBox1.setSelectedItem (model.getValueAt(i, 2).toString());
            jTextField1.setText(model.getValueAt(i, 3).toString());
            jTextField2.setText(model.getValueAt(i, 4).toString());
            jTextField3.setText(model.getValueAt(i, 5).toString());
            jTextField6.setText(model.getValueAt(i, 6).toString());
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double angka1 = Double.parseDouble(jTextField7.getText());
        double angka2 = Double.parseDouble(jTextField8.getText());
        double hasil = angka1 - angka2;
        jTextField9.setText(Double.toString(hasil));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
            cn.createStatement().executeUpdate("update data_pesan_bayar set admin='"+jTextField5.getText()+"', nama_makanan='"+jComboBox1.getSelectedItem()+"', harga='"+jTextField1.getText()+"' ,jumlah='"+jTextField2.getText()+"', total='"+jTextField3.getText()+"', kode_pelanggan='"+jTextField6.getText()+"' where kode_transaksi = '"+jTextField4.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(pemesanandanPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         reset();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(pemesanandanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemesanandanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemesanandanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemesanandanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pemesanandanPembayaran().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}