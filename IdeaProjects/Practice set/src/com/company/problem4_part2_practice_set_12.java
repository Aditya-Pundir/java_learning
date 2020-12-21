package co.company2;
import com.company.*;

class c3 extends problem4_part1{
    void problem4_part1() {
        System.out.println(proInt);
        // System.out.println(defInt);
    }
}
public class problem4_part2{
    public static void main(String[] args){
        System.out.println("I am main method!");
        c3 c = new c3();
        c.problem4_part1();
    }
}
