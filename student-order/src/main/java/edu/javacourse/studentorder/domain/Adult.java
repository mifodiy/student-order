package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person
{
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private PassportOffice issueDeparment;
    private University university;
    private String studentId;

    public Adult() {
    }

    public Adult(String surName, String givenName, String patronymic, LocalDate datOfBirth) {
        super(surName, givenName, patronymic, datOfBirth);
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public PassportOffice getIssueDeparment() {
        return issueDeparment;
    }

    public void setIssueDeparment(PassportOffice issueDeparment) {
        this.issueDeparment = issueDeparment;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "passportSeria='" + passportSeria + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", issueDate=" + issueDate +
                ", issueDeparment=" + issueDeparment +
                ", university=" + university +
                ", studentId='" + studentId + '\'' +
                "} " + super.toString();
    }
}
