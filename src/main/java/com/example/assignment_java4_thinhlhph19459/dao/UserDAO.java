package com.example.assignment_java4_thinhlhph19459.dao;

import com.example.assignment_java4_thinhlhph19459.common.JpaUtil;
import com.example.assignment_java4_thinhlhph19459.model.FavoriteEntity;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.text.Normalizer;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class UserDAO {
    EntityManager em;
    UserEntity entity;
    public UserDAO() {
        em = JpaUtil.getConnection();
        entity = new UserEntity();
    }

    public UserEntity getEntityById(String id){
        UserEntity entityID = em.find(UserEntity.class, id);

        return entityID;
    }

    public List<UserEntity> getAllUser(){
        String jpql = "Select u from UserEntity u ";
        TypedQuery<UserEntity> query = em.createQuery(jpql, UserEntity.class);
        List<UserEntity> list = query.getResultList();
        return list;
    }

    public UserEntity create(UserEntity entity){
        try{
            em.getTransaction().begin();

            em.persist(entity);

            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return entity;
    }
    public UserEntity update(UserEntity entity){
        try{
            em.getTransaction().begin();

            em.merge(entity);

            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return entity;
    }
    public UserEntity delete(String id){
        try{
            em.getTransaction().begin();

            UserEntity entity = em.find(UserEntity.class, id);
            em.remove(entity);

            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return entity;
    }
    public UserEntity findByEmail(String email){
        String jpql = "Select u from UserEntity u where u.email = :email";
        TypedQuery<UserEntity> query = em.createQuery(jpql, UserEntity.class);
        query.setParameter("email",email);

        UserEntity user = query.getSingleResult();

        return user;
    }

    public UserEntity forgotPass(String email){
        UserEntity existUser = findByEmail(email);
        if (existUser != null){
            String newPass = String.valueOf((int) (Math.random() * ((9999-1000) + 1)) + 1000);
            existUser.setPassword(newPass);
            return update(existUser);
        }
        return null;
    }
    public String nameId(String name){
        String[] nameParts = name.split("\\s+");
        String firstName = nameParts[nameParts.length-1];
        String lastName = "";
        for (int i = 0; i < nameParts.length-1; i++) {
            lastName += nameParts[i].charAt(0);
        }
        String result = firstName + lastName.toUpperCase();
        String normalized = Normalizer.normalize(result, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String output = pattern.matcher(normalized).replaceAll("").toLowerCase();

//        Random rd = new Random();
//        int ranNum = rd.nextInt()+1;
        return output;
    }
}
