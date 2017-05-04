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
 * Esta clase respresenta al modelo de la aplicación
 * @author Johann
 */
public class EstadisticoModelo {
    private Nodo numeroHead;
    private double tamanioProxy=0;
    private double cantidadNumeros = 0;
    Proceso procesoIntegral = new Proceso();

    /**
     * Agrega un nodo a la estructura de datos
     * @param x dato correspondiente a X
     * @param y dato correspondiente a Y
     */
    public void agregarNodo(Double x, Double y) {

        Nodo nuevoNodo = new Nodo(x,y);
        if (numeroHead == null){
        numeroHead = nuevoNodo;  
        }
        else {
            Nodo aux = numeroHead;

            while (aux.obtenerSiguiente()!=null){
                aux = aux.obtenerSiguiente();
            }  
            aux.agregarSiguiente(nuevoNodo); 
        }   
    }
    
    /**
     * Asigna el valor estimado del proxy 
     * @param valor es el valor estimado del proxy.
     */
    public void ponerValor(double valor){ 
        tamanioProxy = valor;
    }   
    
    /**
     * Retorna el primer elemento de la lista enlazada.
     * @return primer elemento de la lista.
     */
    public Nodo darCabezaLista(){ 
        return numeroHead;
    }   
    
    /**
     * Calcula la suma de los elementos correspondientes a X en la lista enlazada.
     * @return el valor de la sumatoria de X. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darSumaX() throws Exception { 
        double cantidadAcumulado = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                cantidadAcumulado += aux.obtenerNumeroX();
                aux = aux.obtenerSiguiente();
            }
            return cantidadAcumulado;
        }
    }   
    
    /**
     * Calcula la suma de los elementos correspondientes a Y en la lista enlazada.
     * @return el valor de la sumatoria de Y. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darSumaY() throws Exception { 
        double cantidadAcumulado = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                cantidadAcumulado += aux.obtenerNumeroY();
                aux = aux.obtenerSiguiente();
            }
            return cantidadAcumulado;
        }
    } 
    
    /**
     * Calcula la sumatoria de los elementos x elevados al cuadrado.
     * @return el valor de la sumatoria de X^2. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darSumaXX() throws Exception { 
        double cantidadAcumulado = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                cantidadAcumulado += Math.pow(aux.obtenerNumeroX(), 2) ;
                aux = aux.obtenerSiguiente();
            }
            return cantidadAcumulado;
        }
    } 
    
    /**
     * Calcula la sumatoria de los elementos y elevados al cuadrado.
     * @return el valor de la sumatoria de Y^2. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darSumaYY() throws Exception { 
        double cantidadAcumulado = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                cantidadAcumulado += Math.pow(aux.obtenerNumeroY(), 2) ;
                aux = aux.obtenerSiguiente();
            }
            return cantidadAcumulado;
        }
    } 
    
    /**
     * Calcula la sumatoria de los elementos x multiplicados por los elementos y.
     * @return el valor de la sumatoria de X*Y. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darSumaXY() throws Exception { 
        double cantidadAcumulado = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                cantidadAcumulado += aux.obtenerNumeroX() * aux.obtenerNumeroY() ;
                aux = aux.obtenerSiguiente();
            }
            return cantidadAcumulado;
        }
    } 
     /**
     * Calcula la cantidad de registros que se cargaron desde el archivo.
     * @return cantidad de elementos.
     * @throws Exception Se lanza cuando no hay números registrados.
     */
    public double darCantidadElementos()throws Exception{
        double numeradorAcumulado = 0;
        
        Nodo aux = numeroHead;
        while (aux != null){
            numeradorAcumulado ++;
            aux = aux.obtenerSiguiente();
        }
        
        return numeradorAcumulado;            
    }
    /**
     * Calcula el promedio de los valores x 
     * @return el valor del promedio de X. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darPromedioX()throws Exception{
        if (darCantidadElementos()>0){
            return (darSumaX()/darCantidadElementos());
        }
        throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    /**
     * Calcula el promedio de los valores y
     * @return el valor del promedio de Y. 
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darPromedioY()throws Exception{
        if (darCantidadElementos()>0){
            return (darSumaY()/darCantidadElementos());
        }
        throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    /**
     * Calcula r.
     * @return valor de r.
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darr() throws Exception {
        if (darCantidadElementos() > 0) {
            return ((darCantidadElementos() * darSumaXY()) - (darSumaX() * darSumaY()))
                    / (Math.sqrt(((darCantidadElementos() * darSumaXX()) - Math.pow(darSumaX(), 2))
                            * ((darCantidadElementos() * darSumaYY()) - Math.pow(darSumaY(), 2))
                    ));
        } throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    /**
     * Calcula la correlación de los datos cargados.
     * @return valor de la correlación.
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darCorrelacion() throws Exception {
        if (darCantidadElementos() > 0) {
            return (Math.pow(((darCantidadElementos() * darSumaXY()) - (darSumaX() * darSumaY()))
                    / (Math.sqrt(((darCantidadElementos() * darSumaXX()) - Math.pow(darSumaX(), 2))
                            * ((darCantidadElementos() * darSumaYY()) - Math.pow(darSumaY(), 2))
                    )), 2));
        }
        throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    /**
     * Calcula el valor de Beta1 de los datos cargados.
     * @return valor de Beta1
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darBeta1()throws Exception{
        if (darCantidadElementos()>0){
            return (
                    (darSumaXY()-darCantidadElementos()*darPromedioX()*darPromedioY())
                    /
                    (darSumaXX()-darCantidadElementos()*Math.pow(darPromedioX(), 2))
                    );
        }
        throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    
    /**
     * Calcula el valor de Beta0 de los datos cargados.
     * @return valor de Beta0.
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darBeta0()throws Exception{
        if (darCantidadElementos()>0){
            return (
                    darPromedioY()-darBeta1()*darPromedioX()
                    );
        }
        throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    
    /**
     * Calcula el valor estimado apartir de los datos cargados y el valor estimado del proxy.
     * @return valor estimado a partir del tamaño del proxy.
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darEstimacion()throws Exception{
        if (darCantidadElementos()>0){
            return (
                    darBeta0() + darBeta1()*tamanioProxy
                    );
        } throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
    }
    
    
    //N
    
    /**
     * Calcula el valor de x que corresponde al limite superior de la integral
     * al calcular la significancia
     * @return
     * @throws Exception se lanza cuando no hay registros cargados
     */
    private double darSignificanciaX()throws Exception{
        double x = ((Math.abs(darr())* Math.sqrt(darCantidadElementos()-2.0)))/(Math.sqrt(1.0-(Math.pow(darCorrelacion(), 2.0))));
        return x;
    }
        
