package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cantidadDeseada;
        int contador = 0;

        System.out.println("¿Cuántos elementos desea ingresar?");
        cantidadDeseada = entrada.nextInt();
        entrada.nextLine();

        String[] arregloMarcas = new String[cantidadDeseada];

        String marca;
        String primeraLetra;

        while (contador < cantidadDeseada) {

            System.out.printf("Ingrese la marca de vehículo (Elemento %d de "
                    + "%d válidos)\n",
                    (contador + 1), cantidadDeseada);
            marca = entrada.nextLine();

            primeraLetra = marca.toUpperCase().substring(0, 1);

            if (primeraLetra.equals("A") || primeraLetra.equals("C") || primeraLetra.equals("T")) {
                System.out.printf("Marca con '%s' (no fue considerada en el "
                        + "conteo).\n", primeraLetra);
            } else {
                arregloMarcas[contador] = marca;
                contador++;
            }
        }

        for (int i = 0; i < arregloMarcas.length; i++) {
            System.out.printf("Marca %d: %s\n", (i + 1), arregloMarcas[i]);
        }

    }
}
