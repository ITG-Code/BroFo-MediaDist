package se.itg_code.BroFo_MediaDist.Database;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnector {
    public static Connection getConnection(String host, String database, String user, String password){
        Connection dbc = null;
        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            dbc = DriverManager.getConnection("jdbc:mysql://"+host+"/"+database,user,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return dbc;
    }
    public static Connection getConnection(DBAccount dba){
        Connection dbc = null;
        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            dbc = DriverManager.getConnection("jdbc:mysql://"+dba.getHost()+"/"+dba.getDatabase(),dba.getUser(),dba.getPassword());
        }catch(Exception e){
            e.printStackTrace();
        }
        return dbc;
    }
}
