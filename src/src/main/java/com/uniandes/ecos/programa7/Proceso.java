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
 * Clase que centraliza el proceso de integración
 * @author Johann
 */
public class Proceso {
    private static Integracion integracion1;
    private static Integracion integracion2;
    static double E = 0.000001;
    static double d = 0.5;
    
    /**
     * Retorna el valor de x cuya integral es p0 con un dof especifico y un error máximo determinado
     * @param x1 valor inicial de x
     * @param dof grados de libertad
     * @param p0 Resultado de la integral
     * @return  El valor de x cuya integral es p0 según los parámetros ingresados
     */
    public double obtenerX(double x1,double dof, double p0)
    {
        double resultado = obtenerResultado(x1,dof);
        boolean esMayor = resultado > p0;
        int i = 0 ;
        while ((Math.abs(resultado - p0) > E)||(i <5)){
            x1 += esMayor ? -d : d;
            resultado = obtenerResultado(x1,dof);
            if (esMayor != (resultado>p0)){
                d = d/2.0;
            }
            esMayor = resultado > p0;
            i++;
        }
        return x1;
    }
    
    /**
     * Calcula el resultado de la integral 
     * @param x1 limite superior de la integrar
     * @param dof grados de libertad
     * @return resultado de la integral
     */
    public double obtenerResultado(double x1,double dof) {
        Integracion integracion1;
        Integracion integracion2;
        int numSeg = 10;
        double resultado1 = 0;
        double resultado2 = 0;
        
        while (((Math.abs(resultado1-resultado2))>E)||(resultado1==0 && resultado2==0)) {
            integracion1= new Integracion(0,x1,numSeg,dof);
            resultado1 = integracion1.darResultado();

            integracion2= new Integracion(0,x1,numSeg*2,dof);
            resultado2 = integracion2.darResultado();
            
            numSeg = numSeg * 2;
        }
        return resultado2;
    }
}
