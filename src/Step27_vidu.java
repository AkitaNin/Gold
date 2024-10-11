import java.util.Arrays;
import java.util.Scanner;

public class Step27_vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số pt tối đa của mảng: ");
        int n = sc.nextInt();

        //tạo mạng có n phần tử do người dùng tạo
        int [] arrInt1 = new int[n];
        //nhập dữ liệu cho từng phần tử
        //n và arrInt1.length như nhau
        for (int i =0 ; i<arrInt1.length; i++){
            System.out.print("M["+i+"]= ");
            arrInt1[i] = sc.nextInt();
        }
        Arrays.sort(arrInt1);
        System.out.print(Arrays.toString(arrInt1));

        int [] arrInt5 = new int[]{2, 4, 6, 8};
        for(int i =0, j=arrInt5.length-1; i< j;i++, j--){
            int temp = arrInt5[i];
            arrInt5[i] = arrInt5[j];
            arrInt5[j] = temp;
            System.out.println("mảng sau: ");
            System.out.print(Arrays.toString(arrInt5));
        }

    }
}
