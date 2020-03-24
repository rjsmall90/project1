package com.project.Spitball.repo;

import com.project.Spitball.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherProfileRepo extends JpaRepository<Teacher, Long > {

}