    /**
     * Calcula la significancia
     * @return valor de la significancia
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darSignificancia()throws Exception{
        double p = procesoIntegral.obtenerResultado(darSignificanciaX(), darCantidadElementos() -2.0);
        return 1.0-(2.0*p);
    }
    
    /**
     * Calcula la desviación estandar a partir de los datos cargados en el modelo
     * @return valor de la desviación estandar
     * @throws Exception se lanza cuando no hay registros cargados
     */
    private double darDesviacionEstandar()throws Exception{
      
        double sumatoria = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                sumatoria += Math.pow(aux.obtenerNumeroY() - darBeta0() - (darBeta1()*aux.obtenerNumeroX()), 2);
                aux = aux.obtenerSiguiente();
            }          
            return Math.sqrt((1.0/(darCantidadElementos()-2.0))*sumatoria);          
        } 
    }
    
    /**
     * Realiza el calculo de RaizCuadrada(1+(1/n)+((Xk - Xavg)^2)/(Sumatoria((Xi-Xavg)^2)))
     * @return resultado del calculo
     * @throws Exception se lanza cuando no hay registros cargados
     */
    private double darTercerCalculo()throws Exception{    
        double sumatoria = 0;
        if (numeroHead == null){
            throw new Exception("No hay números registrados. Por favor verifique y cargue de nuevo.");
        }
        else {
            Nodo aux = numeroHead;
            
            while (aux != null){
                sumatoria += Math.pow(aux.obtenerNumeroX()-darPromedioX(), 2);
                aux = aux.obtenerSiguiente();
            }
            
            //double valorX = darSignificanciaX();
            double valorX = tamanioProxy;
            return Math.sqrt(1.0+(1.0/darCantidadElementos())+  ((Math.pow(valorX-darPromedioX(), 2))/(sumatoria)));
           
        } 
    }
    /**
     * Calcular el Rango
     * @return valor del rango
     * @throws Exception se lanza cuando no hay registros cargados
     */
    
    public double darRango()throws Exception{
        double x = procesoIntegral.obtenerX(1,darCantidadElementos()-2.0, 0.35);
        double desviacionEstandar = darDesviacionEstandar();
        double tercerTermino = darTercerCalculo();
        
        return x*desviacionEstandar*tercerTermino;
    } 
    
    /**
     * Calcula el limite superior de la estimación
     * @return limite superior de la estimación
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darUpi()throws Exception{      
        return darEstimacion() + darRango();
    } 
    
    /**
     * Calcula el limite inferior de la estimación
     * @return limite inferior de la estimación
     * @throws Exception se lanza cuando no hay registros cargados
     */
    public double darLpi()throws Exception{      
        return darEstimacion() - darRango();
    } 

}