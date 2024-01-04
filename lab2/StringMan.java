package lab2;

/**
 * Lab Exercise -2.1
 * String Manipulation
 * Write a Java Program to implement the methods from String with the given
 * text.
 */
public class StringMan {
    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the\r\n" + //
                "surrounding villages were still suffering. It became our goal to uplift their\r\n" + //
                "quality of life as well. I remember seeing a family of 4 on a motorbike in the\r\n" + //
                "heavy Bombay rain — I knew I wanted to do more for these families who were\r\n" + //
                "risking their lives for lack of an alternative The alternative mentioned here\r\n" + //
                "is the Tata Nano, which soon after came as the world’s cheapest car on retail\r\n" + //
                "at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a\r\n" + //
                "recent post by Humans of Bombay which formed the basis of his decision to come\r\n" + //
                "up with a car like Tata Nano.";
        String text2 = "hello";
        System.out.println("String charAt(): " + text.charAt(25));
        System.out.println("String compareTo(): " + text.compareTo(text2));
        System.out.println("String concat(): " + text.concat(text2));
        System.out.println("String contains(): " + text.contains(text2));
        System.out.println("String endsWith(): " + text.endsWith(text2));
        System.out.println("String equals(): " + text.equals(text2));
        System.out.println("equalsIgnoreCase(): " + text.equalsIgnoreCase(text2));
        System.out.println("String format(): " + String.format("Hello %s", text2));
        System.out.println("String getBytes(): " + text.getBytes());
        char dest[] = new char[20];
        text.getChars(2, 20, dest, 0);
        System.out.println("String getChars(): ");
        System.out.println(dest);
        System.out.println("String indexOf(): " + text.indexOf(text2));
        System.out.println("String intern(): " + text.intern());
        System.out.println("String isEmpty(): " + text.isEmpty());
        System.out.println("String join(): " + text.join(" > ", text2, "Hello"));
        System.out.println("String lastIndexOf(): " + text.lastIndexOf("words"));
        System.out.println("String length(): " + text.length());
        System.out.println("String replace(): " + text.replace(text2, "Bata"));
        System.out.println("String replaceAll(): " + text.replaceAll("Bata", " "));
        System.out.println("String split(): " + text.split("\\n"));
        System.out.println("String startsWith(): " + text.startsWith("L"));
        System.out.println("String substring(): " + text.substring(25));
        System.out.println("String toCharArray(): ");
        System.out.println(text.toCharArray());
        System.out.println("String toLowerCase(): " + text.toLowerCase());
        System.out.println("String toUpperCase(): " + text.toUpperCase());
        System.out.println("String trim(): " + text.trim());
        System.out.println("String valueOf(): " + String.valueOf(text2));
    }
}