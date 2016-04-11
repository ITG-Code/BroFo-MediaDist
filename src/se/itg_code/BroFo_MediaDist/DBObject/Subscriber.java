package se.itg_code.BroFo_MediaDist.DBObject;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by hannes.kindstrommer on 2016-04-01.
 */
public class Subscriber extends Person{
    private Subscription subsciption;

    public Subscriber(int id, String firstName, String lastName, ArrayList<String> secondaryName){
        super(id, firstName, lastName, secondaryName);
    }
    public Subscriber(int id, String firstName, String lastName, Connection databaseConnection){
        super(id, firstName, lastName, databaseConnection);
    }

    @Override
    void update() {

    }
}
