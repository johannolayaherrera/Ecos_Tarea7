/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Conceptos Avanzados de Ingeniería de Software
 *
 * Programa 7
 * Tarea 7
 * Autor: Johann De Jesus Olaya Herrera
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.uniandes.ecos.programa7;

/**
 * Esta clase se encarga de cargar los casos de prueba al modelo
 * @author Johann
 */
public class CargueCasos {
    
    /**
     * Carga el modelo con el escenario 1
     * @param modelo es el modelo que se va a cargar
     */
    public void escenario1(EstadisticoModelo modelo) {
        modelo.ponerValor(386);
        modelo.agregarNodo(130.0,186.0);
        modelo.agregarNodo(650.0,699.0);
        modelo.agregarNodo(99.0,132.0);
        modelo.agregarNodo(150.0,272.0);
        modelo.agregarNodo(128.0,291.0);
        modelo.agregarNodo(302.0,331.0);
        modelo.agregarNodo(95.0,199.0);
        modelo.agregarNodo(945.0,1890.0);
        modelo.agregarNodo(368.0,788.0);
        modelo.agregarNodo(961.0,1601.0);        
    }
    
    /**
     * Carga el modelo con el escenario 2
     * @param modelo es el modelo que se va a cargar
     */
    public void escenario2(EstadisticoModelo modelo) {
        modelo.ponerValor(386);
        modelo.agregarNodo(130.0,15.0);
        modelo.agregarNodo(650.0,69.9);
        modelo.agregarNodo(99.0,6.5);
        modelo.agregarNodo(150.0,22.4);
        modelo.agregarNodo(128.0,28.4);
        modelo.agregarNodo(302.0,65.9);
        modelo.agregarNodo(95.0,19.4);
        modelo.agregarNodo(945.0,198.7);
        modelo.agregarNodo(368.0,38.8);
        modelo.agregarNodo(961.0,138.2);      
    }
    
    /**
     * Carga el modelo con el escenario 3
     * @param modelo es el modelo que se va a cargar
     */
    public void escenario3(EstadisticoModelo modelo) {
        modelo.ponerValor(106);
        modelo.agregarNodo(115.0,149.0);
        modelo.agregarNodo(83.6,99.0);
        modelo.agregarNodo(120.0,114.0);
        modelo.agregarNodo(19.0,20.0);      
    }
    
    /**
     * Carga el modelo con el escenario 4
     * @param modelo es el modelo que se va a cargar
     */
    public void escenario4(EstadisticoModelo modelo) {
        modelo.ponerValor(106);
        modelo.agregarNodo(115.0,9.01);
        modelo.agregarNodo(83.6,4.48);
        modelo.agregarNodo(120.0,6.97);
        modelo.agregarNodo(19.0,3.1);     
    }
}
