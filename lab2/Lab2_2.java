
package lab2;

import java.io.*;

/*
 * Write a Java program to create String using StringBuffer class and implement the following methods .
1. append()
2. insert()
3. replace()
4. delete()
5. charAt()
6.setCharAt()
7.length()
8.capacity()
9.ensureCapacity()
10.toString()
11.substring(int start)
12. substring(int start, int end)
 */
public class Lab2_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println("1. append(): " + sb);
        sb.insert(1, "Java");
        System.out.println("2. insert(): " + sb);
        sb.replace(1, 3, "Java");
        System.out.println("3. replace(): " + sb);
        sb.delete(1, 4);
        System.out.println("4. delete(): " + sb);
        System.out.println("5. charAt(): " + sb.charAt(0));
        sb.setCharAt(1, 'o');
        System.out.println("6.setCharAt(): " + sb);
        System.out.println("7.length(): " + sb.length());
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("McaB");
        System.out.println("8.capacity(): ");
        System.out.println(sb.capacity());
        sb.ensureCapacity(25);
        System.out.println("9.ensureCapacity(): " + sb);
        System.out.println("10.toString(): " + sb.toString());
        System.out.println("11.substring(int start): " + sb.substring(5));
        System.out.println("12. substring(int start, int end): " + sb.substring(5, 8));

    }

}
