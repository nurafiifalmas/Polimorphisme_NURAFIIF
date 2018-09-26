/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author user
 */
public class Shape {
    private String colour;
    public Shape (String colour){
        this.colour=colour;
    }
    @Override
    public String toString(){
        return "Shape[colour="+colour +"]";
    }
    public double getArea(){
        System.out.println("Shape unknow! Cannot compute area!");
        return 0;
    }
}

