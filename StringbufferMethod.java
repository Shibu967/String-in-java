public class StringbufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shibu");
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());

    }

}
