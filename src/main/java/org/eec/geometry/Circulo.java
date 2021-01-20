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
public class Circulo extends Figura {
    public static final double PI = 3.1416;
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = Circulo.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        // 2 * pi * r
        perimetro = 2 * Circulo.PI * radio;
        return perimetro;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo, radio : ").append(radio).append(" [");
        sb.append(super.toString()).append("]");
        return sb.toString();
    }
} // fin clase concreta Circulo
