/*Write a Java program to display the time in human readable format like, hours:minutes:seconds. */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalTime timeString = LocalTime.now();
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm:ss");
        String hhmmss = timeString.format(parseFormat);
        System.out.println("Current time is: " + hhmmss);
    }
}