import java.util.Scanner;

public class Step17_BT15 {
    public static void main(String[] args) {
        /* tính tổng s = 1! +2!+...10!
                 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giới hạn cần tính tổng gt: ");
        int k = sc.nextInt();

        int kq = 0;
        int gt = 1;

        for(int i = 1; i<=k; i++){
            gt*=i;
            kq+=gt;
        }
        System.out.println(kq);

    }
}
