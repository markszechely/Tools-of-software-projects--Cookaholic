package com.toolsofsoftwareprojects.cookaholic_backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CookaholicUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String userTitle;

    @Column
    private String phone;

    @Column
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String userCode;

    public CookaholicUser() {
    }

    public CookaholicUser(Long id, String name, String email, String userTitle, String phone, String imageUrl, String userCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userTitle = userTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.userCode = userCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public String getPhone() {
        return phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "CookaholicUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userTitle='" + userTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }
}
