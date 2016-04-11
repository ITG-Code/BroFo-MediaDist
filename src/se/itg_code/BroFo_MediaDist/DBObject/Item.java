package se.itg_code.BroFo_MediaDist.DBObject;

import java.sql.Date;

/**
 * Created by hannes.kindstrommer on 2016-04-04.
 */
public class Item extends DBEntity{
    private int id;
    private String name;
    private Publisher publisher;
    private Date publishing_date;

    public Item(int id, String name, Publisher publisher, Date publishing_date){
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishing_date = publishing_date;
    }
    public Item(String name, Publisher publisher, Date publishing_date){
        this.name = name;
        this.publisher = publisher;
        this.publishing_date = publishing_date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Date getPublishing_date() {
        return publishing_date;
    }

    @Override
    void update() {

    }
}
