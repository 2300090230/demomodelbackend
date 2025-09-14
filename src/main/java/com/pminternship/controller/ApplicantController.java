package com.pminternship.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pminternship.model.Applicant;
import com.pminternship.service.ApplicantService;

@RestController
@RequestMapping("/api/applicants")
@CrossOrigin(origins = "*")
public class ApplicantController {

    @Autowired
    private ApplicantService service;
    @Autowired
    private RestTemplate restTemplate;

    // ➕ Register
    @PostMapping("/register")
    public Applicant register(@RequestBody Applicant applicant) {
        return service.register(applicant);
    }

    // 🔑 Login
    @PostMapping("/login")
    public String login(@RequestBody Applicant applicant) {
        Optional<Applicant> loggedIn = service.login(applicant.getUsername(), applicant.getPassword());
        return loggedIn.isPresent() ? "Login Successful!" : "Invalid Credentials!";
    }

    // 📜 View all
    @GetMapping("/viewall")
    public List<Applicant> viewAllApplicants() {
        return service.viewAllApplicants();
    }
    
    @PostMapping("/match")
    public List<Map<String, Object>> getAllMatches(@RequestBody Applicant applicant) {
        String url = "http://127.0.0.1:5001/match";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Applicant> requestEntity = new HttpEntity<>(applicant, headers);

        ResponseEntity<Map[]> response =
                restTemplate.exchange(url, HttpMethod.POST, requestEntity, Map[].class);

        return Arrays.asList(response.getBody());
    }
}
