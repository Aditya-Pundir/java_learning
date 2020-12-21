package calc;


class Calculator{
    public void calculate(int a, int b) {
        System.out.println("Your result is " + a+b);
    }
}
class scCalculator{
    public void calculate(int a, int b) {
        System.out.println("Your result is " + Math.sin(a+b));
    }
}
class hyCalculator{
    public void calculate(int a, int b) {
        System.out.println("Your result is " + Math.sin(a+b));
        System.out.println("Your result is " + a+b);
    }
}
public class problem1{
    public static void main(String[] args){
        System.out.println("I am main method...");
    }
}
