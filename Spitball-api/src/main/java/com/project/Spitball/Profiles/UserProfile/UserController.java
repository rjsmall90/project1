package com.project.Spitball.Profiles.UserProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user_profile")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;

    private User user;

    @PostMapping(value="/add_user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        HttpStatus status;
        {
            this.user = user;
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(service.add(user), new HttpHeaders(), status);
    }

    @DeleteMapping(value="/delete_user")
    public void deleteUser() {
        service.delete(user);
    }

    @GetMapping(value="/find_user")
    public User findUser() {
        return user;
    }

    @GetMapping(value="/retrieve_users")
    public List<User> getUsers() {
        return service.all();
    }


}
