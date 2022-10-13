import java.util.Scanner;

import fibRecursion.ComputeFib;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input a number to perform the Fibonacci Sequence: ");
        System.out.println(ComputeFib.fibonacci(scnr.nextInt()));
    }
}
