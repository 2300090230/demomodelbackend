package com.pminternship.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.pminternship.model.Applicant;
import java.util.Optional;

public interface ApplicantRepository extends MongoRepository<Applicant, String> {
    Optional<Applicant> findByUsername(String username);
    Optional<Applicant> findByUsernameAndPassword(String username, String password);
}
