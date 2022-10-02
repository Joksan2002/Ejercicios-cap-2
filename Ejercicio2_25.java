//Ejercicio 2.25
//Escriba una aplicación que lea un entero y que determine e imprima si es impar o par

import java.util.Scanner;


public class Ejercicio2_25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int resd;
        
        System.out.println("Determinacion si un numero es par o impar");
        System.out.print("Ingrese el numero entero: ");
        num = entrada.nextInt();
        
        resd = num % 2;
        
        if(resd == 0){
            System.out.println("El numero " + num + " es un numero par.");
        }else{
            System.out.println("El numero " + num + " es un numero impar");
        }
        entrada.close();
    }
    
}
