
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class Sqlite {

    public static void main(String[] args) {
                   String s ="creat table bashar";

        try (
                  Connection c =DriverManager.getConnection("jdbc:sqlite:so.db");
           PreparedStatement ss =c.prepareStatement(s);
                )
        {
          
            ss.execute(s);
             System.out.println("Done");
             
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
    }
    
}
