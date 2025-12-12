/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10]; 
        double sumaTotal = 0; 
        double promedio;
        String reporteFinal = "";
        
        int tamano = numeros.length; 

        System.out.println("INGRESO DE 10 NÚMEROS");
        
        for (int i = 0; i < tamano; i++) {
            System.out.printf("Ingrese el número %d: ", i + 1);
            numeros[i] = entrada.nextDouble();
            sumaTotal = sumaTotal + numeros[i];
        }

        promedio = sumaTotal / 10;
        System.out.printf("\nEl promedio de los 10 números es: %.2f\n", promedio);

        System.out.println("\nREPORTE DE NÚMEROS Y DIFERENCIA");
        
        for (int i = 0; i < tamano; i++) {
            double diferencia = numeros[i] - promedio;
            
            reporteFinal = String.format("%sNúmero %.2f | Diferencia con el promedio (%.2f): %.2f\n", 
                    reporteFinal, 
                    numeros[i],   
                    promedio,
                    diferencia
            );
        }

        System.out.print(reporteFinal);
        

    }

}
