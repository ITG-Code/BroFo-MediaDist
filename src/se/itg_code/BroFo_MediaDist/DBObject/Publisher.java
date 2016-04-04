package se.itg_code.BroFo_MediaDist.DBObject;

/**
 * Created by hannes.kindstrommer on 2016-04-04.
 */
public class Publisher {
    private int id;
    private String name;
    public Publisher(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Publisher(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
