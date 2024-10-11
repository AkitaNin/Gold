import java.util.Scanner;

public class Step17_BT12 {
    public static void main(String[] args) {
       /* Viết ctrinh nhập vào số nguyên n, in ra kq n!
            dùng for
            dùng while*/

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Nhập vào n: ");
        int n = sc.nextInt();
        int time = 1;
        // khởi tạo i = 1 ; so sánh đk i <= n; vòng  lặp i tăng 1 gtri
        for(int i = 1; i <= n; i++){
            //System.out.println(i);
            time*=i;//khi i vẫn thõa dk thì thực hiện lấy giá tị của time * cho i
            //System.out.println(time);
            //khi i không thõa dk i <= n thì thoát vòng lặp
        }*/

        //dùng while
        int i = 1;
        int kq = 1;
        System.out.println("Mời nhập số n: ");
        int n = sc.nextInt();
        while(i<=n){
            kq*=i;
            i++;
        }
        System.out.println("Kết quả: "+kq);



        sc.close();
    }
}
