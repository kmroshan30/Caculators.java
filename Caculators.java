import java.util.Scanner;
public class Caculators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      char operator; 
      double c; 
    System.out.println("enter any operator:+, *, - or /");
    operator = sc.next().charAt(0);
    System.out.println("enter first number: ");
    double a = sc.nextDouble();
    System.out.println("enter second number: ");
    double b = sc.nextDouble();
    switch(operator){
        case '+':
        c = a+b;
        System.out.println(a+"+"+b+" = "+c);
        break;
        case '-':
        c = a-b;
        System.out.println(a+"-"+b+" = "+c);
        break;
        case '*':
        c = a*b;
        System.out.println(a+"*"+b+" = "+c);
        break;
        case '/':
        c = a/b;
        System.out.println(a+"/"+b+" = "+c);
        break;
        default:
        System.out.println("Invalid operator!!");
        break;

    }
}

}