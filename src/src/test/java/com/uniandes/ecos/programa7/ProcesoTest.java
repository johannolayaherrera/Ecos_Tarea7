/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniandes.ecos.programa7;

import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Johann
 */
public class ProcesoTest {
   double x1 = 1;
    int dof;
    double E = 0.00001;
    double p0;
    Proceso proceso = new Proceso() ;

    @Before
    public void setUp() {
        p0 = 0.20;
        dof = 6;
    }

    /**
     * Prueba del proceso que obtiene el resultado de la integral
     */
    @Test
    public void testObtenerResultado() {
        System.out.println("obtenerResultado");
        double expResult = 0.32;
        double result = proceso.obtenerResultado(x1,dof);
        assertTrue((result + 0.0001 > expResult) && (result + 0.0001 > expResult));
    }

    /**
     * Prueba del resultado del x cuya integral corresponde a p0 a partir de una tolerancia de error
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        double expResult = 0.55338;
        double result = proceso.obtenerX(x1,dof, p0);
        assertTrue((result + 0.0001 > expResult) && (result + 0.0001 > expResult));
    }
}
