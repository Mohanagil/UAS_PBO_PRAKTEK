/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uas_pbo;

/**
 *
 * @author M.AGIL.MAULANA
 */
public class Education {
    private String Degree,Major;
    private int Research;
    
    Education(){
        
    }
    
    public Education(String Degree,String Major,int Research){
        this.Degree = Degree;
        this.Major = Major;
        this.Research = Research;
    }
    
    public void setDegree(String Degree){
        this.Degree = Degree;
    }
    
    public String getDegree(){
        return Degree;
    }
    
    public void setMajor(String Major){
        this.Major = Major;
    }
    
    public String Major(){
        return Major;
    }
    
    public void setResearch(int Research){
        this.Research = Research;
    }
    
    public int getResearch(){
        return Research;
    }
}

