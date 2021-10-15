/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;

import com.ceep.dominio.Circulo;
import com.ceep.dominio.FiguraGeometrica;
import com.ceep.dominio.Rectangulo;

/**
 *
 * @author javip
 */
public class Test {
    
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        FiguraGeometrica figura2 = new Circulo("Circulo");
        
        figura.dibujar();
        figura2.dibujar();
    }
}
