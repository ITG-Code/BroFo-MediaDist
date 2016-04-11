package se.itg_code.BroFo_MediaDist.DBObject;

public class Adress extends DBEntity{
    private int id;
    private District district;
    private String street_nr;

    public Adress(int id, District district, String street_nr){
        this.id = id;
        this.district = district;
        this.street_nr = street_nr;
    }
    public Adress(int id, District district, int street_nr){
        this.id = id;
        this.district = district;
        this.street_nr = Integer.toString(street_nr);
    }

    @Override
    void update() {

    }
}
