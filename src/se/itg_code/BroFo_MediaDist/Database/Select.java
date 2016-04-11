package se.itg_code.BroFo_MediaDist.Database;

import se.itg_code.BroFo_MediaDist.DBObject.Subscriber;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Select {
    private Connection dbc;
    public Select(Connection dbc){
        this.dbc = dbc;
    }
    public ArrayList<String> getSecondaryNames(int personId){
        ArrayList<String> retval = new ArrayList<String>();
        try{
            Statement stmt = dbc.createStatement();
            ResultSet result = stmt.executeQuery("SELECT name FROM secondary_name WHERE person = "+ personId);
            result.next();
            while(result.next()){
                retval.add(result.getString("name"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return retval;


    }
    public ArrayList<Subscriber>  getAllSubscribers(){
        ArrayList<Subscriber> retval = new ArrayList<>();
        try{
            Statement stmt = dbc.createStatement();
            ResultSet result = stmt.executeQuery("SELECT id, first_name, last_name FROM person");
            result.last();
            retval.ensureCapacity(result.getRow());
            result.first();
            while(result.next()){

                retval.add(new Subscriber(result.getInt("id"), result.getString("first_name"), result.getString("last_name"),
                        this.getSecondaryNames(result.getInt("id"))));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
