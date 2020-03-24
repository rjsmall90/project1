package com.project.Spitball.repo;

import com.project.Spitball.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepo extends JpaRepository< User, Long > {

    User findByUsername(String username);

    User findByEmail(String email);
}
