import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Welcome to CALCULATOR");
System.out.println("Please enter 2 numbers");
int number1 = scan.nextInt();
int number2 = scan.nextInt();
System.out.println("Please enter the operation you want to do : +, -, /, * ");
char operation =scan.next().charAt(0);
int result;
switch(operation){
    case '+':
        result = number1+number2;
        System.out.println("the result of the addition operation = "+result);
        break;
    case '-':
        result = number1-number2;
        System.out.println("the result of subtraction = "+result);
        break;
    case '*':
        result = number1*number2;
        System.out.println("the result of multiply = "+result);
        break;
    case '/':
        result = number1/number2;
        System.out.println("the result of divide = "+result);
        break;
    default:
        System.out.println("ERROR! Please choose one of four operations");
      scan.close();
        }
    }
}