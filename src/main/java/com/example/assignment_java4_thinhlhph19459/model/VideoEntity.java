package com.example.assignment_java4_thinhlhph19459.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Video", schema = "dbo", catalog = "assJava4")
public class VideoEntity {
    public VideoEntity(String videoid, String title, String poster, Integer views, String description, Boolean active, List<FavoriteEntity> favorites) {
        this.videoid = videoid;
        this.title = title;
        this.poster = poster;
        this.views = views;
        this.description = description;
        this.active = active;
        this.favorites = favorites;
    }

    public VideoEntity() {
    }

    @Id
    @Column(name = "videoid")
    private String videoid;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "poster")
    private String poster;
    @Basic
    @Column(name = "views")
    private Integer views;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "video")
    List<FavoriteEntity> favorites;
    @OneToMany(mappedBy = "video")
    List<ShareEntity> shares;


}
