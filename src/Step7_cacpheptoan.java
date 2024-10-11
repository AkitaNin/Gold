public class Step7_cacpheptoan {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //phép cộng
        System.out.println("a+b = " + (a + b));
        //gán biến
        int kq = a + b;
        System.out.println("a+b = " + kq);

        //phép trừ,nhân,chia lấy dư
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("a%b = " + (a % b));

        //phép chia bị sai số nên ép kiểu
        System.out.println("a/b = " + ((double)a / b));
    }
}
