package mts.student.domain.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "sr_student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "sur_name")
    private String surName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "patronymic_name")
    private String patronymicName;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "passport_serial")
    private String passportSerial;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "passport_date")
    private LocalDate passportDate;
    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY, mappedBy = "student")
    private List<StudentDocument> documents;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", passportSerial='" + passportSerial + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportDate=" + passportDate +
                ", documents=" + documents +
                '}';
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public List<StudentDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<StudentDocument> documents) {
        this.documents = documents;
    }
}
