public class StringConversions {
    public static void main(String[] args) {
        String name = "Shibu";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());// 1
        int a = 10, b = 20;
        System.out.println(a + b);
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        System.out.println(s1 + s2);
    }

}
