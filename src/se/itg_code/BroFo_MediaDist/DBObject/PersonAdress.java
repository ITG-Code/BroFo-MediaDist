package se.itg_code.BroFo_MediaDist.DBObject;

/**
 * Created by hannes.kindstrommer on 2016-04-04.
 */
public class PersonAdress {
    private int id;
    private Person person;
    private Adress adress;

    public PersonAdress(int id, Person p, Adress a){
        /* For when fetching a PersonAdress from DB */
        this.id = id;
        this.person = p;
        this.adress = a;
    }
    public PersonAdress(Person p, Adress a){
        /* For when making a new PersonAdress */
        this.person = p;
        this.adress = a;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Adress getAdress() {
        return adress;
    }
}
