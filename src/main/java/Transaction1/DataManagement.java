package main.java.Transaction1;

import java.sql.SQLException;
import java.sql.Statement;

public class DataManagement {

    public static void sqlCreateTable(Statement statement) throws SQLException {
        dropTable(statement);
        String sql = "CREATE TABLE IF NOT EXISTS REGISTRATION " +
                "(id SERIAL NOT NULL PRIMARY KEY, " +
                " name VARCHAR(255), " +
                " lastName VARCHAR(255), " +
                " age INTEGER)";
        statement.executeUpdate(sql);
    }

    public static void insertDataIntoTable(Statement statement) throws SQLException {
       String sql = "INSERT INTO registration VALUES (default, 'Alice','Mutke',41),(default, 'Jonah','Mutke',8)," +
               "(default, 'Kumar','Nava',42),(default, 'Max','Mustermann',30)";
        statement.executeUpdate(sql);   }

    private static void dropTable(Statement statement) throws SQLException {
        String sql = "DROP TABLE IF EXISTS registration";
        statement.executeUpdate(sql);
    }

}
