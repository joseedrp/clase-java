import java.util.Scanner;

// Ejercicios de Estructuras de Control
public class EjerciciosEstructurasControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ejercicios de Estructuras de Control ===");

        // 1. Imprimir los numeros pares del 1 al 100 usando for.
        System.out.println("\n1. Numeros pares del 1 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Imprimir los numeros impares del 1 al 100 usando for.
        System.out.println("\n2. Numeros impares del 1 al 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Sumar los primeros 50 numeros naturales (del 1 al 50).
        System.out.println("\n3. Suma de los primeros 50 numeros naturales:");
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);

        // 4. Pedir un numero y mostrar su tabla del 1 al 10 usando for.
        System.out.println("\n4. Tabla de multiplicar:");
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + ((long) numero * i));
        }

        // 5. Calcular el factorial usando while. El factorial de 0 es 1.
        System.out.println("\n5. Factorial de un numero:");
        System.out.print("Introduce un numero entero entre 0 y 20: ");
        int numeroFactorial = scanner.nextInt();

        // Se limita a 20 porque los factoriales mayores no caben en un long.
        while (numeroFactorial < 0 || numeroFactorial > 20) {
            System.out.print("El numero debe estar entre 0 y 20. Intentalo de nuevo: ");
            numeroFactorial = scanner.nextInt();
        }

        long factorial = 1;
        int contador = 1;
        while (contador <= numeroFactorial) {
            factorial *= contador;
            contador++;
        }
        System.out.println(numeroFactorial + "! = " + factorial);

        // 6. Determinar el mayor de tres numeros usando if-else.
        System.out.println("\n6. Numero mayor de tres numeros:");
        System.out.print("Introduce el primer numero entero: ");
        int primero = scanner.nextInt();
        System.out.print("Introduce el segundo numero entero: ");
        int segundo = scanner.nextInt();
        System.out.print("Introduce el tercer numero entero: ");
        int tercero = scanner.nextInt();

        int mayor;
        if (primero >= segundo && primero >= tercero) {
            mayor = primero;
        } else if (segundo >= primero && segundo >= tercero) {
            mayor = segundo;
        } else {
            mayor = tercero;
        }
        System.out.println("El numero mayor es: " + mayor);

        scanner.close();
    }
}
