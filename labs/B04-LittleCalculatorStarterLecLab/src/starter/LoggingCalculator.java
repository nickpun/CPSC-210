package starter;

import java.util.ArrayList;
import java.util.Scanner;

public class LoggingCalculator {
    ArrayList<LogEntry> operationLog = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public LoggingCalculator(){
        String operation = "";
        while (true){
            LogEntry opEntry = new LogEntry();
            System.out.println("Please select an option");
            operation = scanner.nextLine();
            System.out.println("you selected: "+operation);
            int result = 0;
            if (operation.equals("plus")) {
                opEntry.setOperation(operation);
                result = plus(opEntry);
                opEntry.setResult(result);
            }
            else if (operation.equals("minus")) {
                opEntry.setOperation(operation);
                result = minus(opEntry);
                opEntry.setResult(result);
            }
            else if (operation.equals("quit")) {
                break;
            }
            System.out.println("that equals: "+result);
            operationLog.add(opEntry);
        }
        System.out.println("operation log: "+operationLog);

    }

    private int plus(LogEntry logEntry) {
        System.out.println("Please enter the first number to plus");
        int first = scanner.nextInt();
        System.out.println("Please enter the second number to plus");
        int second = scanner.nextInt();
        scanner.nextLine(); //clears the line,
                            // otherwise the carriage return is taken as the next input
                            // and you get a blank "selected" loop
        logEntry.addOperand(first);
        logEntry.addOperand(second);
        return first + second;
    }

    private int minus(LogEntry logEntry) {
        System.out.println("Please enter the first number to minus");
        int first = scanner.nextInt();
        System.out.println("Please enter the second number to minus");
        int second = scanner.nextInt();
        scanner.nextLine(); //clears the line,
        // otherwise the carriage return is taken as the next input
        // and you get a blank "selected" loop
        logEntry.addOperand(first);
        logEntry.addOperand(second);
        return first - second;
    }


    public static void main(String[] args) {
        new LoggingCalculator();
    }
}
