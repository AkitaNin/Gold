import java.util.Scanner;

public class Step17_BT14 {
    public static void main(String[] args) {
        /* viết ctrinh tính toán từ 10 --> 50
        Liệt kê tất cả các số chia hết cho 3
               */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời cho số n: ");
        int n = sc.nextInt();
        for (int a = n ; a <=50 ;  a++){
            if(a%3 ==0)
                System.out.print(a+" ");
        }
    }
}
