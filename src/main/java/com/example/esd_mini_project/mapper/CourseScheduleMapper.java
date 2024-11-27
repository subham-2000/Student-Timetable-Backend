package com.example.esd_mini_project.mapper;

import com.example.esd_mini_project.dto.CourseScheduleRequest;
import com.example.esd_mini_project.entity.CourseSchedule;
import org.springframework.stereotype.Service;

@Service
public class CourseScheduleMapper {

    public CourseSchedule toCourseSchedule(CourseScheduleRequest courseSchedule) {
        return CourseSchedule.builder()
                .time(courseSchedule.time())
                .day(courseSchedule.day())
                .room_no(courseSchedule.room_no())
                .building(courseSchedule.building())
                .build();
    }
}
