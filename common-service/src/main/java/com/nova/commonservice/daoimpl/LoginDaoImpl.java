package com.nova.commonservice.daoimpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nova.commonservice.dao.LoginDao;
import com.nova.commonservice.dto.LoginUserDto;
import com.nova.commonservice.serviceimpl.LoginServiceImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LoginDaoImpl implements LoginDao {
    private static final Logger logger = LoggerFactory.getLogger (LoginDaoImpl.class);
    @Autowired
    EntityManager entityManager;

    @Override
    public LoginUserDto findByUserNameAndPassword(String userName, String password) {
        try {
            String sql = "SELECT ud.id AS logInUserId, ud.adhar_no AS adhar, ud.age AS age, ud.address AS address, " +
                    " ud.dob AS dob, ud.email AS email, ud.role_id AS roleId, ud.first_name AS firstName, " +
                    " ud.gender AS gender, ud.org_id AS orgId, ud.last_name AS lastName, ud.phone AS phone, " +
                    " ud.username AS username FROM user_details AS ud " +
                    " WHERE ud.username = :userName AND ud.password = :password AND ud.status = true " +
                    " AND ud.is_deleted = false";

            Query query = entityManager.createNativeQuery(sql, LoginUserDto.class)
                    .setParameter("userName", userName)
                    .setParameter("password", password);

            Object result = query.getSingleResult();

            if (result != null) {
                return (LoginUserDto) result;
            } else {
                return null;
            }
        } catch (NoResultException e) {
            logger.error("no result found {} ",e.getMessage());
            return null;
        } catch (Exception e) {
            logger.error("An error occurred while fetching user details", e);
            return null;
        }
    }

}
