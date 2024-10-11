import java.util.ArrayList;
import java.util.List;

public class Step28_arraylistandHashmap {
    public static void main(String[] args) {
        //Khai báo arraylist
        ArrayList<Integer> lst = new ArrayList<>();
        //Khai báo với số lượng pt ban đâu
        ArrayList<Integer> lst1 = new ArrayList<>(5);
        //Khai báo với các pt ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(List.of(1,5,7,10));

        //xuất
        System.out.println(lst);
        System.out.println(lst1);
        System.out.println(lst2);

        ArrayList<Integer> lst3 = new ArrayList<>(5);
        lst3.add(1);
        lst3.add(5);
        lst3.add(9);
        System.out.println(lst3);

        lst3.add(1,0);
        lst3.add(1,11);
        System.out.println(lst3);
        System.out.println(lst3.size());




    }
}
