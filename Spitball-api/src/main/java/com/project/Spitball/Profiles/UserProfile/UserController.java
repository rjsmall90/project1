package com.project.Spitball.Profiles.UserProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


}
