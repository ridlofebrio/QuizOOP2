/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizoop2;

/**
 *
 * @author user
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Connection.koneksi;



public class TambahFilm extends javax.swing.JFrame {

    /**
     * Creates new form tambahFilm
     */
    private static Connection koneksi = new koneksi().with();
    private DefaultTableModel model;
    
    public TambahFilm() {
        initComponents();
        model = new DefaultTableModel();
        this.tableMovie.setModel(model);
        model.addColumn("ID");
        model.addColumn("Judul");
        model.addColumn("Durasi");
        model.addColumn("Harga");
        ambil_data_tabel();
    }
    
    private void ambil_data_tabel() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Statement s = koneksi.createStatement();
            String sql = "Select * from film";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[4];
                o[0] = r.getString("id_film");
                o[1] = r.getString("judul_film");
                o[2] = r.getString("durasi");
                o[3] = r.getString("harga");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kotakBawah = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        labelJudul = new javax.swing.JLabel();
        labelDurasi = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        durasi = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        kotakAtas = new javax.swing.JPanel();
        judulFrame = new javax.swing.JLabel();
        tambahFilm = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

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

        kotakBawah.setBackground(new java.awt.Color(249, 253, 255));
        kotakBawah.setPreferredSize(new java.awt.Dimension(806, 420));

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelId.setText("ID");
        labelId.setPreferredSize(new java.awt.Dimension(200, 25));

        labelJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJudul.setText("Judul");
        labelJudul.setPreferredSize(new java.awt.Dimension(200, 25));

        labelDurasi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDurasi.setText("Durasi");
        labelDurasi.setPreferredSize(new java.awt.Dimension(200, 25));

        labelHarga.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelHarga.setText("Harga");
        labelHarga.setPreferredSize(new java.awt.Dimension(200, 25));

        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        judul.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        durasi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        harga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMovieMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMovie);

        buttonAdd.setText("ADD");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonEdit.setText("EDIT");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonBack.setText("BACK TO MENU");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        kotakAtas.setBackground(new java.awt.Color(39, 40, 41));
        kotakAtas.setPreferredSize(new java.awt.Dimension(806, 50));

        judulFrame.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        judulFrame.setForeground(new java.awt.Color(255, 255, 255));
        judulFrame.setText("Tambah Film");

        tambahFilm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tambahFilm.setForeground(new java.awt.Color(255, 255, 255));
        tambahFilm.setText("JTIXX");

        javax.swing.GroupLayout kotakAtasLayout = new javax.swing.GroupLayout(kotakAtas);
        kotakAtas.setLayout(kotakAtasLayout);
        kotakAtasLayout.setHorizontalGroup(
            kotakAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kotakAtasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(judulFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(636, Short.MAX_VALUE))
            .addGroup(kotakAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kotakAtasLayout.createSequentialGroup()
                    .addContainerGap(714, Short.MAX_VALUE)
                    .addComponent(tambahFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        kotakAtasLayout.setVerticalGroup(
            kotakAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(kotakAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kotakAtasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tambahFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kotakBawahLayout = new javax.swing.GroupLayout(kotakBawah);
        kotakBawah.setLayout(kotakBawahLayout);
        kotakBawahLayout.setHorizontalGroup(
            kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kotakBawahLayout.createSequentialGroup()
                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kotakBawahLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2))
                    .addGroup(kotakBawahLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kotakBawahLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addComponent(judul, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(durasi)
                                    .addComponent(harga, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(222, 222, 222))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kotakBawahLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(buttonBack)))))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kotakBawahLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kotakAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kotakBawahLayout.setVerticalGroup(
            kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kotakBawahLayout.createSequentialGroup()
                .addComponent(kotakAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kotakBawahLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kotakBawahLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(durasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(kotakBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonEdit)
                    .addComponent(buttonDelete)
                    .addComponent(buttonBack)
                    .addComponent(refresh))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kotakBawah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kotakBawah, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
            String sqlkode="Insert into film (id_film, judul_film, durasi, harga) "
            + "values ('"+this.id.getText()+"',"
            + "'"+this.judul.getText()+"',"
            + "'"+this.durasi.getText()+"',"
            + "'"+this.harga.getText()+"')";
        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            JOptionPane.showMessageDialog(this,"Data Berhasil Ditambah");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Terjadi Kesalahan "+ex.getMessage());
        }

    }//GEN-LAST:event_buttonAddActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        ambil_data_tabel();
    }//GEN-LAST:event_refreshActionPerformed

    private void tableMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMovieMouseClicked
        // TODO add your handling code here:
        id.setText(tableMovie.getValueAt(tableMovie.getSelectedRow(), 0).toString());
        judul.setText(tableMovie.getValueAt(tableMovie.getSelectedRow(), 1).toString());
        durasi.setText(tableMovie.getValueAt(tableMovie.getSelectedRow(), 2).toString());
        harga.setText(tableMovie.getValueAt(tableMovie.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tableMovieMouseClicked

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        String sqlkode = "Delete from FILM WHERE id_film='" +tableMovie.getValueAt(tableMovie.getSelectedRow(), 0) +"'";

        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            JOptionPane.showMessageDialog(this, "Data Akan Dihapus");
            ambil_data_tabel();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan " + ex.getMessage());
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        String sqlkode = "Update film set "
        + "id_film  = '" +id.getText() +"',"
        + "judul_film = '" +judul.getText() +"',"       
        + "durasi = '" +durasi.getText() +"', "
        + "harga = '" +harga.getText() +"' "
        +"WHERE id_film = '" +tableMovie.getValueAt(tableMovie.getSelectedRow(), 0) +"'";

        try {
            PreparedStatement mStatement = koneksi.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan " + ex.getMessage());
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_buttonBackActionPerformed

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
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JTextField durasi;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField judul;
    private javax.swing.JLabel judulFrame;
    private javax.swing.JPanel kotakAtas;
    private javax.swing.JPanel kotakBawah;
    private javax.swing.JLabel labelDurasi;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tableMovie;
    private javax.swing.JLabel tambahFilm;
    // End of variables declaration//GEN-END:variables
}
