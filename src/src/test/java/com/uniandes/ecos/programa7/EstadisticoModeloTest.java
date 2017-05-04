/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniandes.ecos.programa7;

import static org.junit.Assert.*;

/**
 *
 * @author Johann
 */
public class EstadisticoModeloTest {

    public EstadisticoModeloTest() {
    }
    
    private static String[] escenario1() {
        String[] valores = {
            "130_186",
            "650_699",
            "99_132",
            "150_272",
            "128_291",
            "302_331",
            "95_199",
            "945_1890",
            "368_788",
            "961_1601"};
        return valores;
    }

    /**
     * Prueba del método darSumaX, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarSumaX() throws Exception {
        System.out.println("darSumaX");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La suma de los valores de X es 3828 
        double actual = modelo.darSumaX();
        double esperado = 3828;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darSumaY, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarSumaY() throws Exception {
        System.out.println("darSumaY");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La suma de los valores de Y son 6389
        double actual = modelo.darSumaY();
        double esperado = 6389;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darSumaXX, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarSumaXX() throws Exception {
        System.out.println("darSumaXX");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La suma de los valores de XX 2540284
        double actual = modelo.darSumaXX();
        double esperado = 2540284;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darSumaYY, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarSumaYY() throws Exception {
        System.out.println("darSumaYY");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La suma de los valores de YY 7604693
        double actual = modelo.darSumaYY();
        double esperado = 7604693;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darSumaXY, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarSumaXY() throws Exception {
        System.out.println("darSumaXY");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La suma de los valores de XY 4303108
        double actual = modelo.darSumaXY();
        double esperado = 4303108;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darCantidadElementos, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarCantidadElementos() throws Exception {
        System.out.println("darCantidadElementos");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La cantidad de elementos es 10 
        double actual = modelo.darCantidadElementos();
        double esperado = 10;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darPromedioX, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarPromedioX() throws Exception {
        System.out.println("darPromedioX");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //El promedio de x es 382.8
        double actual = modelo.darPromedioX();
        double esperado = 382.8;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darPromedioY, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarPromedioY() throws Exception {
        System.out.println("darPromedioY");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //El promedio de x es 638.9
        double actual = modelo.darPromedioY();
        double esperado = 638.9;   
        assertTrue(esperado == actual);
    }

    /**
     * Prueba del método darCorrelacion, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarCorrelacion() throws Exception {
        System.out.println("darCorrelacion");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //La correlación es 0.9111
        double actual = modelo.darCorrelacion(); 
        assertTrue((0.91<actual)&&(actual<0.92));
    }

    /**
     * Prueba del método darBeta1, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarBeta1() throws Exception {
        System.out.println("darBeta1");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //B1 es 1.727932
        double actual = modelo.darBeta1(); 
        assertTrue((1.7<actual)&&(actual<1.73));
    }

    /**
     * Prueba del método darBeta0, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarBeta0() throws Exception {
        System.out.println("darBeta0");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        //B0 es -22.5525
        double actual = modelo.darBeta0(); 
        assertTrue((-23<actual)&&(actual<-22));
    }

    /**
     * Prueba del método darEstimacion, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarEstimacion() throws Exception {
        System.out.println("darEstimacion");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        modelo.ponerValor(386);
        //La estimación es 644.4294
        double actual = modelo.darEstimacion(); 
        assertTrue((644<actual)&&(actual<645));
    }
    
    /**
     * Prueba del método darSignificanciaX, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarSignificancia() throws Exception {
        System.out.println("darSignificancia");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        modelo.ponerValor(386);
        //La significancia es  0.000178755
        double actual = modelo.darSignificancia(); 
        assertTrue((0.000168<actual)&&(actual<0.000188));
    }
    
    /**
     * Prueba del método Rango, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void testDarRango() throws Exception {
        System.out.println("darRango");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        modelo.ponerValor(386);
        //El rango es  es  230
        double actual = modelo.darRango(); 
        assertTrue((220<actual)&&(actual<250));
    } 
    
    /**
     * Prueba del método darUPI, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void darUpi() throws Exception {
        System.out.println("darUPI");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        modelo.ponerValor(386);
        //El UPI es  874
        double actual = modelo.darUpi(); 
        assertTrue((864<actual)&&(actual<894));
    }   
    
    /**
     * Prueba del método darLPI, de la clase EstadisticoModelo.
     */
    @org.junit.Test
    public void darLpi() throws Exception {
        System.out.println("darLPI");
        String[] valores = escenario1();
        EstadisticoModelo modelo = new EstadisticoModelo();
        for(String linea : valores){
            String[] valoresFila;
            valoresFila = linea.split("_");
            modelo.agregarNodo(Double.parseDouble(valoresFila[0]),Double.parseDouble(valoresFila[1]));
        }
        modelo.ponerValor(386);
        //El LPI es  414
        double actual = modelo.darLpi(); 
        assertTrue((401<actual)&&(actual<424));
    } 
    
}
