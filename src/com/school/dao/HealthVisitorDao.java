/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.pojo.HealthVisitor;

/**
 *
 * @author eng doaa
 */
public interface HealthVisitorDao {

    public void InsertDataHealthVisitor(HealthVisitor healthvisitorId, HealthVisitor dateOfHire, HealthVisitor qualification, HealthVisitor postion, HealthVisitor firstName, HealthVisitor midName, HealthVisitor lastName, HealthVisitor address, HealthVisitor gender, HealthVisitor dateBirth, HealthVisitor phone);

    public void removeDataHealthVisitor(HealthVisitor healthvisitorId);

    public void editDataHealthVisitor(HealthVisitor healthvisitorId, HealthVisitor firstName, HealthVisitor dateOfHire, HealthVisitor qualification, HealthVisitor postion, HealthVisitor midName, HealthVisitor lastName, HealthVisitor address, HealthVisitor gender, HealthVisitor dateBirth, HealthVisitor phone);

    //public void editDataHealthVisitorMiddleName(HealthVisitor healthvisitorId, HealthVisitor firstName, HealthVisitor dateOfHire, HealthVisitor qualification, HealthVisitor postion, HealthVisitor midName, HealthVisitor lastName, HealthVisitor address, HealthVisitor gender, HealthVisitor dateBirth, HealthVisitor phone);
    //public void editDataHealthVisitorLastName(HealthVisitor healthvisitorId, HealthVisitor firstName, HealthVisitor dateOfHire, HealthVisitor qualification, HealthVisitor postion, HealthVisitor midName, HealthVisitor lastName, HealthVisitor address, HealthVisitor gender, HealthVisitor dateBirth, HealthVisitor phone);
    public HealthVisitor viewHealthVisitorScreen(int healthvisitorId);

}
