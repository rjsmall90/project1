package com.project.Spitball.service;

import com.project.Spitball.model.User;
import com.project.Spitball.repo.UserProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    UserProfileRepo userRepository;

    public User save(User user) {
        return userRepository.saveAndFlush(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

//    public User findEmail(String email) {
//        return userRepository.findByEmail(email);
//    }

    public User find(Long id) {
        return userRepository.findById(id).get();
    }
}
