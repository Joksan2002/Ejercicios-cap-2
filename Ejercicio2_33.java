//Ejercicio 2.33

import java.util.Scanner;


public class Ejercicio2_33 
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double peso;
        double altura;
        double ibm;
        
        System.out.println("Calculadora del indice de masa corporal\n");
        
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = entrada.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        altura = entrada.nextDouble();
        
        ibm = peso / (altura * altura);
        
        System.out.println("\nSu indice de masa corporal es: " + ibm);
        
        System.out.println("\n\nVALORES DE BMI");
        System.out.println("Bajo peso  : menos de 18.5");
        System.out.println("Normal     : entre 18.5 y 24.9");
        System.out.println("Sobrepeso  : entre 25 y 29.9");
        System.out.println("Obeso      : 30 o mas");
        entrada.close();
    }
    
}
