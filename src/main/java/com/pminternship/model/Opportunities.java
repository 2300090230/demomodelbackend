package com.pminternship.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Opportunities")
public class Opportunities {

    @Id
    private String internshipid;  // mongoDb ID handling
    private String company;
    private String role;
    private String sector;
    private String worklocation;
    private List<String> requiredskills;
    private String qualificationrequired;
    private String otherrequirements;
    private int capacity;

    public Opportunities() {}

    public Opportunities(String internshipid, String company, String role, String sector,
                         String worklocation, List<String> requiredskills,
                         String qualificationrequired, String otherrequirements,
                         int capacity) {
        this.internshipid = internshipid;
        this.company = company;
        this.role = role;
        this.sector = sector;
        this.worklocation = worklocation;
        this.requiredskills = requiredskills;
        this.qualificationrequired = qualificationrequired;
        this.otherrequirements = otherrequirements;
        this.capacity = capacity;
    }

    // Getters & Setters
    public String getInternshipid() { return internshipid; }
    public void setInternshipid(String internshipid) { this.internshipid = internshipid; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public String getWorklocation() { return worklocation; }
    public void setWorklocation(String worklocation) { this.worklocation = worklocation; }

    public List<String> getRequiredskills() { return requiredskills; }
    public void setRequiredskills(List<String> requiredskills) { this.requiredskills = requiredskills; }

    public String getQualificationrequired() { return qualificationrequired; }
    public void setQualificationrequired(String qualificationrequired) { this.qualificationrequired = qualificationrequired; }

    public String getOtherrequirements() { return otherrequirements; }
    public void setOtherrequirements(String otherrequirements) { this.otherrequirements = otherrequirements; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
