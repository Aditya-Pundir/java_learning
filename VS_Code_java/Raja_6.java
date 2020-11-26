import king.gym.Raja_5;

    class Using extends Raja_5{
        void meth2(){
            System.out.println(x);
            System.out.println(y);
            // System.out.println(z);
            // System.out.println(a);
        }
}

public class Raja_6 {
    public static void main(String[] args) {
        System.out.println("I am Raja_6's main method!");

        Using c = new Using();
        c.meth2();
    }
}