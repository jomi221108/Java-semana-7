/*
Escribe un programa que solicite al usuario una contraseña y que la verifique.
Si la contraseña es incorrecta, el programa debe seguir pidiendo la contraseña
hasta que el usuario ingrese la correcta. El ciclo debe terminar cuando se
ingrese la contraseña correcta, y el programa debe mostrar un mensaje de éxito.
 */
package Programas;
import java.util.Scanner;
public class Tarea2 {
    public static void main(String[] args){
        //Declarar variables
        String contra,contra2;
        int i=0;
        Scanner lectura=new Scanner(System.in);
        //Proceso de datos
        System.out.print("Ingrese la contraseña: ");
        contra=lectura.next();
        do{
            i++;
            System.out.print("Vuelva a ingresar la contraseña: ");
            contra2=lectura.next();
        }while(!contra.equals(contra2));
        //Salida de datos
        System.out.println("Usted ha accedido en "+i+" intentos");
    }
}
