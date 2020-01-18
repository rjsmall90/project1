package com.project.Spitball.Profiles.TeacherProfile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teacher_profile")
@CrossOrigin
public class TeacherController {

    @Autowired
    TeacherService service;

    private Teacher teacher;

    @PostMapping(value="/add_teacher")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
        HttpStatus status;
        {
            this.teacher = teacher;
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(service.add(teacher), new HttpHeaders(), status);
    }

    @DeleteMapping(value="/delete_teacher")
    public void deleteTeacher() {
        service.delete(teacher);
    }

}
