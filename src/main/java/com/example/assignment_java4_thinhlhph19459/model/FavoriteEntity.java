package com.example.assignment_java4_thinhlhph19459.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Favorite", schema = "dbo", catalog = "assJava4")
public class FavoriteEntity {
    public FavoriteEntity(int id, VideoEntity video, UserEntity user, Date likedate) {
        this.id = id;
        this.video = video;
        this.user = user;
        this.likedate = likedate;
    }

    public FavoriteEntity() {
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @ManyToOne @JoinColumn(name = "videoid")
    VideoEntity video;
    @ManyToOne @JoinColumn(name = "userid")
    UserEntity user;
    @Temporal(TemporalType.DATE)
    java.util.Date likedate = new java.util.Date();


}
