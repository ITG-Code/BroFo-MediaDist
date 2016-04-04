package se.itg_code.BroFo_MediaDist.Database;

/**
 * Created by hannes.kindstrommer on 2016-04-04.
 */
public class DBAccount {
    private String host = "";
    private String database = "";
    private String user = "";
    private String password = "";

    public String getDatabase() {
        return database;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
