package com.pminternship.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pminternship.model.Opportunities;

public interface OpportunitiesRepository extends MongoRepository<Opportunities, String> {
    List<Opportunities> findByCompany(String company);
    List<Opportunities> findByWorklocation(String worklocation);
    List<Opportunities> findByRequiredskillsContaining(String skill);
}
