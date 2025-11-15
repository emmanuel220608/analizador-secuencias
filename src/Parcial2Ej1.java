import java.util.Scanner;

public class Parcial2Ej1 {
    // Lee y retorna un arreglo de tamaño n.
public static int[] leerArreglo(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[n];
        
        System.out.println("Introduce " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        return arreglo;
    }

    // Retorna true si x es primo (> 1).
    public static boolean esPrimo(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // Devuelve cuántos primos hay en a.
    public static int contarPrimos(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (esPrimo(a[i])) {
                contador++;
            }
        }
        return contador;
    }

    // Devuelve el valor máximo del arreglo.
    public static int maximo(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Devuelve todas las posiciones donde aparece el máximo.
    public static int[] indicesDeMaximo(int[] a) {
        int max = maximo(a);
        int count = 0;

       
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                count++;
            }
        }

       
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                indices[index++] = i;
            }
        }
        return indices;
    }

    // Retorna true si el arreglo es igual al leerlo al derecho y al revés.
    public static boolean esCapicua(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int N = scanner.nextInt();

     
        if (N < 5 || N > 50) {
            System.out.println("El tamaño debe que ser entre 5 y 50");
            return;
        }
        
        int[] arreglo = leerArreglo(N);

       
        int cantidadPrimos = contarPrimos(arreglo);
        System.out.println("Cantidad de números primos es : " + cantidadPrimos);

        
        int max = maximo(arreglo);
        System.out.println("El valor máximo del arreglo es: " + max);

        int[] indicesMax = indicesDeMaximo(arreglo);
        System.out.print("Los indices donde esta el valor máximo: ");
        for (int i = 0; i < indicesMax.length; i++) {
            System.out.print(indicesMax[i] + " ");
        }
        System.out.println();

        
        boolean capicua = esCapicua(arreglo);
        if (capicua) {
            System.out.println("El arreglo es capicúa.");
        } else {
            System.out.println("El arreglo no es capicúa.");
        }

     }
   
}


