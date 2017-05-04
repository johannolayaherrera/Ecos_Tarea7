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

import java.util.ArrayList;

/**
 * Clase que se encarga de hacer el proceso de integración
 * @author Johann
 */
public class Integracion {
    ArrayList<Fila> tablaCalculo = new ArrayList<>();
    double dof;
    double w ;
    
    /**
     * Constructor de la calse Integración
     * @param x1 x inicio
     * @param x2 x fin
     * @param cantidadSegmentos cantidad de segmentos en que se divide
     * @param gradosLibertad valor que corresponde a los grados de libertad
     */
    public Integracion(double x1, double x2,int cantidadSegmentos, double gradosLibertad){
        w = x2/cantidadSegmentos;
        asignarXi(x1,x2,cantidadSegmentos);
        asignarMultiplicador(cantidadSegmentos);
        dof = gradosLibertad;
    }
    
    /**
     * Obtiene la tabla de calculo donde realizo el procesode integración
     * @return Tabla de procesos
     */
    public ArrayList<Fila> getTablaCalculo(){
        return tablaCalculo;
    }
    
    /**
     * Realiza la asignación de los valores discretos de x
     * @param x1 x inicio
     * @param x2 x fin 
     * @param cantidadSegmentos cantidad de segmentos de división
     */
    public void asignarXi(double x1,double x2, int cantidadSegmentos) {
        for (int i = 0 ; i<=cantidadSegmentos ; i++) {
            Fila fila = new Fila();
            double xi=i*w;
            fila.setXi(xi);
            tablaCalculo.add(fila);
        }
    }
    /**
     * Asigna el multiplicador a cada fila
     * @param cantidadSegmentos Cantidad de segmentos
     */
    public void asignarMultiplicador(int cantidadSegmentos) {
        tablaCalculo.get(0).setMultiplicador(1);
        for (int i = 1 ; i <cantidadSegmentos ; i++) {
            if ((i%2)==0) {
                tablaCalculo.get(i).setMultiplicador(2);
            }
            else {
                tablaCalculo.get(i).setMultiplicador(4);
            }
        }
        tablaCalculo.get(tablaCalculo.size()-1).setMultiplicador(1);
    }
    
    /**
     * Realiza a la primera parte de la ecuación de integración con la regla Simpson
     * el cual corresponde a (1 + xi^2/dof)^ -((dof +1)/2)
     */
    public void calculoPaso1() {
        for (int i = 0; i <tablaCalculo.size();i++) {
            double calculo1 = Math.pow((1+(Math.pow(tablaCalculo.get(i).getXi(), 2.0)/dof)), -((dof+1)/2.0));
           tablaCalculo.get(i).setCalculo1(calculo1);
        }
    }
    
    /**
     * Realiza a la segunda parte de la ecuación de integración con la regla Simpson
     * el cual corresponde a el resultado del calculo1 multiplicado por
     *( función gamma * ((dof+1)/2))/((dof*pi)^(1/2)* función gamma*(dof/2)))
     */
    public void calculoPaso2() {
        for (int i = 0; i <tablaCalculo.size();i++) {
           tablaCalculo.get(i).setCalculoFuncion(tablaCalculo.get(i).getCalculo1()*calcularGamma());
        }
    }
    
    /**
     *  Guarda el resultado del resultado de la regla de Simpson
     * el cual corresponde a (w/3)* Multiplicador * CalculoFuncion
     */
    public void calculoPaso3() {
        for (int i = 0; i <tablaCalculo.size();i++) {
           tablaCalculo.get(i).setCalculo3((w/3.0)*tablaCalculo.get(i).getMultiplicador()
                   *tablaCalculo.get(i).getCalculoFuncion());
        }
    }
    
    /**
     * Obtiene el resultado final de la prueba
     * @return resultado del proceso de integración
     */
    public double darResultado() {
        calculoPaso1();
        calculoPaso2();
        calculoPaso3();
        
        double resultado = 0;
        
        for (int i = 0; i <tablaCalculo.size();i++) {
           resultado += tablaCalculo.get(i).getCalculo3();
        }
        return resultado;
    }
    /**
     * Realiza el calculo de Gamma
     * @return Obtiene el calculo de Gamma
     */
    public double calcularGamma() {
        double gamma1;
        double gamma2;
        double inicio;
        
        inicio = ((dof+1.0)/2.0)-1.0;
        gamma1 = calcularFactorial(inicio);
        
        inicio = (dof/2.0)-1.0;
        gamma2 = calcularFactorial(inicio);
        
        return gamma1/((Math.sqrt(dof*Math.PI))*gamma2);
    }
    /**
     * Realiza el proceso de matemático de factorial
     * @param inicio del valor de Gamma
     * @return el resultado de Gamma
     */
    public double calcularFactorial(double inicio) {
        double valorGamma =1.0;
        for (double i = inicio ; i>=0.5 ; i--) {
            valorGamma = valorGamma*i;
            if (i==0.5) {
                valorGamma = valorGamma * Math.sqrt(Math.PI);
            }
        }
        return valorGamma;
    }
}
