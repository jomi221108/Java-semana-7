/*
Crea un programa que genere un número aleatorio entre 1 y 100. El programa debe
pedir al usuario que adivine el número. Si el número ingresado es incorrecto,
debe indicar si es mayor o menor que el número aleatorio. El ciclo debe
continuar hasta que el usuario adivine el número correcto.
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
            System.out.println("Adivina el número que estoy pensando entre 1 y 100");
            do {
                i++;
                System.out.println("Ingresa el número que creas que pienso: ");
                intento = lectura.nextInt();
                if (intento>aleatorio){
                    System.out.println("El número es menor. Intenta de nuevo.");
                } else if (intento<aleatorio){
                    System.out.println("El número es mayor. Intenta de nuevo.");
                }
            }while (intento != aleatorio);
        //Salida de datos
        System.out.println("¡Felicidades! Adivinaste el número correcto en "+i+" intentos");
    }
}
