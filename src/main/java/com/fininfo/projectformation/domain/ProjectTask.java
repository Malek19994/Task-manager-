package com.fininfo.projectformation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class ProjectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Summary cannot be empty")
    private String summary;
    private String acceptanceCriteria;
    private String status;

    public ProjectTask() {
    }

    public ProjectTask(Long id, @NotBlank(message = "Summary cannot be empty") String summary, String acceptanceCriteria, String status) {
        this.id = id;
        this.summary = summary;
        this.acceptanceCriteria = acceptanceCriteria;
        this.status = status;
    }

    public Long getId() {
        return id;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
