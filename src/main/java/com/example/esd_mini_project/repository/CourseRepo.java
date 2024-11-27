package com.example.esd_mini_project.repository;

import com.example.esd_mini_project.entity.Course;
import com.example.esd_mini_project.entity.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
    List<Course> findByDomain(Domain domain);

    Optional<Course> findByCourseCode(String cid);
}
