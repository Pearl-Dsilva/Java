public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())) {
            System.out.println("match1");
        } else if (sb.equals(s)) {
            System.out.println("Match");
        } else {
            System.out.println("no match");
        }
    }
}
