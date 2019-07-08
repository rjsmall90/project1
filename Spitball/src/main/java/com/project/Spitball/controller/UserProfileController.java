package com.project.Spitball.controller;

import com.project.Spitball.model.User;
import com.project.Spitball.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:19002" )
@RestController
public class UserProfileController {

    @Autowired
    UserProfileService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @RequestMapping(value = "/register_user", method = RequestMethod.POST)
    public ResponseEntity<User> registerUser(@RequestBody User newUser) {
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        newUser = userService.save(newUser);
        HttpStatus status = HttpStatus.CREATED;

        return new ResponseEntity<>(newUser, new HttpHeaders(), status);
    }

    @RequestMapping(value = "/delete_profile", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@RequestBody User user) {
        userService.delete(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/find_all", method = RequestMethod.GET)
    public ResponseEntity<User> findAllUsers() {
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<User>((User) userService.findAll(), httpStatus);
    }



}
