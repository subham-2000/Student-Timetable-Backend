package com.example.esd_mini_project.service;


import com.example.esd_mini_project.dto.CourseScheduleRequest;
import com.example.esd_mini_project.entity.Course;
import com.example.esd_mini_project.entity.CourseSchedule;
import com.example.esd_mini_project.mapper.CourseScheduleMapper;
import com.example.esd_mini_project.repository.CourseRepo;
import com.example.esd_mini_project.repository.CourseScheduleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class CourseScheduleService {
    private final CourseScheduleRepo courseScheduleRepo;
    private final CourseRepo courseRepo;
    private final CourseScheduleMapper courseScheduleMapper;

    public String create(CourseScheduleRequest courseSchedule) {
        CourseSchedule schedule =courseScheduleMapper.toCourseSchedule(courseSchedule);
        Course course =courseRepo.findById(courseSchedule.course_id()).orElse(null);
        if(course == null){
            return "Course does not exist";
        }
        schedule.setCourse(course);
        courseScheduleRepo.save(schedule);
        return "Course schedule created";
    }
}
