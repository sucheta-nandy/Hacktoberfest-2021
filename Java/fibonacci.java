import java.util.Scanner;

public class Main {
    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return(fib(n-1) + fib(n-2));
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n >=0 && n <= 40) {
            System.out.println(fib(n));
        }
    }
}
