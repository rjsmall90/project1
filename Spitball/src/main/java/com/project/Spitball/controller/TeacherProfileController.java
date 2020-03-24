package com.project.Spitball.controller;

import com.project.Spitball.model.Teacher;
import com.project.Spitball.service.TeacherProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherProfileController {


    @Autowired
    TeacherProfileService teacherService;


    @RequestMapping(value = "/register_teacher", method = RequestMethod.POST)
    public ResponseEntity<Teacher> registerTeacher(@RequestBody Teacher newTeacher) {
        //newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        newTeacher = teacherService.save(newTeacher);
        HttpStatus status = HttpStatus.CREATED;

        return new ResponseEntity<>(newTeacher, new HttpHeaders(), status);
    }

    @RequestMapping(value = "/delete_teacher_profile", method = RequestMethod.DELETE)
    public ResponseEntity<Teacher> deleteTeacher(@RequestBody Teacher teacher) {
        teacherService.delete(teacher);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @RequestMapping(value = "/find_all", method = RequestMethod.GET)
//    public ResponseEntity<Teacher> findAllUsers() {
//        HttpStatus httpStatus = HttpStatus.OK;
//        return new ResponseEntity<Teacher>((Teacher) teacherService.findAll(), httpStatus);
//    }
}
