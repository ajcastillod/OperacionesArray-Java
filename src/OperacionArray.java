import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Ingreso de valores al array
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break; // Salir del bucle si la entrada es válida
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                    scanner.next(); // Limpiar el buffer
                }
            }
        }

        int option;
        do {
            // Mostrar menú
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Mostrar el array original");
            System.out.println("2. Calcular la suma de los elementos");
            System.out.println("3. Buscar el número máximo y el número mínimo");
            System.out.println("4. Invertir el array");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            while (true) {
                try {
                    option = scanner.nextInt();
                    break; // Salir del bucle si la entrada es válida
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                    scanner.next(); // Limpiar el buffer
                }
            }

            switch (option) {
                case 1:
                    mostrarArray(array);
                    break;
                case 2:
                    calcularSuma(array);
                    break;
                case 3:
                    buscarMaximoMinimo(array);
                    break;
                case 4:
                    invertirArray(array);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 5);

        scanner.close();
    }

    // Método para mostrar el array
    private static void mostrarArray(int[] array) {
        System.out.print("Array original: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para calcular la suma de los elementos
    private static void calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

    // Método para buscar el número máximo y mínimo
    private static void buscarMaximoMinimo(int[] array) {
        int maximo = array[0];
        int minimo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo) {
                minimo = num;
            }
        }
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
    }

    // Método para invertir el array
    private static void invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        System.out.print("Array invertido: ");
        for (int num : arrayInvertido) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}