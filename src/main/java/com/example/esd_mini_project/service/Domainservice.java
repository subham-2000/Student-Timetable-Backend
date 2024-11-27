package com.example.esd_mini_project.service;

import com.example.esd_mini_project.dto.CourseResponse;
import com.example.esd_mini_project.dto.DomainRequest;
import com.example.esd_mini_project.dto.DomainResponse;
import com.example.esd_mini_project.entity.Domain;
import com.example.esd_mini_project.mapper.CourseMapper;
import com.example.esd_mini_project.mapper.DomainMapper;
import com.example.esd_mini_project.repository.CourseRepo;
import com.example.esd_mini_project.repository.DomainRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor

@Service
public class Domainservice {
    private final DomainRepo domainRepo;
    private final DomainMapper domainMapper;
    private final CourseRepo courseRepo;
    private final CourseMapper courseMapper;

    public List<DomainResponse> getDomains() {
        return domainRepo.findAll().stream().map(domainMapper::toDomainResponse).toList() ;
    }

    public String createDomain(DomainRequest domainRequest) {
        Domain domain = domainMapper.toDomain(domainRequest);
        domainRepo.save(domain);
        return "Domain created";
    }

    public List<CourseResponse> getSubj(Long did) {
        Domain domain = domainRepo.findById(did).get();
        return courseRepo.findByDomain(domain).stream().map(courseMapper::toCourseResponse).toList();
    }
}
