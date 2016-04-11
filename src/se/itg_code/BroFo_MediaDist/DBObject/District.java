package se.itg_code.BroFo_MediaDist.DBObject;

/**
 * Created by hannes.kindstrommer on 2016-04-04.
 */
public class District extends DBEntity{
    private int id;
    private District parent;
    private String name;

    public District(District parent, String name){
        // This is called when a new child district should be created
        this.parent = parent;
        this.name = name;

    }
    public District(int id, District parent, String name){
        this.id = id;
        this.parent = parent;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public District getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    @Override
    void update() {

    }
}
