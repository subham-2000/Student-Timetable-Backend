package com.example.esd_mini_project.controller;


import com.example.esd_mini_project.dto.LoginRequest;
import com.example.esd_mini_project.dto.LoginResponse;
import com.example.esd_mini_project.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthenticationController {

    private final StudentService studentService;
  @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody @Valid     LoginRequest request) {
//        return ResponseEntity.ok(studentService.login(request));
//    }

  public ResponseEntity<LoginResponse> login(@RequestBody @Valid     LoginRequest request) {
       return ResponseEntity.ok(studentService.login(request));
   }
}
