/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.*;

/**
 *
 * @author Ana Bella
 */
public class koneksi {

    private static Connection koneksi;

    public Connection with() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/bioskop";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Data berhasil terhubung");
            } catch (SQLException e) {
                System.out.println("Error membuat koneksi" + e);
            }
        }
        return koneksi;
    }

}
