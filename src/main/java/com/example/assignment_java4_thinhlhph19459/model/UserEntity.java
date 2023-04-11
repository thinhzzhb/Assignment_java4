package com.example.assignment_java4_thinhlhph19459.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users", schema = "dbo", catalog = "assJava4")
public class UserEntity {
    @Id
    @Column(name = "userid")
    private String userid;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "fullname")
    private String fullname;
    @Basic
    @Column(name = "admin")
    private Boolean admin = false;

    @OneToMany(mappedBy = "user")
    List<FavoriteEntity> favorites;
    @OneToMany(mappedBy = "user")
    List<ShareEntity> shares;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public List<FavoriteEntity> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<FavoriteEntity> favorites) {
        this.favorites = favorites;
    }

    public List<ShareEntity> getShares() {
        return shares;
    }

    public void setShares(List<ShareEntity> shares) {
        this.shares = shares;
    }

    public UserEntity(String userid, String password, String email, String fullname, Boolean admin, List<FavoriteEntity> favorites, List<ShareEntity> shares) {
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.admin = admin;
        this.favorites = favorites;
        this.shares = shares;
    }

    public UserEntity() {
    }
}
