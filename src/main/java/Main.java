import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            }

            String[] parts = command.split(" ");
            int a = Integer.parseInt(parts[1]);

            try {
                int b = Integer.parseInt(parts[2]);

                switch (parts[0]) {
                    case "add":
                        System.out.println(calculator.add(a, b));
                        break;
                    case "subtract":
                        System.out.println(calculator.subtract(a, b));
                        break;
                    case "multiply":
                        System.out.println(calculator.multiply(a, b));
                        break;
                    case "divide":
                        System.out.println(calculator.divide(a, b));
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                switch (parts[0]) {
                    case "fibonacci":
                        System.out.println(calculator.fibonacciNumberFinder(a));
                        break;
                    case "binary":
                        System.out.println(calculator.intToBinaryNumber(a));
                        break;
                }
            }

        }
    }
}
