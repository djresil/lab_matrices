package com.company;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        boolean salir = false;
        boolean rellenado = false;
        int fila, columna;
        int opcion;
        do {
            System.out.println("menu");
            System.out.println("1. Rellanar matriz");
            System.out.println("2.Sumar Fila");
            System.out.println("3. Sumar Columna");
            System.out.println("4. Sumar Diagonal Principal");
            System.out.println("5. Sumar Diagonal Inversa");
            System.out.println("6. Media de los Elementos General");
            System.out.println("7. Salir");
            System.out.println("8. Ver matriz");

            System.out.println("Ingrese un numero de opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        do {
                            System.out.println("elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println(" la suma de los valores de la fila: " + fila + "  es :  " + sumarFila(matriz, fila - 1));
                    } else {
                        System.out.println("debes rellenar la matriz primero");

                    }
                    break;
                case 3:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una Columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("la suma de la columna:" + columna + " es :" + sumarColumna(matriz, columna - 1));
                    }
                    break;

                case 4:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal principal es : " + sumarDiagPrin(matriz));
                    } else {
                        System.out.println("debes rellenar la matriz primero");
                    }

                    break;

                case 5:
                    System.out.println("la suma de la diagonal inversa es :" + sumaDiagInver(matriz));
                    break;

                case 6:
                    System.out.println("esta es la media de los elemntos de la matriz: " + mediaMatriz(matriz) / matriz.length * matriz.length);

                case 7:
                    salir = true;
                    break;
                case 8:
                    if (rellenado) {
                        System.out.println(imprimir(matriz));

                        System.out.println();

                    } else {
                        System.out.println("debes rellenar la matriz primero");
                    }
                    break;
                default:
                    System.out.println("ingrese un valor valido");
            }

        } while (!salir);
    }

    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    public static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int sumarDiagPrin(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static int sumaDiagInver(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j == matriz.length - 1) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static int mediaMatriz(int[][] matriz) {
        int media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                media += matriz[i][j];
            }
        }
        return media;
    }

    public void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }

        }

    }
}
