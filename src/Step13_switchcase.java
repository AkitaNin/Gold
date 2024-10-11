import java.util.Scanner;

public class Step13_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int n = sc.nextInt();

        //Kiểm tra số dư
        int div = n%2;
        System.out.println(div);

        //sử dụng switch case
        switch (div){
            case 0:
                System.out.println(n+ " là số chẵn");
                break;
            default:
                System.out.println(n+ " là số lẻ");
                break;
        }
    }
}
