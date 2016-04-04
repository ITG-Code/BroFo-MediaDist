package se.itg_code.BroFo_MediaDist.DBObject;

/**
 * Created by hannes.kindstrommer on 2016-04-01.
 */
public class Subscriber extends Person{
    private Subsciption subsciption;
    public Subscriber(int id, String firstName, String lastName, String[] secondaryName){
        super(id, firstName, lastName, secondaryName);
    }

}
