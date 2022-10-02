//Ejercicio 2.15

//Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números
//del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.
//Use las técnicas que se muestran en la figura 2.7.


import java.util.Scanner;


public class Ejercicio2_15
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        int producto;
        int diferencia;
        double cociente1;
        double cociente2;
        
        System.out.print("Digite el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite el segundo entero: ");
        numero2 = entrada.nextInt();
        suma = numero1 + numero2;

        producto = numero1 * numero2;
        
        cociente1 = numero1 / numero2;
        cociente2 = numero2 / numero1;
        
        System.out.println("La suma de los numero es: " + suma);
        System.out.println("El producto de los numeros es: " + producto);
        if(numero1 > numero2)
        {
            diferencia = numero1 - numero2;
            System.out.println("La diferencia de " + numero1 + " - " + numero2 + " es: " + diferencia);
        }
            else{
                 diferencia = numero2 - numero1;
                 System.out.println("La diferencia de " + numero2 + " - " + numero1 + " es: " + diferencia);
                }
        System.out.println("El cociente de " + numero1 + " / " + numero2 + " es: " + cociente1);
        System.out.println("El cociente de " + numero2 + " / " + numero1 + " es: " + cociente2);    
         entrada.close();  
    } 
}
