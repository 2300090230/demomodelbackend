package com.pminternship.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pminternship.model.Applicant;
import com.pminternship.service.ApplicantService;

@RestController
@RequestMapping("/api/applicants")
@CrossOrigin(origins = "*")
public class ApplicantController {

    @Autowired
    private ApplicantService service;

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
}
