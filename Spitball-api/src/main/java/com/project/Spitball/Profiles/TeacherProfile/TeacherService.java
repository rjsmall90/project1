package com.project.Spitball.Profiles.TeacherProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepo repo;

    public Teacher add(Teacher teacher) {
        return repo.saveAndFlush(teacher);
    }

    public void delete(Teacher teacher) {
        repo.delete(teacher);
    }
}
