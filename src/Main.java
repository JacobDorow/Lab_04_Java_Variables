public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 5;
        int intOperandB = 10;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 50.0;
        double doubleOperandB = 20.0;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The Modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);
    }
}