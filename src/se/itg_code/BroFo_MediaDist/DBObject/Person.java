package se.itg_code.BroFo_MediaDist.DBObject;

abstract class Person {
    final private int id;
    private String firstName;
    private String lastName;
    private String[] secondaryName;

    public Person(int id, String firstName, String lastName, String[] secondaryName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondaryName = secondaryName;
    }
    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    private void getSecondaryNamesFromDB(){

    }

}
