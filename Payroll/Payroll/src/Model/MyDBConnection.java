
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class MyDBConnection {
  private static Connection con;
    public static Connection createDBConnection()
    {   try{
        String dbloc="jdbc:mysql://localhost/payroll";
        con=DriverManager.getConnection(dbloc,"root","root");
        }
        catch(SQLException e)
        {JOptionPane.showMessageDialog(null, e);
        }
    return con;
    }
}

