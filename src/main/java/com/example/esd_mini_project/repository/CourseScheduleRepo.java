package com.example.esd_mini_project.repository;

import com.example.esd_mini_project.entity.CourseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScheduleRepo extends JpaRepository<CourseSchedule,Long> {
}
