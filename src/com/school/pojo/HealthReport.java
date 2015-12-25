/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.pojo;

/**
 *
 * @author eng doaa
 */
public class HealthReport {
     private int reportId;
    private String reportContent;
    private int healthId;
    
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public int getHealthId() {
        return healthId;
    }

    public void setHealthId(int healthId) {
        this.healthId = healthId;
    }

   

   
    
}
