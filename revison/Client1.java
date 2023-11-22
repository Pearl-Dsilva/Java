
public class Client1 {
    static void doCalc(byte... a) {
        System.out.print("byte...");
    }

    static void doCalc(long a, long b) {
        System.out.print(a + " " + " " + b);
    }

    static void doCalc(Byte s1, Byte s2) {
        System.out.print("Byte, Byte");
    }

    public static void main(String[] args) {
        byte b = 8;
        doCalc(b, b);
    }
}
