package com.example.sinovoice.mvpsample.bean;

/**
 * Created by miaochangchun on 2016/11/18.
 */
public class UserBean {
    private String firstName;
    private String lastName;

    public UserBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "firstName = " + this.getFirstName() + "; lastName = " + this.getLastName();
    }
}
