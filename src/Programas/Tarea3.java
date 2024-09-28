/*
Crea un programa que genere un n�mero aleatorio entre 1 y 100. El programa debe
pedir al usuario que adivine el n�mero. Si el n�mero ingresado es incorrecto,
debe indicar si es mayor o menor que el n�mero aleatorio. El ciclo debe
continuar hasta que el usuario adivine el n�mero correcto.
 */
package Programas;
import java.util.Random;
import java.util.Scanner;
public class Tarea3 {
    public static void main(String[] args){
        //Declarar variables
        Random random=new Random();
        int aleatorio=random.nextInt(100)+1,intento,i=0;
        Scanner lectura=new Scanner(System.in);
        //Proceso de datos
            System.out.println("Adivina el n�mero que estoy pensando entre 1 y 100");
            do {
                i++;
                System.out.println("Ingresa el n�mero que creas que pienso: ");
                intento = lectura.nextInt();
                if (intento>aleatorio){
                    System.out.println("El n�mero es menor. Intenta de nuevo.");
                } else if (intento<aleatorio){
                    System.out.println("El n�mero es mayor. Intenta de nuevo.");
                }
            }while (intento != aleatorio);
        //Salida de datos
        System.out.println("�Felicidades! Adivinaste el n�mero correcto en "+i+" intentos");
    }
}
