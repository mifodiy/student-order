package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public abstract class Person
{
    private String surName;
    private String givenName;
    private String patronymic;
    private LocalDate datOfBirth;
    private Address address;

    public Person() {
    }

    public Person(String surName, String givenName, String patronymic, LocalDate datOfBirth) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.datOfBirth = datOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(LocalDate datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surName='" + surName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", datOfBirth=" + datOfBirth +
                ", address=" + address +
                '}';
    }
}
