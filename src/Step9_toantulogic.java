public class Step9_toantulogic {
    public static void main(String[] args) {
        int i = 17;
        //Kiểm tra giá trị i >0 và i <10 ko
        System.out.println(i>0 && i<10);

        //Kiểm tra i > 10 hoặc i < -1
        System.out.println(i>10 || i<-1);

        //Toán tử tiền và hậu tố
        int x = 100, y = 90, z = 80, t = 70;
        x++; // x = x +1 tăng x lên 1 giá trị
        ++y; // y = y +1 tăng y lên 1 giá trị
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        /*
        a++ là postfix
        ++a là prefix
        thứ tự các phép toán :
        1.Prefix --> các phép toán còn lại --> gắn giá trị cho biến bên trái dấu = rồi --> Postfix
         */

    }
}
