/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Thuc_Hanh_Java1;


public class Circle extends Shape{
    
    private double radius;
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return radius*radius*3.14;
    }
    
    @Override
    double circumference(){
        return radius*2*3.14;
    }  
 
}
