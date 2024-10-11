public class Step19_trycatch {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int t = a/b;
            System.out.println(t);
        }
        catch (Exception ex){
            System.out.println("BUG");
            ex.printStackTrace();
        }
        System.out.println("HELLOWRODL");
    }
}
