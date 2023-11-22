public class Test4 {
    public static void Test4(String str) {
        int check = 4;
        if (check == str.length()) {
            System.out.print(str.charAt(check -= 1) + ", ");
        } else {
            System.out.print(str.charAt(0) + ", ");
        }
    }

    public static void main(String[] args) {
        Test4("Four");
        Test4("tee");
        Test4("to");
    }

}
