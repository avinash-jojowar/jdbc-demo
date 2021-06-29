package com.sr.cgi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
import java.sql.*;

public class App {
    public static void main( String[] args ) throws SQLException{
        Connection connection;
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cgi", "root", "");

        Statement stmt = connection.createStatement();

        ResultSet resultSet = stmt.executeQuery("select * from sales_rep");

        while (resultSet.next()) {
            int rep_id = resultSet.getInt("rep_id");
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            Double commision = resultSet.getDouble("commision");

            System.out.println(rep_id + "\t" + name + "\t" + city + "\t" + commision);
        }
    }
}
