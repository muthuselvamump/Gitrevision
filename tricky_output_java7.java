public class tricky_output_java7 {
    public static void main(String[] args) {
        Object obj = new Integer(3);
        String s = (String) obj;// runtime error integer cannot type cast string
        System.out.println(s);

    }
}