import java.util.Scanner;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menú ===");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Esfera");
            System.out.println("5. Pirámide");
            System.out.println("6. Cubo");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            Figura figura;
            switch (opcion) {
                case 1:
                    figura = crearCirculo(scanner);
                    break;
                case 2:
                    figura = crearTriangulo(scanner);
                    break;
                case 3:
                    figura = crearCuadrado(scanner);
                    break;
                case 4:
                    figura = crearEsfera(scanner);
                    break;
                case 5:
                    figura = crearPiramide(scanner);
                    break;
                case 6:
                    figura = crearCubo(scanner);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
                    continue;
            }

            figura.calcularArea();
            figura.calcularPerimetro();
            figura.calcularVolumen();

            System.out.println(figura.toString());
        }
    }

    private static Circulo crearCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        return new Circulo(radio);
    }

    private static Triangulo crearTriangulo(Scanner scanner) {
        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();
        return new Triangulo(lado1, lado2, lado3);
    }

    private static Cuadrado crearCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        return new Cuadrado(lado);
    }

    private static Esfera crearEsfera(Scanner scanner) {
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        return new Esfera(radio);
    }

    private static Piramide crearPiramide(Scanner scanner) {
        System.out.print("Ingrese la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        return new Piramide(base, altura);
    }

    private static Cubo crearCubo(Scanner scanner) {
        System.out.print("Ingrese la longitud de un lado del cubo: ");
        double lado = scanner.nextDouble();
        return new Cubo(lado);
    }
}