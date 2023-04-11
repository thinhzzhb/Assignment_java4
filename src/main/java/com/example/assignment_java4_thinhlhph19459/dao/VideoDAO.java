package com.example.assignment_java4_thinhlhph19459.dao;

import com.example.assignment_java4_thinhlhph19459.common.JpaUtil;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import com.example.assignment_java4_thinhlhph19459.model.VideoEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class VideoDAO {
    EntityManager em;

    public VideoDAO() {
        em = JpaUtil.getConnection();
    }

    public List<VideoEntity> getallVideo(){
        String jpql = "Select v from VideoEntity v where v.active = true ORDER BY v.views desc";
        TypedQuery<VideoEntity> query = em.createQuery(jpql, VideoEntity.class);
        List<VideoEntity> list = query.getResultList();
        return list;
    }

    public List<VideoEntity> getallVideoCookie(String watchedid){
        String jpql = "Select v from VideoEntity v where v.videoid in :vid";
        TypedQuery<VideoEntity> query = em.createQuery(jpql, VideoEntity.class);
        query.setParameter("vid", watchedid);
        List<VideoEntity> list = query.getResultList();
        return list;
    }
    public VideoEntity getVideoById(String id){
        VideoEntity videoID = em.find(VideoEntity.class, id);

        return videoID;
    }
    public VideoEntity update(VideoEntity Ventity){
        try{
            em.getTransaction().begin();

            em.merge(Ventity);

            em.getTransaction().commit();

        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return Ventity;
    }

    public VideoEntity delete(String id) {
        VideoEntity Ventity = null;
        try {
            em.getTransaction().begin();

            Ventity = em.find(VideoEntity.class, id);
            Ventity.setActive(false);

            em.merge(Ventity);

            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return Ventity;
    }
}
