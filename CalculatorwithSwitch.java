import java.util.Scanner;

public class CalculatorwithSwitch {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Double number, aggregation, subtraction, multiplication, division, error, result;
        System.out.println("Bir sayı giriniz:");
        number = Input.nextDouble();
        System.out.println("ikinci sayıyı giriniz:");
        number = Input.nextDouble();
    }
    switch(result)

    {
        case 1: {
            System.out.println("Sonuç:" + aggregation);
            break;
        }
        case 2: {
            System.out.println("Sonuç:" + subtraction);
            break;

        }
        case 2: {
            System.out.println("Sonuç:" + multiplecation);
            break;
        }
        case 2: {
            System.out.println("Sonuç:" + division);
            break;
        }
        default: {
            System.out.println("Sonuç:" + error);
            break;
    }
}
