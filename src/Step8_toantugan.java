public class Step8_toantugan {
    public static void main(String[] args) {
        //gán phép +
        int x1 = 10;
        x1+=5; // có nghĩa là x = x + 5
        System.out.println("x1 = " +x1);

        //gán phép -
        int x2 = 10;
        x2-=5; // có nghĩa là x = x - 5
        System.out.println("x2 = " +x2);

        //gán phép *
        int x3 = 10;
        x3*=5; // có nghĩa là x = x * 5
        System.out.println("x3 = " +(double)x3);

        //gán phép /
        int x = 10;
        x/=5; // có nghĩa là x = x / 5
        System.out.println("x4 = " + x);

        //Phép so sánh
        int a = 9 , b = 8;
        System.out.println(a==b);// 9 không thể = 8 nên false
        System.out.println(a!=b);// 9 khác 8 nên true
        System.out.println(a>b);// 9 lớn hơn 8 true
        System.out.println(a<b);// 9 không bé hơn 8 false
        System.out.println(a<=b);// 9 không bé hơn hoặc bằng 8 false
        System.out.println(a>=b);// 9 lớn hơn hoặc bằng 8 true


    }
}
