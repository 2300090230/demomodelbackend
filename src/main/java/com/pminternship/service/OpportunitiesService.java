package com.pminternship.service;

import java.util.List;
import java.util.Optional;
import com.pminternship.model.Opportunities;

public interface OpportunitiesService {
    Opportunities addOpportunity(Opportunities opportunity);
    List<Opportunities> addMultipleOpportunities(List<Opportunities> opportunities);
    List<Opportunities> viewAllOpportunities();
    Optional<Opportunities> getOpportunityById(String id);
    List<Opportunities> getOpportunitiesByCompany(String company);
    List<Opportunities> getOpportunitiesBySkill(String skill);
    List<Opportunities> getOpportunitiesByLocation(String location);
    Opportunities updateOpportunity(String id, Opportunities opportunity);
    void deleteOpportunityById(String id);
}
