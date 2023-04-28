/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_diegocruz;
import java.util.Scanner;

/**
 *
 * @author dfcm9
 */
public class Lab2P1_DiegoCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean continuar = true;
        while (continuar){
            System.out.println("Menu");
            System.out.println("1. Ejercicio 1 - Clasificacion de Numeros");
            System.out.println("2. Ejercicio 2 - Aproximando Pi");
            System.out.println("3. Ejercicio 3 - MCD");
            System.out.println("4. Salir del menu.");
            System.out.println("Ingrese una opcion:");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                {
                    System.out.println("Ingrese el numero que desea evaluar:");
                    int numero = sc.nextInt();
                    while (numero <=0){
                        System.out.println("Ingrese un numero positivo.");
                        numero = sc.nextInt();
                    }
                    boolean par = true;
                    boolean primo = true;
                    int contprimo = 0;
                    int contprimo2 = 1;
                    if (numero % 2 != 0){
                        par = false;
                    }//fin if 1
                    while (contprimo2 <= numero){
                        if (numero % contprimo2 == 0){
                            contprimo ++;
                        }
                        contprimo2 ++;
                    }
                    if (contprimo > 2){
                        primo = false;
                    }
                    if (par && primo){
                        System.out.println("El numero ingresado es par y primo");
                    }
                    else if (par){
                        System.out.println("El numero ingresado es par");
                    }
                    else if (primo){
                        System.out.println("El numero ingresado es impar y primo");
                    }
                    else{
                        System.out.println("El numero ingresado es impar");
                    }
                }// fin case 1
                break;
                case 2:
                {
                    System.out.println("Ingrese la precision del calculo:");
                    int numero = sc.nextInt();
                    while (numero <= 0){
                        System.out.println("Ingrese un numero positivo.");
                        numero = sc.nextInt();
                    }
                    double i = 1;
                    double acumulador = 1;
                    while (i<=numero){
                        double potmult = 4* Math.pow(i,2);
                        double potmultrest = potmult - 1;
                        double potmultrestdiv = potmult / potmultrest;
                        acumulador = acumulador*potmultrestdiv;
                        i++;
                       
                    }// fin while acumulador
                    acumulador = acumulador*2;
                    System.out.println("PI: " + acumulador);
                }
                break;
                case 3:
                {
                    System.out.println("Ingrese A: ");
                    int A = sc.nextInt();
                    while (A<=0){
                        System.out.println("Los numeros ingresados deben ser positivos.");
                        A = sc.nextInt();
                    }
                    System.out.println("Ingrese B: ");
                    int B = sc.nextInt();
                    while (B<=0){
                        System.out.println("Los numeros ingresados deben ser positivos.");
                        B = sc.nextInt();
                    }
                    int num1 = A;
                    int num2 = B;
                    while (A != B){
                        if (A > B){
                            A = A - B;
                        }
                        else {
                            B = B - A;
                        }
                    }
                    System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + A);
                }// fin case 3
                break;
                default:
                    continuar = false;
            }// fin del switch
        }
        
        
        
        // TODO code application logic here
    }
    
}
