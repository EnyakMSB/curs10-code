package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private long salary;
    private final String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, LocalDate birthday, String address, long salary, String dbTech) {
        super(firstName, lastName, birthday, address,"DB_ADMIN", LocalDate.now());
        this.salary=salary;
        this.dbTechnology=dbTech;
    }

    @Override
    public long getSalary() {
        return Math.round(salary * 1.1);
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
