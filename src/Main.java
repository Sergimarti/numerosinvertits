import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int []num  = new int[6];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i <= 5; i++) {

            System.out.println("escribe el numero en la posicion " +i);
            int numero = sc.nextInt();
            num[i] = numero;
        }
        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.println(num[i]);
            
        }







        }



    }

