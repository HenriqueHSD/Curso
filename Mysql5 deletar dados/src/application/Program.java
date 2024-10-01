package application;

import db.Db;
import db.DbIntegrityException;

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
                    "DELETE FROM department " +
                            "WHERE " +
                            "Id = ?");

            st.setInt(1, 5);

            int rows = st.executeUpdate();

            System.out.println("Done! Rows affected: "+ rows);


        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }finally {
            Db.closeStatement(st);
            Db.closeConnection();

        }

    }
}
