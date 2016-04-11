package se.itg_code.BroFo_MediaDist.DBObject;


import java.util.ArrayList;

public class Employee extends Person{
    private String socialSecurity;
    private String salaryTargetAccount;

    public Employee(int id, String firstName, String lastName, ArrayList<String> secondaryName, String socialSecurity, String salaryTargetAccount) {
        super(id, firstName, lastName, secondaryName);
        this.socialSecurity = socialSecurity;
        this.salaryTargetAccount = salaryTargetAccount;
    }

    @Override
    void update() {

    }
}
