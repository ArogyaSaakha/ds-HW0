 
import java.util.ArrayList;
public class Hw0 {
    public static int addAll(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i< 50; i ++){
           sum = sum + numbers.get(i);
        }
        return sum;
    }
    public static void main (String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i< 50; i ++){
            numbers.add(i);
        }
        int sum = addAll(numbers);
        System.out.print(" The total sum of numbers are " + sum);
    }
}
