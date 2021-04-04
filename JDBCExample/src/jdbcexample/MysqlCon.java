/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class MysqlCon {

    private Connection con;
    private Statement stmt;

    public Statement Con() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            //here sonoo is database name, root is username and password  
            stmt = (Statement) con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return stmt;
        

    }

    public static void main(String args[]) {

        try {
            MysqlCon con = new MysqlCon();
            Statement stmt1 = con.Con();
            ResultSet rs;
            rs = stmt1.executeQuery("select * from user");

            String n = "", e = "";

            DefaultTableModel model;
            model = new DefaultTableModel();
            JTable jTable1 = new JTable(model);

            model.addColumn("Full Name");
            model.addColumn("Email");

            while (rs.next()) {
                n = rs.getString("Name");
                e = rs.getString("Email");
                model.addRow(new Object[]{n, e});
            }

            
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
