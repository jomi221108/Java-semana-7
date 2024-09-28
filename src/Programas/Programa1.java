/*
Crear un programa en Java que permita ingresar la edad,
sexo de las personas y preguntar al usuario si desea
continuar o finalizar con el proceso de registro de datos.
Visualizar la cantidad de alumnos y el promedio de edad,
y la cantidad de alumnos de sexo masculino y femenino.
 */
package Programas;
import java.util.Scanner;
public class Programa1 {
    public static void main(String[] args){
        //Declarar variables
        int edad,i=0,edadtotal=0,masc=0,fem=0;
        String sexo,opc;
        double promedades;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        
        //Proceso de datos
        do{
            System.out.print("Ingrese la edad de la "+(i+1)+"° persona: ");
            edad=lectura.nextInt();
            System.out.print("Ingrese el sexo de la "+(i+1)+"° persona (M o F): ");
            sexo=lectura.next();
            if(sexo.equals("M")){
                masc++;
            }else{
                fem++;
            }
            System.out.print("¿Desea continuar? [S o N}: ");
            opc=lectura.next();
            edadtotal=edadtotal+edad;
            i++;
        } while(opc.equals("S"));
        promedades=edadtotal/i;
        //Salida de datos
        System.out.println("La cantidad de alumnos ingresados fueron "+i);
        System.out.println("La cantidad de alumnos de sexo masculino fue de: "+masc);
        System.out.println("La cantidad de alumnos de sexo femenino fue de: "+fem);
        System.out.println("El promedio de edades ingresado es de: "+promedades);
    }
}
