/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class AreaPoligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de inicializacion de variable
        
        double A, B, C, D, lc, at, ar, ats, areaTotal;
                
        A = 0; B = 0; C = 0; D = 0; lc = 0; at = 0; ar = 0; ats = 0; areaTotal = 0;

        System.out.println("--------");
          
        Scanner leer = new Scanner(System.in);
        //Entrada y salida de Datos
        System.out.println("Ingrese la altura del paralelogramo");
        lc = leer.nextDouble();
        System.out.println("Ingrese el largo del rectangulo");
        at = leer.nextDouble();
        System.out.println("Ingrese a la altura del rectangulo");
        ar = leer.nextDouble();
        //Proceso
        A = Math.pow(lc,2);
        B = (lc*at)/ 2;
        ats = B*3;
        D = lc*ar;
        areaTotal = A+B+ats;
        //Salida
        System.out.println("Area Total del paralelogramo: " +areaTotal+
                "compuesto por un cuadrado de lado" +A+
                "area del triangulo" +B+
                "area del rectangulo" +D);
                

    }
    
}
