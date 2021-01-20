/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.test;

import java.util.HashSet;
import java.util.Set;
import org.eec.geometry.*;

/**
 *
 * @author erick
 */
public class TestFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        Circulo circulo1;
        Rectangulo rectangulo1;
        Triangulo triangulo1;
        int figNum = 0;
        // TODO code application logic here
        System.out.println("##--Test de Polimorfismo a partir de una variable de referencia de tipo Figura--##");
        circulo1 = new Circulo();
        rectangulo1 = new Rectangulo();
        triangulo1 = new Triangulo();
        circulo1.setRadio(2.5);
        rectangulo1.setBase(3.3);
        rectangulo1.setAltura(1.5);
        triangulo1.setBase(3.3);
        triangulo1.setAltura(1.5);
        // Guardar referencias en el array
        figuras[0] = circulo1;
        figuras[1] = rectangulo1;
        figuras[2] = triangulo1;
        for(Figura f : figuras){
            System.out.println("Figura " + ++figNum);
            f.calcularArea();
            f.calcularPerimetro();
            System.out.println(f);
            System.out.println("------------------------------------");
        } // end for()
    } // fin main method
    
}
