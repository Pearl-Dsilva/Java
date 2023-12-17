import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Program implements concept of multithreading with a class named Salary. 
// It has a method adder that reads the employee files containing various salary details like 
// basic salary, HRA, Allowances, Insurance premium, EPF etc. 
// Adds a bonus of 15% and shows the result.

class Salary {
    private String inFile, outFile;

    public Salary(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public void adder() throws IOException {
        int total = 0;
        float bonus = 0;
        String line = null;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
            while ((line = reader.readLine()) != null)
                total += Integer.parseInt(line);
        }

        bonus += total;

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
            writer.write(" ****** Employee Salary ****** \n");
            writer.write("Total: " + total + "\n");
            writer.write("After Bonus: " + (float) (bonus + bonus * 0.15) + "\n");
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        String[] inFiles = { "./emp1.txt", "./emp2.txt", "./emp3.txt", "./emp4.txt", "./emp5.txt", "./emp6.txt" };
        String[] outFiles = { "./totSal.emp1.txt", "./totSal.emp2.txt", "./totSal.emp3.txt", "./totSal.emp4.txt",
                "./totSal.emp5.txt", "./totSal.emp6.txt" };

        for (int i = 0; i < inFiles.length; i++) {
            final int j = i;
            new Thread() {
                @Override
                public void run() {
                    Salary salary = new Salary(inFiles[j], outFiles[j]);
                    try {
                        salary.adder();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };
            }.start();
        }
    }
}

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;

// class Adder {
// private String inFile, outFile;

// public Adder(String inFile, String outFile) {
// this.inFile = inFile;
// this.outFile = outFile;
// }

// public void doAdd() throws IOException {
// int total = 0;
// String line = null;

// try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
// while ((line = reader.readLine()) != null)
// total += Integer.parseInt(line);
// }

// try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
// writer.write("Total: " + total);
// }
// }
// }

// class AddBonus {
// private String inFile, outFile;

// public AddBonus(String inFile, String outFile) {
// this.inFile = inFile;
// this.outFile = outFile;
// }

// public void doAdd() throws IOException {
// int total = 0;
// int bonus = 20000;
// String line = null;

// try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
// while ((line = reader.readLine()) != null)
// total += Integer.parseInt(line);

// bonus = total + bonus;
// }

// try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
// writer.write("After Bonus: " + bonus);
// }
// }
// }

// public class Employee {
// public static void main(String[] args) {
// String[] inFiles = { "./emp1.txt", "./emp2.txt", "./emp3.txt", "./emp4.txt",
// "./emp5.txt", "./emp6.txt" };
// String[] outFiles = { "./totSal.emp1.txt", "./totSal.emp2.txt",
// "./totSal.emp3.txt", "./totSal.emp4.txt",
// "./totSal.emp5.txt", "./totSal.emp6.txt" };

// for (int i = 0; i < inFiles.length; i++) {
// final int j = i;
// new Thread() {
// @Override
// public void run() {
// Adder adder = new Adder(inFiles[j], outFiles[j]);
// AddBonus addBonus = new AddBonus(inFiles[j], outFiles[j]);
// try {
// adder.doAdd();
// addBonus.doAdd();

// } catch (IOException e) {
// e.printStackTrace();
// }
// };
// }.start();

// }
// }
// }