
package form;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterJob;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;

public class dataStatistik extends javax.swing.JFrame {

    public dataStatistik() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Penjualan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Makanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 144, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nasi Goreng", "Mie Goreng", "Ayam Bakar", "Sate Ayam", "Soto Ayam", "Bakso", "Gado-gado", "Rendang", "Soto Betawi", "Nasi Padang", "Sushi", "Sashimi", "Tempura", "Udon", "Ramen", "Burger", "Pizza", "Spaghetti", "Steak", "Lobster", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 141, 128, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 300, 610, 270));

        jButton1.setText("Lihat Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 262, -1, -1));

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 262, -1, -1));

        jButton3.setText("Cetak Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 76, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AA1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 690, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectedFood = jComboBox1.getSelectedItem().toString();
        try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
        String query = "SELECT nama_makanan, SUM(jumlah) AS jumlah, harga, SUM(jumlah * harga) AS total_harga FROM data_pesan_bayar WHERE nama_makanan = ? GROUP BY nama_makanan";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, selectedFood);
        ResultSet resultSet = statement.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        model.setColumnIdentifiers(new Object[]{"Makanan", "Total Penjualan", "Harga", "Total Pendapatan"});

        while (resultSet.next()) {
            String food = resultSet.getString("nama_makanan");
            int total = resultSet.getInt("jumlah");
            int price = resultSet.getInt("harga");
            int totalPrice = resultSet.getInt("total_harga");
            model.addRow(new Object[]{food, total, price, totalPrice});
        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
        sorter.setComparator(1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(1, SortOrder.DESCENDING)));
        sorter.sort();
    } catch (SQLException ex) {
        ex.printStackTrace();
    
}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/database_restoran", "root", "");
        String deleteQuery = "DELETE FROM data_statistik";
        PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
        deleteStatement.executeUpdate();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        String insertQuery = "INSERT INTO data_statistik (nama_makanan, jumlah, harga, total_harga) VALUES (?, ?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

        for (int i = 0; i < rowCount; i++) {
            String makanan = model.getValueAt(i, 0).toString();
            int jumlah = Integer.parseInt(model.getValueAt(i, 1).toString());
            int harga = Integer.parseInt(model.getValueAt(i, 2).toString());
            int total_harga = Integer.parseInt(model.getValueAt(i, 3).toString());

            insertStatement.setString(1, makanan);
            insertStatement.setInt(2, jumlah);
            insertStatement.setInt(3, harga);
            insertStatement.setInt(4, total_harga);
            insertStatement.executeUpdate();
        }

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data.", "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         cetakLaporan();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         menuUtama menu = new menuUtama();
          menu.setVisible(true);
          menu.pack();
          menu.setLocationRelativeTo(null);
          menu.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

     private void cetakLaporan() {
    try {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(jTable1.getPrintable(
        JTable.PrintMode.FIT_WIDTH, null, null));
        if (printerJob.printDialog()) {
            printerJob.print();
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencetak laporan.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(dataStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataStatistik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
