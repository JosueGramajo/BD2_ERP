package dao;

import db.DbConnection;
import objects.Usuario;

import java.sql.ResultSet;

public class UserDAO {
    public static UserDAO INSTANCE = new UserDAO();

    public boolean doLogin(String user, String pass){
        ResultSet rs = DbConnection.INSTANCE.executeQuery(
                "SELECT CASE WHEN EXISTS (" +
                "    SELECT *" +
                "    FROM usuario" +
                "    WHERE nombre_corto = '" + user + "'" +
                "AND clave = CAST('"+ pass +"' AS VARBINARY(MAX))" +
                ")" +
                "THEN CAST(1 AS BIT)" +
                "ELSE CAST(0 AS BIT) END AS 'LoginResult'");

        try{
            while(rs.next()){
                return rs.getBoolean("LoginResult");
            }
        }catch (Exception ex){
            return false;
        }

        return false;
    }

    public int getUserCountry(String user){
        ResultSet rs = DbConnection.INSTANCE.executeQuery("select id_pais from usuario where nombre_corto = '"+ user +"'");

        try{
            while(rs.next()){
                return rs.getInt("id_pais");
            }
        }catch (Exception ex){
            return 0;
        }

        return 0;
    }
}
