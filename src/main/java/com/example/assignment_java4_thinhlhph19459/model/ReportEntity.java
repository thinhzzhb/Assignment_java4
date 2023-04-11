package com.example.assignment_java4_thinhlhph19459.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class ReportEntity {

    @Id
    Serializable group;
    long likes;
    Date newdate;
    Date olddate;

    public Serializable getGroup() {
        return group;
    }

    public void setGroup(Serializable group) {
        this.group = group;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public Date getNewdate() {
        return newdate;
    }

    public void setNewdate(Date newdate) {
        this.newdate = newdate;
    }

    public Date getOlddate() {
        return olddate;
    }

    public void setOlddate(Date olddate) {
        this.olddate = olddate;
    }

    public ReportEntity(Serializable group, long likes, Date newdate, Date olddate) {
        this.group = group;
        this.likes = likes;
        this.newdate = newdate;
        this.olddate = olddate;
    }

    public ReportEntity() {
    }
}
