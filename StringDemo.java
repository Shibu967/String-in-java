public class StringDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shibu");
        String s2 = new String(sb);// immutable
        System.out.println(s2);
    }
}// parameter constructor