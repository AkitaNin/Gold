public class Step18_forlongnhau {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        // Vẽ N
        /*for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || j == i) {
                    System.out.print(i + "" + j + "\t");
                } else
                    System.out.print(" "+"\t");
            }*/
       /* for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == 7 || i == 1) {
                    System.out.print(i + "" + j + "\t");
                } else
                    System.out.print(" "+"\t");
            }*/
         for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                /*if (j == 1 || j == 7 || i == 7 || i == 1) {
                    System.out.print(i + "" + j + "\t");
                } else*/
                    System.out.print(i + "" + j + "\t");
            }
            System.out.println("");//ngăn cách từng dòng của i
        }
    }
}