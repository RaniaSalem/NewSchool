/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.demo;

import com.school.dao.HealthVisitorDaoImpl;

import com.school.pojo.HealthVisitor;


/**
 *
 * @author eng doaa
 */
public class HealthVisitorDemo {

    public static void main(String[] args) {

        printHealthVisitorDetails(1);
        HealthVisitorDaoImpl healthvisitorDaoImpl = new HealthVisitorDaoImpl();
        healthvisitorDaoImpl.InsertDataHealthVisitor(1, "2015/12/1", "good", "Doaa", "Magdy", "ibrahim", "mahalla", "female", "2015/11/1", "01111");
    }

    private static void printHealthVisitorDetails(int healthvisitorId) {
        HealthVisitorDaoImpl healthvisitorDaoImpl = new HealthVisitorDaoImpl();
        HealthVisitor healthvisitor = healthvisitorDaoImpl.viewHealthVisitorScreen(healthvisitorId);
        System.out.println("m.getFirstName() :" + healthvisitor.getFirstName());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getAddress() :" + healthvisitor.getAddress());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getGender() :" + healthvisitor.getGender());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getLastName() :" + healthvisitor.getLastName());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getMidName() :" + healthvisitor.getMidName());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getLastName() :" + healthvisitor.getLastName());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getPhone() :" + healthvisitor.getPhone());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getQualification() :" + healthvisitor.getQualification());//select data(FirstName) in table HealthVisitor
        System.out.println("m.getDateOfBirth() :" + healthvisitor.getDateOfBirth());//select data(FirstName) in table HealthVisitor
        System.out.println("mm.getDateOfHire() :" + healthvisitor.getDateOfHire());//select data(FirstName) in table HealthVisitor
        System.out.println("mm.getHealthId() :" + healthvisitor.getHealth_ID());//select data(FirstName) in table HealthVisitor   

    }
}
