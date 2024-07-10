import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("two positive integers: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();



        System.out.println(GCD(n1,n2));

    }

    public static int GCD(int n1, int n2){
        int smallest = Math.min(n1, n2);
        int gcd = 1;

        for (int i = 2; i < smallest; i++){
            if(n1 % i == 0 && n2 % i == 0){
                if(i > gcd){
                    gcd = i;
                }
            }
        }

        return gcd;
    }
}