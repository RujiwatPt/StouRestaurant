/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stourestaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jin
 */
public class MyConnect {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(com.mysql.cj.jdbc.Driver.class.getName());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/stourestaurant", "user", "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String args[]) {
        MyConnect connect = new MyConnect();
        Connection con = connect.getConnection();
        if (con != null) {
            System.out.println("ok");
            
        } else {
            System.out.println("เชื่อมต่อระบบล้มเหลว");
        }
    }
}
