package problem2;
import java.util.Scanner;

class myClass{
    void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name here: ");
        String name = sc.nextLine();
        System.out.println("Hi, " + name);

    }
}
public class problem2{
    public static void main(String[] args){
        myClass me = new myClass();
        me.takeInput();

    }
}
