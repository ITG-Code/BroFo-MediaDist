package se.itg_code.BroFo_MediaDist.DBObject;

import se.itg_code.BroFo_MediaDist.Database.Select;

import java.sql.Connection;
import java.util.ArrayList;

abstract class Person extends DBEntity{
    final private int id;
    private String firstName;
    private String lastName;
    private ArrayList<String> secondaryName;

    public Person(int id, String firstName, String lastName, ArrayList<String> secondaryName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondaryName = secondaryName;
    }
     Person(int id, String firstName, String lastName, Connection databaseConnection){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.getSecondaryNamesFromDB(databaseConnection);

    }
    private void getSecondaryNamesFromDB(Connection dbc){
        Select s = new Select(dbc);
        secondaryName = s.getSecondaryNames(this.id);
    }

}
