public class Test5 {
    public static String Test5() {
        String s = "Fred";
        s = s + "47";
        s = s.substring(2, 5);
        s = s.toUpperCase();
        return s.toString();
    }

    public static void main(String[] args) {
        String res = Test5();
        System.out.println(res);
    }
}
