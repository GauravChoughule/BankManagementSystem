package BankManagementSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        String url = "jdbc:mysql://localhost:3306/bms";
        String username = "root";
        String password = "puyakasha@7G";
        try{
            c = DriverManager.getConnection(url, username,password);
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new Conn();
    }

}

