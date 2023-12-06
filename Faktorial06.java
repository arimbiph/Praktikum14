import java.util.Scanner;
 public class Faktorial06 {
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);  
            
        }
    }

     public static int faktorialInterative(int n) {
        int hasil = 1;

        for (int i = n; i >= 1; i--) {
            hasil = hasil * i;
        }

        return hasil;

    }

     public static void main(String[] args) {
        System.out.println(faktorial(5));
        System.out.println(faktorialInterative(5));
     }
 }     
     
    

     