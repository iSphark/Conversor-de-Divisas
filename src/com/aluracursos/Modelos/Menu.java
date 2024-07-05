package com.aluracursos.Modelos;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void menuDivisas() throws IOException, InterruptedException {
        int opcion = 0;
        do {
            Scanner scannerMenu = new Scanner(System.in);
            System.out.println("**************************************************************");
            System.out.println("*              --Seleccione la opción deseada--              *");
            System.out.println("**************************************************************");
            System.out.println("* (1)  Convertir Dolar EE.UU. (USD) -> Euro (EUR)            *");
            System.out.println("* (2)  Convertir Euro (EUR) -> Dolar EE.UU. (USD)            *");
            System.out.println("* (3)  Convertir Peso Mexicano (MXN) -> Dolar EE.UU. (USD)   *");
            System.out.println("* (4)  Convertir Dolar EE.UU. (USD) -> Pesos Mexicano (MXN)  *");
            System.out.println("* (5)  Convertir Pesos Mexicano (MXN) -> Euro (EUR)          *");
            System.out.println("* (6)  Convertir Euro (EUR) -> Peso Mexicano (MXN)           *");
            System.out.println("* (7)  Convertir Peso Argentino (ARS) -> Dolar EE.UU. (USD)  *");
            System.out.println("* (8)  Convertir Dolar EE.UU (USD) -> Peso Argentino (ARS)   *");
            System.out.println("* (9)  Convertir Peso Argentino (ARS) -> Peso Mexicano (MXN) *");
            System.out.println("* (10) Convertir Peso Mexicano (MXN) -> Peso Argentino (ARS) *");
            System.out.println("* (11) Convertir Peso Argentino (ARS) -> Euro (EUR)          *");
            System.out.println("* (12) Convertir Euro(EUR) -> Peso Argentino (ARS)           *");
            System.out.println("* (13) Ver historial de las comverciones                     *");
            System.out.println("* (14) ¡SALIR DE LA APLICACION!                              *");
            System.out.println("**************************************************************");

            try {
                opcion = scannerMenu.nextInt();
                if (opcion < 1 || opcion > 14) {
                    System.out.println("*****************************************");
                    System.out.println("* Seleccione una opción que sea válida  *");
                    System.out.println("*****************************************");
                    continue;
                }
                if (opcion == 14) {
                    break;
                }
                if (opcion == 13) {
                    CambiosDivisas.mostrarHistorial();
                    continue;
                }
            } catch (Exception e) {
                System.out.println("*****************************************");
                System.out.println("* Seleccione una opción que sea válida  *");
                System.out.println("*****************************************");
                scannerMenu.next();
                continue;
            }

            CambiosDivisas.casos(opcion);

        } while (opcion != 14);
        System.out.println("**********************************************");
        System.out.println("* -Gracias por usar el conversor de divisas- *");
        System.out.println("**********************************************");
        System.out.println("      ----Hecho por Miguel Arellano----");
    }
}