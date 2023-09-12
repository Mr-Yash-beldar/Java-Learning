public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELLO");

        sb.append("java");
        System.out.println(sb);
        sb.insert(1, "programming");
        System.out.println(sb);
        sb.replace(0, 4, "Eclipse");
        System.out.println(sb);
        sb.delete(4, 7);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
    }
}
