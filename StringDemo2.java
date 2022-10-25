public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shibu");
        String s2 = new String(sb);// immutable
        System.out.println(s2);
    }

}
