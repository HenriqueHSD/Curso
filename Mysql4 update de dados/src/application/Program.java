package application;

import db.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;


        try {

            conn = Db.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = BaseSalary + ? " +
                            "WHERE (DepartmentId = ?)");

            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int rows = st.executeUpdate();

            System.out.println("Done! Rows affected: "+ rows);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Db.closeStatement(st);
            Db.closeConnection();

        }

    }
}
