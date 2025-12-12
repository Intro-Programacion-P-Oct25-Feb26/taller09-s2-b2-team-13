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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] cafes = new String[3];
        cafes[0] = "Cafe tradicional";
        cafes[1] = "Cafe aleman";
        cafes[2] = "Cafe frances";

        double precios[] = new double[3];
        precios[0] = 1.5;
        precios[1] = 2.1;
        precios[2] = 2.3;

        String acumulador = "";
        boolean continuar = true;
        while (continuar) {

            System.out.println("====MENÚ DE CAFES====");
            System.out.println("1. Cafe Tradicional = 1.50");
            System.out.println("2. Cafe Aleman = 2.10");
            System.out.println("3. Cafe Frances = 2.30");
            System.out.println("Seleccione una Opcion");
            int opcion = entrada.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opcion no valida");
                continue;
            }
            int index = opcion - 1;

            System.out.println("Cuantas tasas desea comprar??");
            int tazas = entrada.nextInt();

            double totalPedido = tazas * precios[index];

            acumulador += String.format(
                    "%s | %d tazas | $%.2f c/u | Total: $%.2f%n",
                    cafes[index],
                    tazas,
                    precios[index],
                    totalPedido
            );

            System.out.println("Desea hacer otro pedido (s/n): ??");
            entrada.nextLine();
            String respuesta = entrada.nextLine();


             if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;

            }
        }
        System.out.println("\n========== REPORTE FINAL ==========");
        System.out.println(acumulador);

    }

}
