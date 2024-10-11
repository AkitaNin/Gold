import java.util.Scanner;

public class Step17_BT13 {
    public static void main(String[] args) {
        /*viết ctrinh nhập sô n
        nếu chẵn tính tổng, lẻ thì in ra bye bye
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();

        int kq = 0;
        //viết hàm tìm số chẵn
        if (n%2 !=0){ // nếu n chia 2 số đư = 0 là chẵn, != 0 là khác 0
            System.out.println("Số "+n+ " là số chẵn");
            for (int i =1; i<=n;i+=2){
                System.out.println(i);
                if (i==3){
                    //continue;
                    break;
                }else
                    kq+=i;
            }
            System.out.println("Tổng số lẻ: "+kq);
        }else {
            System.out.println("Số "+n+" là số chẵn");
            System.out.println("Không tính số chẵn bye bye");
        }
    }
}
