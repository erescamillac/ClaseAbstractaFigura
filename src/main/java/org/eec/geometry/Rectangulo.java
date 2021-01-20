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
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        area = base * altura;
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        // 2 * (b + h)
        perimetro = 2 * (base + altura);
        return perimetro;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Rectángulo, base = ").append(base);
        sb.append(", altura = ").append(altura);
        sb.append("[").append(super.toString()).append("]");
        return sb.toString();
    }
} // fin clase concreta Rectangulo
