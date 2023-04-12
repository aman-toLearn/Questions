import java.util.Scanner;

public class someOfeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        while (n / 10 != 0) {
            int m = n % 10;
int sum = 0;
            if (m / 2 == 0) {

                n = n/10;
                sum = sum + m;
            }
//
            System.out.println(sum);

n = n/10;
        }

       // System.out.println(sum);
    }}
