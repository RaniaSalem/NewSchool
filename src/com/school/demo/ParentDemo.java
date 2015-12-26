/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.demo;

import com.school.dao.ParentDAOImp;

/**
 *
 * @author manal pc
 */
public class ParentDemo {
    public static void main(String[] args) {
        ParentDAOImp pdi=new ParentDAOImp();
       pdi.deleteDataParent(1); 
        pdi.insertDataParent(2, "Rania", "Salem", "Mohamed", "Elfayom", "female", "1992/12/2","01020252552", 5);
    }
}
