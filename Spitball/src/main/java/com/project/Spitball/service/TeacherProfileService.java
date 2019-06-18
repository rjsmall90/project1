package com.project.Spitball.service;

import com.project.Spitball.model.Teacher;
import com.project.Spitball.repo.TeacherProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherProfileService {

    @Autowired
    TeacherProfileRepo teacherRepository;

    Teacher teacher;

    public Teacher save(Teacher teacher) {
        return teacherRepository.saveAndFlush(teacher);
    }

    public Teacher update(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher find(Long id) {
        return teacherRepository.findById(id).get();
    }

    public void delete(Teacher teacher) {
        teacherRepository.delete(teacher);
    }

//    public Teacher findEmail(String email) {
//        return teacherRepository.findByEmail(email);
//    }
//
//    public List<Teacher> findAllBySchool(Long id) {
//        id = teacher.getSchoolId();
//        return teacherRepository.findAllBySchoolId(id);
//    }

    public List<Teacher> findAll() { return teacherRepository.findAll();
    }

}
