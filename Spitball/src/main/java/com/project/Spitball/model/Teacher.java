package com.project.Spitball.model;

import javax.persistence.*;

@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String firstName;
    String lastName;
    String email;
    String password;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn
//    private List<TeacherRating> ratings;
//
//    @OneToMany
//    private List<Comment> comments;

    private Long schoolId;

//    public List<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<Comment> comments) {
//        this.comments = comments;
//    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

//    public List<TeacherRating> getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(List<TeacherRating> ratings) {
//        this.ratings = ratings;
//    }
}
