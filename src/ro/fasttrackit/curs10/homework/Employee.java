package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public abstract class Employee implements Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    private final LocalDate dateOfEmployment;
    private String address;
    private String position;


    public Employee(String lastName, String firstName, LocalDate birthday, String address, String position,
                    LocalDate dateOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
        this.dateOfEmployment = dateOfEmployment;
    }

    public abstract long getSalary();

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthday;
    }

    @Override
    public String getAdress() {
        return this.address;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return this.position;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
