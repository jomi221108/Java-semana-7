/*
Escribe un programa que pida al usuario ingresar n�meros enteros y
sume esos n�meros. El ciclo debe continuar hasta que el usuario ingrese
un cero, momento en el cual el programa debe imprimir la suma total
de los n�meros ingresados.
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
            System.out.print("Ingrese el "+i+"� n�mero a sumar (0 para terminar): ");
            num=lectura.nextInt();
            suma=suma+num;
        }while(num!=0);
        //Salida de datos
        System.out.println("La suma de los "+(i-1)+" n�meros ingresados es: "+suma);
    }
}
