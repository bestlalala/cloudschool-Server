package com.bestlalala.cloudschool.repository;

import com.bestlalala.cloudschool.domain.User;
import com.bestlalala.cloudschool.dto.UserDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @PersistenceContext
    private final EntityManager em;

    public void save(User user) {
        em.persist(user);
    }

    public List<UserDto> findAll() {
        return em.createQuery("select new UserDto(u) from User u", UserDto.class)
                .getResultList();
    }
}
