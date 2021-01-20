/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.geometry;

/**
 *
 * @author erick
 */
public abstract class Figura {
    protected double area;
    protected double perimetro;
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }
    
} // fin: clase abstracta Figura
