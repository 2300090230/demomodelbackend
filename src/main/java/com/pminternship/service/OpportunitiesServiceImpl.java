package com.pminternship.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pminternship.model.Opportunities;
import com.pminternship.repository.OpportunitiesRepository;

@Service
public class OpportunitiesServiceImpl implements OpportunitiesService {

    @Autowired
    private OpportunitiesRepository repository;

    @Override
    public Opportunities addOpportunity(Opportunities opportunity) {
        return repository.save(opportunity);
    }

    @Override
    public List<Opportunities> addMultipleOpportunities(List<Opportunities> opportunities) {
        return repository.saveAll(opportunities);
    }

    @Override
    public List<Opportunities> viewAllOpportunities() {
        return repository.findAll();
    }

    @Override
    public Optional<Opportunities> getOpportunityById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Opportunities> getOpportunitiesByCompany(String company) {
        return repository.findByCompany(company);
    }

    @Override
    public List<Opportunities> getOpportunitiesBySkill(String skill) {
        return repository.findByRequiredskillsContaining(skill);
    }

    @Override
    public List<Opportunities> getOpportunitiesByLocation(String location) {
        return repository.findByWorklocation(location);
    }

    @Override
    public Opportunities updateOpportunity(String id, Opportunities opportunity) {
        return repository.findById(id).map(existing -> {
            existing.setCompany(opportunity.getCompany());
            existing.setRole(opportunity.getRole());
            existing.setSector(opportunity.getSector());
            existing.setWorklocation(opportunity.getWorklocation());
            existing.setRequiredskills(opportunity.getRequiredskills());
            existing.setQualificationrequired(opportunity.getQualificationrequired());
            existing.setOtherrequirements(opportunity.getOtherrequirements());
            existing.setCapacity(opportunity.getCapacity());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Opportunity not found with id: " + id));
    }

    @Override
    public void deleteOpportunityById(String id) {
        repository.deleteById(id);
    }
}
