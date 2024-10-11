import java.util.Scanner;

public class Step11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điểm: ");
        double dtb = sc.nextDouble();

        //Kiểm tra điều kiện
        if( dtb >= 8.0) { // điều kiện ntn thì chạy lệnh bên dưới
            System.out.println("PASSED");
            System.out.println("OK");
        }// từ 2 lệnh trở lên cần đóng mở {}
        else if (dtb <=7 && dtb >5)
            System.out.println("MÉM COOK");
        else
            System.out.println("COOK");
    }
}
