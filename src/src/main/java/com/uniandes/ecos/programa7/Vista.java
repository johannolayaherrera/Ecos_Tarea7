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

import static spark.Spark.*;

/**
 * Muestra los resultado del calculo
 * @author Johann
 */
public class Vista {
    static EstadisticoModelo modelo;
    static CargueCasos cargue = new CargueCasos();
    
    /**
     * Método principal que da el arranque al sistema e implementa los métodos para obtener el resultado de cada caso
     * @param args 
     */
    public static void main(String[] args) throws Exception {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
    
        get("/Escenario_1", (req, res) -> {
            modelo = new EstadisticoModelo();
            return respuesta(1);
        });
        get("/Escenario_2", (req, res) -> {
            modelo = new EstadisticoModelo();
            return respuesta(2);
        });
        get("/Escenario_3", (req, res) -> {
            modelo = new EstadisticoModelo();
            return respuesta(3);
        });
        get("/Escenario_4", (req, res) -> {
            modelo = new EstadisticoModelo();
            return respuesta(4);
        });    
    }
    
    private static String respuesta(int escenario) throws Exception{
         switch(escenario){
             case 1:
                 cargue.escenario1(modelo); 
             break;
             case 2:
                 cargue.escenario2(modelo); 
             break;
             case 3:
                 cargue.escenario3(modelo); 
             break;
             case 4:
                 cargue.escenario4(modelo); 
             break;
         }
        return  "<br>Prueba Assignment Kit for Program 7 <br>" +
            " Prueba " + String.valueOf(escenario)
            + "<br><br><table border = '1'>"
            + "<tr>"
            + "<td> r (x,y) : " + String.valueOf(modelo.darr()) + "</td>"   
            +"</tr>"
            + "<tr>" 
            + "<td> r^2 : " + String.valueOf(modelo.darCorrelacion()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> Significancia : " + String.valueOf(modelo.darSignificancia()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> B0 : " + String.valueOf(modelo.darBeta0()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> B1 : " + String.valueOf(modelo.darBeta1()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> Yk : " + String.valueOf(modelo.darEstimacion()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> Rango : " + String.valueOf(modelo.darRango()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> UPI (70%) : " + String.valueOf(modelo.darUpi()) + "</td>"   
            +"</tr>"
            + "<tr>"
            + "<td> LPI (70%) : " + String.valueOf(modelo.darLpi()) + "</td>"   
            +"</tr>";
        }
}
