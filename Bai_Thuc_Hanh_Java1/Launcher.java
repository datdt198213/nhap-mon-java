/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_Thuc_Hanh_Java1;

import java.util.Scanner;

/**
 *
 * @author Tien Dat
 */
public class Launcher {
    public static void main(String[] args) {
        double radius;
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        
        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println("Dien tich hinh tron = " + circle.area());
        System.out.println("Chu vi hinh tron = " + circle.circumference());
        
        
        double edge;
        System.out.println("Canh = ");
        edge = scanner.nextDouble();
        
        Square square = new Square();
        
        square.setEdge(edge);
        
        System.out.println("Dien tich hinh vuong = " + square.area());
        System.out.println("Chu vi hinh tron = " + square.circumference());
    }
}
