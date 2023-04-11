package com.example.assignment_java4_thinhlhph19459.dao;
import com.example.assignment_java4_thinhlhph19459.common.JpaUtil;
import com.example.assignment_java4_thinhlhph19459.model.FavoriteEntity;
import com.example.assignment_java4_thinhlhph19459.model.ReportEntity;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReportDao {
    EntityManager em;

    public ReportDao() {
        em = JpaUtil.getConnection();
    }
    public List<ReportEntity> getInfor(){
        String jpql = "Select new ReportEntity (o.video.title, count(o),max(o.likedate),min(o.likedate))" +
                "From FavoriteEntity o " +
                "Group BY o.video.title";
        TypedQuery<ReportEntity> query = em.createQuery(jpql, ReportEntity.class);
        List<ReportEntity> listReport = query.getResultList();
        return listReport;
    }

    public List<UserEntity> getUserLikeVideos(String title){
        String jpql = "SELECT o.user FROM FavoriteEntity o WHERE o.video.title=:title";
        TypedQuery<UserEntity> query = em.createQuery(jpql, UserEntity.class);
        query.setParameter("title", title);
        List<UserEntity> list = query.getResultList();
        return list;
    }
}
