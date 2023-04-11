package com.example.assignment_java4_thinhlhph19459.dao;

import com.example.assignment_java4_thinhlhph19459.common.JpaUtil;
import com.example.assignment_java4_thinhlhph19459.model.FavoriteEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class FavoriteDAO {
    EntityManager em;
    FavoriteEntity FaEntity;
    public FavoriteDAO() {
        em = JpaUtil.getConnection();
        FaEntity = new FavoriteEntity();
    }



    public FavoriteEntity insertFavorite(FavoriteEntity entity){
        try{
            em.getTransaction().begin();

            em.persist(FaEntity);

            em.getTransaction().commit();

        } catch (Exception e){

            em.getTransaction().rollback();

            e.printStackTrace();

        }

        return FaEntity;
    }

    public FavoriteEntity findFavorite(String uid, String vdi){
        String jpql = "Select f from FavoriteEntity f where f.user.userid = :uid and  f.video.videoid =:vid";
        TypedQuery<FavoriteEntity> query = em.createQuery(jpql,FavoriteEntity.class);

        FaEntity = query.getSingleResult();

        return FaEntity;
    }
    public Boolean delFavorite(String userid, String videoid){
        Boolean resutl = false;
        try{
            em.getTransaction().begin();

            FaEntity =  findFavorite(userid, videoid);

            em.remove(FaEntity);

            em.getTransaction().commit();

            resutl = true;
        } catch (Exception e){

            em.getTransaction().rollback();

            e.printStackTrace();

        }
        return resutl;
    }
}
