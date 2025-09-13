package com.pminternship.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pminternship.model.Opportunities;
import com.pminternship.service.OpportunitiesService;

@RestController
@RequestMapping("/api/opportunities")
@CrossOrigin(origins = "*")
public class OpportunitiesController {

    @Autowired
    private OpportunitiesService service;

    // ➕ Add single opportunity
    @PostMapping
    public Opportunities addOpportunity(@RequestBody Opportunities opportunity) {
        return service.addOpportunity(opportunity);
    }

    // ➕ Add multiple opportunities
    @PostMapping("/bulk")
    public List<Opportunities> addMultipleOpportunities(@RequestBody List<Opportunities> opportunities) {
        return service.addMultipleOpportunities(opportunities);
    }

    // 📜 View all
    @GetMapping
    public List<Opportunities> viewAllOpportunities() {
        return service.viewAllOpportunities();
    }

    // 🔍 Get by ID
    @GetMapping("/{id}")
    public Optional<Opportunities> getOpportunityById(@PathVariable String id) {
        return service.getOpportunityById(id);
    }

    // 🔍 Get by Company
    @GetMapping("/company/{company}")
    public List<Opportunities> getOpportunitiesByCompany(@PathVariable String company) {
        return service.getOpportunitiesByCompany(company);
    }

    // 🔍 Get by Skill
    @GetMapping("/skill/{skill}")
    public List<Opportunities> getOpportunitiesBySkill(@PathVariable String skill) {
        return service.getOpportunitiesBySkill(skill);
    }

    // 🔍 Get by Location
    @GetMapping("/location/{location}")
    public List<Opportunities> getOpportunitiesByLocation(@PathVariable String location) {
        return service.getOpportunitiesByLocation(location);
    }

    // ✏️ Update
    @PutMapping("/{id}")
    public Opportunities updateOpportunity(@PathVariable String id, @RequestBody Opportunities opportunity) {
        return service.updateOpportunity(id, opportunity);
    }

    // ❌ Delete
    @DeleteMapping("/{id}")
    public String deleteOpportunityById(@PathVariable String id) {
        service.deleteOpportunityById(id);
        return "Opportunity with ID " + id + " deleted successfully!";
    }
}
