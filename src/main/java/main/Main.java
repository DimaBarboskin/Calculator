package main;

import java.util.Scanner;

/**
 * There is my first task, which names "Calculator"
 *
 * @author Dmitry Rogoza
 */
public class Main {
    public static void main(String[] args) {
        chooseOperation();
        }


    /**
     * Calculate numbers
     *
     * @author Dimitry Rogoza
     * @param enteringNumber1, which an user entered first
     * @param enteringNumber2, which an user entered second
     * @param action, which an user entered
     * @return result of action
     */
    public static double count(double enteringNumber1, double enteringNumber2, Calculate action){
        //Method for calculation
        return action.calculate(enteringNumber1,enteringNumber2);
    }

    /**
     * Receive and calculate user's action
     *
     * @author Dimitry Rogoza
     */
    public static void calculateUsersActions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number in format:\"0,0\"");
        double number1 = scanner.nextDouble();
        System.out.println("What do you want to do?");
        System.out.println("Write \"+\" for sum;");
        System.out.println("\"-\" for subtract;");
        System.out.println("\"*\" for multiply;");
        System.out.println("\"/\" for divide.");
        String action = scanner.next();
        System.out.println("Write second number in format:\"0,0\"");
        double number2 = scanner.nextDouble();
        switch (action) {
            case "+":
                System.out.printf("%.4f",count(number1, number2, (a, b) -> a + b));
                break;
            case "-":
                System.out.printf("%.4f",count(number1, number2, (a, b) -> a - b));
                break;
            case "*":
                System.out.printf("%.4f",count(number1, number2, (a, b) -> a * b));
                break;
            case "/":
                if(number2==0)
                    throw new IllegalArgumentException("You can't divide by zero");
                System.out.printf("%.4f",count(number1, number2, (a, b) -> a / b));
                break;
                default:
                    System.out.println("Wrong action. Do it again");
                    calculateUsersActions();
        }
        scanner.close();
    }
    public static void searchMaxElement(){
        System.out.println("Write the number of elements");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        String max = "";
        String[] array = new String[index];
        System.out.println("Write element");
        for(int i = 0;i<array.length;i++){
            array[i]= scanner.next();
        }
        for(String s : array){
            if (s.length()>max.length())
                max = s;
        }
        System.out.println(max);
    }

    public static void chooseOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1 - Calculator, 2 - Search max element of array");
        int choice = scanner.nextInt();
        switch (choice){
            case (1):
                calculateUsersActions();
                break;
            case (2):
                searchMaxElement();
                break;
            default:
                System.out.println("Wrong actions. Do it again");
                chooseOperation();

    }
}
}
