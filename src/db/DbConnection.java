package db;

import java.sql.*;

public class DbConnection {
    private static Connection cn;
    private static Connection cn2;

    public static DbConnection INSTANCE = new DbConnection();

    private String manzoURL = "jdbc:sqlserver://192.168.43.131\\SQLDEV2017;databaseName=erpDB;integratedSecurity=false";
    private String localURL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=erpDB;integratedSecurity=false";


    public ResultSet executeQuery(String query){
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

            cn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=erpDB;integratedSecurity=false","sa","123456");

            PreparedStatement ps = cn.prepareCall(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public ResultSet executeQueryExternal(String query){
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

            cn2 = DriverManager.getConnection("jdbc:sqlserver://192.168.43.131\\SQLDEV2017;databaseName=erpDB;integratedSecurity=false","sa","Master@1");

            PreparedStatement ps = cn.prepareCall(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}
