package com.pminternship.service;

import java.util.List;
import java.util.Optional;
import com.pminternship.model.Applicant;

public interface ApplicantService {
    Applicant register(Applicant applicant);
    Optional<Applicant> login(String username, String password);
    List<Applicant> viewAllApplicants();
}
