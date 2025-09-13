package com.pminternship.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Applicant")
public class Applicant {
    
    @Id
    private String applicant_id;
    private String applicant_name;
    private String username;        // for login
    private String password;        // typo fixed from "passsword"
    private List<String> skills;
    private String qualifications;
    private String location_prefrences;
    private String native_location;
    private String social_category;
    private String participation_status;

    public Applicant() {}

    public Applicant(String applicant_id, String applicant_name, String username, String password,
                     List<String> skills, String qualifications, String location_prefrences,
                     String native_location, String social_category, String participation_status) {
        this.applicant_id = applicant_id;
        this.applicant_name = applicant_name;
        this.username = username;
        this.password = password;
        this.skills = skills;
        this.qualifications = qualifications;
        this.location_prefrences = location_prefrences;
        this.native_location = native_location;
        this.social_category = social_category;
        this.participation_status = participation_status;
    }

    // Getters & Setters
    public String getApplicant_id() { return applicant_id; }
    public void setApplicant_id(String applicant_id) { this.applicant_id = applicant_id; }

    public String getApplicant_name() { return applicant_name; }
    public void setApplicant_name(String applicant_name) { this.applicant_name = applicant_name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }

    public String getQualifications() { return qualifications; }
    public void setQualifications(String qualifications) { this.qualifications = qualifications; }

    public String getLocation_prefrences() { return location_prefrences; }
    public void setLocation_prefrences(String location_prefrences) { this.location_prefrences = location_prefrences; }

    public String getNative_location() { return native_location; }
    public void setNative_location(String native_location) { this.native_location = native_location; }

    public String getSocial_category() { return social_category; }
    public void setSocial_category(String social_category) { this.social_category = social_category; }

    public String getParticipation_status() { return participation_status; }
    public void setParticipation_status(String participation_status) { this.participation_status = participation_status; }
}
