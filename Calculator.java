import java.util.*;
class CalculatorApp  extends Throwable
{
    double num1,num2,result;

    CalculatorApp(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the num1 ");
            num1 = sc.nextDouble();
            System.out.println("Enter the num2");
            num2 = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("\nWrong Input \n");

        }
    }
    void add()
    {
        result=num1+num2;
        System.out.println("The sum of "+num1+"and"+ num2+"is"+result);
    }
    void subtract()
    {
        result=num1-num2;
        System.out.println("The subtract of "+num1+"and"+ num2+"is"+result);
    }
    void multiply()
    {
        result=num1*num2;
        System.out.println("The multiply of "+num1+"and"+ num2+"is"+result);
    }
    void divide()
    {
        try {
            result = num1 / num2;
            System.out.println("The divide of " + num1 + "and" + num2 + "is" + result);
        }
        catch(Exception e)
        {

            //e.printStackTrace();
            System.out.println("DIVISION BY zero is not possible");
        }
    }
    void modulus() {
        if (num1 > num2) {
            result = num1 % num2;
        } else {
            result = num2 % num1;
        }
        System.out.println("The modulus of  " + num1 + "and" + num2 + "is" + result);
    }
}
class Main
{
    public static void main(String args []) {
        while (true) {
            System.out.println("****CALCULATOR APP ****");
            System.out.println("Enter the operator like +,-,*,/,% ");
            System.out.println("Enter the word exit for terminate the process");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the operator");
            String operator = s.nextLine();
            if (operator.equals("exit")) {
                System.exit(0);
            } else if(operator.equals("+") ||operator.equals("-")||operator.equals("*")||operator.equals("/") ||operator.equals("%")){
                CalculatorApp ca = new CalculatorApp();

                switch (operator) {

                    case "+": {
                        ca.add();
                        break;
                    }
                    case "-": {
                        ca.subtract();
                        break;
                    }
                    case "*": {
                        ca.multiply();
                        break;
                    }
                    case "/": {
                        ca.divide();
                        break;
                    }
                    case "%": {
                        ca.modulus();
                        break;
                    }
                }
            }
            else {
                {
                    System.out.println("\nWrong operator Try again\n");
                }
            }
        }
    }
}