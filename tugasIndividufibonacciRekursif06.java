import java.util.Scanner;
public class tugasIndividufibonacciRekursif06 {
    public static void main(String[] args) {
                int n = 15;
                System.out.println("Bilangan fibonacci dari 0 sampai " + n + " adalah: ");
                for (int i = 1; i <= n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
            }
    
            public static int fibonacci(int n) {
                if (n == 1 || n == 2) {
                    return 1;
                } else {
                     return fibonacci(n - 1) + fibonacci(n - 2);
                }
        }
    }
    