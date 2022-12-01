import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 double tomatoPrice = 2.50;
 double cucumberPrice = 1.0;
 double zucchiniPrice = 1.99;

 System.out.println("How many kilos of tomatoes do you want?");
    Double TomatoesKg = scan.nextDouble();
 System.out.println("How many cucumber do you want?");
    Double CucumberQuantity = scan.nextDouble();
 System.out.println("How many kilos of zucchini do you want?");
    Double zucchiniKg = scan.nextDouble();
    Double TotalPrice =0.0;
    TotalPrice=(tomatoPrice*TomatoesKg)+(cucumberPrice*CucumberQuantity)+(zucchiniPrice*zucchiniKg);
    System.out.println("Total price of your shopping = " +TotalPrice+ " $");

    }
}
