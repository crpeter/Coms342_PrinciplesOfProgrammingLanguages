package coms342;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first operator: ");
        int op1 = in.nextInt();
        System.out.print("Enter the second operator: ");
        int op2 = in.nextInt();
        System.out.print("Enter the symbol (+ or -): ");
        String symbol = in.next();

        Operations op = new Operations();
        if (symbol.equals("+")) {
            System.out.println(op1 + " + " + op2 + " = " + op.plus(op1, op2));
        } else if (symbol.equals("-")) {
            System.out.println(op1 + " - " + op2 + " = " + op.minus(op1, op2));
        } else {
            System.err.println("Wrong symbol");
        }
    }
}
