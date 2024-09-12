
/* Como parte de su aprendizaje autónomo se solicita elaborar un programa que permita solicitar números hasta que se
   teclee uno negativo, y mostrar cuántos números se han introducido, para lo cuál debe tomar en cuenta las siguientes 
   consideraciones del algoritmo:

   Se debe imprimir en pantalla todos los ingresos hasta que cumpla la condición del número negativo.
   Para la solución puede hacer uso de instrucciones o estructuras de repetición que se ejecutan hasta que se cumpla 
   una condición específica, así como el uso de contadores en la programación.*/
/**
 *
 * @author Byron
 */
package Clase2;

import java.util.Scanner;

public class Tarea8 
{
    public static void main(String[] arg)
    {
        boolean inicio = true;
        Scanner ingreso = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        while(inicio)
        {
            System.out.print("Ingrese un numero: ");
            numero = ingreso.nextInt();
            if(numero >= 0)
            {
                contador++;
            }
            else
                inicio = false;
        }
        System.out.println("Usted ingreso "+contador+ " veces un numero positivo");

    }
}
