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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] ventas = new double[5];

        String[] dias = new String[5];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";

        String reporteFinal = "";

        System.out.println("INGRESE LOS VALORES DE VENTA DE HOY");
        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("Ingrese el valor de venta para el día %s: ", dias[i]);
            ventas[i] = entrada.nextDouble();
        }

        for (int i = 0; i < ventas.length; i++) {

            reporteFinal = String.format("%s- %s $%.0f\n",
                    reporteFinal,
                    dias[i],
                    ventas[i]
            );
        }

        System.out.print(reporteFinal);

    }
}


