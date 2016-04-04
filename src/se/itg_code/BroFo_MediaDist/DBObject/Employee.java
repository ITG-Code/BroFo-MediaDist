package se.itg_code.BroFo_MediaDist.DBObject;


public class Employee extends Person{
    private String socialSecurity;
    private String salaryTargetAccount;

    public Employee(int id, String firstName, String lastName, String[] secondaryName, String socialSecurity, String salaryTargetAccount) {
        super(id, firstName, lastName, secondaryName);
        this.socialSecurity = socialSecurity;
        this.salaryTargetAccount = salaryTargetAccount;
    }

}
