/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizoop2;


import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
/**
 *
 * @author Febrio
 */
public class DetailTransaksi extends javax.swing.JPanel {
    String info;
    private static Connection koneksi;
    private DefaultTableModel model;
    /**
     * Creates new form DetailTransaksi
     */
    public DetailTransaksi() {
        initComponents();
         model = new DefaultTableModel();
        this.jTable2.setModel(model);
        model.addColumn("Id Transaksi");
        model.addColumn("Tgl Transaksi");
        model.addColumn("Id Film");
        model.addColumn("Id Studio");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Id Kursi");
        model.addColumn("Kode Jam");
       
    }
    
    
    private static void buka_koneksi(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/bioskop";
                String user = "root";
                String password = "";
               DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
               koneksi = (Connection) DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                System.out.println("Erro Membuat Koneksi");
            }
        }
    }
    private void ambil_data_tabel() {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            String sql = "Select * from detail_transaksi";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
            Object[] o = new Object[7];
            o[0] = r.getString("id_transaksi");
            o[1] = r.getString("tgl_transaksi");
            o[2] = r.getString("id_film");
            o[3] = r.getString("id_studio");
            o[4] = r.getString("nama_pelanggan");
            o[5] = r.getString("id_kursi");
            o[6] = r.getString("kode_jam");
            model.addRow(o);
            }
            r.close();
            s.close();
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan " + e.getMessage());
            }
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDelete = new javax.swing.JButton();
        jButtonNota = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonNota.setText("Buat Nota");
        jButtonNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotaActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Detail Transaksi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonNota)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int row = jTable2.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        int idColumnIndex = 0;
        String idToDelete = jTable2.getValueAt(row, idColumnIndex).toString();
        if (idToDelete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selected row does not have a valid ID.");
            return;
        }
        String sqlkode = "DELETE FROM detail_transaksi WHERE id_transaksi = ?";
        try {
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/bioskop", "root", "");
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.setString(1, idToDelete); // Set the parameter for the ID
            mStatement.executeUpdate();
            mStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting record.");
        }
        ambil_data_tabel();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotaActionPerformed
        int selectedRowIndex = jTable2.getSelectedRow();

    // Check if a row is selected
    if (selectedRowIndex != -1) {
        // Get id_transaksi from the selected row
        String id_transaksi = jTable2.getValueAt(selectedRowIndex, 0).toString();

        // Query to retrieve data based on id_transaksi
//        String query = "SELECT * FROM detail_transaksi WHERE id_transaksi = '" + id_transaksi + "'";
        
        String query = "SELECT id_transaksi, tgl_transaksi, f.judul_film, s.nama_studio, nama_pelanggan, k.nama_kursi, kode_jam FROM detail_transaksi d INNER JOIN film f on f.id_film = d.id_film INNER JOIN studio s on s.id_studio = d.id_studio INNER JOIN kursi k on k.id_kursi = d.id_kursi WHERE id_transaksi = '" + id_transaksi + "'";
        
        try {
            buka_koneksi();
            Statement s = koneksi.createStatement();
            ResultSet r = s.executeQuery(query);

         
            if (r.next()) {
               
                String tgl_transaksi = r.getString("tgl_transaksi");
                String id_film = r.getString("f.judul_film");
                String id_studio = r.getString("s.nama_studio");
                String nama_pelanggan = r.getString("nama_pelanggan");
                String id_kursi = r.getString("k.nama_kursi");
                String kode_jam = r.getString("kode_jam");

                // Display the information using JOptionPane
                String info = "Id Transaksi\t:" + id_transaksi + "\n";
                info += "Tanggal\t:" + tgl_transaksi + "\n";
                info += "Film\t:" + id_film + "\n";
                info += "Studio\t:" + id_studio + "\n";
                info += "Nama Pelanggan\t:" + nama_pelanggan + "\n";
                info += "Kursi\t:" + id_kursi + "\n";
                info += "Jam\t:" + kode_jam + "\n";

                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "Data not found for id_transaksi: " + id_transaksi);
            }

            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan " + e.getMessage());
        }
    } else {
        // Inform the user that no row is selected
        JOptionPane.showMessageDialog(null, "Pilih baris pada tabel terlebih dahulu.");
    }//GEN-LAST:event_jButtonNotaActionPerformed
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

     public static void main(String[] args) {
        // Create a JFrame to host the DetailTransaksi panel
        JFrame frame = new JFrame("Detail Transaksi");
        DetailTransaksi detailTransaksiPanel = new DetailTransaksi();

        // Set up the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(detailTransaksiPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);

        // Fetch data for the table when the panel is displayed
        detailTransaksiPanel.ambil_data_tabel();
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
