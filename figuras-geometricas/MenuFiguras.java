import java.util.Scanner;
public class MenuFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("\n1. Circulo\n2. Cuadrado\n3. Trapecio\n4. Triangulo\n0. Salir");
        System.out.print("Elige una opcion: ");
        opcion = sc.nextInt();
        double area = 0, perimetro = 0;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                area = Math.PI * radio * radio;
                perimetro = 2 * Math.PI * radio;
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado (base y altura son iguales): ");
                double lado = sc.nextDouble();
                area = lado * lado;
                perimetro = 4 * lado;
                break;
            case 3:
                System.out.println("Para el area del trapecio, introduce las dos bases y la altura.");
                System.out.print("Ingrese la base mayor del trapecio: ");
                double baseMayor = sc.nextDouble();
                System.out.print("Ingrese la base menor del trapecio: ");
                double baseMenor = sc.nextDouble();
                System.out.print("Ingrese la altura del trapecio: ");
                double alturaTrapecio = sc.nextDouble();
                System.out.print("Para el perimetro, ingrese el lado 1 del trapecio (no paralelo): ");
                double ladoT1 = sc.nextDouble();
                System.out.print("Ingrese el lado 2 del trapecio (no paralelo): ");
                double ladoT2 = sc.nextDouble();
                area = ((baseMayor + baseMenor) * alturaTrapecio) / 2;
                perimetro = baseMayor + baseMenor + ladoT1 + ladoT2;
                break;
            case 4:
                System.out.println("Para el area del triangulo, introduce la base y la altura.");
                System.out.print("Ingrese la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura correspondiente a esa base: ");
                double altura = sc.nextDouble();
                System.out.print("Para el perimetro, ingrese el lado 1 del triangulo (distinto de la base): ");
                double lado1 = sc.nextDouble();
                System.out.print("Ingrese el lado 2 del triangulo (distinto de la base): ");
                double lado2 = sc.nextDouble();
                area = base * altura / 2;
                perimetro = base + lado1 + lado2;
                break;
            default:
                System.out.println(opcion == 0 ? "Hasta luego!" : "Opcion no valida.");
        }
        if (opcion >= 1 && opcion <= 4) {
            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
        }
        sc.close();
    }
}
