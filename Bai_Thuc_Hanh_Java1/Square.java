/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Thuc_Hanh_Java1;

/**
 *
 * @author Tien Dat
 */
public class Square extends Shape {
    private double edge;

    public void setEdge(double edge){
        this.edge = edge;
    }
    double area(){
        return edge * edge;
    }
    
    double circumference(){
        return edge*4;
    }
}
