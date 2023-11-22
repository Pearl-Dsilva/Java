/*
Write a Java program to split a sentence in to array with the space delimiter.
“Betty bought some butter”
 */

public class SplitButter {
    public static void main(String[] args) {
        String text = "Betty bought some butter";
        String[] res = text.split(" ");
        System.out.println("The array is: ");
        for (String s : res) {
            System.out.println(s);
        }
    }
}