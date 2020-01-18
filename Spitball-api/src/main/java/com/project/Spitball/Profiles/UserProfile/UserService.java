package com.project.Spitball.Profiles.UserProfile;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public User add(User user) {
        return repo.saveAndFlush(user);
    }

    public void delete(User user) {
         repo.delete(user);
    }


}
