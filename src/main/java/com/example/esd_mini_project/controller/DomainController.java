package com.example.esd_mini_project.controller;


import com.example.esd_mini_project.dto.CourseResponse;
import com.example.esd_mini_project.dto.DomainRequest;
import com.example.esd_mini_project.dto.DomainResponse;
import com.example.esd_mini_project.service.Domainservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/domain")
@RequiredArgsConstructor

public class DomainController {
    private final Domainservice domainService;

    @GetMapping
    public ResponseEntity<List<DomainResponse> > getAllDomains() {
        return ResponseEntity.ok(domainService.getDomains());
    }

    @GetMapping("/domainid/{did}")
    public ResponseEntity<List<CourseResponse>> getSubjByDomainId(@PathVariable Long did) {

        return ResponseEntity.ok(domainService.getSubj(did));
    }


    @PostMapping
    public ResponseEntity<String> createDomain(@RequestBody DomainRequest domainRequest) {
        return ResponseEntity.ok(domainService.createDomain(domainRequest));
    }
}
