import java.util.Scanner;

public class Step10_giaibaitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập r: ");//Nhập vào 1 số
        double r = sc.nextDouble();//đọc số nhập bên trên
        double cv = 2 * Math.PI * r;
        System.out.println("Chu vi hình tròn: " + cv);

        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Diện tích hình tròn: " + dt);

    }

}
