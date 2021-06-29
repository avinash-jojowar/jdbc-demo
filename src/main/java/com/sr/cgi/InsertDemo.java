package com.sr.cgi;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost/cgi", "root", "");
        PreparedStatement psmt = connection.prepareStatement("insert into sales_rep(rep_id, name, city, commision) values(?,?,?,?)");

        psmt.setInt(1, 1008);
        psmt.setString(2, "Virat");
        psmt.setString(3, "Delhi");
        psmt.setDouble(4, 0.18);

        psmt.executeUpdate();
    }
}
