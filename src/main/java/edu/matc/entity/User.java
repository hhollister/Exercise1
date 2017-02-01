package edu.matc.entity;

import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

// TODO Add a calculation for the user's age. Age should not be stored, it should be calculated only.

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
public class User {
    private String firstName;
    private String lastName;
    private String userid;
    private LocalDate dateBirth;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userid    the userid
     * @param dateBirth the date of birth
     */
    public User(String firstName, String lastName, String userid, LocalDate dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.dateBirth = dateBirth;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets dateBirth.
     *
     * @param dateBirth the dateBirth
     */
    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }


    /**
     * Gets date of birth.
     *
     * @return the date of birth
     */
    public LocalDate getDateBirth() {
        return dateBirth;
    }


    /**
     * Calculates age
     *
     * @return the age
     */
    public int ageCalculator() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dateBirth, currentDate).getYears();
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userid='" + userid + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }


}