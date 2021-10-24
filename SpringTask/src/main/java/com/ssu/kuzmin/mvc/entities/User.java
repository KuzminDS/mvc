package com.ssu.kuzmin.mvc.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "patronymic", nullable = false)
    private String patronymic;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "number", nullable = false)
    private String number;
    @Column(name = "password", nullable = false)
    private String password;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    @JsonBackReference
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private List<Appointment> appointments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    private MedicalCard medicalCard;

    public User() {}

//    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password) {
//        super(id, firstName, lastName, patronymic, email, number, password);
//    }

    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password, MedicalCard medicalCard) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.number = number;
        this.password = password;
//        this.appointments = new ArrayList<>();
//        super(id, firstName, lastName, patronymic, email, number, password);
//        this.medicalCard = medicalCard;
    }
}
