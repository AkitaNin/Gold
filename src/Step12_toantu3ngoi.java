import java.util.Scanner;
import java.util.SortedMap;

public class Step12_toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số n: ");
//        int n = sc.nextInt();
//        //Nhập và đọc giá trị nhập vào
//
//        //sử dụng toán tử 3 ngôi
//        String kq = (n%2 ==0)? "Chẵn" : "Lẻ";
//        System.out.println("Số" +n+ "là " +kq);
        System.out.println("Nhập điểm: ");
        double d = sc.nextDouble();

        String result = (d >= 8)? "Giỏi" : ((d<8 && d>=6.5)?"Khá" :(d>=5 && d<6.5)?"TB":"Yếu" );
        System.out.println("Điểm "+d+ " Xếp loại: " +result);

    }
}
