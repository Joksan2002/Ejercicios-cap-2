//Ejercicio 2.8
//b) Asignar el producto de las variables b y c a la variable a.

import java.util.Scanner;


public class Ejercicio2_8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int b;
        int c;
        int a;

        System.out.print("Ingrese el primer numero: ");
        b = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        c = entrada.nextInt();

        a = b * c;

        System.out.printf("El producto de los dos numeros son: %d%n", a);
        entrada.close();
    }
       
}
