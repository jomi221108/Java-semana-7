/*
Escribe un programa que pida al usuario ingresar números enteros y
sume esos números. El ciclo debe continuar hasta que el usuario ingrese
un cero, momento en el cual el programa debe imprimir la suma total
de los números ingresados.
 */
package Programas;
import java.util.Scanner;
public class Tarea1 {
    public static void main(String[] args){
        //Declarar variables
        int num,suma=0,i=0;
        Scanner lectura=new Scanner(System.in);
        //Proceso de datos
        do{
            i++;
            System.out.print("Ingrese el "+i+"° número a sumar (0 para terminar): ");
            num=lectura.nextInt();
            suma=suma+num;
        }while(num!=0);
        //Salida de datos
        System.out.println("La suma de los "+(i-1)+" números ingresados es: "+suma);
    }
}
