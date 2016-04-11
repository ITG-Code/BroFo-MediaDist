package se.itg_code.BroFo_MediaDist.DBObject;

public class Subscription extends DBEntity{
    int id;
    PersonAdress payer;
    PersonAdress delivery;
    public Subscription(int id, PersonAdress p, PersonAdress d){
        this.id = id;
        this.payer = p;
        this.delivery = d;
    }
    public Subscription(PersonAdress p, PersonAdress d){
        this.payer = p;
        this.delivery = d;
    }

    public int getId() {
        return id;
    }

    public PersonAdress getPayer() {
        return payer;
    }

    public PersonAdress getDelivery() {
        return delivery;
    }

    @Override
    void update() {

    }
}
