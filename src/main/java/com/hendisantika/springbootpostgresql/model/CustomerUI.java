package com.hendisantika.springbootpostgresql.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-20
 * Time: 05:55
 * To change this template use File | Settings | File Templates.
 */
public class CustomerUI {

    private String firstName;
    private String lastName;

    protected CustomerUI() {
    }

    public CustomerUI(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("Customer[firstName='%s', lastName='%s']", firstName, lastName);
    }
}
