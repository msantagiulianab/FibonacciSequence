import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence {

    // The user is asked to input the max integer up to which to calculate the Fibonacci sequence
    // A Fibonacci number is the sum of the previous two numbers in the sequence

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int high = s.nextInt();
        int k = 0;
        int counter = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; k<high; i++){
            if(i==0||i==1){
                arr.add(i);
                counter++;
            } else {
                k=(arr.get(counter))+(arr.get(counter-1));
                arr.add(k);
                counter++;
            }
        }

        if (arr.get(arr.size()-1) > high) {
            arr.remove(arr.size()-1);
        }

        System.out.println(arr);
    }
}
