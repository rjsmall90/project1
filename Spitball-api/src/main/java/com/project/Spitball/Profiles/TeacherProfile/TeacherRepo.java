package com.project.Spitball.Profiles.TeacherProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository <Teacher, Long> {

}
