//Ejercicio 2.26

//Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e 
//imprima el resultado.

import java.util.Scanner;


public class Ejercicio2_26
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Programa que determina si los numeros son multiplos");
        
        int num1;
        int num2;
        int temp;
        
        System.out.print("Ingrese el primer entero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo entero: ");
        num2 = entrada.nextInt();
        
        if(num2 > num1){
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        
        temp = num1 % num2;
        
        if(temp == 0){
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        }else{
            System.out.println("Los numeros no son multiplos");
        }
        entrada.close();
    }
    
}
