import java.util.Scanner;

public class Step14_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = sc.nextInt();

        while (n<=5){
            System.out.println("n= "+n);
            n++;
        }
    }
}
