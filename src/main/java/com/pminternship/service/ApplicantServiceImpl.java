package com.pminternship.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pminternship.model.Applicant;
import com.pminternship.repository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantRepository repository;

    @Override
    public Applicant register(Applicant applicant) {
        return repository.save(applicant);
    }

    @Override
    public Optional<Applicant> login(String username, String password) {
        return repository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<Applicant> viewAllApplicants() {
        return repository.findAll();
    }
}
