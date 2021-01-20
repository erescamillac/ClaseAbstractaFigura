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
public class Triangulo extends Figura{
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
        // area = (b * h) / 2
        area = (base * altura) / 2;
        return area;
    }
    
    /* Sólo calcula el menor valor posible del perímetro del triángulo
    * para las dimensiones de base y altura especificados.
    */
    @Override
    public double calcularPerimetro(){
        // Smallest possible perimeter
        // menor perímetro posible del Triangulo
        // https://math.stackexchange.com/questions/80397/can-we-find-the-perimeter-of-a-triangle-given-only-its-base-and-height
        // P = b + sqrt( b^2 + 4*h^2)
        perimetro = base + Math.sqrt(Math.pow(base, 2) + 4*(Math.pow(altura, 2)));
        return perimetro;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Triángulo: base = ").append(base).append(", altura = ");
        sb.append(altura).append(", Área = ").append(area).append(", Perímetro MÍNIMO = ");
        sb.append(perimetro);
        return sb.toString();
    }
} // fin clase concreta Triangulo
