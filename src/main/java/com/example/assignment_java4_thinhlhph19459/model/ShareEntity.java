package com.example.assignment_java4_thinhlhph19459.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
@Data
@Entity
@Table(name = "Share", schema = "dbo", catalog = "assJava4")
public class ShareEntity {
    @Id
    @Column(name = "shareid")
    private double shareid;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "sharedate")
    private Date sharedate;

    @ManyToOne @JoinColumn(name = "videoid")
    VideoEntity video;
    @ManyToOne @JoinColumn(name = "userid")
    UserEntity user;

    public ShareEntity(double shareid, String email, Date sharedate, VideoEntity video, UserEntity user) {
        this.shareid = shareid;
        this.email = email;
        this.sharedate = sharedate;
        this.video = video;
        this.user = user;
    }

    public ShareEntity() {
    }
}
