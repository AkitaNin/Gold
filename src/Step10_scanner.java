import java.util.Scanner;

public class Step10_scanner {
    public static void main(String[] args) {
        //Cần khởi tạo 1 đối tượng scanner
        Scanner sc = new Scanner(System.in);

        //Cho phép nhập chuỗi
        System.out.println("Password :");
        String pw1 = sc.nextLine();
        System.out.println("MK là:" +pw1);

        //Nhập số nguyên
        System.out.println("Input number: ");
        int pw2 = sc.nextInt();
        System.out.println("Number: "+pw2);

        //Nhập số thực
        System.out.println("Input Float: ");
        float pw3 = sc.nextFloat();
        System.out.println("Number: "+pw3);
        
    }
}
